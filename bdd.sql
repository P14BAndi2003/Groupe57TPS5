create database flotte_avion;

\c flotte_avion

create table Avion (
id_Avion serial primary key,
immatriculation VARCHAR(10) not null,
fin_Assurance Date not null,
photo varchar(200) default 'avion.jpg'
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



insert into Avion(immatriculation,fin_Assurance) values('Avion 111','2023-01-01'),('Avion 222','2023-01-02'),('Avion 333','2023-01-03');

insert into Kilometrage(id_Avion,date,debutkm,finkm) values(1,'2022-12-10',1000,2000),(2,'2022-12-11',1000,4000),(3,'2022-12-12',1000,6000);

insert into typeEntretien(type) values('vidange'),('pneu');

insert into Entretien(id_type,id_Avion,date) values(1,1,'2022-12-01'),(1,2,'2022-12-02'),(1,3,'2022-12-03');