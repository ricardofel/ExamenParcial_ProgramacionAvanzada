-- Eliminar el esquema si ya existe
DROP SCHEMA IF EXISTS sistema_celulares;

-- Crear el esquema
CREATE SCHEMA sistema_celulares
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;

-- Usar el esquema creado
USE sistema_celulares;

-- Tabla Cliente
CREATE TABLE Cliente (
    idClie INT AUTO_INCREMENT PRIMARY KEY,
    cedula VARCHAR(10),
    nombres VARCHAR(100),
    apellidos VARCHAR(100)
);

-- Tabla Celular
CREATE TABLE Celular (
    idCel INT AUTO_INCREMENT PRIMARY KEY,
    numero VARCHAR(10),
    estado VARCHAR(100),
    saldo INT,
    megas INT,
    idClie INT,
    FOREIGN KEY (idClie) REFERENCES Cliente(idClie)
);

-- Tabla Recarga
CREATE TABLE Recarga (
    idReca INT AUTO_INCREMENT PRIMARY KEY,
    valor INT,
    saldo INT,
    megas INT,
    idCel INT,
    FOREIGN KEY (idCel) REFERENCES Celular(idCel)
);

-- Hacer Pruebas
SELECT * from cliente;
select * from celular;
select * from recarga;