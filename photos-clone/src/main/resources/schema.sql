CREATE TABLE IF NOT EXISTS photos(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    fileName varchar(255),
    contentType varchar(255),
    data binary large object
);