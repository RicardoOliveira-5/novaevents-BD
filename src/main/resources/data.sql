-- Event Types
INSERT INTO event_type (name) VALUES ('WORKSHOP');
INSERT INTO event_type (name) VALUES ('TALK');
INSERT INTO event_type (name) VALUES ('COMPETITION');
INSERT INTO event_type (name) VALUES ('SOCIAL');
INSERT INTO event_type (name) VALUES ('MEETING');
INSERT INTO event_type (name) VALUES ('OTHER');

-- Clubs
INSERT INTO club (name, description, category) VALUES ('Chess Club', 'A club for chess enthusiasts', 'SOCIAL');
INSERT INTO club (name, description, category) VALUES ('Robotics Club', 'Robotics ideas into machines', 'ACADEMIC');
INSERT INTO club (name, description, category) VALUES ('Photography Club', 'For photography lovers', 'CULTURAL');
INSERT INTO club (name, description, category) VALUES ('Hiking & Outdoors Club', 'Hiking and outdoor adventures', 'SPORTS');
INSERT INTO club (name, description, category) VALUES ('Film Society Club', 'Film screenings and discussions', 'CULTURAL');

-- Events (Chess Club - id 1)
INSERT INTO event (name, date, club_id, type_id, location) VALUES ('Beginner Chess Workshop', DATEADD(DAY, 1, CURRENT_DATE), 1, 1, 'Room A101');
INSERT INTO event (name, date, club_id, type_id, location) VALUES ('Spring Chess Tournament', DATEADD(DAY, 30, CURRENT_DATE), 1, 3, 'Room A');
INSERT INTO event (name, date, club_id, type_id, location) VALUES ('Chess Strategy Talk', DATEADD(DAY, 7, CURRENT_DATE), 1, 2, 'Room B202');

-- Events (Robotics Club - id 2)
INSERT INTO event (name, date, club_id, type_id, location) VALUES ('Robotics Workshop', DATEADD(DAY, 10, CURRENT_DATE), 2, 1, 'Lab 3');
INSERT INTO event (name, date, club_id, type_id, location) VALUES ('Robotics Competition', DATEADD(DAY, 25, CURRENT_DATE), 2, 3, 'Main Hall');
INSERT INTO event (name, date, club_id, type_id, location) VALUES ('Robotics Talk', DATEADD(DAY, 12, CURRENT_DATE), 2, 2, 'Lab 1');

-- Events (Photography Club - id 3)
INSERT INTO event (name, date, club_id, type_id, location) VALUES ('Photo Walk', DATEADD(DAY, 5, CURRENT_DATE), 3, 4, 'Campus Garden');
INSERT INTO event (name, date, club_id, type_id, location) VALUES ('Photography Workshop', DATEADD(DAY, 14, CURRENT_DATE), 3, 1, 'Studio A');
INSERT INTO event (name, date, club_id, type_id, location) VALUES ('Photography Exhibition', DATEADD(DAY, 21, CURRENT_DATE), 3, 4, 'Gallery');

-- Events (Hiking Club - id 4)
INSERT INTO event (name, date, club_id, type_id) VALUES ('Hiking Trip', DATEADD(DAY, 20, CURRENT_DATE), 4, 4);
INSERT INTO event (name, date, club_id, type_id, location) VALUES ('Trail Running', DATEADD(DAY, 8, CURRENT_DATE), 4, 3, 'Sintra');
INSERT INTO event (name, date, club_id, type_id, location) VALUES ('Outdoor Meeting', DATEADD(DAY, 3, CURRENT_DATE), 4, 5, 'Park');

-- Events (Film Society - id 5)
INSERT INTO event (name, date, club_id, type_id, location) VALUES ('Film Screening', DATEADD(DAY, 15, CURRENT_DATE), 5, 6, 'Auditorium');
INSERT INTO event (name, date, club_id, type_id, location) VALUES ('Director Talk', DATEADD(DAY, 22, CURRENT_DATE), 5, 2, 'Room C');
INSERT INTO event (name, date, club_id, type_id, location) VALUES ('Film Club Meeting', DATEADD(DAY, 6, CURRENT_DATE), 5, 5, 'Lounge');