/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author DanielaGF
 */

//EN EL BTON DE GRUPOS CUANDO DAS REGRESAR EN LUGAR DE REGRESARTE AQUI TE DIRIGE A LA PRINCIPAL DE ADMIN 
//YA QUE ADMIN TAMBIEN TIENE ESE BOTON Y LO REGRESA NORMAL A SU INTERFAZ NO SE SI DEBAMOS HACER OTRA INTERFAZ DE 
//GRUPOS PARA ESTA(:
//LO MISMO CON EL BOTON DE ALUMNOS
//BOTON DE IMPRIMIR REPORTE/JUSTIFICANTE
//HASTA AQUI MI REPORTE JOAQUIN 


public class IProfesores extends javax.swing.JFrame
{

    /**
     * Creates new form ControlEscolar
     */
    public IProfesores()
    {
        initComponents();
        
        ImageIcon icono = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/Sin título.png");
        jLLogo.setIcon(icono);
        
        ImageIcon icono1 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/grupo.png");
        btnGrupo.setIcon(icono1);
        
        ImageIcon icono2 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/estudiante.png");
        btnAlumnos.setIcon(icono2);
        
        ImageIcon icono3 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/hora.png");
        btnHorarios.setIcon(icono3);
        
        ImageIcon icono4 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/producto.png");
        btnMaterias.setIcon(icono4);
        
        ImageIcon icono5 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/lista.png");
        btnListaAlumnos.setIcon(icono5);
        
        ImageIcon icono6 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/impresora.png");
        btnImprimir.setIcon(icono6);
        
        ImageIcon icono7 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/reloj.png");
        btnHorariosClase.setIcon(icono7);
        
        ImageIcon icono8 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/mujer.png");
        btnRegistarCalificaciones.setIcon(icono8);
        
        ImageIcon icono9 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/salida (8).png");
        btnSalir.setIcon(icono9);
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

        jPanel1 = new javax.swing.JPanel();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnGrupo = new javax.swing.JButton();
        btnAlumnos = new javax.swing.JButton();
        btnHorarios = new javax.swing.JButton();
        jLLogo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnListaAlumnos = new javax.swing.JButton();
        btnMaterias = new javax.swing.JButton();
        btnRegistarCalificaciones = new javax.swing.JButton();
        btnHorariosClase = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenuItem2.setText("configuración 1");
        jPopupMenu2.add(jMenuItem2);

        jMenuItem6.setText("configuracion 2");
        jPopupMenu2.add(jMenuItem6);

        jMenuItem7.setText("configuración 3");
        jPopupMenu2.add(jMenuItem7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(686, 476));
        setType(java.awt.Window.Type.POPUP);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setComponentPopupMenu(jPopupMenu2);
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Control Escolar");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Lic.Benito Juárez");

        btnGrupo.setBackground(new java.awt.Color(255, 204, 102));
        btnGrupo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGrupo.setText("Grupo");
        btnGrupo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnGrupoActionPerformed(evt);
            }
        });

        btnAlumnos.setBackground(new java.awt.Color(255, 204, 102));
        btnAlumnos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAlumnos.setText("Alumnos");
        btnAlumnos.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAlumnosActionPerformed(evt);
            }
        });

        btnHorarios.setBackground(new java.awt.Color(255, 204, 102));
        btnHorarios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnHorarios.setText("Horarios");
        btnHorarios.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHorariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)))
                .addGap(84, 84, 84)
                .addComponent(btnGrupo)
                .addGap(31, 31, 31)
                .addComponent(btnAlumnos)
                .addGap(18, 18, 18)
                .addComponent(btnHorarios)
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnGrupo)
                                .addComponent(btnAlumnos)
                                .addComponent(btnHorarios))
                            .addComponent(jLLogo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Hola Profesor");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("¿Qué deseas hacer hoy?");

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setToolTipText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSalirActionPerformed(evt);
            }
        });

        btnImprimir.setBackground(new java.awt.Color(255, 255, 255));
        btnImprimir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnImprimir.setText("Imprimir Reporte/Justifcante");
        btnImprimir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnImprimirActionPerformed(evt);
            }
        });

        btnListaAlumnos.setBackground(new java.awt.Color(255, 255, 255));
        btnListaAlumnos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnListaAlumnos.setText("Lista Mis Alumnos");
        btnListaAlumnos.setToolTipText("");
        btnListaAlumnos.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnListaAlumnosActionPerformed(evt);
            }
        });

        btnMaterias.setBackground(new java.awt.Color(255, 255, 255));
        btnMaterias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnMaterias.setText("Materias ");
        btnMaterias.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMateriasActionPerformed(evt);
            }
        });

        btnRegistarCalificaciones.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistarCalificaciones.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnRegistarCalificaciones.setText("Registar Calificaciones ");
        btnRegistarCalificaciones.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegistarCalificacionesActionPerformed(evt);
            }
        });

        btnHorariosClase.setBackground(new java.awt.Color(255, 255, 255));
        btnHorariosClase.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnHorariosClase.setText("Horarios de Clase");
        btnHorariosClase.setToolTipText("Horarios de clase");
        btnHorariosClase.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHorariosClaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnMaterias)
                        .addGap(49, 49, 49)
                        .addComponent(btnListaAlumnos)
                        .addGap(52, 52, 52)
                        .addComponent(btnImprimir))
                    .addComponent(btnSalir))
                .addGap(51, 51, 51))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnHorariosClase)
                        .addGap(64, 64, 64)
                        .addComponent(btnRegistarCalificaciones))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMaterias)
                    .addComponent(btnListaAlumnos)
                    .addComponent(btnImprimir))
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHorariosClase)
                    .addComponent(btnRegistarCalificaciones))
                .addGap(35, 35, 35)
                .addComponent(btnSalir)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 204, 102));
        jMenuBar1.setForeground(new java.awt.Color(255, 204, 102));

        jMenu2.setText("Configuracion");

        jMenu3.setText("Cambiar color letras");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Azul");
        jMenu3.add(jCheckBoxMenuItem1);

        jMenu2.add(jMenu3);

        jMenu4.setText("Cambiar Fuente");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Arial");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jRadioButtonMenuItem1);

        jMenu2.add(jMenu4);

        jMenuItem1.setText("Letra mas grande");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        Ayuda.setText("Ayuda");
        jMenuBar1.add(Ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
    {//GEN-HEADEREND:event_jRadioButtonMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void btnHorariosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHorariosActionPerformed
    {//GEN-HEADEREND:event_btnHorariosActionPerformed
       // new Horarios().setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_btnHorariosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalirActionPerformed
    {//GEN-HEADEREND:event_btnSalirActionPerformed
        Cerrar();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAlumnosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAlumnosActionPerformed
    {//GEN-HEADEREND:event_btnAlumnosActionPerformed
         new Alumnos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAlumnosActionPerformed

    private void btnGrupoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnGrupoActionPerformed
    {//GEN-HEADEREND:event_btnGrupoActionPerformed
        new Grupo().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGrupoActionPerformed

    private void btnHorariosClaseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHorariosClaseActionPerformed
    {//GEN-HEADEREND:event_btnHorariosClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHorariosClaseActionPerformed

    private void btnMateriasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMateriasActionPerformed
    {//GEN-HEADEREND:event_btnMateriasActionPerformed
      new MateriasxProfesor().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMateriasActionPerformed

    private void btnListaAlumnosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnListaAlumnosActionPerformed
    {//GEN-HEADEREND:event_btnListaAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListaAlumnosActionPerformed

    private void btnRegistarCalificacionesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegistarCalificacionesActionPerformed
    {//GEN-HEADEREND:event_btnRegistarCalificacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistarCalificacionesActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnImprimirActionPerformed
    {//GEN-HEADEREND:event_btnImprimirActionPerformed
        new RJPProfesores().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnImprimirActionPerformed

    //METODO PARA PREGUNTAR SI DESEA SALIR O NO
    public void Cerrar()
    {
        String botones[] = {"Salir", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(null, "¿Desea Salir?", "SALIDA", 0, 0, null, botones, this);
        if (eleccion == JOptionPane.YES_OPTION)
        {
            System.out.println("Salio del programa con exito");
            System.exit(eleccion);
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
            java.util.logging.Logger.getLogger(IProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(IProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(IProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(IProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new IProfesores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ayuda;
    private javax.swing.JButton btnAlumnos;
    private javax.swing.JButton btnGrupo;
    private javax.swing.JButton btnHorarios;
    private javax.swing.JButton btnHorariosClase;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnListaAlumnos;
    private javax.swing.JButton btnMaterias;
    private javax.swing.JButton btnRegistarCalificaciones;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
}
