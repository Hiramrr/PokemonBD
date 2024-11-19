DROP TRIGGER validar_NumPokedex;

/*Valida si el numero de pokedex es valido con respecto a su region */
DELIMITER //
CREATE TRIGGER validar_NumPokedex
BEFORE INSERT ON Especie
FOR EACH ROW
BEGIN
    DECLARE maxNumPokemon INT;
    SELECT NumPokemon 
    INTO maxNumPokemon
    FROM Region
    WHERE Nombre = NEW.NomRegion;

    IF NEW.NumPokedex > maxNumPokemon THEN
        SET NEW.NumPokedex = NULL;
    END IF;
END//
DELIMITER ;
