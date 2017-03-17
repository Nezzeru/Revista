/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Articulo;
import Controller.Lista;
import java.io.Serializable;

/**
 *
 * @author teodora
 */
public class UI extends javax.swing.JFrame implements Serializable{

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
        guardar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        titulo = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        cuerpo = new javax.swing.JTextPane();
        anterior = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        Categoria = new javax.swing.JLabel();
        imgBack = new javax.swing.JPanel();
        tagCate = new javax.swing.JComboBox<>();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBorder(javax.swing.BorderFactory.createTitledBorder("Revista"));

        titulo.setEditable(false);
        jScrollPane1.setViewportView(titulo);

        cuerpo.setEditable(false);
        jScrollPane2.setViewportView(cuerpo);

        anterior.setText("Anterior");

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nuevo))
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editar)
                        .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guardar)
                .addContainerGap())
        );

        Categoria.setText("Categoria");

        imgBack.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgBack.setLayout(new java.awt.GridLayout(1, 1));

        tagCate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "politica", "tech", "deportes", "" }));
        tagCate.setSelectedIndex(3);
        tagCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tagCateActionPerformed(evt);
            }
        });

        img.setText(" ");
        img.setBorder(javax.swing.BorderFactory.createTitledBorder("Autor"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Categoria)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tagCate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imgBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgBack, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Categoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tagCate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        save();
        guardar.setVisible(false);


    }//GEN-LAST:event_guardarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        titulo.setEditable(true);
        cuerpo.setEditable(true);
        guardar.setVisible(true);

        background.revalidate();
        background.repaint();


    }//GEN-LAST:event_editarActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed

        dibujar();
    }//GEN-LAST:event_siguienteActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        limpiar();
        titulo.setEditable(true);
        cuerpo.setEditable(true);
        guardar.setVisible(true);
        img.setIcon(null);
        imgBack.revalidate();
        imgBack.repaint();

    }//GEN-LAST:event_nuevoActionPerformed

    private void tagCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tagCateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tagCateActionPerformed

    public void dibujar() {
        
        
        Articulo y = (Articulo) revista.iterador().next();
        titulo.setText(y.getTitulo());
        cuerpo.setText(y.getCuerpo());
        if (y.getRuta() != null) {
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource(y.getRuta())));
            revista.añadir(y);
            imgBack.revalidate();
            imgBack.repaint();

        }
   
        background.revalidate();
        background.repaint();
        System.out.println("________________________________________-");
        System.out.println(y.getTitulo());
        System.out.println(y.getCuerpo());
        System.out.println("Al pelo");
    }

    public void limpiar() {
        titulo.setText("");
        cuerpo.setText("");
    }

    public void save() {

        Articulo nuevo = new Articulo(titulo.getText(), cuerpo.getText());
        titulo.setEditable(false);
        cuerpo.setEditable(false);
        revista.añadir(nuevo);
        background.revalidate();
        background.repaint();

        switch (tagCate.getSelectedIndex()) {

            case 0:
                img.setIcon(new javax.swing.ImageIcon(getClass().getResource(politica)));
                imgBack.revalidate();
                imgBack.repaint();
                nuevo.setRuta(politica);
                break;

            case 1:
                img.setIcon(new javax.swing.ImageIcon(getClass().getResource(tech)));
                imgBack.revalidate();
                imgBack.repaint();
                nuevo.setRuta(tech);
                break;

            case 2:
                img.setIcon(new javax.swing.ImageIcon(getClass().getResource(deportes)));
                imgBack.revalidate();
                imgBack.repaint();
                nuevo.setRuta(deportes);
                break;

            default:
                break;
        }

        System.out.println(nuevo.getCuerpo());

    }

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }
    Articulo predeterminado = new Articulo("Tu madre", "mundo");
    Lista revista = new Lista();
    String politica = "/Resources/img03.png";
    String tech = "/Resources/img04.png";
    String deportes = "/Resources/img05.png";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Categoria;
    private javax.swing.JButton anterior;
    private javax.swing.JPanel background;
    private javax.swing.JTextPane cuerpo;
    private javax.swing.JButton editar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel img;
    private javax.swing.JPanel imgBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton siguiente;
    private javax.swing.JComboBox<String> tagCate;
    private javax.swing.JTextPane titulo;
    // End of variables declaration//GEN-END:variables
}
