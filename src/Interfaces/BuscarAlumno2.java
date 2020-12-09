/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Interno.Calificaciones1;
import Interno.ManipulaBD;
import cjb.ci.CtrlInterfaz;
import cjb.ci.Validaciones;
import javax.swing.ImageIcon;

/**
 *
 * @author DanielaGF
 */
public class BuscarAlumno2 extends javax.swing.JFrame
  {

    /**
     * Creates new form BuscarAlumno
     */
    public BuscarAlumno2()
      {
        initComponents();

        ImageIcon icono = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/regresa (1).png");
        btnRegresar.setIcon(icono);
        CtrlInterfaz.habilita(false, Buscar);
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jButton3 = new javax.swing.JButton();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtFAlumno = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Buscar Alumno");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Folio Alumno:");

        jtFAlumno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtFAlumno.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jtFAlumnoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtFAlumnoKeyTyped(evt);
            }
        });

        Cancelar.setBackground(new java.awt.Color(255, 255, 255));
        Cancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 0, 0));
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CancelarActionPerformed(evt);
            }
        });

        Buscar.setBackground(new java.awt.Color(255, 255, 255));
        Buscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(0, 102, 255));
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BuscarActionPerformed(evt);
            }
        });

        btnRegresar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cancelar)
                .addGap(63, 63, 63)
                .addComponent(Buscar)
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jtFAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar)))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtFAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(Buscar))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CancelarActionPerformed
    {//GEN-HEADEREND:event_CancelarActionPerformed
        CtrlInterfaz.limpia(jtFAlumno);
        CtrlInterfaz.habilita(false, Buscar);
    }//GEN-LAST:event_CancelarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegresarActionPerformed
    {//GEN-HEADEREND:event_btnRegresarActionPerformed
        new Calificaciones().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jtFAlumnoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtFAlumnoKeyTyped
    {//GEN-HEADEREND:event_jtFAlumnoKeyTyped
        if (jtFAlumno.getText().isEmpty() != true)
          {
            Validaciones.enter(this, evt, evt);
            Buscar.setEnabled(true);

          }
    }//GEN-LAST:event_jtFAlumnoKeyTyped

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BuscarActionPerformed
    {//GEN-HEADEREND:event_BuscarActionPerformed
        int fAlumno = Integer.parseInt(String.valueOf(jtFAlumno.getText()));
        CtrlInterfaz.habilita(false, Buscar);
        CtrlInterfaz.limpia(jtFAlumno);
        Calificaciones.objeto = ManipulaBD.ConsultasAlumnos("FolioAlumno=", ""+fAlumno+"");
        Calificaciones nueva = new Calificaciones();
        nueva.setVisible(true);
        nueva.Mostrar();
        this.setVisible(false);
    }//GEN-LAST:event_BuscarActionPerformed

    private void jtFAlumnoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtFAlumnoKeyPressed
    {//GEN-HEADEREND:event_jtFAlumnoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFAlumnoKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
      {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
          {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
              {
                if ("Nimbus".equals(info.getName()))
                  {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                  }
              }
          } catch (ClassNotFoundException ex)
          {
            java.util.logging.Logger.getLogger(BuscarAlumno2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex)
          {
            java.util.logging.Logger.getLogger(BuscarAlumno2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex)
          {
            java.util.logging.Logger.getLogger(BuscarAlumno2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex)
          {
            java.util.logging.Logger.getLogger(BuscarAlumno2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
          {
            public void run()
              {
                new BuscarAlumno2().setVisible(true);
              }
          });
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton3;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtFAlumno;
    // End of variables declaration//GEN-END:variables
}
