# Campus E-Commerce Platform

## Project Overview

This project is a **Campus E-Commerce Platform**, designed to enable students to buy and sell both used and unused products easily within a college campus. It provides a simple interface for listing items for sale and browsing available products.

## Features

- **User Authentication**: Secure login and registration.
- **Product Listing**: Users can add details about the products they want to sell.
- **Product Browsing**: Buyers can browse listed products with descriptions and prices.
- **Contact Seller**: Buyers can directly call or message sellers.
- **Database Integration**: Uses MySQL for data storage.

##  Tech Stack

- **Frontend**: HTML, CSS, JavaScript, Thymeleaf (for dynamic content rendering)
- **Backend**: Java, Spring Boot (MVC architecture)
- **Database**: MySQL (using Spring Data JPA)
- **Tools & IDE**: Visual Studio Code, Spring Boot DevTools

##  Installation & Setup


1. **Set up the MySQL database**:
   - Create a database named `campus_ecommerce`.
   - Update `application.properties` with your database credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/campus_ecommerce
     spring.datasource.username=root
     spring.datasource.password=yourpassword
     spring.jpa.hibernate.ddl-auto=update
     ```
2. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```
3. **Access the app**:
   - Open `http://localhost:8080/` in your browser.




##  API Endpoints

| HTTP Method | Endpoint    | Description             |
| ----------- | ----------- | ----------------------- |
| **POST**    | `/login`    | User login              |
| **POST**    | `/register` | New user registration   |
| **POST**    | `/sell`     | List a product for sale |
| **GET**     | `/buy`      | View available products |
| **GET**     | `/home`     | User dashboard          |

## Future Enhancements

- **Image Upload Feature**: Allow sellers to upload product images.
- **Search & Filter**: Enable users to search and filter products.
- **Wishlist**: Add a wishlist feature for buyers.



