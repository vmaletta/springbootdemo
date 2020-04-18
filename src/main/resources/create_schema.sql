CREATE DATABASE IF NOT EXISTS FLIGHTS;

CREATE TABLE IF NOT EXISTS flight_ticket
(
  itinerary_id INT NOT NULL AUTO_INCREMENT default 0,
  passenger_age INT NOT NULL,
  passenger_name VARCHAR(200)  NOT NULL,
  origin_city VARCHAR(200)  NOT NULL,
  destination_city VARCHAR(200)  NOT NULL,
  departure_date DATE  NOT NULL,
  arrival_date DATE NOT NULL,
  departure_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  arrival_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  has_luggage_storage INT NOT NULL,
  price FLOAT NOT NULL,
  PRIMARY KEY (itinerary_id)
);


SELECT * FROM flight_ticket;

DROP TABLE IF EXISTS flight_ticket;

DROP DATABASE IF EXISTS FLIGHTS;