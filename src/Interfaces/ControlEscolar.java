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
public class ControlEscolar extends javax.swing.JFrame
{

    /**
     * Creates new form ControlEscolar
     */
    public ControlEscolar()
    {
        initComponents();
        
        ImageIcon icono = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/Sin título.png");
        jLLogo.setIcon(icono);
        
        ImageIcon icono1 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/grupo.png");
        btnGrupo.setIcon(icono1);
        
        ImageIcon icono2 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/estudiante.png");
        btnAlumnos.setIcon(icono2);
        
        ImageIcon icono3 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/estudiante (1).png");
        btnProfesores.setIcon(icono3);
        
        ImageIcon icono4 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/hora.png");
        btnRegHorario.setIcon(icono4);
        
        ImageIcon icono5 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/libro.png");
        btnMaterias.setIcon(icono5);
        
        ImageIcon icono6 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/marcador.png");
        btnCalificaciones.setIcon(icono6);
        
        ImageIcon icono7 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/grupo.png");
        btnUsuarios.setIcon(icono7);
        
        ImageIcon icono8 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/colegio (1).png");
        btnRegistroA.setIcon(icono8);
        
        ImageIcon icono9 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/equipo (3).png");
        btnAdministrarGrupos.setIcon(icono9);
        
        ImageIcon icono10 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/lista.png");
        btnBoletas.setIcon(icono10);
        
        ImageIcon icono11 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/producto.png");
        btnRegistrarMaterias.setIcon(icono11);
        
        ImageIcon icono12 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/impresora.png");
        btnImprimir.setIcon(icono12);
        
        ImageIcon icono13 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/profesor (1).png");
        btnRegistrarProf.setIcon(icono13);
        
        ImageIcon icono14 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/reloj.png");
        btnHorarios.setIcon(icono14);
        
        ImageIcon icono15 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/mujer.png");
        btnRegistrarCalificaciones.setIcon(icono15);
        
        ImageIcon icono16 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/humano.png");
        btnNuevoAdmin.setIcon(icono16);
        
        ImageIcon icono17 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/salida (8).png");
        btnSalir.setIcon(icono17);
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
        btnProfesores = new javax.swing.JButton();
        btnMaterias = new javax.swing.JButton();
        btnCalificaciones = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnRegHorario = new javax.swing.JButton();
        jLLogo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnRegistroA = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnBoletas = new javax.swing.JButton();
        btnAdministrarGrupos = new javax.swing.JButton();
        btnNuevoAdmin = new javax.swing.JButton();
        btnRegistrarMaterias = new javax.swing.JButton();
        btnRegistrarCalificaciones = new javax.swing.JButton();
        btnHorarios = new javax.swing.JButton();
        btnRegistrarProf = new javax.swing.JButton();
        btnAdminsFijos = new javax.swing.JButton();
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

        btnProfesores.setBackground(new java.awt.Color(255, 204, 102));
        btnProfesores.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnProfesores.setText("Profesores");
        btnProfesores.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnProfesoresActionPerformed(evt);
            }
        });

        btnMaterias.setBackground(new java.awt.Color(255, 204, 102));
        btnMaterias.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMaterias.setText("Materias");
        btnMaterias.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMateriasActionPerformed(evt);
            }
        });

        btnCalificaciones.setBackground(new java.awt.Color(255, 204, 102));
        btnCalificaciones.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCalificaciones.setText("Calificaciones");
        btnCalificaciones.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCalificacionesActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(255, 204, 102));
        btnUsuarios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnRegHorario.setBackground(new java.awt.Color(255, 204, 102));
        btnRegHorario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegHorario.setText("Registar Horario");
        btnRegHorario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegHorarioActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlumnos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProfesores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegHorario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMaterias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalificaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUsuarios)
                .addContainerGap(263, Short.MAX_VALUE))
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
                                .addComponent(btnProfesores)
                                .addComponent(btnMaterias)
                                .addComponent(btnCalificaciones)
                                .addComponent(btnUsuarios)
                                .addComponent(btnRegHorario))
                            .addComponent(jLLogo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Hola Admin");

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

        btnRegistroA.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistroA.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnRegistroA.setText("Registar Alumnos ");
        btnRegistroA.setToolTipText("Registar Alumnos");
        btnRegistroA.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegistroAActionPerformed(evt);
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

        btnBoletas.setBackground(new java.awt.Color(255, 255, 255));
        btnBoletas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnBoletas.setText("Boletas Alumnos");
        btnBoletas.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBoletasActionPerformed(evt);
            }
        });

        btnAdministrarGrupos.setBackground(new java.awt.Color(255, 255, 255));
        btnAdministrarGrupos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnAdministrarGrupos.setText("Administrar Grupos");
        btnAdministrarGrupos.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAdministrarGruposActionPerformed(evt);
            }
        });

        btnNuevoAdmin.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevoAdmin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnNuevoAdmin.setText("Registrar nuevo administrador");
        btnNuevoAdmin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNuevoAdminActionPerformed(evt);
            }
        });

        btnRegistrarMaterias.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarMaterias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnRegistrarMaterias.setText("Registar Materias ");
        btnRegistrarMaterias.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegistrarMateriasActionPerformed(evt);
            }
        });

        btnRegistrarCalificaciones.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarCalificaciones.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnRegistrarCalificaciones.setText("Registar Calificaciones ");
        btnRegistrarCalificaciones.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegistrarCalificacionesActionPerformed(evt);
            }
        });

        btnHorarios.setBackground(new java.awt.Color(255, 255, 255));
        btnHorarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnHorarios.setText("Horarios de Clase");
        btnHorarios.setToolTipText("Horarios de clase");
        btnHorarios.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHorariosActionPerformed(evt);
            }
        });

        btnRegistrarProf.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarProf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnRegistrarProf.setText("Registar Profesores");
        btnRegistrarProf.setToolTipText("");
        btnRegistrarProf.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegistrarProfActionPerformed(evt);
            }
        });

        btnAdminsFijos.setBackground(new java.awt.Color(255, 255, 255));
        btnAdminsFijos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAdminsFijos.setText("Adminsitradores Fijos ");
        btnAdminsFijos.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAdminsFijosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRegistroA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdministrarGrupos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBoletas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistrarMaterias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImprimir))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnRegistrarProf)
                        .addGap(30, 30, 30)
                        .addComponent(btnHorarios)
                        .addGap(32, 32, 32)
                        .addComponent(btnRegistrarCalificaciones)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevoAdmin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(476, 476, 476))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(457, 457, 457))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(btnAdminsFijos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(110, 110, 110)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdministrarGrupos)
                    .addComponent(btnBoletas)
                    .addComponent(btnRegistrarMaterias)
                    .addComponent(btnImprimir)
                    .addComponent(btnRegistroA))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarCalificaciones)
                    .addComponent(btnNuevoAdmin)
                    .addComponent(btnHorarios)
                    .addComponent(btnRegistrarProf))
                .addGap(104, 104, 104)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdminsFijos)
                    .addComponent(btnSalir))
                .addContainerGap(92, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
    {//GEN-HEADEREND:event_jRadioButtonMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void btnRegHorarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegHorarioActionPerformed
    {//GEN-HEADEREND:event_btnRegHorarioActionPerformed
       new Horarios().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegHorarioActionPerformed

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

    private void btnProfesoresActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnProfesoresActionPerformed
    {//GEN-HEADEREND:event_btnProfesoresActionPerformed
         new Docentes().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProfesoresActionPerformed

    private void btnMateriasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMateriasActionPerformed
    {//GEN-HEADEREND:event_btnMateriasActionPerformed
         new Materias().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMateriasActionPerformed

    private void btnCalificacionesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCalificacionesActionPerformed
    {//GEN-HEADEREND:event_btnCalificacionesActionPerformed
         new Calificaciones().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCalificacionesActionPerformed

    private void btnRegistroAActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegistroAActionPerformed
    {//GEN-HEADEREND:event_btnRegistroAActionPerformed
        new RegistrarAlumnos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistroAActionPerformed

    private void btnAdministrarGruposActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAdministrarGruposActionPerformed
    {//GEN-HEADEREND:event_btnAdministrarGruposActionPerformed
        new Grupo().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAdministrarGruposActionPerformed

    private void btnRegistrarProfActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegistrarProfActionPerformed
    {//GEN-HEADEREND:event_btnRegistrarProfActionPerformed
       new RegistrarProfesor().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistrarProfActionPerformed

    private void btnHorariosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHorariosActionPerformed
    {//GEN-HEADEREND:event_btnHorariosActionPerformed
        new TodosHorarios().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHorariosActionPerformed

    private void btnRegistrarMateriasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegistrarMateriasActionPerformed
    {//GEN-HEADEREND:event_btnRegistrarMateriasActionPerformed
       new AltaMaterias().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistrarMateriasActionPerformed

    private void btnNuevoAdminActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNuevoAdminActionPerformed
    {//GEN-HEADEREND:event_btnNuevoAdminActionPerformed
       new Registrarse().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNuevoAdminActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUsuariosActionPerformed
    {//GEN-HEADEREND:event_btnUsuariosActionPerformed
        new VerUsuariosAdminisrtradores().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnRegistrarCalificacionesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegistrarCalificacionesActionPerformed
    {//GEN-HEADEREND:event_btnRegistrarCalificacionesActionPerformed
      new RegistarCalificaciones().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistrarCalificacionesActionPerformed

    private void btnAdminsFijosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAdminsFijosActionPerformed
    {//GEN-HEADEREND:event_btnAdminsFijosActionPerformed
        new ADministrFijoos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAdminsFijosActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnImprimirActionPerformed
    {//GEN-HEADEREND:event_btnImprimirActionPerformed
         new ReporteJustufcante().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnBoletasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBoletasActionPerformed
    {//GEN-HEADEREND:event_btnBoletasActionPerformed
        new Boletas().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBoletasActionPerformed

    //METODO PARA PREGUNTAR SI DESEA SALIR O NO
    public void Cerrar()
    {
        String botones[] = {"Salir", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(null, "¿Desea Salir?", "SALIDA", 0, 0, null, botones, this);
        if (eleccion == JOptionPane.YES_OPTION)
        {
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
            java.util.logging.Logger.getLogger(ControlEscolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ControlEscolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ControlEscolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ControlEscolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ControlEscolar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ayuda;
    private javax.swing.JButton btnAdministrarGrupos;
    private javax.swing.JButton btnAdminsFijos;
    private javax.swing.JButton btnAlumnos;
    private javax.swing.JButton btnBoletas;
    private javax.swing.JButton btnCalificaciones;
    private javax.swing.JButton btnGrupo;
    private javax.swing.JButton btnHorarios;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnMaterias;
    private javax.swing.JButton btnNuevoAdmin;
    private javax.swing.JButton btnProfesores;
    private javax.swing.JButton btnRegHorario;
    private javax.swing.JButton btnRegistrarCalificaciones;
    private javax.swing.JButton btnRegistrarMaterias;
    private javax.swing.JButton btnRegistrarProf;
    private javax.swing.JButton btnRegistroA;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUsuarios;
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
