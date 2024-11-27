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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author hiram
 */
public class AgregarEspecie extends javax.swing.JPanel implements ActionListener {
    public String idEntrenador;
    String ruta;
    BD mBD = new BD();
    int psbase;
    int ataquebase;
    int defensabase;
    int atqespecialbase;
    int defespecialbase;
    int velocidadbase;
    int totalbase;
    int sumatoria;


    public AgregarEspecie(String idEntrenador) {
        initComponents();
        this.idEntrenador = idEntrenador;
        System.out.println(idEntrenador + "En especie");
        obtenerRegiones();
        agregarListenerSeleccionRegion();
        agregarListenerEstadisticas();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agregar = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        imagen = new javax.swing.JPanel();
        perfil = new javax.swing.JLabel();
        especie_Label = new javax.swing.JLabel();
        nombre_especie = new javax.swing.JTextField();
        numPokedex_label = new javax.swing.JLabel();
        numPokedex_t = new javax.swing.JTextField();
        objeto_label = new javax.swing.JLabel();
        region_combo = new javax.swing.JComboBox<>();
        tipo_combo = new javax.swing.JComboBox<>();
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
        tipo2_combo = new javax.swing.JComboBox<>();
        cargar = new javax.swing.JButton();
        generacion_label = new javax.swing.JLabel();
        generaciont = new javax.swing.JTextField();
        pkMax = new javax.swing.JLabel();
        maxPokemon = new javax.swing.JTextField();
        numPokedex_utilizado = new javax.swing.JLabel();
        editar = new javax.swing.JButton();

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

        nombre_especie.setBackground(new java.awt.Color(13, 17, 23));
        nombre_especie.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nombre_especie.setForeground(new java.awt.Color(255, 255, 255));
        nombre_especie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre_especie.setBorder(null);
        nombre_especie.setCaretColor(new java.awt.Color(255, 255, 255));
        nombre_especie.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        nombre_especie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_especieActionPerformed(evt);
            }
        });
        Agregar.add(nombre_especie);
        nombre_especie.setBounds(320, 120, 370, 30);

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
        numPokedex_t.setBounds(320, 220, 330, 30);

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
                region_comboActionPerformed(evt);
            }
        });
        Agregar.add(region_combo);
        region_combo.setBounds(320, 310, 370, 30);

        tipo_combo.setBackground(new java.awt.Color(13, 17, 23));
        tipo_combo.setForeground(new java.awt.Color(255, 255, 255));
        tipo_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acero", "Agua", "Bicho", "Dragón", "Eléctrico", "Fantasma", "Fuego", "Hada", "Hielo", "Lucha", "Normal", "Planta", "Psíquico", "Roca", "Siniestro", "Tierra", "Veneno", "Volador" }));
        tipo_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_comboActionPerformed(evt);
            }
        });
        Agregar.add(tipo_combo);
        tipo_combo.setBounds(40, 420, 120, 26);

        agregarPK.setBackground(new java.awt.Color(35, 135, 55));
        agregarPK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarPK.setForeground(new java.awt.Color(255, 255, 255));
        agregarPK.setText("Agregar");
        agregarPK.addActionListener(this);
        Agregar.add(agregarPK);
        agregarPK.setBounds(500, 640, 190, 40);

        tipo_label.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        tipo_label.setForeground(new java.awt.Color(255, 255, 255));
        tipo_label.setText("Tipo");
        Agregar.add(tipo_label);
        tipo_label.setBounds(40, 390, 100, 29);

        ps_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ps_label.setForeground(new java.awt.Color(255, 255, 255));
        ps_label.setText("PS");
        Agregar.add(ps_label);
        ps_label.setBounds(50, 480, 20, 20);

        atq_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        atq_label.setForeground(new java.awt.Color(255, 255, 255));
        atq_label.setText("Ataque");
        Agregar.add(atq_label);
        atq_label.setBounds(50, 510, 50, 16);

        defensa_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        defensa_label.setForeground(new java.awt.Color(255, 255, 255));
        defensa_label.setText("Defensa");
        Agregar.add(defensa_label);
        defensa_label.setBounds(50, 540, 50, 20);

        atqEspecial_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        atqEspecial_label.setForeground(new java.awt.Color(255, 255, 255));
        atqEspecial_label.setText("Atq. Especial");
        Agregar.add(atqEspecial_label);
        atqEspecial_label.setBounds(50, 570, 90, 16);

        defEspacial_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        defEspacial_label.setForeground(new java.awt.Color(255, 255, 255));
        defEspacial_label.setText("Def. Especial");
        Agregar.add(defEspacial_label);
        defEspacial_label.setBounds(50, 600, 80, 20);

        velocidad_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        velocidad_label.setForeground(new java.awt.Color(255, 255, 255));
        velocidad_label.setText("Velocidad");
        Agregar.add(velocidad_label);
        velocidad_label.setBounds(50, 630, 70, 20);

        total_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        total_label.setForeground(new java.awt.Color(255, 255, 255));
        total_label.setText("Total");
        Agregar.add(total_label);
        total_label.setBounds(50, 660, 30, 20);

        base_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        base_label.setForeground(new java.awt.Color(255, 255, 255));
        base_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        base_label.setText("Base");
        base_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Agregar.add(base_label);
        base_label.setBounds(160, 450, 80, 20);

        totalBase_t.setEditable(false);
        totalBase_t.setBackground(new java.awt.Color(13, 17, 23));
        totalBase_t.setForeground(new java.awt.Color(255, 255, 255));
        totalBase_t.setText("0");
        Agregar.add(totalBase_t);
        totalBase_t.setBounds(160, 660, 80, 26);

        psBase_t.setBackground(new java.awt.Color(13, 17, 23));
        psBase_t.setForeground(new java.awt.Color(255, 255, 255));
        psBase_t.setText("0");
        Agregar.add(psBase_t);
        psBase_t.setBounds(160, 480, 80, 26);

        ataqueBase_t.setBackground(new java.awt.Color(13, 17, 23));
        ataqueBase_t.setForeground(new java.awt.Color(255, 255, 255));
        ataqueBase_t.setText("0");
        Agregar.add(ataqueBase_t);
        ataqueBase_t.setBounds(160, 510, 80, 26);

        defensaBase_t.setBackground(new java.awt.Color(13, 17, 23));
        defensaBase_t.setForeground(new java.awt.Color(255, 255, 255));
        defensaBase_t.setText("0");
        Agregar.add(defensaBase_t);
        defensaBase_t.setBounds(160, 540, 80, 26);

        atqespecialBase_t.setBackground(new java.awt.Color(13, 17, 23));
        atqespecialBase_t.setForeground(new java.awt.Color(255, 255, 255));
        atqespecialBase_t.setText("0");
        Agregar.add(atqespecialBase_t);
        atqespecialBase_t.setBounds(160, 570, 80, 26);

        defespecialBase_t.setBackground(new java.awt.Color(13, 17, 23));
        defespecialBase_t.setForeground(new java.awt.Color(255, 255, 255));
        defespecialBase_t.setText("0");
        Agregar.add(defespecialBase_t);
        defespecialBase_t.setBounds(160, 600, 80, 26);

        velocidadBase_t.setBackground(new java.awt.Color(13, 17, 23));
        velocidadBase_t.setForeground(new java.awt.Color(255, 255, 255));
        velocidadBase_t.setText("0");
        Agregar.add(velocidadBase_t);
        velocidadBase_t.setBounds(160, 630, 80, 26);

        tipo_label1.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        tipo_label1.setForeground(new java.awt.Color(255, 255, 255));
        tipo_label1.setText("Tipo 2");
        Agregar.add(tipo_label1);
        tipo_label1.setBounds(210, 390, 100, 29);

        tipo2_combo.setBackground(new java.awt.Color(13, 17, 23));
        tipo2_combo.setForeground(new java.awt.Color(255, 255, 255));
        tipo2_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Acero", "Agua", "Bicho", "Dragón", "Eléctrico", "Fantasma", "Fuego", "Hada", "Hielo", "Lucha", "Normal", "Planta", "Psíquico", "Roca", "Siniestro", "Tierra", "Veneno", "Volador" }));
        tipo2_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo2_comboActionPerformed(evt);
            }
        });
        Agregar.add(tipo2_combo);
        tipo2_combo.setBounds(210, 420, 120, 26);

        cargar.setBackground(new java.awt.Color(30, 112, 235));
        cargar.setForeground(new java.awt.Color(255, 255, 255));
        cargar.setText("Cargar imagen");
        cargar.addActionListener(this);
        Agregar.add(cargar);
        cargar.setBounds(40, 360, 250, 27);

        generacion_label.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        generacion_label.setForeground(new java.awt.Color(255, 255, 255));
        generacion_label.setText("Generación");
        Agregar.add(generacion_label);
        generacion_label.setBounds(360, 390, 130, 29);

        generaciont.setEditable(false);
        generaciont.setBackground(new java.awt.Color(13, 17, 23));
        generaciont.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        generaciont.setForeground(new java.awt.Color(255, 255, 255));
        generaciont.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        generaciont.setBorder(null);
        generaciont.setCaretColor(new java.awt.Color(255, 255, 255));
        generaciont.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        generaciont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generaciontActionPerformed(evt);
            }
        });
        Agregar.add(generaciont);
        generaciont.setBounds(360, 420, 140, 26);

        pkMax.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        pkMax.setForeground(new java.awt.Color(255, 255, 255));
        pkMax.setText("Disponibles");
        Agregar.add(pkMax);
        pkMax.setBounds(520, 390, 130, 30);

        maxPokemon.setEditable(false);
        maxPokemon.setBackground(new java.awt.Color(13, 17, 23));
        maxPokemon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        maxPokemon.setForeground(new java.awt.Color(255, 255, 255));
        maxPokemon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maxPokemon.setBorder(null);
        maxPokemon.setCaretColor(new java.awt.Color(255, 255, 255));
        maxPokemon.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        /*
        maxPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxPokemonActionPerformed(evt);
            }
        });
        */
        Agregar.add(maxPokemon);
        maxPokemon.setBounds(520, 420, 140, 26);

        numPokedex_utilizado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        numPokedex_utilizado.setForeground(new java.awt.Color(184, 44, 0));
        Agregar.add(numPokedex_utilizado);
        numPokedex_utilizado.setBounds(320, 250, 330, 15);

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        editar.addActionListener(this);
        Agregar.add(editar);
        editar.setBounds(660, 20, 41, 41);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tipo_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_comboActionPerformed

    private void region_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_region_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_region_comboActionPerformed

    private void numPokedex_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numPokedex_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numPokedex_tActionPerformed

    private void nombre_especieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_especieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_especieActionPerformed

    private void tipo2_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo2_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo2_comboActionPerformed

    private void generaciontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generaciontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generaciontActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agregar;
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
    private javax.swing.JButton editar;
    private javax.swing.JLabel especie_Label;
    private javax.swing.JLabel generacion_label;
    private javax.swing.JTextField generaciont;
    private javax.swing.JPanel imagen;
    private javax.swing.JTextField maxPokemon;
    private javax.swing.JTextField nombre_especie;
    private javax.swing.JLabel numPokedex_label;
    private javax.swing.JTextField numPokedex_t;
    private javax.swing.JLabel numPokedex_utilizado;
    private javax.swing.JLabel objeto_label;
    private javax.swing.JLabel perfil;
    private javax.swing.JLabel pkMax;
    private javax.swing.JTextField psBase_t;
    private javax.swing.JLabel ps_label;
    private javax.swing.JComboBox<String> region_combo;
    private javax.swing.JComboBox<String> tipo2_combo;
    private javax.swing.JComboBox<String> tipo_combo;
    private javax.swing.JLabel tipo_label;
    private javax.swing.JLabel tipo_label1;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField totalBase_t;
    private javax.swing.JLabel total_label;
    private javax.swing.JTextField velocidadBase_t;
    private javax.swing.JLabel velocidad_label;
    // End of variables declaration//GEN-END:variables


    public void cargarImagen() {
        JFileChooser archivos = new JFileChooser();
        FileNameExtensionFilter imagenes = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        archivos.setFileFilter(imagenes);

        int respuesta = archivos.showOpenDialog(this);
        if (respuesta == archivos.APPROVE_OPTION) {
            ruta = archivos.getSelectedFile().getPath();

            Image foto = new ImageIcon(ruta).getImage();
            ImageIcon icono = new ImageIcon(foto.getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH));
            perfil.setIcon(icono);
        }
    }

    public void obtenerRegiones() {
        ArrayList lista = mBD.obtenerRegiones();
        String[] regiones = new String[lista.size() / 3];
        for (int i = 0; i < lista.size(); i += 3) {
            regiones[i / 3] = lista.get(i).toString();
        }
        region_combo.removeAllItems();
        region_combo.setModel(new javax.swing.DefaultComboBoxModel<>(regiones));
    }

    private byte[] getImagen(String ruta) {
        File imagen = new File(ruta);
        try {
            byte[] icono = new byte[(int) imagen.length()];
            InputStream input = new FileInputStream(imagen);
            input.read(icono);
            return icono;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public void validar() {
        try {
            psbase = Integer.parseInt(psBase_t.getText());
            ataquebase = Integer.parseInt(ataqueBase_t.getText());
            defensabase = Integer.parseInt(defensaBase_t.getText());
            atqespecialbase = Integer.parseInt(atqespecialBase_t.getText());
            defespecialbase = Integer.parseInt(defespecialBase_t.getText());
            velocidadbase = Integer.parseInt(velocidadBase_t.getText());
            sumatoria = psbase + ataquebase + defensabase + atqespecialbase + defespecialbase + velocidadbase;
            if (sumatoria > 780) {
                totalBase_t.setText("Error");
            } else {
                totalBase_t.setText(Integer.toString(sumatoria));
            }
        } catch (NumberFormatException e) {
            totalBase_t.setText("Error");
        }
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == cargar) {
            cargarImagen();
        }
        if(evt.getSource() == agregarPK){
            crearEspecie();
        }
    }


    private void agregarListenerSeleccionRegion() {
        region_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                int filaSeleccionada = region_combo.getSelectedIndex();
                ArrayList datos = mBD.obtenerDatosRegion(region_combo.getItemAt(filaSeleccionada));

                if (filaSeleccionada != -1) {
                    generaciont.setText(datos.get(0).toString());
                    maxPokemon.setText(mBD.obtenerEspaciosDisponiblesPokemon(region_combo.getItemAt(filaSeleccionada)) + "/" + datos.get(1).toString());
                }
            }
        });
    }

    private void agregarListenerEstadisticas() {
        psBase_t.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                validar();
            }
            public void removeUpdate(DocumentEvent e) {
                validar();
            }
            public void insertUpdate(DocumentEvent e) {
                validar();
            }
        });

        ataqueBase_t.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                validar();
            }
            public void removeUpdate(DocumentEvent e) {
                validar();
            }
            public void insertUpdate(DocumentEvent e) {
                validar();
            }
        });

        defensaBase_t.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                validar();
            }
            public void removeUpdate(DocumentEvent e) {
                validar();
            }
            public void insertUpdate(DocumentEvent e) {
                validar();
            }
        });

        atqespecialBase_t.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                validar();
            }
            public void removeUpdate(DocumentEvent e) {
                validar();
            }
            public void insertUpdate(DocumentEvent e) {
                validar();
            }
        });

        defespecialBase_t.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                validar();
            }
            public void removeUpdate(DocumentEvent e) {
                validar();
            }
            public void insertUpdate(DocumentEvent e) {
                validar();
            }
        });

        velocidadBase_t.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                validar();
            }
            public void removeUpdate(DocumentEvent e) {
                validar();
            }
            public void insertUpdate(DocumentEvent e) {
                validar();
            }

        });
        numPokedex_t.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                numPokedexValido();
            }
            public void removeUpdate(DocumentEvent e) {
                numPokedexValido();
            }
            public void insertUpdate(DocumentEvent e) {
                numPokedexValido();
            }
        });
    }

    public void crearEspecie() {
        try {
            int numPokedex = Integer.parseInt(numPokedex_t.getText());
            String nombre = nombre_especie.getText();
            String region = region_combo.getSelectedItem().toString();
            String tipo1 = tipo_combo.getSelectedItem().toString();
            String tipo2 = tipo2_combo.getSelectedItem().toString();
            int psBase = Integer.parseInt(psBase_t.getText());
            int ataqueBase = Integer.parseInt(ataqueBase_t.getText());
            int defensaBase = Integer.parseInt(defensaBase_t.getText());
            int atqespecialBase = Integer.parseInt(atqespecialBase_t.getText());
            int defespecialBase = Integer.parseInt(defespecialBase_t.getText());
            int velocidadBase = Integer.parseInt(velocidadBase_t.getText());
            AlmacenEspecie especie = new AlmacenEspecie();
            especie.setNumPokedex(numPokedex);
            especie.setNombre(nombre);
            especie.setPSBase(psBase);
            especie.setATKBase(ataqueBase);
            especie.setDEFBase(defensaBase);
            especie.setVELBase(velocidadBase);
            especie.setSDEFBase(defespecialBase);
            especie.setSATKBase(atqespecialBase);
            especie.setTipo1(tipo1);
            especie.setTipo2(tipo2);
            especie.setNomRegion(region);
            try {
                especie.setImagen(getImagen(ruta));
            } catch (NullPointerException e) {
                especie.setImagen(getImagen("src/main/resources/images/MissingNO.png"));
            }
            if (mBD.agregarEspecie(especie)) {
                ((AgregarNuevo)javax.swing.SwingUtilities.getWindowAncestor(this)).Exito();
                vaciarTexto();
            } else {
                ((AgregarNuevo)javax.swing.SwingUtilities.getWindowAncestor(this)).Error("El numero de pokedex es invalido!");
            }
        } catch (NumberFormatException e) {
            ((AgregarNuevo)javax.swing.SwingUtilities.getWindowAncestor(this)).Error("¡Las estadisticas y numero de pokedex deben ser numeros!");
        }
    }

    public void vaciarTexto(){
        nombre_especie.setText("");
        numPokedex_t.setText("");
        psBase_t.setText("0");
        ataqueBase_t.setText("0");
        defensaBase_t.setText("0");
        atqespecialBase_t.setText("0");
        defespecialBase_t.setText("0");
        velocidadBase_t.setText("0");
        totalBase_t.setText("0");
        perfil.setIcon(null);
    }

    public void numPokedexValido() {
        try {
            Object selectedItem = region_combo.getSelectedItem();
            if (selectedItem == null) {
                numPokedex_utilizado.setText("");
                return;
            }
            ArrayList lista = mBD.numPokedexValido(selectedItem.toString());
            if (lista == null || lista.isEmpty()) {
                numPokedex_utilizado.setText("");
                return;
            }
            for (Object item : lista) {
                if (numPokedex_t.getText().equals(item.toString())) {
                    numPokedex_utilizado.setText("Este número de pokedex ya esta en uso");
                    return;
                }
            }
            numPokedex_utilizado.setText("");
        } catch (NumberFormatException e) {
            numPokedex_utilizado.setText("");
        }
    }
}

