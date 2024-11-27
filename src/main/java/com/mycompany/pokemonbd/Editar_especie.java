/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.pokemonbd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hiram
 */
public class Editar_especie extends javax.swing.JDialog implements ActionListener{
    BD mBD = new BD();
    /**
     * Creates new form Editar_especie
     */
    public Editar_especie(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        titulo = new javax.swing.JLabel();
        especies_combo = new javax.swing.JComboBox<>();
        especie_Label = new javax.swing.JLabel();
        imagen = new javax.swing.JPanel();
        perfil = new javax.swing.JLabel();
        cargar = new javax.swing.JButton();
        especie_Label1 = new javax.swing.JLabel();
        nombre_especie = new javax.swing.JTextField();
        numPokedex_label = new javax.swing.JLabel();
        numPokedex_t = new javax.swing.JTextField();
        tipo_label = new javax.swing.JLabel();
        tipo_combo = new javax.swing.JComboBox<>();
        tipo_label1 = new javax.swing.JLabel();
        tipo2_combo = new javax.swing.JComboBox<>();
        cambios = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(22, 26, 33));

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Editar Especie");

        especies_combo.setBackground(new java.awt.Color(13, 17, 23));
        especies_combo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        especies_combo.setForeground(new java.awt.Color(255, 255, 255));

        especie_Label.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        especie_Label.setForeground(new java.awt.Color(255, 255, 255));
        especie_Label.setText("Elegir especie");

        imagen.setBackground(new java.awt.Color(13, 17, 23));
        imagen.setForeground(new java.awt.Color(13, 17, 23));
        imagen.setLayout(null);
        imagen.add(perfil);
        perfil.setBounds(0, 0, 150, 150);

        cargar.setBackground(new java.awt.Color(30, 112, 235));
        cargar.setForeground(new java.awt.Color(255, 255, 255));
        cargar.setText("Cargar nueva imagen");
        cargar.addActionListener(this);

        especie_Label1.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        especie_Label1.setForeground(new java.awt.Color(255, 255, 255));
        especie_Label1.setText("Nombre de la especie");

        nombre_especie.setBackground(new java.awt.Color(13, 17, 23));
        nombre_especie.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nombre_especie.setForeground(new java.awt.Color(255, 255, 255));
        nombre_especie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre_especie.setBorder(null);
        nombre_especie.setCaretColor(new java.awt.Color(255, 255, 255));
        nombre_especie.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        numPokedex_label.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        numPokedex_label.setForeground(new java.awt.Color(255, 255, 255));
        numPokedex_label.setText("Num. Pokedex");

        numPokedex_t.setBackground(new java.awt.Color(13, 17, 23));
        numPokedex_t.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        numPokedex_t.setForeground(new java.awt.Color(255, 255, 255));
        numPokedex_t.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numPokedex_t.setBorder(null);
        numPokedex_t.setCaretColor(new java.awt.Color(255, 255, 255));
        numPokedex_t.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        numPokedex_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numPokedex_tActionPerformed(evt);
            }
        });

        tipo_label.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        tipo_label.setForeground(new java.awt.Color(255, 255, 255));
        tipo_label.setText("Tipo");

        tipo_combo.setBackground(new java.awt.Color(13, 17, 23));
        tipo_combo.setForeground(new java.awt.Color(255, 255, 255));
        tipo_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acero", "Agua", "Bicho", "Dragón", "Eléctrico", "Fantasma", "Fuego", "Hada", "Hielo", "Lucha", "Normal", "Planta", "Psíquico", "Roca", "Siniestro", "Tierra", "Veneno", "Volador" }));
        tipo_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_comboActionPerformed(evt);
            }
        });

        tipo_label1.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        tipo_label1.setForeground(new java.awt.Color(255, 255, 255));
        tipo_label1.setText("Tipo 2");

        tipo2_combo.setBackground(new java.awt.Color(13, 17, 23));
        tipo2_combo.setForeground(new java.awt.Color(255, 255, 255));
        tipo2_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Acero", "Agua", "Bicho", "Dragón", "Eléctrico", "Fantasma", "Fuego", "Hada", "Hielo", "Lucha", "Normal", "Planta", "Psíquico", "Roca", "Siniestro", "Tierra", "Veneno", "Volador" }));
        tipo2_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo2_comboActionPerformed(evt);
            }
        });

        cambios.setBackground(new java.awt.Color(30, 112, 235));
        cambios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cambios.setForeground(new java.awt.Color(255, 255, 255));
        cambios.setText("Confirmar cambios");
        cambios.addActionListener(this);
        cambios.setToolTipText("Confirmar los cambios al pokemon");

        eliminar.setBackground(new java.awt.Color(184, 44, 0));
        eliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setText("Eliminar Especie");
        eliminar.addActionListener(this);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titulo)
                                    .addComponent(especie_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(especies_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(especie_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nombre_especie, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(numPokedex_label, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(numPokedex_t, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(cargar)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tipo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(tipo_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tipo_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(tipo2_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cambios)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(especie_Label)
                .addGap(11, 11, 11)
                .addComponent(especies_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(especie_Label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombre_especie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numPokedex_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numPokedex_t, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cargar)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipo_label)
                    .addComponent(tipo_label1))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipo_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo2_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cambios)
                    .addComponent(eliminar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void numPokedex_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numPokedex_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numPokedex_tActionPerformed

    private void tipo_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_comboActionPerformed

    private void tipo2_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo2_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo2_comboActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambios;
    private javax.swing.JButton cargar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel especie_Label;
    private javax.swing.JLabel especie_Label1;
    private javax.swing.JComboBox<String> especies_combo;
    private javax.swing.JPanel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombre_especie;
    private javax.swing.JLabel numPokedex_label;
    private javax.swing.JTextField numPokedex_t;
    private javax.swing.JLabel perfil;
    private javax.swing.JComboBox<String> tipo2_combo;
    private javax.swing.JComboBox<String> tipo_combo;
    private javax.swing.JLabel tipo_label;
    private javax.swing.JLabel tipo_label1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
