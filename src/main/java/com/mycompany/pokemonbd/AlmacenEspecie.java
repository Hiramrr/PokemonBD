package com.mycompany.pokemonbd;

public class AlmacenEspecie {
    private int numPokedex;
    private String nombre;
    private int PSBase;
    private int ATKBase;
    private int DEFBase;
    private int VELBase;
    private int SDEFBase;
    private int SATKBase;
    private String tipo1;
    private String tipo2;
    private String NomRegion;
    private byte [] imagen;

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPSBase() {
        return PSBase;
    }

    public void setPSBase(int PSBase) {
        this.PSBase = PSBase;
    }

    public int getATKBase() {
        return ATKBase;
    }

    public void setATKBase(int ATKBase) {
        this.ATKBase = ATKBase;
    }

    public int getDEFBase() {
        return DEFBase;
    }

    public void setDEFBase(int DEFBase) {
        this.DEFBase = DEFBase;
    }

    public int getVELBase() {
        return VELBase;
    }

    public void setVELBase(int VELBase) {
        this.VELBase = VELBase;
    }

    public int getSDEFBase() {
        return SDEFBase;
    }

    public void setSDEFBase(int SDEFBase) {
        this.SDEFBase = SDEFBase;
    }

    public int getSATKBase() {
        return SATKBase;
    }

    public void setSATKBase(int SATKBase) {
        this.SATKBase = SATKBase;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public String getNomRegion() {
        return NomRegion;
    }

    public void setNomRegion(String NomRegion) {
        this.NomRegion = NomRegion;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
}
