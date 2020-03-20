# AirWatch - A Case Study

## Problem Statement

Build a system to keep track of Air Quality.

## Requirements:

1. The application needs to fetch existing states from `https://www.airvisual.com/air-pollution-data-api`

2. A frontend where the user can **View and create WatchList of Cities.** 
  - On launching the application the user should get the login page. The login page should have a link for registration using which the user should be able to register. On successful registration the user should be taken to the login page. Upon login, the user should be taken to the home page.
  - Proper navigation links for all the pages should be available within pages.
  - Error handling should be implemented across pages. Appropriate messages should be    displayed for the same. Success messages should be displayed for the User Registration.
  - Logout feature should be implemented.

3. View to select the country to display the States

4. View to select the State to show the AirQuality of all the Cities of that particular state.

## Modules

### AirWatchUI
  - User should be able to
    1. Needs to show all the countries which AirVisual Supports. On clicking the **Country** it should display all the **States** present in the country.
    2. On clicking the **State** the interface needs to show the AirQuality of all the **Cities of that particular state.**
    3. UI should be responsive which can run smoothly on various devices
    4. UI should be appealing and user friendly.

### AccountManager 
  - Should be able to manage user accounts

### The AirWatcher 
  - Application should be able to maintain watchlist of cities

## Tech Stack
- Spring Boot 
- MySQL
- Angular
- CI (Gitlab Runner)
- Docker, Docker Compose

## Flow of Modules

### Building frontend
- Building responsive views:
    1. Build a View to show all 
          1. Countries - Populating from external api
          2. States - Populating from external api
          3. Build a view to show cities added under watchlist
          4. A view to authenticate users
- Using Services to populate these data in views
- Stitching these views using Routes and Guards
- Making the UI Responsive
- Unit Tests should be created for the Components and Services
- E2E scripts using protractor should be created for the functional flows
- Implement CI - continuous Integration ( use .gitlab-ci.yml)
- Dockerize the frontend (create dockerfile, docker-compose.yml and get it executed through docker compose)

### Note: FrontEnd and all the backend services should be dockerized and run through docker-compose

### Building the Account Manager
- Creating a server in Spring Boot to facilitate user registration and login with MySQL as backend. Upon login, JWT token has to be generated. It has to be used in the Filters set in other services.
- Writing swagger documentation
- Unit Testing of the entire code which involves the positive and negative scenarios
- Implement continuous Integration CI ( use .gitlab-ci.yml)
- Dockerize the Account Manager Service (create dockerfile, docker-compose.yml and get it executed through docker compose)

### Building the Airwatcher Application
  1. Building a server in Spring Boot to facilitate CRUD operation over watchlist of cities  stored in MySQL.
      - Application should be able to maintain watchlist of cities.
  2. JWT Filter should be applied for all the API calls of the Airwatcher service. JWT token should be used to authorize the user access to all the resources.
  3. Writing Swagger Documentaion
  4. Write Unit Test Cases and get it executed.
  5. Implement CI - continuous Integration ( use .gitlab-ci.yml)
  6. Dockerize the Airwatcher Application(create dockerfile and update the docker-compose.yml)
  
### Demonstrate the entire application
    1. Make sure all the functionalities are implemented
    2. Make sure both the UI (Component and Services) and server side (For all layers) codes are unit tested. 
    3. All the Services are up and running using docker (Dockercompose should be used for running them)
    4. E2E tests should be executed and shown
    5. Application is completely responsive in nature