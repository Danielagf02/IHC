package Interfaces;

import Interno.Alumnno1;
import Interno.Calificaciones1;
import Interno.ManipulaBD;
import Interno.Materias1;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author DanielaGF
 */
public class RegistrarCalificaciones1 extends javax.swing.JFrame
  {

    public static ArrayList<Alumnno1> objeto;
    ArrayList<Calificaciones1> cal = null;
    ArrayList<Materias1> mat = null;

    /**
     * Creates new form Alumnos
     */
    public RegistrarCalificaciones1()
      {
        initComponents();
        ImageIcon icono = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/regresa (1).png");
        btnRegresar.setIcon(icono);
        String condicion;
        

      }
    
    public void Mostrar()
    {
        String condicion = String.valueOf(objeto.get(0).getId());
        cal = ManipulaBD.ConsultasCalificaciones("id_Alumno=", condicion);

        for (int i = 0; i < cal.size(); i++)
          {
            condicion = String.valueOf(cal.get(i).getId_Materia());
            mat = ManipulaBD.ConsultasMaterias("id=", condicion);
            TaCali.setValueAt(mat.get(0).getNombre(), i, 0);
            TaCali.setValueAt(cal.get(i).getCalificacion(), i, 1);
          }
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BuscarAlumno = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TaDatosAlumno = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TaCali = new javax.swing.JTable();
        BModificaCal = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Calificaciones");

        BuscarAlumno.setBackground(new java.awt.Color(255, 255, 255));
        BuscarAlumno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BuscarAlumno.setText("Buscar Alumno ");
        BuscarAlumno.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BuscarAlumnoActionPerformed(evt);
            }
        });

        TaDatosAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null}
            },
            new String []
            {
                "Folio Alumno", "Apellido Paterno", "Apelido Paterno", "Nombre", "Grado", "Grupo"
            }
        ));
        jScrollPane1.setViewportView(TaDatosAlumno);

        btnRegresar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegresarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        TaCali.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TaCali.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String []
            {
                "Materias", "Calificaciones"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TaCali);

        BModificaCal.setBackground(new java.awt.Color(255, 255, 255));
        BModificaCal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BModificaCal.setText("Modificar Calificación");
        BModificaCal.setToolTipText("");
        BModificaCal.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BModificaCalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnRegresar)
                                .addGap(240, 240, 240)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(BuscarAlumno))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BModificaCal)
                        .addGap(102, 102, 102)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegresar)
                    .addComponent(jLabel1))
                .addGap(41, 41, 41)
                .addComponent(BuscarAlumno)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(BModificaCal)
                .addGap(37, 37, 37))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegresarActionPerformed
    {//GEN-HEADEREND:event_btnRegresarActionPerformed
        new ControlEscolar().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void BuscarAlumnoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BuscarAlumnoActionPerformed
    {//GEN-HEADEREND:event_BuscarAlumnoActionPerformed
        String Folio = JOptionPane.showInputDialog("Folio del Alumno");
        objeto = ManipulaBD.ConsultasAlumnos("FolioAlumno=", "" + Folio + "");
        TaDatosAlumno.setValueAt(objeto.get(0).getFolioAlumno(), 0, 0);
        TaDatosAlumno.setValueAt(objeto.get(0).getApellidoP(), 0, 1);
        TaDatosAlumno.setValueAt(objeto.get(0).getApellidoM(), 0,2);
        TaDatosAlumno.setValueAt(objeto.get(0).getNombre(), 0, 3);
        TaDatosAlumno.setValueAt(objeto.get(0).getGrado(), 0, 4);
        TaDatosAlumno.setValueAt(objeto.get(0).getGrupo(), 0, 5);
        Mostrar();
    }//GEN-LAST:event_BuscarAlumnoActionPerformed

    private void BModificaCalActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BModificaCalActionPerformed
    {//GEN-HEADEREND:event_BModificaCalActionPerformed
        for (int i = 0; i < cal.size(); i++)
          {
            ManipulaBD.ModificarCalificaciones(cal.get(i).getId(), "Calificacion", "" + TaCali.getValueAt(i, 1) + "");
          }
    }//GEN-LAST:event_BModificaCalActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarCalificaciones1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex)
          {
            java.util.logging.Logger.getLogger(RegistrarCalificaciones1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex)
          {
            java.util.logging.Logger.getLogger(RegistrarCalificaciones1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex)
          {
            java.util.logging.Logger.getLogger(RegistrarCalificaciones1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RegistrarCalificaciones1().setVisible(true);
              }
          });
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BModificaCal;
    private javax.swing.JButton BuscarAlumno;
    private javax.swing.JTable TaCali;
    private javax.swing.JTable TaDatosAlumno;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
