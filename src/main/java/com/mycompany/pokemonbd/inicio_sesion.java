/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.pokemonbd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hiram
 */
public class inicio_sesion extends javax.swing.JPanel implements ActionListener {
    public String Nombre;
    public String Contraseña;
    BD mBD = new BD();
    /**
     * Creates new form inicio_lesion
     */
    public inicio_sesion() {
        initComponents();
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

        panel_manejo = new javax.swing.JPanel();
        inicio_sesion = new javax.swing.JPanel();
        inicio_label = new javax.swing.JLabel();
        entrenadorID = new javax.swing.JTextField();
        Nombre_label = new javax.swing.JLabel();
        contraseña_label = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        inicio = new javax.swing.JButton();
        error = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(704, 502));
        setPreferredSize(new java.awt.Dimension(704, 502));

        panel_manejo.setBackground(new java.awt.Color(13, 17, 23));
        panel_manejo.setMinimumSize(new java.awt.Dimension(490, 333));

        inicio_sesion.setBackground(new java.awt.Color(22, 26, 33));
        inicio_sesion.setForeground(new java.awt.Color(22, 26, 33));
        inicio_sesion.setMinimumSize(new java.awt.Dimension(548, 411));

        inicio_label.setBackground(new java.awt.Color(255, 255, 255));
        inicio_label.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        inicio_label.setForeground(new java.awt.Color(255, 255, 255));
        inicio_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicio_label.setText("Iniciar Sesión");

        entrenadorID.setBackground(new java.awt.Color(13, 17, 23));
        entrenadorID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        entrenadorID.setForeground(new java.awt.Color(255, 255, 255));
        entrenadorID.setBorder(null);
        entrenadorID.setCaretColor(new java.awt.Color(255, 255, 255));
        entrenadorID.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        entrenadorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrenadorIDActionPerformed(evt);
            }
        });

        Nombre_label.setBackground(new java.awt.Color(255, 255, 255));
        Nombre_label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Nombre_label.setForeground(new java.awt.Color(255, 255, 255));
        Nombre_label.setText("Nombre del entrenador");

        contraseña_label.setBackground(new java.awt.Color(255, 255, 255));
        contraseña_label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        contraseña_label.setForeground(new java.awt.Color(255, 255, 255));
        contraseña_label.setText("Contraseña");

        contraseña.setBackground(new java.awt.Color(13, 17, 23));
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setBorder(null);

        inicio.setBackground(new java.awt.Color(35, 135, 55));
        inicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        inicio.setForeground(new java.awt.Color(255, 255, 255));
        inicio.setText("Iniciar Sesión");
        inicio.addActionListener(this);

        error.setBackground(new java.awt.Color(255, 51, 51));
        error.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        error.setForeground(new java.awt.Color(255, 51, 51));
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout inicio_sesionLayout = new javax.swing.GroupLayout(inicio_sesion);
        inicio_sesion.setLayout(inicio_sesionLayout);
        inicio_sesionLayout.setHorizontalGroup(
            inicio_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicio_sesionLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(inicio_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicio_sesionLayout.createSequentialGroup()
                        .addComponent(Nombre_label)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(inicio_sesionLayout.createSequentialGroup()
                        .addGroup(inicio_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contraseña_label)
                            .addGroup(inicio_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(entrenadorID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(contraseña, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicio_sesionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
            .addGroup(inicio_sesionLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(inicio_label, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(inicio_sesionLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        inicio_sesionLayout.setVerticalGroup(
            inicio_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicio_sesionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(inicio_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(Nombre_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(entrenadorID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contraseña_label)
                .addGap(18, 18, 18)
                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout panel_manejoLayout = new javax.swing.GroupLayout(panel_manejo);
        panel_manejo.setLayout(panel_manejoLayout);
        panel_manejoLayout.setHorizontalGroup(
            panel_manejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_manejoLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(inicio_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        panel_manejoLayout.setVerticalGroup(
            panel_manejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_manejoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(inicio_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_manejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_manejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void entrenadorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrenadorIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entrenadorIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombre_label;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel contraseña_label;
    private javax.swing.JTextField entrenadorID;
    private javax.swing.JLabel error;
    private javax.swing.JButton inicio;
    private javax.swing.JLabel inicio_label;
    private javax.swing.JPanel inicio_sesion;
    private javax.swing.JPanel panel_manejo;
    // End of variables declaration//GEN-END:variables
    
    public boolean usuarioValido(String Nombre, String Contraseña){
        if(mBD.inicioSesion(Nombre, Contraseña)){
            return true;
        }
        return false;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public String getID(){
        return mBD.getID(Nombre,Contraseña);
    }
    
  
    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == inicio){
            Nombre = entrenadorID.getText();
            Contraseña = contraseña.getText();
            if(usuarioValido(Nombre,Contraseña)){
              ((PInicio) javax.swing.SwingUtilities.getWindowAncestor(this)).iniciarSesionExitoso(getID());
              return;
            }
            ((PInicio) javax.swing.SwingUtilities.getWindowAncestor(this)).iniciarSesionError();
            error.setText("\tIntroduce datos correctos!");
        }
    }
}
