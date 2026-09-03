create database BabyVaccination;
use BabyVaccination;

create table  Vaccine(vacci_id int primary key,
vacci_name varchar(30),
recommended_age varchar(20),
dose int,
price decimal(8,2));

create table Parent(parent_id int primary key,parent_name varchar(20),mobile_no varchar(15),email varchar(40),
address varchar(60));
select * from Parent;

create table Baby(baby_id int primary key,
parent_id int ,
baby_name varchar(30),
gender varchar(10),
baby_dob date,
blood_group varchar(4));
select * from Baby;

create table Appointment (appointment_id int primary key,
parent_id int ,
vacci_id int ,
appointment_date date,
hospital_id int ,
status varchar(18));
select * from Appointment;

create table Hospital
(hospital_id int primary key,
hospital_name varchar(50),
doctor_name varchar(22),
location varchar(70),
contact_no varchar(10));
