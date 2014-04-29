/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.fifa;


import javax.swing.JOptionPane;

/**
 *
 * @author Cesar Javier Solares Orozco
 */
public class Menu extends javax.swing.JFrame {
    
    static Sede [] Sedes = new Sede [100];
    static Equipo [] Equipos = new Equipo [100];
    static Equipo [] EquiposTorneos = new Equipo [100];
    static Jugador [] Jugadores = new Jugador [100];
    static Torneo [] Torneos = new Torneo [100];
    
    static int ControlEquipos = 0;
  
    public Menu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        oli = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(765, 550));
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo/estadio.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 0, 370, 290);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo/Torneo.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(620, 230, 90, 90);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo/Jugador.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(440, 320, 70, 80);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo/Equipo.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(270, 320, 80, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo/fedefut.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1000000, 1000000));
        jLabel1.setMinimumSize(new java.awt.Dimension(770, 650));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 760, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String nom, pa, ciu;
       int cap;
       nom = JOptionPane.showInputDialog(this, "Ingrese Nombre");
       pa = JOptionPane.showInputDialog(this, "Ingrese Pais");
       ciu = JOptionPane.showInputDialog(this, "Ingrese Ciudad");
       cap = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese Capacidad"));
       
       Sede est = new Sede (nom, pa, ciu, cap);
        Sede sede = new Sede (est);
       JOptionPane.showMessageDialog(this, "Sede " + nom + " \n Creada en " + pa + " ubicada en " + ciu + "\n Con capacidad de "+ cap, "Sede", JOptionPane.INFORMATION_MESSAGE);
       
 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nom, fecha, pais, tipo;
       // oli.setVisible(true);
        if (Menu.Equipos[7] == null)
            {
                for (int i = 0; i <= Equipos.length; i++)
                {
                    if (Equipos[i] == null)
                    {
                        JOptionPane.showMessageDialog(null, "No existen suficientes equipos, \n Ahora existen " + i + " Equipos \n El minimo son 8 equipos", "Torneo", JOptionPane.INFORMATION_MESSAGE);   
                        break;
                    }
                    else 
                    {}
                }            
            }
        else
            {       
                nom = JOptionPane.showInputDialog(this, "Ingrese Nombre");
                fecha = JOptionPane.showInputDialog(this, "Ingrese fecha \n Formato AAAA-MM-DD");
                pais = JOptionPane.showInputDialog(this, "Ingrese Pais");
                tipo = JOptionPane.showInputDialog(this, "Ingrese tipo");
       
                Torneo tor = new Torneo (nom, fecha, pais, tipo);
                new Torneo (tor);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       String nom, fecha, ciu;
       int cod;
       if (Sedes[0] == null)
       {
         JOptionPane.showMessageDialog(this, "No hay estadios creados", "Estadios", JOptionPane.INFORMATION_MESSAGE); 
       }
       else
       {
        nom = JOptionPane.showInputDialog(this, "Ingrese Nombre");
        fecha = JOptionPane.showInputDialog(this, "Ingrese fecha \n Formato AAAA-MM-DD");
        ciu = JOptionPane.showInputDialog(this, "Ingrese Ciudad de Origen");
        cod = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese Codigo"));
       
        Equipo eq = new Equipo (nom, fecha, ciu, cod);
        new Equipo (eq);
       
        JOptionPane.showMessageDialog(this, "Equipo " + nom + " \n Creado en " + ciu + " con fecha " + fecha + "\n Con codigo "+ cod + "\n Con sede " + eq.Estadio , "Estadio", JOptionPane.INFORMATION_MESSAGE);     
        
        int Confirmacion =JOptionPane.showConfirmDialog(this, "¿Agregar jugadores al equipo??");
        
        if (Confirmacion == 0)
        {
            for(int cont = 0; cont <= Jugadores.length; cont ++)
            {
              if(Jugadores[cont] == null)
              {
                  break;
              }
              else
              {
                JOptionPane.showConfirmDialog(null, "Jugadores " + Jugadores[cont], "Disconnect Products", JOptionPane.YES_NO_OPTION);     
              } 
            }     
        }
        
       }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String nom, ape, fechanac, paisnac, pos; 
        int codcar, numerocam;
        
        nom = JOptionPane.showInputDialog(this, "Ingrese Nombres");
        ape = JOptionPane.showInputDialog(this, "Ingrese Apellidos");
        fechanac = JOptionPane.showInputDialog(this, "Ingrese Fecha de nacimiento \n Formato AAAA-MM-DD");
        paisnac = JOptionPane.showInputDialog(this, "Ingrese Pais de nacimiento");
        pos = JOptionPane.showInputDialog(this, "Ingrese Posicion en la que juega");
        codcar = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese Codigo de carnet"));
        numerocam = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese Numero de camisola"));
        
        Jugador ju = new Jugador (nom, ape, fechanac, paisnac, pos, codcar, numerocam);
        new Jugador (ju);
       
        JOptionPane.showMessageDialog(this, "Jugador " + nom + " " + ape + " \n Nacido en la fecha " + fechanac + " En " + paisnac + "\n , Posicion: "+ pos + "\n Con codigo de carnet " + codcar + " y numero de camisola " + numerocam, "Jugador", JOptionPane.INFORMATION_MESSAGE);
       
    }//GEN-LAST:event_jButton3ActionPerformed

   
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JFrame oli;
    // End of variables declaration//GEN-END:variables
}
