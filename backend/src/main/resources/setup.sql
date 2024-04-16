CREATE DATABASE wiss_db;
CREATE USER wiss_user IDENTIFIED BY "secret";
GRANT ALL ON wiss_db.* TO wiss_user;