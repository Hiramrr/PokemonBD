/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.pokemonbd;

/**
 *
 * @author cinom
 */
public class AgregarPK extends javax.swing.JDialog {

    /**
     * Creates new form AgregarPK
     */
    public AgregarPK(java.awt.Frame parent, boolean modal) {
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

        jSeparator1 = new javax.swing.JSeparator();
        panel_tabla = new javax.swing.JPanel();
        Agregar = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        imagen = new javax.swing.JPanel();
        perfil = new javax.swing.JLabel();
        especie_Label = new javax.swing.JLabel();
        IDEntrenador1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel_tabla.setBackground(new java.awt.Color(13, 17, 23));
        panel_tabla.setForeground(new java.awt.Color(255, 255, 255));

        Agregar.setBackground(new java.awt.Color(22, 26, 33));
        Agregar.setForeground(new java.awt.Color(22, 26, 33));
        Agregar.setMinimumSize(new java.awt.Dimension(548, 411));
        Agregar.setLayout(null);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        titulo.setText("Agregar Pokemón");
        Agregar.add(titulo);
        titulo.setBounds(20, 10, 360, 54);

        imagen.setBackground(new java.awt.Color(13, 17, 23));
        imagen.setForeground(new java.awt.Color(13, 17, 23));
        imagen.setLayout(null);
        imagen.add(perfil);
        perfil.setBounds(-4, -3, 260, 270);

        Agregar.add(imagen);
        imagen.setBounds(40, 90, 260, 270);

        especie_Label.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        especie_Label.setText("Elegir especie");
        Agregar.add(especie_Label);
        especie_Label.setBounds(320, 100, 140, 29);

        IDEntrenador1.setEditable(false);
        IDEntrenador1.setBackground(new java.awt.Color(13, 17, 23));
        IDEntrenador1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IDEntrenador1.setForeground(new java.awt.Color(255, 255, 255));
        IDEntrenador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IDEntrenador1.setBorder(null);
        IDEntrenador1.setCaretColor(new java.awt.Color(255, 255, 255));
        IDEntrenador1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        IDEntrenador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDEntrenador1ActionPerformed(evt);
            }
        });
        Agregar.add(IDEntrenador1);
        IDEntrenador1.setBounds(320, 140, 400, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Agregar.add(jComboBox1);
        jComboBox1.setBounds(596, 180, 120, 26);

        javax.swing.GroupLayout panel_tablaLayout = new javax.swing.GroupLayout(panel_tabla);
        panel_tabla.setLayout(panel_tablaLayout);
        panel_tablaLayout.setHorizontalGroup(
            panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tablaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        panel_tablaLayout.setVerticalGroup(
            panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tablaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDEntrenador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDEntrenador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDEntrenador1ActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarPK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarPK dialog = new AgregarPK(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel especie_Label;
    private javax.swing.JPanel imagen;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panel_tabla;
    private javax.swing.JLabel perfil;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
