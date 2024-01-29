														-- CONSULTAS SOBRE UNA TABLA --

-- 1. Lista el nombre de todos los productos que hay en la tabla producto.
SELECT p.nombre
FROM producto p;

-- 2. Lista los nombres y los precios de todos los productos de la tabla producto.
SELECT nombre, precio
FROM producto;

-- 3. Lista todas las columnas de la tabla producto.
 SELECT *
 FROM producto;

-- 4. Lista el nombre de los productos, el precio en euros y el precio en dólares estadounidenses (USD).
SELECT nombre, precio AS Euros, precio AS USD
FROM producto;

-- 5. Lista el nombre de los productos, el precio en euros y el precio en dólares estadounidenses (USD).
-- Utiliza los siguientes alias para las columnas: nombre de producto, euros, dólares.
SELECT nombre, precio AS Euros, precio AS USD
FROM producto;

-- 6. Lista los nombres y los precios de todos los productos de la tabla producto, convirtiendo los nombres a mayúscula.
SELECT UPPER(nombre) AS nombre_upper, precio
FROM producto;

-- 7. Lista los nombres y los precios de todos los productos de la tabla producto, convirtiendo los nombres a minúscula.
SELECT LOWER(nombre) AS nombre_lower, precio
FROM producto;

-- 8. Lista el nombre de todos los fabricantes en una columna, y en otra columna obtenga en mayúsculas los dos primeros caracteres del nombre del fabricante.
SELECT nombre, substr(nombre, 1,2)
FROM fabricante;

-- 9. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor del precio.
SELECT nombre, ROUND(precio)
FROM producto;

-- 10. Lista los nombres y los precios de todos los productos de la tabla producto, truncando el valor del precio para mostrarlo sin ninguna cifra decimal.
SELECT TRUNCATE(precio,0) AS precio_truncado, nombre
FROM producto;

-- 11. Lista el identificador de los fabricantes que tienen productos en la tabla producto.
SELECT distinct(fabricante.id)
FROM fabricante
INNER JOIN producto ON fabricante.id
;

-- 12. Lista el identificador de los fabricantes que tienen productos en la tabla producto, eliminando los identificadores que aparecen repetidos 
SELECT DISTINCT(id_fabricante.id) AS unico_id
FROM producto p
;

-- 13. Lista los nombres de los fabricantes ordenados de forma ascendente
SELECT f.nombre 
FROM fabricante f
ORDER BY nombre ASC
;

-- 14. Lista los nonbres de los fabricantes ordenados de forma descendente
SELECT nombre
FROM fabricante 
ORDER BY nombre DESC;

-- 15. Lista los nombres de los productos ordenados en primer lugar por el nombre en forma ascendente y en esgundo lugar por el precio en forma descendente
SELECT nombre AS nombre_ascendiente, precio
FROM producto
ORDER BY nombre ASC, precio DESC
;

-- 16. Devuelve una lista con las 5 primeras filas de la tabla fabricante
SELECT *
FROM fabricante
LIMIT 5
;

-- 17. Devuelva una lista con 2 filas a partir de la cuarta fila de la tabla fabricante. La cuarta fila también se debe incluir en la respuesta
SELECT *
FROM fabricante
LIMIT 3,2
;

-- 18. Lista el nombre y el precio del producto más barato (Utilice solamente cláusulas ORDER BY y LIMIT)
SELECT nombre, precio
FROM producto
ORDER BY precio ASC
LIMIT 1
;

-- 19. Lista el nombre y el precio del producto más caro (Utilice solamente cláusulas ORDER BY y LIMIT)
SELECT nombre, precio
FROM producto
ORDER BY precio DESC
LIMIT 1
;

-- 20. Lista el nombre de todos los productos del fabricante cuyo identificador de fabricante es igual a 2
SELECT nombre
FROM producto
WHERE id_fabricante=2
;

-- 21. Lista el nombre de los productos que tienen un precio menor o igual a 120 euros
SELECT nombre AS precio_menorIgual120
FROM producto
WHERE precio <= 120
;

-- 22. Lista el nombre de los productos que tienen un precio mayor o igual a 120 euros
SELECT nombre AS precio_menorIgual120
FROM producto
WHERE precio >= 120
;

-- 23. Lista el nombre de los productos que no tienen un precio mayor o igual a 400 euros
SELECT nombre AS precio_menor400
FROM producto 
WHERE precio<400
;

-- 24. Lista todos los productos que tengan un precio entre 80 euros y 300 euros. Sin utilizar el operador between
SELECT *
FROM producto 
WHERE precio>=80 AND precio<=300
;

-- 25. Lista todos los productos que tengan un precio entre 60 euros y 200 euros. Utiliza el operador between
SELECT *
FROM producto
WHERE precio BETWEEN 60 AND 200
;

-- 26. Lista todos los productos que tengan un precio mayor que 200 euros y que el identificador del fabricante sea igual a 6
SELECT *
FROM producto
WHERE precio>200 AND id_fabricante=6
;

-- 27. Lista todos los productos donde el identificador de fabricante sera 1,3 o 5. Sin utilizar el operador IN
SELECT *
FROM producto 
WHERE id_fabricante=3 OR id_fabricante=1 OR id_fabricante=5
;

-- 28. Lista todos los productos donde el identificador de fabricante sera 1,3 o 5. Utiliza el operador IN
SELECT *
FROM producto 
WHERE id_fabricante IN (1,3,5)
;

-- 29. Lista el nombre y el precio de los productos en céntimos (euro*100). Cree un alias para la columna que contiene el precio que se llame céntimos
SELECT nombre, precio*100 AS céntimos
FROM producto
;

-- 30. Lista los nombres de los fabricantes cuyo nombre empiece por letra S
SELECT nombre AS nombre_inicio_S
FROM fabricante
WHERE nombre LIKE 'S%'
;

-- 31. Lista los nombres de fabricantes cuyo nombre termine por vocal e
SELECT nombre AS nombre_terminado_E
FROM fabricante
WHERE nombre LIKE '%e'
;

-- 32. Lista los nombres de los fabricantes cuyo nombre contenga un carácter w
SELECT nombre AS nombre_contiene_W
FROM fabricante
WHERE nombre lIKE '%w%'
;

-- 33. Lista los nombres de los fabricantes cuyo nombre sea de 4 caracteres
SELECT nombre AS nombre_4caracteres
FROM fabricante 
WHERE length(nombre)=4
;

-- 34. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil en el nombre
SELECT nombre AS nombre_cadena
FROM producto
WHERE nombre LIKE '%Portátil%'
;

-- 35. Devuelve una lista con el nombre de todos los productos que contienen la cadena Monitor en el nombre y tienen un precio inferior a 215 euros
SELECT nombre AS nombre_cadena, precio AS precio_inferior
FROM producto
WHERE nombre LIKE '%Monitor%' && precio<215
;

-- 36. Lista el nombre y el precio de todos los productos que tengan un precio mayor o igual a 180 euros. Ordene el resultado en primer lugar por el precio (en orden descendente)
-- y en segundo lugar por el nombre (en orden ascendente)

SELECT nombre, precio
FROM producto
WHERE precio >= 180
ORDER BY precio DESC, nombre ASC
;
														-- CONSULTAS SOBRE UNA TABLA --
