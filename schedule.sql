CREATE DATABASE IF NOT EXISTS spring_day_project;
USE spring_day_project;


CREATE TABLE users (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       username VARCHAR(50) NOT NULL UNIQUE,
                       email VARCHAR(100) NOT NULL UNIQUE,
                       password VARCHAR(255) NOT NULL,
                       created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
                       modified_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);


CREATE TABLE todos (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       title VARCHAR(100) NOT NULL,
                       content TEXT,
                       username VARCHAR(50) NOT NULL,
                       member_id INT NOT NULL,
                       created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
                       modified_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                       CONSTRAINT fk_member FOREIGN KEY (member_id) REFERENCES users(id)
);
