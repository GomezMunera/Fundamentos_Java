use colegio;

SELECT * FROM estudiante_has_materias;

-- crear una tabla a partir de las otras dos tablas

CREATE TABLE MateriasJuan
SELECT m.nombre as materia, e.nombre
FROM materias m, estudiante e, estudiante_has_materias h
WHERE e.cc = h.Estudiante_cc AND  m.codigo=h.Materias_codigo AND e.nombre="Pedro";

SELECT * FROM MateriasJuan;


CREATE VIEW MateriasJuanV AS
SELECT m.nombre as MateriasJuan 
FROM materias m, estudiante e, estudiante_has_materias h
WHERE e.cc = h.Estudiante_cc AND  m.codigo=h.Materias_codigo AND e.nombre="Pedro";

SELECT * FROM MateriasJuanV;


-- CREATE TABLE completa
SELECT e.nombre, 
e.apellido, e.edad, e.cc,
m.nombre as materia,
m.codigo as CodMateria,
m.horario, m.creditos
FROM materias m, estudiante e, estudiante_has_materias h
WHERE e.cc = h.Estudiante_cc AND  m.codigo=h.Materias_codigo
ORDER BY e.nombre DESC;

