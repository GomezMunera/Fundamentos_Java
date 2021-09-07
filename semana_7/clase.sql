CREATE DATABASE concesionario;
USE concesionario ;

CREATE TABLE Vehiculos (
placa VARCHAR(10) NOT NULL,
marca VARCHAR(50) NOT NULL,
modelo VARCHAR(50) NOT NULL,
kilometraje INT NOT NULL,
fecha_venta DATE,
documento_vendedor INT NOT NULL,
PRIMARY KEY ( placa )
);

CREATE TABLE Vendedores (
documento_vendedor INT NOT NULL,
nombres VARCHAR(50) NOT NULL,
apellidos VARCHAR(50) NOT NULL,
ciudad VARCHAR(50) NOT NULL,
PRIMARY KEY ( documento_vendedor )
);

ALTER TABLE Vehiculos
ADD FOREIGN KEY (documento_vendedor)
REFERENCES Vendedores(documento_vendedor);

INSERT INTO Vendedores (documento_vendedor,
nombres, apellidos, ciudad)
VALUES ('1964', 'Juan', 'Rodríguez', 'Medellín');
INSERT INTO Vendedores (documento_vendedor,
nombres, apellidos, ciudad)
VALUES ('2853', 'José', 'González', 'Bogotá');
INSERT INTO Vendedores (documento_vendedor,
nombres, apellidos, ciudad)
VALUES ('6501', 'Luis', 'Gómez', 'Cali');

INSERT INTO Vehiculos (placa, marca, modelo,
kilometraje, fecha_venta, documento_vendedor)
VALUES ('ACD 427', 'Renault', 'Stepway', '25000',
'2020-7-05', '1964');
INSERT INTO Vehiculos (placa, marca, modelo,
kilometraje, fecha_venta, documento_vendedor)
VALUES ('IYU 521', 'Renault', 'Clío', '70200',
null, '2853');
INSERT INTO Vehiculos (placa, marca, modelo,
kilometraje, fecha_venta, documento_vendedor)
VALUES ('POI 700', 'Nissan', 'March', '45345',
null, '1964');

SELECT * FROM vendedores;

SELECT * FROM
vehiculos;

ALTER TABLE vendedores
RENAME COLUMN documento_vendedor TO documento;

/*
SELECT * FROM candidates 
WHERE id = 100 OR id = 101;
*/