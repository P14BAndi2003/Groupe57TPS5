create database flotte_avion;

\c flotte_avion

create table Avion (
id_Avion serial primary key,
immatriculation VARCHAR(10) not null,
fin_Assurance Date not null,
photo varchar(200)
);

create table Kilometrage (
id_kilometrage serial primary key,
id_Avion int,
foreign key (id_Avion) references Avion(id_Avion),
date Date not null,
debutkm int,
finkm int
);

create table typeEntretien (
id_type serial primary key,
type varchar(20)
);

create table Entretien (
id_entretien serial primary key,
id_type int,
foreign key (id_type) references typeEntretien(id_type),
id_Avion int,
foreign key (id_Avion) references Avion(id_Avion),
date Date not null
);