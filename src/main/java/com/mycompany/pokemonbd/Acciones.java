/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.pokemonbd;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author hiram
 */
public class Acciones extends javax.swing.JDialog implements ActionListener {
    /**
     * Creates new form Acciones
     */
    public Acciones(Usuario parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIconImage(new ImageIcon("Icono.jpg").getImage());
        this.setTitle("PokeDialogo");
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
        Mensaje = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        rechazar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(13, 17, 23));
        jPanel1.setMinimumSize(new java.awt.Dimension(490, 333));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(22, 26, 33));
        jPanel2.setForeground(new java.awt.Color(22, 26, 33));

        Mensaje.setBackground(new java.awt.Color(255, 255, 255));
        Mensaje.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Mensaje.setForeground(new java.awt.Color(255, 255, 255));
        Mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mensaje.setText("Mensaje");

        aceptar.setBackground(new java.awt.Color(35, 135, 55));
        aceptar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        aceptar.setForeground(new java.awt.Color(255, 255, 255));
        aceptar.setText("Si");
        aceptar.addActionListener(this);

        rechazar.setBackground(new java.awt.Color(184, 44, 0));
        rechazar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rechazar.setForeground(new java.awt.Color(255, 255, 255));
        rechazar.setText("No");
        rechazar.addActionListener(this);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(aceptar)
                .addGap(51, 51, 51)
                .addComponent(rechazar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(Mensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar)
                    .addComponent(rechazar))
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 20, 320, 200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mensaje;
    private javax.swing.JButton aceptar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton rechazar;
    // End of variables declaration//GEN-END:variables
    public void setMensaje(String msg){
        Mensaje.setText("<html>" + msg + "</html>");
    }
    
    
    
    public void actionPerformed(ActionEvent evt){
        if(evt.getSource() == aceptar){
            this.dispose();
            Adios bye = new Adios(new javax.swing.JFrame(), true);
            bye.setVisible(true);
        } else if(evt.getSource() == rechazar){
            this.dispose();
        }
    }
}