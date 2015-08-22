/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jirucho
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        desc1.setVisible(false);
        yuna.setVisible(false);
        tidus.setVisible(false);
        cloud.setVisible(false);
        ashe.setVisible(false);
        lun.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc1 = new javax.swing.JTextArea();
        yuna = new javax.swing.JLabel();
        cloud = new javax.swing.JLabel();
        lun = new javax.swing.JLabel();
        ashe = new javax.swing.JLabel();
        tidus = new javax.swing.JLabel();
        titu1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(685, 996));
        getContentPane().setLayout(null);

        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Ashe", "Tidus", "Cloud", "Luneth", "Yuna" }));
        combo.setSelectedItem("Vaan");
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        getContentPane().add(combo);
        combo.setBounds(20, 50, 80, 30);

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        desc1.setBackground(new java.awt.Color(0, 0, 102));
        desc1.setColumns(20);
        desc1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        desc1.setForeground(new java.awt.Color(255, 255, 255));
        desc1.setRows(5);
        jScrollPane1.setViewportView(desc1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 120, 150, 210);

        yuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Yuna.png"))); // NOI18N
        yuna.setToolTipText("");
        yuna.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                yunaComponentHidden(evt);
            }
        });
        getContentPane().add(yuna);
        yuna.setBounds(180, 130, 160, 170);

        cloud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cloud.png"))); // NOI18N
        cloud.setToolTipText("");
        getContentPane().add(cloud);
        cloud.setBounds(180, 130, 160, 180);

        lun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Luneth.png"))); // NOI18N
        lun.setToolTipText("");
        getContentPane().add(lun);
        lun.setBounds(180, 130, 140, 170);

        ashe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ashe.png"))); // NOI18N
        ashe.setToolTipText("");
        getContentPane().add(ashe);
        ashe.setBounds(180, 130, 140, 150);

        tidus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tidus.png"))); // NOI18N
        tidus.setToolTipText("");
        getContentPane().add(tidus);
        tidus.setBounds(180, 130, 140, 150);

        titu1.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        titu1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(titu1);
        titu1.setBounds(120, 50, 110, 23);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FF4-RecoverHP.png"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 50, 370, 326);

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Final Fantasy Mini Enciclopedia");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(0, 0, 370, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        String name = (String)combo.getSelectedItem( );
        if(!name.equals("Tidus")){
            tidus.setVisible(false);
        } if(!name.equals("Cloud")){
            cloud.setVisible(false);
        } if(!name.equals("Luneth")){
            lun.setVisible(false);
        } if(!name.equals("Yuna")){
            yuna.setVisible(false);
        } if(!name.equals("Ashe")){
            ashe.setVisible(false);
        }
        while(name.equals("Tidus")){
            titu1.setText("Final Fantasy X");
            tidus.setVisible(true);
            desc1.setVisible(true);
            desc1.setText(" Después de que el monstruo\n gigantesco conocido como Sinh atacara\n su ciudad natal, Tidus es transportado\n al mundo de Spira. Perdido, confundido, y\n aparentemente fuera de lugar, Tidus se encuentra\n con un recién hecha y derecha invocadora llamada Yuna\n y sus guardianes. Yuna establece una peregrinación para poner\n fin al Sinh, y al unirse a Yuna en su peregrinación Tidus\n espera encontrar su camino a casa.");
            break;
        }
        while(name.equals("Luneth")){
                 titu1.setText("Final Fantasy III");
            lun.setVisible(true);
            desc1.setVisible(true);
            desc1.setText("Un joven de Ur llamado Luneth,\n descubre un Cristal en una cueva a\n las afueras de su pueblo que le dice que\n debe encontrar a otras 3 personas como él. \nLos cuatro al juntarse tendrán que liberar al\n pueblo de Kazus de la maldición de un ser llamado Jinn,\n tras esto el Cristal les dice que fueron los elegidos para ser\n los 4 Guerreros de la Luz con el fin de restaurar el\n equilibrio entre la Luz y la Oscuridad\n debido a que el mundo se enfrenta a\n la destrucción total...");   
            break;
        }
        while(name.equals("Yuna")){
                 titu1.setText("Final Fantasy X");
            ashe.setVisible(true);
            desc1.setVisible(true);
            desc1.setText("Heroina de Final fantasy X");
            break;
                    }
        while(name.equals("Ashe")){
             titu1.setText("Final Fantasy XII");
            ashe.setVisible(true);
            desc1.setVisible(true);
            desc1.setText("Ashe es la princesa (y, posteriormente,\n la reina) de 19 años de edad\n de Dalmasca, y su objetivo es liberar a\n su reino de la ocupación de Arcadia. Es la\n líder del movimiento de resistencia y la única\n heredera del trono.");
            break;
        }
        while(name.equals("Cloud")){
             titu1.setText("Final Fantasy VII");
            cloud.setVisible(true);
            desc1.setVisible(true);
            desc1.setText("Cloud es un Ex-SOLDADO, que pasó a trabajar\n como mercenario. Tras un tiempo,\n Barret Wallace, líder del grupo\n revolucionario AVALANCHA, lo contrata para\n una misión.");
            break;
        }
        
    }//GEN-LAST:event_comboActionPerformed

    private void yunaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_yunaComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_yunaComponentHidden

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ashe;
    private javax.swing.JLabel cloud;
    private javax.swing.JComboBox combo;
    private javax.swing.JTextArea desc1;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lun;
    private javax.swing.JLabel tidus;
    public static javax.swing.JLabel titu1;
    private javax.swing.JLabel yuna;
    // End of variables declaration//GEN-END:variables
}
