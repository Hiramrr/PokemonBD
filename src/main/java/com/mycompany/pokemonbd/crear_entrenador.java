/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.pokemonbd;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author sasuk
 */
public class crear_entrenador extends javax.swing.JPanel implements ActionListener {
    String ruta;
    BD mBD = new BD();
    /**
     * Creates new form crear_entrenador
     */
    public crear_entrenador() {
        initComponents();
        entrenadorID.setText(generarID());
        if(mBD.conectar()){
            System.out.println("Conectado");
        } else {
            System.out.println("No conectado");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        secundario = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        entrenadorID = new javax.swing.JTextField();
        ID_label = new javax.swing.JLabel();
        contraseña_label = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        nombre_label = new javax.swing.JLabel();
        IDEntrenador1 = new javax.swing.JTextField();
        imagen = new javax.swing.JPanel();
        perfil = new javax.swing.JLabel();
        cargar = new javax.swing.JButton();
        crear = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(704, 502));
        setLayout(new java.awt.BorderLayout());

        principal.setBackground(new java.awt.Color(13, 17, 23));
        principal.setMinimumSize(new java.awt.Dimension(704, 502));
        principal.setPreferredSize(new java.awt.Dimension(704, 502));

        secundario.setBackground(new java.awt.Color(22, 26, 33));
        secundario.setForeground(new java.awt.Color(22, 26, 33));
        secundario.setMinimumSize(new java.awt.Dimension(548, 411));
        secundario.setPreferredSize(new java.awt.Dimension(548, 411));

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Crear entrenador");

        entrenadorID.setEditable(false);
        entrenadorID.setBackground(new java.awt.Color(13, 17, 23));
        entrenadorID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        entrenadorID.setForeground(new java.awt.Color(255, 255, 255));
        entrenadorID.setBorder(null);
        entrenadorID.setCaretColor(new java.awt.Color(255, 255, 255));
        entrenadorID.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        entrenadorID.setEnabled(false);
        entrenadorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrenadorIDActionPerformed(evt);
            }
        });

        ID_label.setBackground(new java.awt.Color(255, 255, 255));
        ID_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ID_label.setForeground(new java.awt.Color(255, 255, 255));
        ID_label.setText("ID Entrenador");

        contraseña_label.setBackground(new java.awt.Color(255, 255, 255));
        contraseña_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        contraseña_label.setForeground(new java.awt.Color(255, 255, 255));
        contraseña_label.setText("Contraseña");

        contraseña.setBackground(new java.awt.Color(13, 17, 23));
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setBorder(null);

        nombre_label.setBackground(new java.awt.Color(255, 255, 255));
        nombre_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombre_label.setForeground(new java.awt.Color(255, 255, 255));
        nombre_label.setText("Nombre del entrenador");

        IDEntrenador1.setBackground(new java.awt.Color(13, 17, 23));
        IDEntrenador1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IDEntrenador1.setForeground(new java.awt.Color(255, 255, 255));
        IDEntrenador1.setBorder(null);
        IDEntrenador1.setCaretColor(new java.awt.Color(255, 255, 255));
        IDEntrenador1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        IDEntrenador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDEntrenador1ActionPerformed(evt);
            }
        });

        imagen.setBackground(new java.awt.Color(13, 17, 23));
        imagen.setForeground(new java.awt.Color(13, 17, 23));
        imagen.setLayout(null);
        imagen.add(perfil);
        perfil.setBounds(-4, -3, 160, 160);

        cargar.setBackground(new java.awt.Color(30, 112, 235));
        cargar.setForeground(new java.awt.Color(255, 255, 255));
        cargar.setText("Cargar imagen");
        cargar.addActionListener(this);

        crear.setBackground(new java.awt.Color(30, 112, 235));
        crear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        crear.setForeground(new java.awt.Color(255, 255, 255));
        crear.setText("Crear entrenador");
        crear.addActionListener(this);

        javax.swing.GroupLayout secundarioLayout = new javax.swing.GroupLayout(secundario);
        secundario.setLayout(secundarioLayout);
        secundarioLayout.setHorizontalGroup(
            secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secundarioLayout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(121, 121, 121))
            .addGroup(secundarioLayout.createSequentialGroup()
                .addGroup(secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(secundarioLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(crear))
                    .addGroup(secundarioLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contraseña)
                            .addGroup(secundarioLayout.createSequentialGroup()
                                .addGroup(secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contraseña_label)
                                    .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cargar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ID_label)
                                    .addComponent(nombre_label)
                                    .addComponent(IDEntrenador1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(entrenadorID, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        secundarioLayout.setVerticalGroup(
            secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secundarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titulo)
                .addGap(0, 22, Short.MAX_VALUE)
                .addGroup(secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(secundarioLayout.createSequentialGroup()
                        .addComponent(nombre_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDEntrenador1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ID_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(entrenadorID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(contraseña_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(crear)
                .addGap(15, 15, 15))
        );

        ID_label.getAccessibleContext().setAccessibleName("ID Entrenador");

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(secundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(secundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        add(principal, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void entrenadorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrenadorIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entrenadorIDActionPerformed

    private void IDEntrenador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDEntrenador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDEntrenador1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDEntrenador1;
    private javax.swing.JLabel ID_label;
    private javax.swing.JButton cargar;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel contraseña_label;
    private javax.swing.JButton crear;
    private javax.swing.JTextField entrenadorID;
    private javax.swing.JPanel imagen;
    private javax.swing.JLabel nombre_label;
    private javax.swing.JLabel perfil;
    private javax.swing.JPanel principal;
    private javax.swing.JPanel secundario;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
    
    public String generarID(){
        Random random = new Random();
        int limiteInferior = 10000;
        int limiteSuperior = 65535;
        int limiteSuperiorAbierto = limiteSuperior + 1;
        int numeroAleatorio = limiteInferior + random.nextInt(limiteSuperiorAbierto - limiteInferior);
 
        return String.valueOf(numeroAleatorio);
    }

    public boolean crearEntrenador(){
        String nombre = IDEntrenador1.getText();
        String pass = contraseña.getText();
        String id = entrenadorID.getText();

        ImagenAlmacenEntrenador entrenador = new ImagenAlmacenEntrenador();
        entrenador.setID(Integer.parseInt(id));
        entrenador.setNombre(nombre);
        entrenador.setContraseña(pass);
        //Checa si el usuario cargo una imagen, si no la cargo se le asiganara una default
        try {
            entrenador.setImagen(getImagen(ruta));
        } catch (NullPointerException e){
            entrenador.setImagen(getImagen("src/main/resources/images/PikachuPrueba.png"));
        }
        if(mBD.AgregarEntrenador(entrenador)) {
            ((PInicio) javax.swing.SwingUtilities.getWindowAncestor(this)).crearUsuarioExitoso();
            vaciarTexto();
            return true;
        } else {
            ((PInicio) javax.swing.SwingUtilities.getWindowAncestor(this)).crearUsuarioError("El nombre "  +  nombre + " ya existe en la base de datos");
            return false;
        }
    }



    public void vaciarTexto(){
        IDEntrenador1.setText("");
        contraseña.setText("");
        entrenadorID.setText(generarID());
        perfil.setIcon(null);
    }

    public void cargarImagen(){
        JFileChooser archivos = new JFileChooser();
        FileNameExtensionFilter imagenes = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        archivos.setFileFilter(imagenes);

        int respuesta = archivos.showOpenDialog(this);
        if(respuesta == archivos.APPROVE_OPTION){
            ruta = archivos.getSelectedFile().getPath();

            Image foto = new ImageIcon(ruta).getImage();
            ImageIcon icono = new ImageIcon(foto.getScaledInstance(imagen.getWidth(),imagen.getHeight(),Image.SCALE_SMOOTH));
            perfil.setIcon(icono);
        }
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == crear){
            crearEntrenador();
        }

        if(evt.getSource() == cargar){
            cargarImagen();
        }
    }

    private byte[] getImagen(String ruta){
        File imagen = new File(ruta);
        try{
            byte[] icono = new byte[(int)imagen.length()];
            InputStream input = new FileInputStream(imagen);
            input.read(icono);
            return icono;
        } catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

}
