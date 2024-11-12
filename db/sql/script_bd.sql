--SELECT COMUNA
SELECT * 
FROM COMUNA;

--Script crea tabla comuna 
CREATE TABLE COMUNA(
    id_comuna number(10),
    nombre varchar2(50));

--Script crea tabla comuna 2 y posee un campo autoincrementable
CREATE TABLE COMUNA_2(
    id_comuna number(10)
        GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999
        START WITH 1 INCREMENT BY 1,
    nombre varchar2(50));
    
/** Insert con todos los campos indicados */
INSERT INTO COMUNA (id_comuna,nombre) VALUES (1,'Melipilla');
INSERT INTO COMUNA (id_comuna,nombre) VALUES (1,'Santiago');
INSERT INTO COMUNA (id_comuna,nombre) VALUES (1,'Vi�a del mar');

INSERT INTO COMUNA (id_comuna,nombre) VALUES (4,null);

-- Insert sin campos especificos 
INSERT INTO COMUNA VALUES (1,'Melipilla');
INSERT INTO COMUNA VALUES (1,'Santiago');
INSERT INTO COMUNA VALUES (1,'Vi�a del mar');


INSERT INTO COMUNA VALUES (1,'Melipilla','Hola');


INSERT INTO COMUNA_2 (nombre) VALUES ('Melipilla');
INSERT INTO COMUNA_2 (nombre) VALUES ('Santiago');
INSERT INTO COMUNA_2 (id_comuna,nombre) VALUES (null,'Vi�a del mar');
INSERT INTO COMUNA_2 (nombre) VALUES (null);

SELECT * 
FROM COMUNA_2
WHERE ID_COMUNA IN (5,7,9);
-- Left join de dos tablas
SELECT DISTINCT T1.ID_COMUNA,T2.NOMBRE
FROM COMUNA_2 T1
LEFT JOIN (
    SELECT NOMBRE
    FROM COMUNA_2
    WHERE ID_COMUNA IN 
            (SELECT ID_COMUNA 
            FROM COMUNA_2
            WHERE ID_COMUNA IN (5,7,9))) T2 ON T1.NOMBRE=T2.NOMBRE

        
        

INSERT INTO COMUNA_3 (id_comuna,nombre) VALUES (1,'Gato City');

SELECT * 
FROM COMUNA_3;

CREATE TABLE COMUNA_3(
    id_comuna number(10),
    nombre varchar2(50) NOT NULL);



SELECT * 
FROM COMUNA_2
WHERE ID_COMUNA;
