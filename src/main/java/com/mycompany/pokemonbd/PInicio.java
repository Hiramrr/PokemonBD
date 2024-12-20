package com.mycompany.pokemonbd;


import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hiram
 */
public class PInicio extends javax.swing.JFrame implements ActionListener {
    public boolean estado = true;
    /**
     * Creates new form Principal
     */
    public PInicio() {
        initComponents();
        setIconImage(new ImageIcon("Icono.png").getImage());
        this.setTitle("PokeConnect");
        inicio_sesion inicio = new inicio_sesion();
        inicio.setLocation(0,0);
        inicio.setSize(704, 502);
          
        contenido.removeAll();
        contenido.add(inicio,BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        Image foto = new ImageIcon("Icono.png").getImage();
        ImageIcon icono =  new ImageIcon(foto.getScaledInstance(iconoLugar.getWidth(),iconoLugar.getHeight(),Image.SCALE_SMOOTH));
        iconoP.setIcon(icono);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        entrenador = new javax.swing.JLabel();
        secundario = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();
        boton = new javax.swing.JButton();
        iconoLugar = new javax.swing.JPanel();
        iconoP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(15, 123, 189));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1280, 764));
        getContentPane().setLayout(null);

        principal.setBackground(new java.awt.Color(13, 17, 23));
        principal.setForeground(new java.awt.Color(255, 255, 255));
        principal.setMinimumSize(new java.awt.Dimension(1280, 764));

        entrenador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/collage2.png"))); // NOI18N

        secundario.setBackground(new java.awt.Color(22, 26, 33));
        secundario.setForeground(new java.awt.Color(22, 26, 33));

        titulo.setBackground(new java.awt.Color(240, 246, 252));
        titulo.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(240, 246, 252));
        titulo.setText("PokeConnect");
        titulo.setToolTipText("");

        contenido.setBackground(new java.awt.Color(13, 17, 23));
        contenido.setMinimumSize(new java.awt.Dimension(704, 502));
        contenido.setLayout(new java.awt.BorderLayout());

        boton.setBackground(new java.awt.Color(30, 112, 235));
        boton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton.setForeground(new java.awt.Color(255, 255, 255));
        boton.setText("Crear entrenador");
        boton.addActionListener(this);
        boton.setToolTipText("Crear un nuevo usuario en el sistema");

        iconoLugar.setBackground(new java.awt.Color(22, 26, 33));
        iconoLugar.setForeground(new java.awt.Color(22, 26, 33));
        iconoLugar.setToolTipText("");

        iconoP.setBackground(new java.awt.Color(22, 26, 33));
        iconoP.setForeground(new java.awt.Color(22, 26, 33));

        javax.swing.GroupLayout iconoLugarLayout = new javax.swing.GroupLayout(iconoLugar);
        iconoLugar.setLayout(iconoLugarLayout);
        iconoLugarLayout.setHorizontalGroup(
            iconoLugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconoP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        iconoLugarLayout.setVerticalGroup(
            iconoLugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconoP, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout secundarioLayout = new javax.swing.GroupLayout(secundario);
        secundario.setLayout(secundarioLayout);
        secundarioLayout.setHorizontalGroup(
            secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secundarioLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(secundarioLayout.createSequentialGroup()
                        .addComponent(iconoLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(titulo)
                        .addGap(81, 81, 81)
                        .addComponent(boton)))
                .addGap(68, 68, 68))
        );
        secundarioLayout.setVerticalGroup(
            secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secundarioLayout.createSequentialGroup()
                .addGroup(secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(secundarioLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(boton))
                    .addGroup(secundarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconoLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addComponent(entrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(entrenador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(secundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(principal);
        principal.setBounds(0, 0, 1280, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>-
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel entrenador;
    private javax.swing.JPanel iconoLugar;
    private javax.swing.JLabel iconoP;
    private javax.swing.JPanel principal;
    private javax.swing.JPanel secundario;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    public void iniciarSesionExitoso(String idEntrenador) {
        ListaPK lista = new ListaPK(idEntrenador);
        lista.setVisible(true);
        System.out.println("Funciono");
        this.dispose();
    }

    public void iniciarSesionError() {
        Dialogo acciones = new Dialogo(this,false);
        acciones.setVisible(true);
        acciones.setMensaje("No existe el entrenador en la base de datos");
        acciones.setLocation(450, 261);
        System.out.println("fallo");
    }

    public void crearUsuarioExitoso() {
        Dialogo acciones = new Dialogo(this,false);
        acciones.setVisible(true);
        acciones.setMensaje("Entrenador creado exitosamente");
        acciones.setLocation(450, 261);
        System.out.println("Funciono");
    }

    public void crearUsuarioError(String mensaje) {
        Dialogo acciones = new Dialogo(this,false);
        acciones.setVisible(true);
        acciones.setMensaje(mensaje);
        acciones.setLocation(450, 261);
        System.out.println("fallo");
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == boton){
            if(estado){
                boton.setText("Inicio de sesion");
                crear_entrenador crear = new crear_entrenador();
                crear.setLocation(0, 0);
                crear.setSize(704, 502);

                contenido.removeAll();
                contenido.add(crear,BorderLayout.CENTER);
                contenido.revalidate();
                contenido.repaint();
                estado = false;
                boton.setToolTipText("Iniciar sesion en la aplicacion");
            }
            else {
                boton.setText("Crear entrenador");
                inicio_sesion inicio = new inicio_sesion();
                inicio.setLocation(0,0);
                inicio.setSize(704, 502);

                contenido.removeAll();
                contenido.add(inicio,BorderLayout.CENTER);
                contenido.revalidate();
                contenido.repaint();
                estado = true;
                boton.setToolTipText("Crear un nuevo usuario en el sistema");
            }
        }
    }
}

