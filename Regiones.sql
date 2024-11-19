USE Pokemon;

DROP TABLE Region;

INSERT INTO Region VALUES("Kanto", "Primera", 151);

INSERT INTO Region VALUES("Johto", "Segunda", 100);

INSERT INTO Region VALUES("Hoenn", "Tercera", 135);

INSERT INTO Region VALUES("Sinnoh", "Cuarta", 107);

SELECT * FROM Region;

SELECT Generacion FROM Region Where Nombre = "Kanto";

SELECT * FROM Especie;