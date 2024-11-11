/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pokemonbd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author hiram
 */
public class Usuario extends javax.swing.JFrame implements ActionListener {
    private String idEntrenador;
    BD mBD = new BD();
    ImagenAlmacenEntrenador mImagen = new ImagenAlmacenEntrenador();
    /**
     * Creates new form Usuario
     */
    public Usuario() {
        initComponents();
        setIconImage(new ImageIcon("Icono.jpg").getImage());
        this.setTitle("Perfil de usuario");
    }

    public Usuario(String idEntrenador) {
        this.idEntrenador = idEntrenador;
        initComponents();
        setIconImage(new ImageIcon("Icono.png").getImage());
        this.setTitle("Perfil de usuario");
        cargarImagen();
        cargarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        saludo_label = new javax.swing.JLabel();
        nombre_label = new javax.swing.JLabel();
        idEntrenador_label = new javax.swing.JLabel();
        pk_favorito = new javax.swing.JLabel();
        adios = new javax.swing.JButton();
        favorito_label = new javax.swing.JLabel();
        ganadas_label = new javax.swing.JLabel();
        perdidas_label = new javax.swing.JLabel();
        cerrar = new javax.swing.JButton();
        imagen = new javax.swing.JPanel();
        perfil = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(13, 17, 23));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 764));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(22, 26, 33));
        jPanel2.setForeground(new java.awt.Color(22, 26, 33));

        saludo_label.setBackground(new java.awt.Color(255, 255, 255));
        saludo_label.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        saludo_label.setForeground(new java.awt.Color(255, 255, 255));
        saludo_label.setText("Hola, + Nombre Usuario");

        nombre_label.setBackground(new java.awt.Color(255, 255, 255));
        nombre_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombre_label.setForeground(new java.awt.Color(255, 255, 255));
        nombre_label.setText("Nombre: ");

        idEntrenador_label.setBackground(new java.awt.Color(255, 255, 255));
        idEntrenador_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idEntrenador_label.setForeground(new java.awt.Color(255, 255, 255));
        idEntrenador_label.setText("ID Entrenador:");

        pk_favorito.setBackground(new java.awt.Color(255, 255, 255));
        pk_favorito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pk_favorito.setForeground(new java.awt.Color(255, 255, 255));
        pk_favorito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pk_favorito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PikachuPrueba.png"))); // NOI18N
        pk_favorito.setText("Pikachu");
        pk_favorito.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pk_favorito.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pk_favorito.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        adios.setBackground(new java.awt.Color(184, 44, 0));
        adios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adios.setForeground(new java.awt.Color(255, 255, 255));
        adios.setText("Decir Adios");
        adios.addActionListener(this);

        favorito_label.setBackground(new java.awt.Color(255, 255, 255));
        favorito_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        favorito_label.setForeground(new java.awt.Color(255, 255, 255));
        favorito_label.setText("Pokemon favorito:");

        ganadas_label.setBackground(new java.awt.Color(255, 255, 255));
        ganadas_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ganadas_label.setForeground(new java.awt.Color(255, 255, 255));
        ganadas_label.setText("Batallas ganadas:");

        perdidas_label.setBackground(new java.awt.Color(255, 255, 255));
        perdidas_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        perdidas_label.setForeground(new java.awt.Color(255, 255, 255));
        perdidas_label.setText("Batallas perdidas:");

        cerrar.setBackground(new java.awt.Color(184, 44, 0));
        cerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cerrar.setForeground(new java.awt.Color(255, 255, 255));
        cerrar.setText("Cerrar Sesión");
        cerrar.addActionListener(this);

        imagen.setBackground(new java.awt.Color(13, 17, 23));
        imagen.setForeground(new java.awt.Color(13, 17, 23));
        imagen.setLayout(null);
        imagen.add(perfil);
        perfil.setBounds(0, 0, 260, 260);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(favorito_label)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adios)
                            .addComponent(pk_favorito))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrar)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_label)
                            .addComponent(idEntrenador_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ganadas_label)
                            .addComponent(perdidas_label))
                        .addGap(226, 226, 226))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(saludo_label)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(saludo_label)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre_label)
                            .addComponent(ganadas_label))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(perdidas_label)
                            .addComponent(idEntrenador_label)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(favorito_label)
                .addGap(15, 15, 15)
                .addComponent(pk_favorito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(cerrar)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(60, 30, 1150, 690);

        regresar.setBackground(new java.awt.Color(13, 17, 23));
        regresar.setForeground(new java.awt.Color(13, 17, 23));
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/regresar.png"))); // NOI18N
        regresar.setBorder(null);
        regresar.addActionListener(this);
        regresar.setToolTipText("Regresar a la caja de Pokemons");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar);
        regresar.setBounds(1220, 10, 50, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adios;
    private javax.swing.JButton cerrar;
    private javax.swing.JLabel favorito_label;
    private javax.swing.JLabel ganadas_label;
    private javax.swing.JLabel idEntrenador_label;
    private javax.swing.JPanel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nombre_label;
    private javax.swing.JLabel perdidas_label;
    private javax.swing.JLabel perfil;
    private javax.swing.JLabel pk_favorito;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel saludo_label;
    // End of variables declaration//GEN-END:variables

    public void cargarImagen(){
        ArrayList imagenUser = mBD.cargarImagen(idEntrenador);
        if (mBD.conectar()) {
            byte[] datos = (byte[]) imagenUser.get(0);
            Image foto = new ImageIcon(datos).getImage();
            ImageIcon icono = new ImageIcon(foto.getScaledInstance(imagen.getWidth(),imagen.getHeight(),Image.SCALE_SMOOTH));
            perfil.setIcon(icono);
        }
    }


    public void cargarDatos(){
        ArrayList datos = mBD.obtenerDatos(idEntrenador);
        if (mBD.conectar()) {
            saludo_label.setText("Hola " + datos.get(0));
            nombre_label.setText("Nombre: " + datos.get(0));
            idEntrenador_label.setText("ID Entrenador: " + idEntrenador);
            ganadas_label.setText("Batallas ganadas: " + datos.get(1));
            perdidas_label.setText("Batallas perdidas: " + datos.get(2));
        }
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == adios){
            Acciones msg = new Acciones(this, true);
            msg.setMensaje("¿Estas seguro que quieres liberar a este pokemon?");
            msg.setVisible(true);
        }
        if(evt.getSource() == cerrar){
            PInicio i = new PInicio();
            i.setVisible(true);
            this.dispose();
        }
        if(evt.getSource() == regresar){
            ListaPK lista = new ListaPK(idEntrenador);
            lista.setVisible(true);
            this.dispose();
        }
    }


}
