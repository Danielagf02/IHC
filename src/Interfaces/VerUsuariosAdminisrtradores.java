/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Interno.Adminis1;
import Interno.ManipulaBD;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author DanielaGF
 */
public class VerUsuariosAdminisrtradores extends javax.swing.JFrame
{
     public static ArrayList<Adminis1> objeto;

    /**
     * Creates new form Alumnos
     */
    public VerUsuariosAdminisrtradores()
    {
        initComponents();
        
        ImageIcon icono = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/regresa (1).png");
        btnRegresar.setIcon(icono);
        
        ImageIcon icono1 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/grupo.png");
        btnTodosU.setIcon(icono1);
        
        ImageIcon icono2 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/salida (8).png");
        btnSalir.setIcon(icono2);
    }

     public void Mostrar()
    {
       
        
        TaDatosAlumno.setValueAt(objeto.get(0).getApellidoP(), 0, 0);
        TaDatosAlumno.setValueAt(objeto.get(0).getApellidoM(), 0, 1);
        
        TaDatosAlumno.setValueAt(objeto.get(0).getNombre(), 0, 2);
        TaDatosAlumno.setValueAt(objeto.get(0).getFechaNacimiento(), 0, 3);
        TaDatosAlumno.setValueAt(objeto.get(0).getCURP(), 0, 4);
        //TaDatosA.setValueAt(objeto.get(0).getRFC(), 0, 5);
        TaDatosAlumno.setValueAt(objeto.get(0).getSexo(), 0, 6);
        TaDatosAlumno.setValueAt(objeto.get(0).getTelefono(), 0, 7);
        TaDatosAlumno.setValueAt(objeto.get(0).getCedulaProfe(), 0, 8);
        TaDatosAlumno.setValueAt(objeto.get(0).getDireccion(), 0, 9);
        TaDatosAlumno.setValueAt(objeto.get(0).getFolioEmpleado(), 0, 10);
        //TaDatosA.setValueAt(objeto.get(0).getFolioPuesto(), 0, 11);
        TaDatosAlumno.setValueAt(objeto.get(0).getCorreo(), 0, 12);
        TaDatosAlumno.setValueAt(objeto.get(0).getContrasenia(), 0, 13);
    }
    

    VerUsuariosAdminisrtradores(ArrayList<Adminis1> ConsultaAdminis1)
      {
        for (int i = 0; i < ConsultaAdminis1.size(); i++)
          {
            System.out.print(ConsultaAdminis1.get(i));
            System.out.println("\n");
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
        btnTodosU = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TaDatosAlumno = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Administradores");

        btnTodosU.setBackground(new java.awt.Color(255, 255, 255));
        btnTodosU.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnTodosU.setText("Todos los usuarios");
        btnTodosU.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnTodosUActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton3.setText("Buscar Usuario");
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });

        TaDatosAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String []
            {
                "A.Paterno", "A.Materno", "Nombres", "Fecha nacimiento", "CURP", "RFC", "Sexo", "Telefono", "Cedula profesional", "Dirección", "Folio Empleado", "Puesto", "Correo", "Contraseña"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                true, true, true, true, true, true, true, true, true, true, true, true, false, true
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
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
            .addGap(0, 85, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setToolTipText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTodosU)
                            .addComponent(btnRegresar))
                        .addGap(0, 133, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(406, 406, 406)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel1)))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTodosU)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalirActionPerformed
    {//GEN-HEADEREND:event_btnSalirActionPerformed
        Cerrar();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
       String Folio = JOptionPane.showInputDialog("Folio Admnistrador");
      
       objeto = ManipulaBD.ConsultasAdmins("FolioAdministrador=", "" + Folio + "");
      
        
        TaDatosAlumno.setValueAt(objeto.get(0).getApellidoP(), 0, 0);
        TaDatosAlumno.setValueAt(objeto.get(0).getApellidoM(), 0, 1);
        TaDatosAlumno.setValueAt(objeto.get(0).getNombre(), 0, 2);
        TaDatosAlumno.setValueAt(objeto.get(0).getFechaNacimiento(), 0, 3);
        TaDatosAlumno.setValueAt(objeto.get(0).getCURP(), 0, 4);
        TaDatosAlumno.setValueAt(objeto.get(0).getSexo(), 0, 5);
        TaDatosAlumno.setValueAt(objeto.get(0).getTelefono(), 0, 6);
        TaDatosAlumno.setValueAt(objeto.get(0).getCedulaProfe(), 0, 7);
        TaDatosAlumno.setValueAt(objeto.get(0).getDireccion(), 0, 8);
        TaDatosAlumno.setValueAt(objeto.get(0).getFolioEmpleado(), 0, 9);
        TaDatosAlumno.setValueAt(objeto.get(0).getPuesto(), 0, 10);
       
        TaDatosAlumno.setValueAt(objeto.get(0).getCorreo(), 0, 11);
        TaDatosAlumno.setValueAt(objeto.get(0).getContrasenia(), 0, 12);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnTodosUActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnTodosUActionPerformed
    {//GEN-HEADEREND:event_btnTodosUActionPerformed
         String condicion = "-1";
        objeto = ManipulaBD.ConsultasAdmins("id!=", condicion);
        for (int i = 0; i < objeto.size(); i++)
        {
           
            
        TaDatosAlumno.setValueAt(objeto.get(i).getApellidoP(), i, 0);
        TaDatosAlumno.setValueAt(objeto.get(i).getApellidoM(), i, 1);
        TaDatosAlumno.setValueAt(objeto.get(i).getNombre(), i, 2);
        TaDatosAlumno.setValueAt(objeto.get(i).getFechaNacimiento(), i, 3);
        TaDatosAlumno.setValueAt(objeto.get(i).getCURP(), i, 4);
        //TaDatosA.setValueAt(objeto.get(i).getRFC(), i, 5);
        TaDatosAlumno.setValueAt(objeto.get(i).getSexo(), i, 6);
        TaDatosAlumno.setValueAt(objeto.get(i).getTelefono(), i, 7);
        TaDatosAlumno.setValueAt(objeto.get(i).getCedulaProfe(), i, 8);
        TaDatosAlumno.setValueAt(objeto.get(i).getDireccion(), i, 9);
        TaDatosAlumno.setValueAt(objeto.get(i).getFolioEmpleado(), i, 10);
        //TaDatosA.setValueAt(objeto.get(i).getFolioPuesto(), i, 11);
        TaDatosAlumno.setValueAt(objeto.get(i).getCorreo(), i, 12);
        TaDatosAlumno.setValueAt(objeto.get(i).getContrasenia(), i, 13);
       
        }
    }//GEN-LAST:event_btnTodosUActionPerformed

    
    //METODO PARA PREGUNTAR SI DESEA SALIR O NO
    public void Cerrar()
    {
        String botones[] = {"Salir", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(null, "¿Desea Salir?", "SALIDA", 0, 0, null, botones, this);
        if (eleccion == JOptionPane.YES_OPTION)
        {
//            System.out.println("Salio del programa con exito");
//            System.exit(eleccion);
            new InicioUsuarios().setVisible(true);
            this.setVisible(false);
        } else 
        if(eleccion == JOptionPane.NO_OPTION)
        {
            System.out.println("Se cancelo la salida");
        }
    }
    
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
            java.util.logging.Logger.getLogger(VerUsuariosAdminisrtradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VerUsuariosAdminisrtradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VerUsuariosAdminisrtradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VerUsuariosAdminisrtradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VerUsuariosAdminisrtradores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TaDatosAlumno;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTodosU;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
