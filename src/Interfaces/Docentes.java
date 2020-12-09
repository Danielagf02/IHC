/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Interno.ManipulaBD;
import Interno.Profesor1;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author DanielaGF
 */
public class Docentes extends javax.swing.JFrame
{

    public static ArrayList<Profesor1> objeto;

    /**
     * Creates new form Alumnos
     */
    public Docentes()
    {
        initComponents();

        ImageIcon icono = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/regresa (1).png");
        btnRegresar.setIcon(icono);

        ImageIcon icono1 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/grupo.png");
        btnTodosD.setIcon(icono1);

        ImageIcon icono2 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/salida (8).png");
        btnSalir.setIcon(icono2);
    }

    public void Mostrar()
    {
        TaDatosP.setValueAt(objeto.get(0).getApellidoP(), 0, 0);
        TaDatosP.setValueAt(objeto.get(0).getApellidoM(), 0, 1);
        TaDatosP.setValueAt(objeto.get(0).getNombres(), 0, 2);
        TaDatosP.setValueAt(objeto.get(0).getFechaNacimiento(), 0, 3);
        TaDatosP.setValueAt(objeto.get(0).getCURP(), 0, 4);
        TaDatosP.setValueAt(objeto.get(0).getSexo(), 0, 5);
        TaDatosP.setValueAt(objeto.get(0).getGrado(), 0, 6);
        TaDatosP.setValueAt(objeto.get(0).getGrupo(), 0, 7);
        TaDatosP.setValueAt(objeto.get(0).getTelefono(), 0, 8);
        TaDatosP.setValueAt(objeto.get(0).getCedulaProf(), 0, 9);
        TaDatosP.setValueAt(objeto.get(0).getDireccion(), 0, 10);
        TaDatosP.setValueAt(objeto.get(0).getId(), 0, 11);
        TaDatosP.setValueAt(objeto.get(0).getRfc(), 0, 12);
        TaDatosP.setValueAt(objeto.get(0).getCorreo(), 0, 13);
    }

    Docentes(ArrayList<Profesor1> ConsultasProfesor1)
    {
        for (int i = 0; i < ConsultasProfesor1.size(); i++)
        {
            System.out.print(ConsultasProfesor1.get(i));
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
        btnTodosD = new javax.swing.JButton();
        BuscarPorfesor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TaDatosP = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Docentes");

        btnTodosD.setBackground(new java.awt.Color(255, 255, 255));
        btnTodosD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnTodosD.setText("Todos los Docentes ");
        btnTodosD.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnTodosDActionPerformed(evt);
            }
        });

        BuscarPorfesor.setBackground(new java.awt.Color(255, 255, 255));
        BuscarPorfesor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BuscarPorfesor.setText("Buscar Docente");
        BuscarPorfesor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BuscarPorfesorActionPerformed(evt);
            }
        });

        TaDatosP.setModel(new javax.swing.table.DefaultTableModel(
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
                "A.Paterno", "A.Materno", "Nombres", "Fecha nacimiento", "CURP", "Sexo", "Grado", "Grupo", "Telefono", "Cedula profesional", "Dirección", "Folio Docente", "RFC", "Correo"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                true, true, true, true, true, true, true, true, true, true, true, true, true, false
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
        jScrollPane1.setViewportView(TaDatosP);

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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTodosD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 924, Short.MAX_VALUE)
                                .addComponent(BuscarPorfesor)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegresar)
                                .addGap(120, 120, 120)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTodosD)
                    .addComponent(BuscarPorfesor))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(btnSalir))
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

    private void BuscarPorfesorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BuscarPorfesorActionPerformed
    {//GEN-HEADEREND:event_BuscarPorfesorActionPerformed
        new Buscarprofesor().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BuscarPorfesorActionPerformed

    private void btnTodosDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnTodosDActionPerformed
    {//GEN-HEADEREND:event_btnTodosDActionPerformed
        String condicion = "-1";
        objeto = ManipulaBD.ConsultasProfesores("id!=", condicion);
        for (int i = 0; i < objeto.size(); i++)
        {
            TaDatosP.setValueAt(objeto.get(i).getApellidoP(), i, 0);
            TaDatosP.setValueAt(objeto.get(i).getApellidoM(), i, 1);
            TaDatosP.setValueAt(objeto.get(i).getNombres(), i, 2);
            TaDatosP.setValueAt(objeto.get(i).getFechaNacimiento(), i, 3);
            TaDatosP.setValueAt(objeto.get(i).getCURP(), i, 4);
            TaDatosP.setValueAt(objeto.get(i).getSexo(), i, 5);
            TaDatosP.setValueAt(objeto.get(i).getGrado(), i, 6);
            TaDatosP.setValueAt(objeto.get(i).getGrupo(), i, 7);
            TaDatosP.setValueAt(objeto.get(i).getTelefono(), i, 8);
            TaDatosP.setValueAt(objeto.get(i).getCedulaProf(), i, 9);
            TaDatosP.setValueAt(objeto.get(i).getDireccion(), i, 10);
            TaDatosP.setValueAt(objeto.get(i).getId(), i, 11);
            TaDatosP.setValueAt(objeto.get(i).getRfc(), i, 12);
            TaDatosP.setValueAt(objeto.get(i).getCorreo(), i, 13);
        }

    }//GEN-LAST:event_btnTodosDActionPerformed

    //METODO PARA PREGUNTAR SI DESEA SALIR O NO
    public void Cerrar()
    {
        String botones[] =
        {
            "Salir", "Cancelar"
        };
        int eleccion = JOptionPane.showOptionDialog(null, "¿Desea Salir?", "SALIDA", 0, 0, null, botones, this);
        if (eleccion == JOptionPane.YES_OPTION)
        {
            System.out.println("Salio del programa con exito");
            System.exit(eleccion);
        } else if (eleccion == JOptionPane.NO_OPTION)
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
            java.util.logging.Logger.getLogger(Docentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Docentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Docentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Docentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Docentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarPorfesor;
    private javax.swing.JTable TaDatosP;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTodosD;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
