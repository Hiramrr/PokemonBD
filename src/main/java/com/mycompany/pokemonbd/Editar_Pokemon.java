/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.pokemonbd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author hiram
 */
public class Editar_Pokemon extends javax.swing.JDialog implements ActionListener {
    String idPokemon;
    BD mBD = new BD();
    /**
     * Creates new form Editar_Pokemon
     */
    public Editar_Pokemon(java.awt.Frame parent, boolean modal, String idPokemon) {
        super(parent, modal);
        this.idPokemon = idPokemon;
        initComponents();
        llenarDatos();
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
        cambios = new javax.swing.JButton();
        mote = new javax.swing.JTextField();
        mote_label = new javax.swing.JLabel();
        hab_especial_label = new javax.swing.JLabel();
        habilidad_combo = new javax.swing.JComboBox<>();
        objeto_label = new javax.swing.JLabel();
        objeto_combo = new javax.swing.JComboBox<>();
        titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(22, 26, 33));

        cambios.setBackground(new java.awt.Color(30, 112, 235));
        cambios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cambios.setForeground(new java.awt.Color(255, 255, 255));
        cambios.setText("Confirmar cambios");
        cambios.addActionListener(this);
        cambios.setToolTipText("Confirmar los cambios al pokemon");

        mote.setBackground(new java.awt.Color(13, 17, 23));
        mote.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mote.setForeground(new java.awt.Color(255, 255, 255));
        mote.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mote.setBorder(null);
        mote.setCaretColor(new java.awt.Color(255, 255, 255));
        mote.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        mote_label.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        mote_label.setForeground(new java.awt.Color(255, 255, 255));
        mote_label.setText("Mote");

        hab_especial_label.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        hab_especial_label.setForeground(new java.awt.Color(255, 255, 255));
        hab_especial_label.setText("Hab. Especial");

        habilidad_combo.setBackground(new java.awt.Color(13, 17, 23));
        habilidad_combo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        habilidad_combo.setForeground(new java.awt.Color(255, 255, 255));
        habilidad_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Absorbe agua", "Absorbe electricidad", "Absorbe fuego", "Aclimatación", "Agallas", "Armadura batalla", "Cabeza roca", "Cacofonía", "Calco", "Cambio color", "Caparazón", "Chorro arena", "Clorofila", "Corte fuerte", "Cuerpo llama", "Cuerpo puro", "Cura lluvia", "Cura natural", "Despiste", "Dicha", "Efecto espora", "Electricidad estática", "Energía pura", "Enjambre", "Entusiasmo", "Escama especial", "Esclusa de aire", "Escudo magma", "Espesura", "Espíritu vital", "Flexibilidad", "Fuerza mental", "Fuga", "Gran encanto", "Hedor", "Humedad", "Humo blanco", "Iluminación", "Imán", "Impulso", "Inmunidad", "Insomnio", "Insonorizar", "Intimidación", "Levitación", "Llovizna", "Madrugar", "Mar llamas", "Más", "Menos", "Mudar", "Nado rápido", "Ojo compuesto", "Pararrayos", "Pereza", "Piel tosca", "Polvo escudo", "Potencia", "Predicción", "Presión", "Punto tóxico", "Recogida", "Ritmo propio", "Robustez", "Sebo", "Sequía", "Sincronía", "Sombra trampa", "Superguarda", "Torrente", "Trampa arena", "Velo agua", "Velo arena", "Ventosas", "Viscosecreción", "Viscosidad", "Vista lince" }));

        objeto_label.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        objeto_label.setForeground(new java.awt.Color(255, 255, 255));
        objeto_label.setText("Objeto");

        objeto_combo.setBackground(new java.awt.Color(13, 17, 23));
        objeto_combo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        objeto_combo.setForeground(new java.awt.Color(255, 255, 255));
        objeto_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Agua fresca", "Agua fresca", "Antihielo", "Antiparalizador", "Antiquemar", "Antídoto", "Ataque X", "Bicicleta", "Bicicleta", "Bono bici", "Calcio", "Calcio", "Caramelo raro", "Caramelo raro", "Carburante", "Carburante", "Caña buena", "Caña vieja", "Correo Oak", "Correo Oak", "Cuerda huida", "Cura total", "Defensa especial X", "Defensa X", "Despertar", "Dientes oro", "Directo", "Elixir", "Especial X", "Fósil domo", "Fósil domo", "Fósil hélix", "Hierro", "Hierro", "Hiperpoción", "Limonada", "Limonada", "Llave ascensor", "Llave magnética", "Llave secreta", "Mapa", "Mapa", "Monedero", "Monedero", "Más PP", "Más PS", "Más PS", "Máximo elixir", "Pepita", "Piedra agua", "Piedra agua", "Piedra fuego", "Piedra fuego", "Piedra hoja", "Piedra hoja", "Piedra lunar", "Piedra lunar", "Piedra trueno", "Piedra trueno", "Poción", "Poción", "Poción máxima", "Poción máxima", "Poké flauta", "Poké flauta", "Poké muñeco", "Poké muñeco", "Precisión X", "Protección especial", "Proteína", "Proteína", "Refresco", "Refresco", "Repartir experiencia", "Repelente", "Repelente máximo", "Repelente máximo", "Restaurar todo", "Revivir", "Revivir máximo", "Revivir máximo", " ", "S", "Scope Silph", "Scope Silph", "Supercaña", "Supercaña", "Superpoción", "Superpoción", "Superrepelente", "Ticket barco", "Velocidad X", "Zahorí", "Zahorí", "Ámbar viejo", "Ámbar viejo", "Éter", "Éter máximo" }));

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Editar Pokémon");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 262, Short.MAX_VALUE)
                        .addComponent(cambios))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mote_label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mote, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hab_especial_label, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(habilidad_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(objeto_label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(objeto_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(mote_label)
                .addGap(11, 11, 11)
                .addComponent(mote, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hab_especial_label)
                        .addGap(11, 11, 11)
                        .addComponent(habilidad_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(objeto_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(objeto_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(cambios)
                .addGap(16, 16, 16))
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



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambios;
    private javax.swing.JLabel hab_especial_label;
    private javax.swing.JComboBox<String> habilidad_combo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mote;
    private javax.swing.JLabel mote_label;
    private javax.swing.JComboBox<String> objeto_combo;
    private javax.swing.JLabel objeto_label;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    public void llenarDatos(){
        ArrayList datos = mBD.obtenerDatosPokemon(idPokemon);
        mote.setText(datos.get(3).toString());
        habilidad_combo.setSelectedItem(datos.get(9).toString());
        objeto_combo.setSelectedItem(datos.get(6).toString());
    }

    public void actualizar(){
        mBD.actualizarDatosPokemon(idPokemon, mote.getText(), habilidad_combo.getSelectedItem().toString(), objeto_combo.getSelectedItem().toString());
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == cambios){
            actualizar();
            ((ListaPK) this.getParent()).actualizarTabla();
            this.dispose();
        }
    }
}
