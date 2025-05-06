-- Ricardo Fabian Espinosa Largo
-- Eliminar el esquema si ya existe
DROP SCHEMA IF EXISTS sistema_vehiculos;

-- Crear el esquema
CREATE SCHEMA sistema_vehiculos
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;

-- Usar el esquema creado
USE sistema_vehiculos;

-- Tabla Propietario
CREATE TABLE Propietario (
    idPropietario INT PRIMARY KEY AUTO_INCREMENT,
    apellido VARCHAR(50),
    nombre VARCHAR(50),
    cedula VARCHAR(20)
);

-- Tabla Vehiculo
CREATE TABLE Vehiculo (
    idVehiculo INT PRIMARY KEY AUTO_INCREMENT,
    placa VARCHAR(10),
    marca VARCHAR(50),
    estado VARCHAR(20),
    idPropietario INT,
    FOREIGN KEY (idPropietario) REFERENCES Propietario(idPropietario)
);

-- Tabla Turno
CREATE TABLE Turno (
    idTurno INT PRIMARY KEY AUTO_INCREMENT,
    anden INT,
    dia INT,
    hora INT,
    idVehiculo INT,
    FOREIGN KEY (idVehiculo) REFERENCES Vehiculo(idVehiculo)
);

/*
pruebas:
SELECT * FROM Propietario;
SELECT * FROM Vehiculo;
SELECT * FROM Turno;
 */