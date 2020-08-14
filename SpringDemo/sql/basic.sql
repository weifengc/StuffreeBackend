-- Create DB
CREATE DATABASE blogposts;
USE blogposts;

-- Create User table.
CREATE TABLE IF NOT EXISTS user(
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    user_name varchar(255)  NOT NULL UNIQUE,
    user_password TEXT NOT NULL
)  ENGINE=INNODB;

-- Create Message table
USE blogposts;
CREATE TABLE IF NOT EXISTS message(
    message_id INT auto_increment primary key,
    created_by_user_id INT NOT NULL,
    title TEXT NOT NULL,
    description TEXT NOT NULL,
    created_at_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP
) ENGINE=INNODB;

-- Tests
INSERT INTO user(user_name, user_password)
VALUES ('user1', 'pass1');

select * from user;

INSERT INTO message(created_by_user_id, title, description)
VALUES (1, 'title1', 'description abc ...');

select description from message;