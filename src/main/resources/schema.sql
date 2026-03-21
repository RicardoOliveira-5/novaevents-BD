CREATE TABLE IF NOT EXISTS event_type (
                                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                          name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS club (
                                    id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                    name VARCHAR(255) NOT NULL,
                                    description VARCHAR(2000) NOT NULL,
                                    category VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS event (
                                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                     name VARCHAR(255) NOT NULL,
                                     date DATE NOT NULL,
                                     location VARCHAR(255),
                                     description VARCHAR(255),
                                     club_id BIGINT,
                                     type_id BIGINT,
                                     FOREIGN KEY (club_id) REFERENCES club(id),
                                     FOREIGN KEY (type_id) REFERENCES event_type(id)
);