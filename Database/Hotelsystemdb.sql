-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.11.3-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.3.0.6589
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for hotel_252
CREATE DATABASE IF NOT EXISTS `hotel_252` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci */;
USE `hotel_252`;

-- Dumping structure for table hotel_252.books
CREATE TABLE IF NOT EXISTS `books` (
  `Room_No` int(11) DEFAULT NULL,
  `Book_ID` int(11) NOT NULL,
  `Check_In` date DEFAULT NULL,
  `Check_Out` date DEFAULT NULL,
  `Customer_ID` varchar(50) DEFAULT NULL,
  `Payment_ID` int(11) DEFAULT NULL,
  `No_Nights` int(11) DEFAULT NULL,
  PRIMARY KEY (`Book_ID`),
  KEY `FK_Room_No` (`Room_No`),
  KEY `FK_Payment_ID` (`Payment_ID`),
  KEY `FK_Customer_ID` (`Customer_ID`),
  CONSTRAINT `FK_Customer_ID` FOREIGN KEY (`Customer_ID`) REFERENCES `customers` (`Customer_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_Payment_ID` FOREIGN KEY (`Payment_ID`) REFERENCES `payments` (`Payment_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_Room_No` FOREIGN KEY (`Room_No`) REFERENCES `room_table` (`Room_No`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table hotel_252.books: ~0 rows (approximately)

-- Dumping structure for table hotel_252.customers
CREATE TABLE IF NOT EXISTS `customers` (
  `Customer_ID` varchar(50) NOT NULL DEFAULT '0',
  `Customer_Name` varchar(25) DEFAULT NULL,
  `Customer_Age` int(11) DEFAULT NULL,
  `Customer_Phone` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`Customer_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table hotel_252.customers: ~1 rows (approximately)
REPLACE INTO `customers` (`Customer_ID`, `Customer_Name`, `Customer_Age`, `Customer_Phone`) VALUES
	('1', 'Omar', 24, '0566115702');

-- Dumping structure for table hotel_252.customer_info
CREATE TABLE IF NOT EXISTS `customer_info` (
  `ID` varchar(50) NOT NULL DEFAULT '',
  `Name` varchar(50) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `Phone` int(11) DEFAULT NULL,
  `Pyment_method` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table hotel_252.customer_info: ~0 rows (approximately)

-- Dumping structure for table hotel_252.employee
CREATE TABLE IF NOT EXISTS `employee` (
  `ID` int(11) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table hotel_252.employee: ~0 rows (approximately)

-- Dumping structure for table hotel_252.extra_services
CREATE TABLE IF NOT EXISTS `extra_services` (
  `Serv_ID` int(11) NOT NULL DEFAULT 0,
  `Serv_Name` varchar(50) DEFAULT '0',
  `Serv_Price` int(11) DEFAULT NULL,
  PRIMARY KEY (`Serv_ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table hotel_252.extra_services: ~4 rows (approximately)
REPLACE INTO `extra_services` (`Serv_ID`, `Serv_Name`, `Serv_Price`) VALUES
	(1, 'Breakfast', 50),
	(2, 'Dinner', 50),
	(3, 'Gym', 100),
	(4, 'Valet', 150);

-- Dumping structure for table hotel_252.include
CREATE TABLE IF NOT EXISTS `include` (
  `Book_ID` int(11) DEFAULT NULL,
  `Serv_ID` int(11) DEFAULT NULL,
  KEY `FK_BOOK_ID` (`Book_ID`),
  KEY `FK_Serv_ID` (`Serv_ID`),
  CONSTRAINT `FK_BOOK_ID` FOREIGN KEY (`Book_ID`) REFERENCES `books` (`Book_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_Serv_ID` FOREIGN KEY (`Serv_ID`) REFERENCES `extra_services` (`Serv_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table hotel_252.include: ~0 rows (approximately)

-- Dumping structure for table hotel_252.login
CREATE TABLE IF NOT EXISTS `login` (
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table hotel_252.login: ~3 rows (approximately)
REPLACE INTO `login` (`Username`, `Password`) VALUES
	('rakan', '2037276'),
	('abdulaziz', '2036023'),
	('omar', '2040569');

-- Dumping structure for table hotel_252.payments
CREATE TABLE IF NOT EXISTS `payments` (
  `Payment_ID` int(11) NOT NULL,
  `Payment_Type` varchar(50) DEFAULT NULL,
  `Total` int(11) DEFAULT NULL,
  PRIMARY KEY (`Payment_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table hotel_252.payments: ~0 rows (approximately)

-- Dumping structure for table hotel_252.rooms
CREATE TABLE IF NOT EXISTS `rooms` (
  `Room_No` int(11) NOT NULL,
  `Room_Type` int(11) DEFAULT NULL,
  `Customer_ID` varchar(50) DEFAULT NULL,
  `Check_In` date DEFAULT NULL,
  `Check_Out` date DEFAULT NULL,
  `Room_State` int(11) DEFAULT 0,
  `Breakfast` int(11) DEFAULT 0,
  `Wifi` int(11) DEFAULT 0,
  `Swimming_Pool` int(11) DEFAULT 0,
  `Gym` int(11) DEFAULT 0,
  `Room_Service` int(11) DEFAULT 0,
  `Vip` int(11) DEFAULT NULL,
  PRIMARY KEY (`Room_No`),
  KEY `FK_rooms_customer_info` (`Customer_ID`),
  CONSTRAINT `FK_rooms_customer_info` FOREIGN KEY (`Customer_ID`) REFERENCES `customer_info` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table hotel_252.rooms: ~14 rows (approximately)
REPLACE INTO `rooms` (`Room_No`, `Room_Type`, `Customer_ID`, `Check_In`, `Check_Out`, `Room_State`, `Breakfast`, `Wifi`, `Swimming_Pool`, `Gym`, `Room_Service`, `Vip`) VALUES
	(1, NULL, NULL, NULL, NULL, 0, 0, 0, 0, 0, 0, NULL),
	(2, NULL, NULL, NULL, NULL, 0, 0, 0, 0, 0, 0, NULL),
	(3, NULL, NULL, NULL, NULL, 0, 0, 0, 0, 0, 0, NULL),
	(4, NULL, NULL, NULL, NULL, 0, 0, 0, 0, 0, 0, NULL),
	(5, NULL, NULL, NULL, NULL, 0, 0, 0, 0, 0, 0, NULL),
	(6, NULL, NULL, NULL, NULL, 0, 0, 0, 0, 0, 0, NULL),
	(7, NULL, NULL, NULL, NULL, 0, 0, 0, 0, 0, 0, NULL),
	(8, NULL, NULL, NULL, NULL, 0, 0, 0, 0, 0, 0, NULL),
	(9, NULL, NULL, NULL, NULL, 0, 0, 0, 0, 0, 0, NULL),
	(10, NULL, NULL, NULL, NULL, 0, 0, 0, 0, 0, 0, NULL),
	(11, NULL, NULL, NULL, NULL, 0, 0, 0, 0, 0, 0, NULL),
	(12, NULL, NULL, NULL, NULL, 0, 0, 0, 0, 0, 0, NULL),
	(13, NULL, NULL, NULL, NULL, 0, 0, 0, 0, 0, 0, NULL),
	(14, NULL, NULL, NULL, NULL, 0, 0, 0, 0, 0, 0, NULL);

-- Dumping structure for table hotel_252.room_table
CREATE TABLE IF NOT EXISTS `room_table` (
  `Room_No` int(11) NOT NULL AUTO_INCREMENT,
  `Room_Type` varchar(50) DEFAULT NULL,
  `State` int(11) DEFAULT 1,
  PRIMARY KEY (`Room_No`),
  KEY `FK_ROOM_Type` (`Room_Type`),
  CONSTRAINT `FK_ROOM_Type` FOREIGN KEY (`Room_Type`) REFERENCES `room_types` (`Type`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table hotel_252.room_table: ~10 rows (approximately)
REPLACE INTO `room_table` (`Room_No`, `Room_Type`, `State`) VALUES
	(1, 'Singel', 1),
	(2, 'Singel', 1),
	(3, 'Singel', 1),
	(4, 'Singel', 0),
	(5, 'Singel', 1),
	(6, 'Double', 0),
	(7, 'Double', 0),
	(8, 'Double', 0),
	(9, 'Double', 0),
	(10, 'Double', 0);

-- Dumping structure for table hotel_252.room_types
CREATE TABLE IF NOT EXISTS `room_types` (
  `Type` varchar(50) NOT NULL DEFAULT 'X',
  `Price` int(11) DEFAULT NULL,
  PRIMARY KEY (`Type`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table hotel_252.room_types: ~2 rows (approximately)
REPLACE INTO `room_types` (`Type`, `Price`) VALUES
	('Double', 150),
	('Singel', 100);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
customers