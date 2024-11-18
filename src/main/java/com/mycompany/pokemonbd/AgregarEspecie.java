/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.pokemonbd;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author sasuk
 */
public class AgregarEspecie extends javax.swing.JPanel implements ActionListener {
    public String idEntrenador;
    String ruta;
    BD mBD = new BD();
    
    /**
     * Creates new form AgregarEspecie
     */
    public AgregarEspecie(String idEntrenador) {
        initComponents();
        this.idEntrenador = idEntrenador;
        obtenerRegiones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agregar = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        imagen = new javax.swing.JPanel();
        perfil = new javax.swing.JLabel();
        especie_Label = new javax.swing.JLabel();
        IDEntrenador1 = new javax.swing.JTextField();
        numPokedex_label = new javax.swing.JLabel();
        numPokedex_t = new javax.swing.JTextField();
        objeto_label = new javax.swing.JLabel();
        region_combo = new javax.swing.JComboBox<>();
        objeto_combo1 = new javax.swing.JComboBox<>();
        agregarPK = new javax.swing.JButton();
        tipo_label = new javax.swing.JLabel();
        ps_label = new javax.swing.JLabel();
        atq_label = new javax.swing.JLabel();
        defensa_label = new javax.swing.JLabel();
        atqEspecial_label = new javax.swing.JLabel();
        defEspacial_label = new javax.swing.JLabel();
        velocidad_label = new javax.swing.JLabel();
        total_label = new javax.swing.JLabel();
        base_label = new javax.swing.JLabel();
        totalBase_t = new javax.swing.JTextField();
        psBase_t = new javax.swing.JTextField();
        ataqueBase_t = new javax.swing.JTextField();
        defensaBase_t = new javax.swing.JTextField();
        atqespecialBase_t = new javax.swing.JTextField();
        defespecialBase_t = new javax.swing.JTextField();
        velocidadBase_t = new javax.swing.JTextField();
        tipo_label1 = new javax.swing.JLabel();
        objeto_combo2 = new javax.swing.JComboBox<>();
        cargar = new javax.swing.JButton();
        tipo_label2 = new javax.swing.JLabel();
        generacion = new javax.swing.JTextField();

        Agregar.setBackground(new java.awt.Color(22, 26, 33));
        Agregar.setForeground(new java.awt.Color(22, 26, 33));
        Agregar.setMinimumSize(new java.awt.Dimension(548, 411));
        Agregar.setLayout(null);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Agregar Especie");
        Agregar.add(titulo);
        titulo.setBounds(20, 10, 360, 54);

        imagen.setBackground(new java.awt.Color(13, 17, 23));
        imagen.setForeground(new java.awt.Color(13, 17, 23));
        imagen.setLayout(null);
        imagen.add(perfil);
        perfil.setBounds(6, -3, 240, 260);

        Agregar.add(imagen);
        imagen.setBounds(40, 90, 250, 260);

        especie_Label.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        especie_Label.setForeground(new java.awt.Color(255, 255, 255));
        especie_Label.setText("Nombre de la especie");
        Agregar.add(especie_Label);
        especie_Label.setBounds(320, 80, 220, 29);

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
        IDEntrenador1.setBounds(320, 120, 400, 30);

        numPokedex_label.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        numPokedex_label.setForeground(new java.awt.Color(255, 255, 255));
        numPokedex_label.setText("Num. Pokedex");
        Agregar.add(numPokedex_label);
        numPokedex_label.setBounds(320, 180, 170, 29);

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
        Agregar.add(numPokedex_t);
        numPokedex_t.setBounds(320, 220, 400, 30);

        objeto_label.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        objeto_label.setForeground(new java.awt.Color(255, 255, 255));
        objeto_label.setText("Región");
        Agregar.add(objeto_label);
        objeto_label.setBounds(320, 270, 140, 29);

        region_combo.setBackground(new java.awt.Color(13, 17, 23));
        region_combo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        region_combo.setForeground(new java.awt.Color(255, 255, 255));
        region_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                objeto_comboActionPerformed(evt);
            }
        });
        Agregar.add(region_combo);
        region_combo.setBounds(320, 310, 400, 30);

        objeto_combo1.setBackground(new java.awt.Color(13, 17, 23));
        objeto_combo1.setForeground(new java.awt.Color(255, 255, 255));
        objeto_combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acero", "Agua", "Bicho", "Dragón", "Eléctrico", "Fantasma", "Fuego", "Hada", "Hielo", "Lucha", "Normal", "Planta", "Psíquico", "Roca", "Siniestro", "Tierra", "Veneno", "Volador" }));
        objeto_combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                objeto_combo1ActionPerformed(evt);
            }
        });
        Agregar.add(objeto_combo1);
        objeto_combo1.setBounds(40, 430, 120, 26);

        agregarPK.setBackground(new java.awt.Color(35, 135, 55));
        agregarPK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarPK.setForeground(new java.awt.Color(255, 255, 255));
        agregarPK.setText("Agregar");
        agregarPK.addActionListener(this);
        Agregar.add(agregarPK);
        agregarPK.setBounds(510, 800, 240, 40);

        tipo_label.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        tipo_label.setForeground(new java.awt.Color(255, 255, 255));
        tipo_label.setText("Tipo");
        Agregar.add(tipo_label);
        tipo_label.setBounds(40, 400, 100, 29);

        ps_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ps_label.setForeground(new java.awt.Color(255, 255, 255));
        ps_label.setText("PS");
        Agregar.add(ps_label);
        ps_label.setBounds(40, 540, 20, 20);

        atq_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        atq_label.setForeground(new java.awt.Color(255, 255, 255));
        atq_label.setText("Ataque");
        Agregar.add(atq_label);
        atq_label.setBounds(40, 570, 50, 16);

        defensa_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        defensa_label.setForeground(new java.awt.Color(255, 255, 255));
        defensa_label.setText("Defensa");
        Agregar.add(defensa_label);
        defensa_label.setBounds(40, 600, 50, 20);

        atqEspecial_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        atqEspecial_label.setForeground(new java.awt.Color(255, 255, 255));
        atqEspecial_label.setText("Atq. Especial");
        Agregar.add(atqEspecial_label);
        atqEspecial_label.setBounds(40, 630, 90, 16);

        defEspacial_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        defEspacial_label.setForeground(new java.awt.Color(255, 255, 255));
        defEspacial_label.setText("Def. Especial");
        Agregar.add(defEspacial_label);
        defEspacial_label.setBounds(40, 660, 80, 20);

        velocidad_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        velocidad_label.setForeground(new java.awt.Color(255, 255, 255));
        velocidad_label.setText("Velocidad");
        Agregar.add(velocidad_label);
        velocidad_label.setBounds(40, 690, 70, 20);

        total_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        total_label.setForeground(new java.awt.Color(255, 255, 255));
        total_label.setText("Total");
        Agregar.add(total_label);
        total_label.setBounds(40, 720, 30, 20);

        base_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        base_label.setForeground(new java.awt.Color(255, 255, 255));
        base_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        base_label.setText("Base");
        base_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Agregar.add(base_label);
        base_label.setBounds(150, 510, 80, 20);

        totalBase_t.setBackground(new java.awt.Color(13, 17, 23));
        totalBase_t.setForeground(new java.awt.Color(255, 255, 255));
        totalBase_t.setText("0");
        Agregar.add(totalBase_t);
        totalBase_t.setBounds(150, 720, 80, 26);

        psBase_t.setBackground(new java.awt.Color(13, 17, 23));
        psBase_t.setForeground(new java.awt.Color(255, 255, 255));
        psBase_t.setText("0");
        Agregar.add(psBase_t);
        psBase_t.setBounds(150, 540, 80, 26);

        ataqueBase_t.setBackground(new java.awt.Color(13, 17, 23));
        ataqueBase_t.setForeground(new java.awt.Color(255, 255, 255));
        ataqueBase_t.setText("0");
        Agregar.add(ataqueBase_t);
        ataqueBase_t.setBounds(150, 570, 80, 26);

        defensaBase_t.setBackground(new java.awt.Color(13, 17, 23));
        defensaBase_t.setForeground(new java.awt.Color(255, 255, 255));
        defensaBase_t.setText("0");
        Agregar.add(defensaBase_t);
        defensaBase_t.setBounds(150, 600, 80, 26);

        atqespecialBase_t.setBackground(new java.awt.Color(13, 17, 23));
        atqespecialBase_t.setForeground(new java.awt.Color(255, 255, 255));
        atqespecialBase_t.setText("0");
        Agregar.add(atqespecialBase_t);
        atqespecialBase_t.setBounds(150, 630, 80, 26);

        defespecialBase_t.setBackground(new java.awt.Color(13, 17, 23));
        defespecialBase_t.setForeground(new java.awt.Color(255, 255, 255));
        defespecialBase_t.setText("0");
        Agregar.add(defespecialBase_t);
        defespecialBase_t.setBounds(150, 660, 80, 26);

        velocidadBase_t.setBackground(new java.awt.Color(13, 17, 23));
        velocidadBase_t.setForeground(new java.awt.Color(255, 255, 255));
        velocidadBase_t.setText("0");
        Agregar.add(velocidadBase_t);
        velocidadBase_t.setBounds(150, 690, 80, 26);

        tipo_label1.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        tipo_label1.setForeground(new java.awt.Color(255, 255, 255));
        tipo_label1.setText("Tipo 2");
        Agregar.add(tipo_label1);
        tipo_label1.setBounds(210, 390, 100, 29);

        objeto_combo2.setBackground(new java.awt.Color(13, 17, 23));
        objeto_combo2.setForeground(new java.awt.Color(255, 255, 255));
        objeto_combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Acero", "Agua", "Bicho", "Dragón", "Eléctrico", "Fantasma", "Fuego", "Hada", "Hielo", "Lucha", "Normal", "Planta", "Psíquico", "Roca", "Siniestro", "Tierra", "Veneno", "Volador" }));
        objeto_combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                objeto_combo2ActionPerformed(evt);
            }
        });
        Agregar.add(objeto_combo2);
        objeto_combo2.setBounds(210, 430, 120, 26);

        cargar.setBackground(new java.awt.Color(30, 112, 235));
        cargar.setForeground(new java.awt.Color(255, 255, 255));
        cargar.setText("Cargar imagen");
        cargar.addActionListener(this);
        Agregar.add(cargar);
        cargar.setBounds(40, 360, 250, 27);

        tipo_label2.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        tipo_label2.setForeground(new java.awt.Color(255, 255, 255));
        tipo_label2.setText("Generación");
        Agregar.add(tipo_label2);
        tipo_label2.setBounds(380, 390, 130, 29);

        generacion.setEditable(false);
        generacion.setBackground(new java.awt.Color(13, 17, 23));
        generacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        generacion.setForeground(new java.awt.Color(255, 255, 255));
        generacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        generacion.setBorder(null);
        generacion.setCaretColor(new java.awt.Color(255, 255, 255));
        generacion.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        generacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generacionActionPerformed(evt);
            }
        });
        Agregar.add(generacion);
        generacion.setBounds(380, 430, 200, 26);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void objeto_combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_objeto_combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_objeto_combo1ActionPerformed

    private void objeto_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_objeto_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_objeto_comboActionPerformed

    private void numPokedex_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numPokedex_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numPokedex_tActionPerformed

    private void IDEntrenador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDEntrenador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDEntrenador1ActionPerformed

    private void objeto_combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_objeto_combo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_objeto_combo2ActionPerformed

    private void generacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agregar;
    private javax.swing.JTextField IDEntrenador1;
    private javax.swing.JButton agregarPK;
    private javax.swing.JTextField ataqueBase_t;
    private javax.swing.JLabel atqEspecial_label;
    private javax.swing.JLabel atq_label;
    private javax.swing.JTextField atqespecialBase_t;
    private javax.swing.JLabel base_label;
    private javax.swing.JButton cargar;
    private javax.swing.JLabel defEspacial_label;
    private javax.swing.JTextField defensaBase_t;
    private javax.swing.JLabel defensa_label;
    private javax.swing.JTextField defespecialBase_t;
    private javax.swing.JLabel especie_Label;
    private javax.swing.JTextField generacion;
    private javax.swing.JPanel imagen;
    private javax.swing.JLabel numPokedex_label;
    private javax.swing.JTextField numPokedex_t;
    private javax.swing.JComboBox<String> region_combo;
    private javax.swing.JComboBox<String> objeto_combo1;
    private javax.swing.JComboBox<String> objeto_combo2;
    private javax.swing.JLabel objeto_label;
    private javax.swing.JLabel perfil;
    private javax.swing.JTextField psBase_t;
    private javax.swing.JLabel ps_label;
    private javax.swing.JLabel tipo_label;
    private javax.swing.JLabel tipo_label1;
    private javax.swing.JLabel tipo_label2;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField totalBase_t;
    private javax.swing.JLabel total_label;
    private javax.swing.JTextField velocidadBase_t;
    private javax.swing.JLabel velocidad_label;
    // End of variables declaration//GEN-END:variables

    
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

    public void obtenerRegiones(){
        ArrayList lista =  mBD.obtenerRegiones();
        String [] regiones = new String[lista.size()];
        for(int i = 0; i < lista.size(); i+= 3){
            regiones[i / 3] = lista.get(i).toString();
        }
        region_combo.setModel(new javax.swing.DefaultComboBoxModel<>(regiones));
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
    
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == cargar){
            cargarImagen();
        }
    }
}
