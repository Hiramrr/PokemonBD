/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.pokemonbd;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hiram
 */
public class AgregarNuevo extends javax.swing.JDialog implements ActionListener{
    public boolean estado = true;
    public String idEntrenador;
    /**
     * Creates new form AgregarPK
     */
    public AgregarNuevo(java.awt.Frame parent, boolean modal,String idEntrenador) {
        super(parent, modal);
        initComponents();
        AgregarPK agregar = new AgregarPK(idEntrenador);
        agregar.setLocation(0,0);
        agregar.setSize(716, 703);
          
        contenido.removeAll();
        contenido.add(agregar,BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        panel_tabla = new javax.swing.JPanel();
        contenido = new javax.swing.JPanel();
        cambiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel_tabla.setBackground(new java.awt.Color(13, 17, 23));
        panel_tabla.setForeground(new java.awt.Color(255, 255, 255));

        contenido.setBackground(new java.awt.Color(22, 26, 33));
        contenido.setForeground(new java.awt.Color(22, 26, 33));
        contenido.setMinimumSize(new java.awt.Dimension(548, 411));
        contenido.setLayout(null);

        cambiar.setBackground(new java.awt.Color(30, 112, 235));
        cambiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cambiar.setForeground(new java.awt.Color(255, 255, 255));
        cambiar.setText("Agregar Especie");
        cambiar.addActionListener(this);
        cambiar.setToolTipText("contenido una especie al sistema");

        javax.swing.GroupLayout panel_tablaLayout = new javax.swing.GroupLayout(panel_tabla);
        panel_tabla.setLayout(panel_tablaLayout);
        panel_tablaLayout.setHorizontalGroup(
            panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tablaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cambiar)
                    .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        panel_tablaLayout.setVerticalGroup(
            panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tablaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(cambiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
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

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambiar;
    private javax.swing.JPanel contenido;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panel_tabla;
    // End of variables declaration//GEN-END:variables

    public String getIdEntrenador() {
        return idEntrenador;
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == cambiar) {
            if (estado) {
                cambiar.setText("Agregar Pokemon");
                AgregarEspecie especie = new AgregarEspecie(idEntrenador);
                especie.setLocation(0, 0);
                especie.setSize(716, 703);

                contenido.removeAll();
                contenido.setLayout(new BorderLayout());
                contenido.add(especie, BorderLayout.CENTER);
                contenido.revalidate();
                contenido.repaint();
                estado = false;
            
            } else {
                cambiar.setText("Agregar Especie");
                AgregarPK agregar = new AgregarPK(idEntrenador);
                agregar.setLocation(0, 0);
                agregar.setSize(716, 703);

                contenido.removeAll();
                contenido.setLayout(new BorderLayout());
                contenido.add(agregar, BorderLayout.CENTER);
                contenido.revalidate();
                contenido.repaint();
                estado = true;
            }
        }

    }

    public void EspecieCreadaExito(){
        Dialogo dialogo = new Dialogo((java.awt.Frame) this.getParent(),true);
        dialogo.setMensaje("Especie creada con éxito");
        dialogo.setLocation(450, 261);
        dialogo.setTitle("Éxito");
        dialogo.setVisible(true);
    }

    public void EspecieCreadaError(String mensaje){
        Dialogo dialogo = new Dialogo((java.awt.Frame) this.getParent(),true);
        dialogo.setMensaje(mensaje);
        dialogo.setLocation(450, 261);
        dialogo.setTitle("Error");
        dialogo.setVisible(true);
    }
}
