CREATE DATABASE Airport;
USE Airport;
CREATE TABLE bookings (
book_id varchar(6) primary key unique not null,
book_data DATE not null,
total_amount decimal(5,2) not null CHECK (amount >= 0)
);
CREATE TABLE tickets (
ticket_id varchar(10) primary key unique not null,
book_ref varchar(6),
foreign key (book_ref) references bookings(book_id),
passenger_id varchar(10) unique not null,
passenger_name varchar(255) not null,
contact_data varchar(255) not null
);
CREATE TABLE flights(
flight_id varchar(10) primary key unique not null,
flight_num varchar(6) not null,
scheduled_departure datetime not null,
scheduled_arrival datetime not null check (scheduled_arrival > scheduled_departure),
departure_airport varchar(6) not null,
FOREIGN KEY (departure_airport) REFERENCES airports(airport_code),
arrival_airport varchar(6) not null,
FOREIGN KEY (arrival_airport) REFERENCES airports(airport_code),
status  varchar(32) not null CHECK (status IN ('On Time', 'Delayed', 'Departed',
'Arrived', 'Scheduled', 'Cancelled')),
aircraft_code  varchar(3) not null,
FOREIGN KEY (aircraft_code) REFERENCES aircrafts(aircraft_code),
actual_departure datetime not null,
actual_arrival  datetime not null check (actual_arrival > actual_departure)
);
CREATE TABLE ticket_flights (
ticket_id varchar(10) primary key unique not null,
FOREIGN KEY (ticket_id) REFERENCES tickets(ticket_id),
flight_id varchar(10) primary key unique not null,
FOREIGN KEY (flight_id) REFERENCES flights(flight_id),
fare_conditions varchar(6) not null CHECK (fare_conditions IN ('Economy', 'Comfort', 'Business')),
total_amount decimal(5,2) not null CHECK (amount >= 0)
);
CREATE TABLE airport (
airport_code varchar(4) primary key unique not null,
airport_name varchar(16) not null,
city varchar(16) not null,
coordinates varchar(16) not null,
timezone datetime not null
);
CREATE TABLE board_card(
ticket_id varchar(10) ,
flight_id varchar(10)  unique not null,
boarding_num varchar(6) primary key unique not null auto_increment unique,
seat_num varchar(3) , 
FOREIGN KEY (ticket_id, flight_id)
REFERENCES ticket_flights(ticket_id, flight_id),
PRIMARY KEY btree (ticket_no, flight_id) 
);
CREATE TABLE aircrafts(
aircraft_code varchar(4) primary key unique not null,
model varchar(8) not null,
range_max integer not null
);
CREATE TABLE  seats(
aircraft_code varchar(4)  unique not null,
FOREIGN KEY (aircraft_code)
REFERENCES aircrafts(aircraft_code) ON DELETE CASCADE,
seat_num varchar(3) not null, 
fare_conditions varchar(6) not null CHECK (fare_conditions IN ('Economy', 'Comfort', 'Business')),
FOREIGN KEY (aircraft_code)
REFERENCES aircrafts(aircraft_code) ON DELETE CASCADE,
PRIMARY KEY btree (aircraft_code, seat_no)
);

