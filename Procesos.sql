DROP PROCEDURE cuantos_entrenadores;

/*Contar cuantos entrenadores tenemos*/
DELIMITER //
CREATE PROCEDURE cuantos_entrenadores(
  OUT num_entrenadores INT
)
BEGIN
	SELECT COUNT(*)
	INTO num_entrenadores
	FROM Entrenador
	WHERE ID;
END //
DELIMITER ;

CALL cuantos_entrenadores(@cantidad);
SELECT @cantidad;

DROP PROCEDURE actualizar_ganadas;

/*Actualizar batallas ganadas del entrenador*/
DELIMITER //
CREATE PROCEDURE actualizar_ganadas(idEntrenador INT)
	BEGIN
		UPDATE Entrenador
        SET Ganadas = Ganadas + 1
        WHERE ID = idEntrenador;
	END //
DELIMITER ;

DROP PROCEDURE actualizar_perdidas;

/*Actualizar batallas perdidas del entrenador*/
DELIMITER //
CREATE PROCEDURE actualizar_perdidas(idEntrenador INT)
	BEGIN
		UPDATE Entrenador
        SET Perdidas = Perdidas + 1
        WHERE ID = idEntrenador;
	END //
DELIMITER ;

DROP PROCEDURE obtener_tablaEntrenador;

/*Obtiene una tabla con los demas Entrenadores registrados excluyendo al que la solicita*/
DELIMITER //
CREATE PROCEDURE obtener_tablaEntrenador(idEntrenador INT)
	BEGIN
		SELECT ID, Nombre, Imagen 
        FROM Entrenador 
        WHERE ID != idEntrenador;
	END //
DELIMITER ;


DROP PROCEDURE obtener_idEntrenador;

/*Obtiene el id del entranador solo con su nombre*/
DELIMITER //
CREATE PROCEDURE obtener_idEntrenador(Nombre_Entrenador varchar(20))
	BEGIN
		SELECT ID 
        FROM Entrenador 
        WHERE Nombre = Nombre_Entrenador;
	END //
DELIMITER ;

DROP PROCEDURE validacion_entrenador;

/*Valida el usuario para el login*/
DELIMITER //
CREATE PROCEDURE validacion_entrenador(Nombre_Entrenador varchar(20), Contraseña_Entrenador varchar(255))
	BEGIN
		SELECT * 
        FROM Entrenador 
        WHERE Nombre = Nombre_Entrenador
        AND Contraseña = Contraseña_Entrenador;
	END //
DELIMITER ;

DROP PROCEDURE obtener_contraseña;

/*Valida el usuario para el login*/
DELIMITER //
CREATE PROCEDURE obtener_contraseña(idEntrenador INT(5))
	BEGIN
		SELECT Contraseña 
        FROM Entrenador 
        WHERE ID = idEntrenador;
	END //
DELIMITER ;

CALL obtener_contraseña(40466);

DROP PROCEDURE actualizarDatosSinContraseña;

/*Actualiza solo el nombre del entrenador */
DELIMITER //
CREATE PROCEDURE actualizarDatosSinContraseña(Nombre_nuevo varchar(20), idEntrenador INT(5))
	BEGIN
		UPDATE Entrenador 
        SET Nombre = Nombre_nuevo
        WHERE ID = idEntrenador;
	END //
DELIMITER ;

DROP PROCEDURE obtenerDatosRegion;

DELIMITER //
CREATE PROCEDURE obtenerDatosRegion()
	BEGIN
		SELECT *
        FROM Region;
	END //
DELIMITER ;

DROP PROCEDURE contarDisponibles;
/* Cuenta los espacios que quedan disponibles en la region de los pokemons*/
DELIMITER //
CREATE PROCEDURE contarDisponibles(
    IN NombreRegion VARCHAR(20),
    OUT EspaciosDisponibles INT
)
BEGIN
    DECLARE espaciosUtilizados INT;

    SELECT COUNT(*)
    INTO espaciosUtilizados
    FROM Especie
    WHERE NomRegion = NombreRegion;

    SELECT NumPokemon - espaciosUtilizados
    INTO EspaciosDisponibles
    FROM Region
    WHERE Nombre = NombreRegion;
END //
DELIMITER ;

CALL contarDisponibles("Kanto", @disponibles);
SELECT @disponibles as Disponibles;

DROP PROCEDURE numPokedexLista;
/*regresa una lista con los numeros de pokedex*/
DELIMITER //
CREATE PROCEDURE numPokedexLista(NombreRegion VARCHAR(20))
	BEGIN
		SELECT numPokedex as total
        FROM Especie
        Where NomRegion = NombreRegion;
	END //
DELIMITER ;

CALL numPokedexLista("kanto");
        
