CREATE TABLE USERS (
    idUser  SERIAL primary key,
    mail     VARCHAR(30),
    mdp     VARCHAR(30) 
);
INSERT INTO USERS (mail,mdp) VALUES ('aro@gmail.com','aro123'),('fitia@gmail.com','fitia123');

CREATE TABLE VOITURE(
    idVoiture       serial primary key,
    matricule   VARCHAR(30)
);
INSERT INTO VOITURE (matricule) VALUES ('7498TF'),('2629TV');
CREATE TABLE kilometrage(
    idKilometrage   serial primary key,
    debut       double precision,
    fin     double precision,
    idVoiture int references  voiture (idvoiture),
    dates   date
);
INSERT INTO kilometrage (debut, fin, idVoiture, dates) VALUES
(100.5, 250.8, 1, '2023-01-15'),
(300.2, 500.1, 2, '2023-02-02'),
(50.0, 120.3, 1, '2023-03-10'),
(600.7, 800.5, 1, '2023-04-22'),
(150.8, 300.0, 2, '2023-05-05');
