USE TIENDA_new;

-- INSERT INTO cliente VALUES (4587863,"Joaquín","Emilio",	"Correa",	"Guzmán","Cartagena",	"4587863",	"3125648792");
SELECT * FROM cliente;

INSERT INTO cliente VALUES (4587863 , "Joaquín" , "Emilio"  ,"Correa",	  "Guzmán" , "Cartagena",        NULL ,"3125648792");
INSERT INTO cliente VALUES (3256598 , "Luisa"   , NULL      ,"Restrepo",  "Ocampo" , "Pereira" ,         NULL ,"3002654879");
INSERT INTO cliente VALUES (2154578 , "Juan"    , "Alberto" ,"Martinez" , "Gacha" ,  "Medellín",  "3012225546","3235566");
INSERT INTO cliente VALUES (4565897 , "Leon"    , "Daniel"  ,"Gomez" ,    "Hoyos" ,  "Manizales", "3104569872","3255648");

INSERT INTO productos VALUES(1500,"panPrueba"   ,11111111,200);
INSERT INTO productos VALUES(1000,"azucarPrueba",22222222,300);
INSERT INTO productos VALUES(2000,"lechePrueba" ,33333333,400);

SELECT * FROM productos;

INSERT INTO vendedor VALUES(1234567, "Benito", "Garcia", "Beniga23","789321");
INSERT INTO vendedor VALUES(6547891, "Luis", "Amador", "lam123","456798");
INSERT INTO vendedor VALUES(9876543, "Sara", "Valencia", "Sval32","798465");

SELECT * FROM vendedor;

# Mismo vendedor distinto cliente
INSERT INTO factura VALUES(0001,4587863,"Medellin",1234567, "20210101");
INSERT INTO factura VALUES(0002,3256598,"Medellin",1234567, "20210101");

/* CAMBIO DE UN VALOR
UPDATE factura 
SET ventas_Vendedor_num_compra = 11114
WHERE num_compra = 0004;
*/

# Mismo Cliente distinto Vendedor
INSERT INTO factura VALUES(0003,2154578,"Medellin",6547891, "20210101");
INSERT INTO factura VALUES(0004,2154578,"Medellin",9876543, "20210101");

SELECT * FROM factura;

INSERT INTO detalle VALUES(11111111,0001,20);
INSERT INTO detalle VALUES(22222222,0001,30);
INSERT INTO detalle VALUES(33333333,0001,40);

INSERT INTO detalle VALUES(11111111,0002,10);
INSERT INTO detalle VALUES(22222222,0002,15);

INSERT INTO detalle VALUES(22222222,0003,11);
INSERT INTO detalle VALUES(33333333,0003,12);
SELECT * FROM detalle;

SELECT * FROM factura;

/*
Seleccionamos los campos de cada tabla
creamos unas instancias de cada una
comparamos las claves primaria y foranea
*/
SELECT c.nombre_1, f.num_compra
FROM factura f, cliente c 
WHERE f.Cliente_cc = c.cc;

SELECT cliente.nombre_1, factura.num_compra
FROM factura , cliente 
WHERE  cliente.cc = factura.Cliente_cc ;



