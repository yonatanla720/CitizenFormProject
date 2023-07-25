# Vaccine Registration Web Application

## Overview
This web application is developed to help undeveloped countries vaccinate their people. It consists of a registration page for citizens to fill out their information and a summary page that presents a tabular view of all the existing registration information available in the system. Users can search the data using different parameters.

## Technologies Used
- Frontend: ReactJS, Material-UI, Vite (frontend build tool), React Router
- Backend: Java, Spring Boot, Spring Data JPA, PostgreSQL (Database)
- Deployment: Docker, Docker Compose

## Getting Started
To run this project locally, follow the steps below:

### Prerequisites
- Docker installed on your machine
- node.js installed on your machine
- yarn installed on your machine
- maven installed on your machine and required PATH variable setted up
- 

### Setting Up the Database
1. Clone this repository to your local machine.
2. Open a terminal and navigate to the root directory of the project.
3. Run the following command to start up the PostgreSQL database using Docker Compose: <code>docker-compose up -d</code>
4. The PostgreSQL database should now be running on port 5432.

### Running the Backend
1. Open another terminal and navigate to the `backend` directory of the project.
2. Build and run the backend using Maven: <code>mvn spring-boot:run</code>
3. The backend server should now be running on port 8080.

### Running the Frontend
1. Open a third terminal and navigate to the `frontend` directory of the project.
2. Install the frontend dependencies using Yarn: <code>yarn</code>
3. Start the development server: `yarn dev`
4. The frontend should now be running on port `5173`.

### Accessing the Web Application
You can access the web application by opening your web browser and navigating to `http://localhost:5173`.

## Additional Notes
- The application uses React Router for client-side routing, allowing you to navigate between different pages without a full page reload.
- The frontend makes API calls to the backend to fetch and display data from the database. The backend handles data processing and database interactions using Spring Boot and Spring Data JPA.
- The Docker Compose file is used to easily set up the PostgreSQL database for development purposes. For production, consider using a real server or Kubernetes to host the database.
- The form's City field's values are being fetched from another REST API (https://countriesnow.space). To change the country from which to get the cities, change the `CITIES_API_DATE.country` value to your desired country.

