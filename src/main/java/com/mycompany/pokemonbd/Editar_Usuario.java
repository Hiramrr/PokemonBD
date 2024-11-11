/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.pokemonbd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author hiram
 */
public class Editar_Usuario extends javax.swing.JDialog implements ActionListener {

    /**
     * Creates new form Editar_Usuario
     */
    public Editar_Usuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIconImage(new ImageIcon("Icono.png").getImage());
        this.setTitle("Lista de Pokemones");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_tabla = new javax.swing.JPanel();
        Agregar = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        imagen = new javax.swing.JPanel();
        perfil = new javax.swing.JLabel();
        nombre_label = new javax.swing.JLabel();
        IDEntrenador1 = new javax.swing.JTextField();
        id_label = new javax.swing.JLabel();
        id_texto = new javax.swing.JTextField();
        contraseñaA_label = new javax.swing.JLabel();
        actualizar = new javax.swing.JButton();
        contraseñaA_text = new javax.swing.JPasswordField();
        cargar = new javax.swing.JButton();
        naturaleza_label1 = new javax.swing.JLabel();
        contraseñaN = new javax.swing.JPasswordField();
        eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(829, 822));

        panel_tabla.setBackground(new java.awt.Color(13, 17, 23));
        panel_tabla.setForeground(new java.awt.Color(255, 255, 255));

        Agregar.setBackground(new java.awt.Color(22, 26, 33));
        Agregar.setForeground(new java.awt.Color(22, 26, 33));
        Agregar.setMinimumSize(new java.awt.Dimension(548, 411));
        Agregar.setLayout(null);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Editar Usuario");
        Agregar.add(titulo);
        titulo.setBounds(20, 10, 360, 54);

        imagen.setBackground(new java.awt.Color(13, 17, 23));
        imagen.setForeground(new java.awt.Color(13, 17, 23));
        imagen.setLayout(null);
        imagen.add(perfil);
        perfil.setBounds(6, -3, 240, 260);

        Agregar.add(imagen);
        imagen.setBounds(40, 90, 250, 260);

        nombre_label.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        nombre_label.setForeground(new java.awt.Color(255, 255, 255));
        nombre_label.setText("Cambiar Nombre");
        Agregar.add(nombre_label);
        nombre_label.setBounds(320, 80, 180, 29);

        IDEntrenador1.setBackground(new java.awt.Color(13, 17, 23));
        IDEntrenador1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IDEntrenador1.setForeground(new java.awt.Color(255, 255, 255));
        IDEntrenador1.setBorder(null);
        IDEntrenador1.setCaretColor(new java.awt.Color(255, 255, 255));
        IDEntrenador1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        IDEntrenador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDEntrenador1ActionPerformed(evt);
            }
        });
        Agregar.add(IDEntrenador1);
        IDEntrenador1.setBounds(320, 120, 400, 30);

        id_label.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        id_label.setForeground(new java.awt.Color(255, 255, 255));
        id_label.setText("ID");
        Agregar.add(id_label);
        id_label.setBounds(320, 170, 140, 29);

        id_texto.setEditable(false);
        id_texto.setBackground(new java.awt.Color(13, 17, 23));
        id_texto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        id_texto.setForeground(new java.awt.Color(204, 204, 204));
        id_texto.setBorder(null);
        id_texto.setCaretColor(new java.awt.Color(255, 255, 255));
        id_texto.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        id_texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_textoActionPerformed(evt);
            }
        });
        Agregar.add(id_texto);
        id_texto.setBounds(320, 210, 400, 30);

        contraseñaA_label.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        contraseñaA_label.setForeground(new java.awt.Color(255, 255, 255));
        contraseñaA_label.setText("Contraseña antigua");
        Agregar.add(contraseñaA_label);
        contraseñaA_label.setBounds(320, 260, 210, 29);

        actualizar.setBackground(new java.awt.Color(35, 135, 55));
        actualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        actualizar.setForeground(new java.awt.Color(255, 255, 255));
        actualizar.setText("Actualizar datos");
        actualizar.addActionListener(this);
        Agregar.add(actualizar);
        actualizar.setBounds(320, 450, 400, 40);

        contraseñaA_text.setBackground(new java.awt.Color(13, 17, 23));
        contraseñaA_text.setForeground(new java.awt.Color(255, 255, 255));
        Agregar.add(contraseñaA_text);
        contraseñaA_text.setBounds(320, 300, 400, 30);

        cargar.setBackground(new java.awt.Color(30, 112, 235));
        cargar.setForeground(new java.awt.Color(255, 255, 255));
        cargar.setText("Cargar imagen nueva");
        cargar.addActionListener(this);
        Agregar.add(cargar);
        cargar.setBounds(40, 370, 250, 30);

        naturaleza_label1.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        naturaleza_label1.setForeground(new java.awt.Color(255, 255, 255));
        naturaleza_label1.setText("Contraseña nueva");
        Agregar.add(naturaleza_label1);
        naturaleza_label1.setBounds(320, 350, 180, 29);

        contraseñaN.setBackground(new java.awt.Color(13, 17, 23));
        contraseñaN.setForeground(new java.awt.Color(255, 255, 255));
        Agregar.add(contraseñaN);
        contraseñaN.setBounds(320, 390, 400, 30);

        eliminar.setBackground(new java.awt.Color(184, 44, 0));
        eliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setText("Eliminar usuario");
        eliminar.addActionListener(this);
        Agregar.add(eliminar);
        eliminar.setBounds(50, 450, 160, 40);

        javax.swing.GroupLayout panel_tablaLayout = new javax.swing.GroupLayout(panel_tabla);
        panel_tabla.setLayout(panel_tablaLayout);
        panel_tablaLayout.setHorizontalGroup(
            panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tablaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        panel_tablaLayout.setVerticalGroup(
            panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tablaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDEntrenador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDEntrenador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDEntrenador1ActionPerformed

    private void id_textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_textoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_textoActionPerformed

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
            java.util.logging.Logger.getLogger(Editar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Editar_Usuario dialog = new Editar_Usuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agregar;
    private javax.swing.JTextField IDEntrenador1;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton cargar;
    private javax.swing.JLabel contraseñaA_label;
    private javax.swing.JPasswordField contraseñaA_text;
    private javax.swing.JPasswordField contraseñaN;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel id_label;
    private javax.swing.JTextField id_texto;
    private javax.swing.JPanel imagen;
    private javax.swing.JLabel naturaleza_label1;
    private javax.swing.JLabel nombre_label;
    private javax.swing.JPanel panel_tabla;
    private javax.swing.JLabel perfil;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}