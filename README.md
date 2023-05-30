# Hotel System
Welcome to the Hotel Booking Management System project! Our system is designed to provide a comprehensive solution for managing hotel reservations and empowering receptionists with efficient tools. This project aims to streamline the booking process, enhance customer service, and simplify the management of room bookings within a hotel environment.

## Features
**1- Secure Login:** We have implemented a robust login mechanism that ensures the security of your data. Receptionists are required to enter their unique username and password, which are authenticated against a secure database. This authentication process guarantees that only authorized personnel can access the system.

**2- Booking Rooms:** Our system's primary function is to enable receptionists to easily book rooms for guests. With a user-friendly interface, receptionists can check room availability, select suitable options based on guest preferences, and confirm bookings. This feature simplifies the reservation process, saving time and effort for both receptionists and guests.

**3- Room Information and Customer Details:** Our system provides receptionists with instant access to room information. They can retrieve details such as room number, book id, customer id, payment id, check in, check out,  and number of nights whenever needed. Furthermore, receptionists can conveniently access customer information associated with each booked room.

**4-Room Locking and Unlocking:** In certain situations, the receptionist may need to temporarily lock a room for maintenance or updates. Our system includes a room locking feature that allows receptionists to mark a room as unavailable for bookings. This ensures that no further reservations are made for that room during the specified period, facilitating uninterrupted maintenance work. Once the maintenance or updates are completed, the receptionist can also unlock the room from the same function, making it available for bookings again.

**5-Cancellation:** Guests occasionally need to cancel their bookings, and our system simplifies the cancellation process.
Receptionists can efficiently manage cancellations.

## ER Diagram

![ERupdated](https://github.com/Hotel-System252/Hotel-System/assets/98660298/29d6d49e-8ec8-4ab2-b85f-837688d24f38)

## Schema 

![Schema ](https://github.com/Hotel-System252/Hotel-System/assets/98660298/33a028aa-a0a5-4f44-9f81-9d22da9870b4)

## Design Patterns Used in Project

**1-Singleton Design Pattern - Connection Object**

In our project, we have employed the Singleton design pattern to ensure that only one object of the connection is created. The Singleton pattern restricts the instantiation of a class to a single object, providing a global point of access to it. By utilizing this pattern for the connection object, we can ensure that multiple instances of the connection are not created unnecessarily, thereby optimizing resource usage and promoting a centralized and consistent connection state.

**2-Decorator Design Pattern - Total Price Calculation**

The Decorator design pattern has been implemented in our project to calculate the total price of a book, considering factors such as room type and extra services. This pattern allows us to dynamically add or modify the behavior of an object at runtime by wrapping it with decorator objects. By using the Decorator pattern for price calculation, we can extend the functionality of the book class without directly modifying its code. This approach promotes flexibility, modularity, and reusability in our pricing system.

**3-Strategy Design Pattern - Payment Methods**

The Strategy design pattern has been utilized to implement payment methods in our project. Each payment method is encapsulated in a separate class, and all these classes adhere to a common interface or base class. This design allows us to switch between different payment methods seamlessly and interchangeably, without tightly coupling the payment logic to the client code. By adopting the Strategy pattern for payment methods, we can easily introduce new payment implementations or modify existing ones without affecting other parts of the system.

By employing these design patterns in our project, we aim to enhance maintainability, flexibility, and scalability. These patterns promote code reusability, separation of concerns, and adherence to software design principles.

## GUI

Login:

![Login](https://github.com/Hotel-System252/Hotel-System/assets/98660298/58e77e21-dbc8-4047-a47e-a0a5aa580fc1)

main menu: 

![MAIN](https://github.com/Hotel-System252/Hotel-System/assets/98660298/d5ab23a7-4c07-44e5-9382-b9a836dd1424)

Booking:

![Booking](https://github.com/Hotel-System252/Hotel-System/assets/98660298/4a286d79-736b-40b1-8c59-296ccdf064d3)

Customer(If he is a new customer or old customer):

![image](https://github.com/Hotel-System252/Hotel-System/assets/98660298/e867502c-c5f9-400c-92b9-391956b38dab)

New customer: 

![image](https://github.com/Hotel-System252/Hotel-System/assets/98660298/24885f65-4f77-4529-922d-342fde1a850b)

Old customer: 

![image](https://github.com/Hotel-System252/Hotel-System/assets/98660298/a6708a42-fd13-4e66-a853-cdad8459516b)

Payment:

![image](https://github.com/Hotel-System252/Hotel-System/assets/98660298/b9aa1286-a03f-488c-b631-07b0960f82eb)

GetInfo:

![image](https://github.com/Hotel-System252/Hotel-System/assets/98660298/09aa1e48-8894-42bf-89f2-cfdd17f2c919)

LockRoom:

![image](https://github.com/Hotel-System252/Hotel-System/assets/98660298/e997450a-acf5-497a-99df-5faee70828bc)

Cancel book: 

![image](https://github.com/Hotel-System252/Hotel-System/assets/98660298/e1e93dfd-b0b8-4b38-8c1a-fcaa8b62f4a9)


