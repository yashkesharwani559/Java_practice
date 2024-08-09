// for implementing the database, here we are using the MySQL database. SO first
// we download the mysql then we download the mysql connector for the JDBC.

// so here we are studying the java.sql package

// here we are using a class Driver in java.sql package whoose object we don't
// needed but it is important to load it.
//

// queries for the mysql database:

// show databases;
// create database college_db;
// use college_db;
// create table students(
// student_id int not null auto increment, name char(60) not null, email
// char(255) not null, college char(255), password varchar(500) not null
// );

// system cls; -> is to clear the mysql command line
// show tables;
// desc students; or (describe students;)
// select * from students;
// insert into students value (); -> here it is used when we know all the columns and we have to give the values to all the columns at once in same sequence.
// insert into students(column_names) values(values we want to store);
// update students set name=?, email=?, password=?, college=?, student_id=? where student_id = ?;