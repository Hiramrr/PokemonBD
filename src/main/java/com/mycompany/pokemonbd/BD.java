package com.mycompany.pokemonbd;

import java.sql.*;
import java.util.ArrayList;

/**
 * @autor Hiram
 */
public class BD {
    private static Connection con;

    private static Statement consulta;
    private static ResultSet resultado;


    private final String SQL_AGREGAR_MOVMIENTOS = "INSERT INTO Posee (NomMovimiento, IDPokemon, masPP) VALUES (?, ?, ?)";
    private final String SQL_AGREGAR_POKEMON = "INSERT INTO Pokemon(ID, IDEntrenador, Mote, Genero, HabEspecial, NumPokedex, PS, ATK, DEF, VEL, SDEF, SATK, Objeto, " +
            "Naturaleza, IVPS, IVATK, IVDEF, IVVEL, IVSDEF, IVSATK, EVPS, EVATK, EVDEF, EVVEL, EVSDEF, EVSATK ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private final String SQL_AGREGAR_ESPECIE = "INSERT INTO Especie (NumPokedex, Nombre, PSBase, ATKBase, DEFBase, VELBase, SDEFBase, SATKBase, Tipo1, Tipo2, NomRegion, Imagen) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
    private final String SQL_AGREGAR_ENTRENADOR = "INSERT INTO Entrenador (ID, Nombre, Contraseña, Imagen) VALUES (?, ?, ?, ?)";
    private final String SQL_CONSULTA = "SELECT * FROM Entrenador";


    public BD() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Pokemon", "Hiram", "coco123");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Pokemon", "Hiram", "coco123");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM Entrenador");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getBytes(4));

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    public void desconectar() {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean AgregarEntrenador(ImagenAlmacenEntrenador mImagen){
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(SQL_AGREGAR_ENTRENADOR);
            ps.setInt(1, mImagen.getID());
            ps.setString(2, mImagen.getNombre());
            ps.setString(3, mImagen.getContraseña());
            ps.setBytes(4, mImagen.getImagen());
            ps.executeUpdate();
            return true;
        } catch (Exception e){
            System.out.println(e);
            return false;
        } finally {
            try {
                ps.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }


    public boolean inicioSesion(String nombre, String contraseña) {
        try {
            consulta = con.createStatement();
            resultado = consulta.executeQuery("CALL validacion_entrenador('" + nombre + "','" + contraseña + "')");
            if (resultado.next()) {
                System.out.println("Inicio de sesión exitoso");
                return true;
            } else {
                System.out.println("Inicio de sesión fallido");
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public ArrayList cargarImagen(String idEntrenador) {
        ArrayList imagenes = new ArrayList<>();
        try {
            consulta = con.createStatement();
            resultado = consulta.executeQuery("SELECT Imagen FROM Entrenador WHERE ID = '" + idEntrenador + "'");
            if (resultado.next()) {
                System.out.println("Imagen cargada");
                imagenes.add(resultado.getBytes("Imagen")); // Añade la imagen en bytes al ArrayList
            } else {
                System.out.println("Imagen no cargada");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return imagenes;
    }

    public ArrayList obtenerDatos(String idEntrenador) {
        ArrayList datos = new ArrayList<>();
        try {
            consulta = con.createStatement();
            resultado = consulta.executeQuery("SELECT * FROM Entrenador WHERE ID = '" + idEntrenador + "'");
            if (resultado.next()) {
                System.out.println("Datos obtenidos");
                datos.add(resultado.getString("Nombre")); // 0
                datos.add(resultado.getString("Ganadas")); // 1
                datos.add(resultado.getString("Perdidas")); // 2
            } else {
                System.out.println("Datos no obtenidos");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return datos;
    }

    public void actualizarGanadas(String idEntrenador) {
        try {
            consulta = con.createStatement();
            consulta.executeUpdate("CALL actualizar_ganadas(" + idEntrenador + ")");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void actualizarPerdidas(String idEntrenador) {
        try {
            consulta = con.createStatement();
            consulta.executeUpdate("CALL actualizar_perdidas(" + idEntrenador + ")");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList obtenerTabla(String idEntrenador) {
        ArrayList tabla = new ArrayList<>();
        try {
            consulta = con.createStatement();
            resultado = consulta.executeQuery("CALL obtener_tablaEntrenador(" + idEntrenador + ")");

            while (resultado.next()) {
                tabla.add(resultado.getBytes("Imagen")); // 0
                tabla.add(resultado.getString("EntrenadorNombre")); // 1
                tabla.add(resultado.getString("Ganadas")); // 2
                tabla.add(resultado.getString("Perdidas")); // 3
                tabla.add(resultado.getInt("Favorito")); // 4
                tabla.add(resultado.getInt("Nombre")); // 5
                tabla.add(resultado.getString("Mote")); // 6
                tabla.add(resultado.getString("NumPokedex")); // 7
                tabla.add(resultado.getBytes("FotoPk")); // 8
            }
            return tabla;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String obtenerID(String nombre) {
        try {
            consulta = con.createStatement();
            resultado = consulta.executeQuery("CALL obtener_idEntrenador('" + nombre + "')");
            if (resultado.next()) {
                return resultado.getString("ID");
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public boolean actualizarDatosContraseñaImagen(ImagenAlmacenEntrenador mImagen){
        PreparedStatement ps = null;
        try{
            System.out.println("intento de actualizacion");
            ps = con.prepareStatement("UPDATE Entrenador SET Nombre = ?, Contraseña = ?, Imagen = ? WHERE ID = ?");
            ps.setString(1, mImagen.getNombre());
            ps.setString(2, mImagen.getContraseña());
            ps.setBytes(3, mImagen.getImagen());
            ps.setInt(4, mImagen.getID());
            ps.executeUpdate();
            return true;
        } catch (Exception e){
            System.out.println(e);
            return false;
        } finally {
            try {
                ps.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public boolean actualizarDatosContraseña(ImagenAlmacenEntrenador mImagen) {
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("UPDATE Entrenador SET Nombre = ?, Contraseña = ? WHERE ID = ?");
            ps.setString(1, mImagen.getNombre());
            ps.setString(2, mImagen.getContraseña());
            ps.setInt(3, mImagen.getID());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                ps.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public boolean actualizarDatosImagen(ImagenAlmacenEntrenador mImagen) {
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("UPDATE Entrenador SET Nombre = ?, Imagen = ? WHERE ID = ?");
            ps.setString(1, mImagen.getNombre());
            ps.setBytes(2, mImagen.getImagen());
            ps.setInt(3, mImagen.getID());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                ps.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public boolean actualizarDatosSinContraseña(ImagenAlmacenEntrenador mImagen) {
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("CALL actualizarDatosSinContraseña(?, ?)");
            ps.setString(1, mImagen.getNombre());
            ps.setInt(2, mImagen.getID());

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                ps.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public String getContraseña(String idEntrenador) {
        try {
            consulta = con.createStatement();
            resultado = consulta.executeQuery("CALL obtener_contraseña(" + idEntrenador + ")");;
            if (resultado.next()) {
                return resultado.getString("Contraseña");
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public void eliminarEntrenador(String idEntrenador) {
        try {
            consulta = con.createStatement();
            consulta.executeUpdate("DELETE FROM Entrenador WHERE ID = '" + idEntrenador + "'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList obtenerRegiones(){
        ArrayList regiones = new ArrayList<>();
        try{
            consulta = con.createStatement();
            resultado = consulta.executeQuery("CALL obtenerDatosRegion()");
            while (resultado.next()){
                regiones.add(resultado.getString("Nombre"));
                regiones.add(resultado.getString("Generacion"));
                regiones.add(resultado.getInt("NumPokemon"));
            }
        } catch (Exception e){
            System.out.println(e);
            return null;
        }
        return regiones;
    }

    public String obtenerEspaciosDisponiblesPokemon(String Region){
        try{
            consulta = con.createStatement();
            consulta.executeQuery("CALL contarDisponibles('" + Region + "', @disponibles)");
            resultado = consulta.executeQuery("SELECT @disponibles as Disponibles");
            if (resultado.next()) {
                return resultado.getString("Disponibles");
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public ArrayList obtenerDatosRegion(String Region){
        ArrayList datos = new ArrayList<>();
        try{
            consulta = con.createStatement();
            resultado = consulta.executeQuery("SELECT Generacion, NumPokemon FROM Region WHERE Nombre = '" + Region + "'");
            while(resultado.next()){
                datos.add(resultado.getString("Generacion"));
                datos.add(resultado.getInt("NumPokemon"));
            }
            return datos;
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Error al obtener la generacion");
        }
        return null;
    }

    public boolean agregarEspecie(AlmacenEspecie mEspecie){
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(SQL_AGREGAR_ESPECIE);
            ps.setInt(1, mEspecie.getNumPokedex());
            ps.setString(2, mEspecie.getNombre());
            ps.setInt(3, mEspecie.getPSBase());
            ps.setInt(4, mEspecie.getATKBase());
            ps.setInt(5, mEspecie.getDEFBase());
            ps.setInt(6, mEspecie.getVELBase());
            ps.setInt(7, mEspecie.getSDEFBase());
            ps.setInt(8, mEspecie.getSATKBase());
            ps.setString(9, mEspecie.getTipo1());
            ps.setString(10, mEspecie.getTipo2());
            ps.setString(11, mEspecie.getNomRegion());
            ps.setBytes(12, mEspecie.getImagen());
            ps.executeUpdate();
            return true;
        } catch (Exception e){
            System.out.println(e);
            return false;
        } finally {
            try {
                ps.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public ArrayList numPokedexValido(String Region) {
        ArrayList datos = new ArrayList<>();
        try {
            consulta = con.createStatement();
            resultado = consulta.executeQuery("CALL numPokedexLista('" + Region + "')");
            while(resultado.next()){
                datos.add(resultado.getString("total"));
            }
            return datos;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public ArrayList obtenerEspecies(){
        ArrayList especies = new ArrayList<>();
        try{
            consulta = con.createStatement();
            resultado = consulta.executeQuery("CALL obtenerEspecies()");
            while (resultado.next()) {
                especies.add(resultado.getString("Nombre"));
            }
            return especies;
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public ArrayList obtenerDatosEspecie(String nombre){
        ArrayList datos = new ArrayList<>();
        try{
            consulta = con.createStatement();
            resultado = consulta.executeQuery("CALL obtenerDatosEspecie('" + nombre + "')");
            while(resultado.next()){
                datos.add(resultado.getInt("numPokedex"));
                datos.add(resultado.getString("PSBase"));
                datos.add(resultado.getInt("ATKBase"));
                datos.add(resultado.getInt("DEFBase"));
                datos.add(resultado.getInt("VELBase"));
                datos.add(resultado.getInt("SDEFBase"));
                datos.add(resultado.getInt("SATKBase"));
                datos.add(resultado.getBytes("Imagen"));
            }
            return datos;
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public ArrayList obtenerMovimientos(){
        ArrayList movimientos = new ArrayList<>();
        try{
            consulta = con.createStatement();
            resultado = consulta.executeQuery("CALL obtenerMovimientos()");
            while (resultado.next()) {
                movimientos.add(resultado.getString("Nombre"));
            }
            return movimientos;
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public String obtenerPP(String movimiento){
        try{
            consulta = con.createStatement();
            resultado = consulta.executeQuery("CALL obtenerPP('" + movimiento + "')");
            while(resultado.next()){
                return resultado.getString("PP");
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public boolean agregarPokemon(ArrayList datos) {
        PreparedStatement ps = null;
        try {
            System.out.println("Intento de agregar pokemon");
            ps = con.prepareStatement(SQL_AGREGAR_POKEMON);
            ps.setInt(1, (int) datos.get(0)); //id
            ps.setInt(2, (int) datos.get(1)); //identrenador
            ps.setString(3, (String) datos.get(2)); //Mote
            ps.setString(4, (String) datos.get(3)); //genero
            ps.setString(5, (String) datos.get(4)); //habEspecial
            ps.setFloat(6, (int) datos.get(5)); //numPokedex
            ps.setFloat(7, (Float) datos.get(6)); //ps
            ps.setFloat(8, (Float) datos.get(7)); //atk
            ps.setFloat(9, (Float) datos.get(8));  //def
            ps.setFloat(10, (Float) datos.get(9)); //vel
            ps.setFloat(11, (Float) datos.get(10)); //sdef
            ps.setFloat(12, (Float) datos.get(11)); //satk
            ps.setString(13, (String) datos.get(12)); //objeto
            ps.setString(14, (String) datos.get(13)); //naturaleza
            ps.setInt(15, (int) datos.get(14)); //ivps
            ps.setInt(16, (int) datos.get(15)); //ivatk
            ps.setInt(17, (int) datos.get(16)); //ivdef
            ps.setInt(18, (int) datos.get(17)); //ivvel
            ps.setInt(19, (int) datos.get(18)); //ivsdef
            ps.setInt(20, (int) datos.get(19)); //ivsatk
            ps.setInt(21, (int) datos.get(20)); //evps
            ps.setInt(22, (int) datos.get(21)); //evatk
            ps.setInt(23, (int) datos.get(22)); //evdef
            ps.setInt(24, (int) datos.get(23)); //evvel
            ps.setInt(25, (int) datos.get(24)); //evsdef
            ps.setInt(26, (int) datos.get(25)); //evsatk
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                ps.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public boolean agregarMovimientos(ArrayList informacion) {
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(SQL_AGREGAR_MOVMIENTOS);
            ps.setString(1, (String) informacion.get(0)); // Nombre del movimiento llave foranea
            ps.setInt(2, (int) informacion.get(1)); // IDPokemon llave foranea
            ps.setInt(3, (int) informacion.get(2)); // masPP
            ps.executeUpdate();
            return true;
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Foreign key constraint violation: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public ArrayList<PokemonAlmacen> obtenerPokemon(String idEntrenador) {
        ArrayList<PokemonAlmacen> tabla = new ArrayList<>();
        try {
            consulta = con.createStatement();
            resultado = consulta.executeQuery("CALL lista_PKEntrenador(" + idEntrenador + ")");

            while (resultado.next()) {
                PokemonAlmacen pokemon = new PokemonAlmacen();
                pokemon.setImagen(resultado.getBytes("ImagenEspecie"));
                pokemon.setNombre(resultado.getString("NombreEspecie"));
                pokemon.setMote(resultado.getString("MotePokemon"));
                pokemon.setIDPokemon(resultado.getInt("IDPokemon"));

                tabla.add(pokemon);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return tabla;
    }

    public ArrayList obtenerDatosPokemon(String idPokemon){
        ArrayList datos = new ArrayList<>();
        try{
            consulta = con.createStatement();
            resultado = consulta.executeQuery("CALL obtener_InformacionPK(" + idPokemon + ")");
            while(resultado.next()){
                datos.add(resultado.getInt("IDPokemon")); // 0
                datos.add(resultado.getBytes("ImagenEspecie")); // 1
                datos.add(resultado.getString("NombreEspecie")); // 2
                datos.add(resultado.getString("MotePokemon")); // 3
                datos.add(resultado.getString("Tipo1")); // 4
                datos.add(resultado.getString("Tipo2")); // 5
                datos.add(resultado.getString("Objeto"));   // 6
                datos.add(resultado.getString("Naturaleza")); // 7
                datos.add(resultado.getString("Genero")); // 8
                datos.add(resultado.getString("HabEspecial")); // 9
                datos.add(resultado.getInt("NumPokedex")); // 10
                datos.add(resultado.getString("NombreRegion")); // 11
            }
            return datos;
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public ArrayList obtenerEstadisticasPokemon(String idPokemon){
        ArrayList estadisticas = new ArrayList<>();
        try{
            consulta = con.createStatement();
            resultado = consulta.executeQuery("CALL obtener_estadisticas_PK(" + idPokemon + ")");
            while(resultado.next()){
                estadisticas.add(resultado.getInt("ID")); // 0
                estadisticas.add(resultado.getInt("PSBase")); // 1
                estadisticas.add(resultado.getInt("ATKBase")); // 2
                estadisticas.add(resultado.getInt("DEFBase")); // 3
                estadisticas.add(resultado.getInt("VELBase")); // 4
                estadisticas.add(resultado.getInt("SDEFBase")); // 5
                estadisticas.add(resultado.getInt("SATKBase")); // 6
                estadisticas.add(resultado.getInt("IVPS")); // 7
                estadisticas.add(resultado.getInt("IVATK")); // 8
                estadisticas.add(resultado.getInt("IVDEF")); // 9
                estadisticas.add(resultado.getInt("IVVEL")); // 10
                estadisticas.add(resultado.getInt("IVSDEF")); // 11
                estadisticas.add(resultado.getInt("IVSATK")); // 12
                estadisticas.add(resultado.getInt("EVPS")); // 13
                estadisticas.add(resultado.getInt("EVATK"));  // 14
                estadisticas.add(resultado.getInt("EVDEF")); // 15
                estadisticas.add(resultado.getInt("EVVEL")); // 16
                estadisticas.add(resultado.getInt("EVSDEF")); // 17
                estadisticas.add(resultado.getInt("EVSATK")); // 18
                estadisticas.add(resultado.getFloat("PSFinal")); // 19
                estadisticas.add(resultado.getFloat("ATKFinal")); // 20
                estadisticas.add(resultado.getFloat("DEFFinal")); // 21
                estadisticas.add(resultado.getFloat("VELFinal"));  // 22
                estadisticas.add(resultado.getFloat("SDEFFinal")); // 23
                estadisticas.add(resultado.getFloat("SATKFinal")); // 24
            }
            return estadisticas;
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public int cuantos_Pokemon(String idEntrenador){
        try{
            consulta = con.createStatement();
            resultado = consulta.executeQuery("CALL cuantos_Pokemon(" + idEntrenador + ")");
            if (resultado.next()) {
                return resultado.getInt("Total");
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return 0;
    }

    public void asignarFavorito(String idPokemon, String idEntrenador){
        try{
            consulta = con.createStatement();
            consulta.executeUpdate("CALL asignar_favorito(" + idPokemon + ", " + idEntrenador + ")");
            System.out.println("Pokemon favorito asignado");
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public ArrayList obtenerMovimientosPokemon(String idPokemon){
        ArrayList movimientos = new ArrayList<>();
        try{
            consulta = con.createStatement();
            resultado = consulta.executeQuery("CALL obtener_movimientos_PK(" + idPokemon + ")");
            while(resultado.next()){
                movimientos.add(resultado.getString("Movimiento"));
                movimientos.add(resultado.getInt("PP"));
                movimientos.add(resultado.getInt("masPP"));
            }
            return movimientos;
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public String obtenerFavorito(String idEntrenador){
        try{
            consulta = con.createStatement();
            resultado = consulta.executeQuery("CALL obtener_favorito(" + idEntrenador + ")");
            if (resultado.next()) {
                return resultado.getString("Pokemon_favorito");
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
