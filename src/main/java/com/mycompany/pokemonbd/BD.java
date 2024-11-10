package com.mycompany.pokemonbd;

import java.net.ConnectException;
import java.sql.*;
import java.util.ArrayList;


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

    public void AgregarEntrenador(ImagenAlmacenEntrenador mImagen){
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(SQL_AGREGAR);
            ps.setInt(1, mImagen.getID());
            ps.setString(2, mImagen.getNombre());
            ps.setString(3, mImagen.getContraseña());
            ps.setBytes(4, mImagen.getImagen());
            ps.executeUpdate();
        }catch (Exception e){
            System.out.println(e);
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
}
