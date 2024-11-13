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


    private String SQL_AGREGAR = "INSERT INTO Entrenador (ID, Nombre, Contraseña, Imagen) VALUES (?, ?, ?, ?)";
    private String SQL_CONSULTA = "SELECT * FROM Entrenador";


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
            ps = con.prepareStatement(SQL_AGREGAR);
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


    /*
    Este seria mas para cargar los pokemons guardados en la base de datos
     */
    public ArrayList CargarImagen(){
        ArrayList imagenes = new ArrayList<>();
        try{
            consulta = con.createStatement();
            resultado = consulta.executeQuery(SQL_CONSULTA);
            while (resultado.next()){
                ImagenAlmacenEntrenador imagen = new ImagenAlmacenEntrenador();
                imagen.setID(resultado.getInt("ID"));
                imagen.setNombre(resultado.getString("Nombre"));
                imagen.setContraseña(resultado.getString("Contraseña"));
                imagen.setImagen(resultado.getBytes("Imagen"));
                imagenes.add(imagen);
            }
        } catch (Exception e){
            System.out.println(e);
            return null;
        }
        return imagenes;
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

    public ArrayList<ImagenAlmacenEntrenador> obtenerTabla(String idEntrenador) {
        ArrayList<ImagenAlmacenEntrenador> tabla = new ArrayList<>();
        try {
            consulta = con.createStatement();
            resultado = consulta.executeQuery("CALL obtener_tablaEntrenador(" + idEntrenador + ")");

            while (resultado.next()) {
                ImagenAlmacenEntrenador entrenador = new ImagenAlmacenEntrenador();
                entrenador.setID(resultado.getInt("ID"));
                entrenador.setNombre(resultado.getString("Nombre"));
                entrenador.setImagen(resultado.getBytes("Imagen"));

                tabla.add(entrenador);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return tabla;
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
}
