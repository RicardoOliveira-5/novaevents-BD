-- 1️⃣ Criar a base de dados
CREATE DATABASE IF NOT EXISTS novaevents
CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;

-- 2️⃣ Criar utilizador e dar permissões
CREATE USER IF NOT EXISTS 'Ricardo'@'localhost' IDENTIFIED BY 'Ricardo';
GRANT ALL PRIVILEGES ON novaevents.* TO 'Ricardo'@'localhost';
FLUSH PRIVILEGES;

USE novaevents;

CREATE TABLE IF NOT EXISTS Club (
                                    id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                    name VARCHAR(255) NOT NULL,
                                    description VARCHAR(2000) NOT NULL,
                                    category VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS EventType (
                                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                         name VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS Event (
                                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                     name VARCHAR(255) NOT NULL,
                                     date DATE NOT NULL,
                                     location VARCHAR(255),
                                     description VARCHAR(2000),
                                     club_id BIGINT NOT NULL,
                                     type_id BIGINT NOT NULL,
                                     CONSTRAINT fk_event_club FOREIGN KEY (club_id) REFERENCES Club(id) ON DELETE CASCADE,
                                     CONSTRAINT fk_event_type FOREIGN KEY (type_id) REFERENCES EventType(id) ON DELETE CASCADE
);


select *
from Event;