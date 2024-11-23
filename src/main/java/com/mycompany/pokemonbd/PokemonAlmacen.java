package com.mycompany.pokemonbd;

public class PokemonAlmacen {
    private int IDPokemon;
    private String Nombre;
    private String Mote;
    private byte [] imagen;

    public int getIDPokemon() {
        return IDPokemon;
    }
    public void setIDPokemon(int IDPokemon) {
        this.IDPokemon = IDPokemon;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public String getMote() {
        return Mote;
    }
    public void setMote(String mote) {
        this.Mote = mote;
    }
    public byte[] getImagen() {
        return imagen;
    }
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
}

