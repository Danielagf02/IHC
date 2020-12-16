/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import static Interfaces.Calificaciones.objeto;
import Interno.Alumnno1;
import Interno.ManipulaBD;
import cjb.ci.Validaciones;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import poo.bd.Querys;

/**
 *
 * @author DanielaGF
 */
public class Reporte1 extends javax.swing.JFrame
{

    //ArrayList<Object> datos = new ArrayList<Object>();
    //ArrayList<Object> datos2 = new ArrayList<Object>();
    public static ArrayList<Alumnno1> objeto;
    Querys q = new Querys();

    DefaultTableModel modelo;

    /**
     * Creates new form Justificante
     */
    public Reporte1()
    {
        initComponents();

        ImageIcon icono = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/regresa (1).png");
        btnRegresar.setIcon(icono);

        ImageIcon icono6 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/impresora.png");
        btnImprimir.setIcon(icono6);

        ImageIcon icono2 = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/estudiante.png");
        btnBuscarA.setIcon(icono2);
    }

    public void abrir(String nombre)
    {
        try
        {
            File path = new File(nombre + ".pdf");
            Desktop.getDesktop().open(path);
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Atencion", 2);
        }
    }

    public void generar(String nombre)
    {

        FileOutputStream archivo;
        try
        {
            archivo = new FileOutputStream(nombre + ".pdf");
            Document documento = new Document();
            try
            {
                PdfWriter.getInstance(documento, archivo);
            } catch (DocumentException ex)
            {
                Logger.getLogger(Reporte1.class.getName()).log(Level.SEVERE, null, ex);
            }
            documento.open();
            try
            {

                documento.add(new Paragraph("Datos del alumno"));
                documento.add(new Paragraph("Folio Alumno: " + objeto.get(0).getFolioAlumno()));
                documento.add(new Paragraph("Apellido paterno: " + objeto.get(0).getApellidoP()));
                documento.add(new Paragraph("Apellido materno: " + objeto.get(0).getApellidoM()));
                documento.add(new Paragraph("Nombre: " + objeto.get(0).getNombre()));
                documento.add(new Paragraph("Grado: " + objeto.get(0).getGrado()));
                documento.add(new Paragraph("Grupo: " + objeto.get(0).getGrupo()));
                documento.add(new Paragraph("Día: " + jtfdia.getText()));
                documento.add(new Paragraph("Razon: " + jtfRazon.getText()));
                documento.add(new Paragraph("Día cita del padre: " + jtfdiaPadre.getText()));

            } catch (DocumentException ex)
            {
                Logger.getLogger(Reporte1.class.getName()).log(Level.SEVERE, null, ex);
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "PDF creado correctamente", "Reporte", 1);
        } catch (FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "Error: " + ex, "Advertencia", 1);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarA = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabAlumno = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtfdia = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtfRazon = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfdiaPadre = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Reporte");

        btnBuscarA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnBuscarA.setText("Buscar Alumno ");
        btnBuscarA.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscarAActionPerformed(evt);
            }
        });

        btnRegresar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegresarActionPerformed(evt);
            }
        });

        jTabAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null}
            },
            new String []
            {
                "Folio Alumno", "Apellido Paterno", "Apelido Materno", "Nombre", "Grado", "Grupo"
            }
        ));
        jScrollPane1.setViewportView(jTabAlumno);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Día:");

        jtfdia.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jtfdiaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfdiaKeyTyped(evt);
            }
        });

        jtfRazon.setColumns(20);
        jtfRazon.setRows(5);
        jtfRazon.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jtfRazonKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfRazonKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jtfRazon);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Razón:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Día cita Padres:");

        jtfdiaPadre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfdiaPadreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarA)
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfdia, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jtfdiaPadre, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel1)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(btnRegresar)
                    .addContainerGap(564, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(btnBuscarA)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 120, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfdiaPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(btnRegresar)
                    .addContainerGap(439, Short.MAX_VALUE)))
        );

        btnImprimir.setText("PDF ");
        btnImprimir.setToolTipText("");
        btnImprimir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnImprimirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Firma Director:____________________ ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(138, 138, 138)
                .addComponent(btnImprimir)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(btnImprimir))
                .addGap(0, 72, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarAActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBuscarAActionPerformed
    {//GEN-HEADEREND:event_btnBuscarAActionPerformed

        String Folio = JOptionPane.showInputDialog("Folio del Alumno");
        objeto = ManipulaBD.ConsultasAlumnos("FolioAlumno=", "" + Folio + "");
        jTabAlumno.setValueAt(objeto.get(0).getFolioAlumno(), 0, 0);
        jTabAlumno.setValueAt(objeto.get(0).getApellidoP(), 0, 1);
        jTabAlumno.setValueAt(objeto.get(0).getApellidoM(), 0, 2);
        jTabAlumno.setValueAt(objeto.get(0).getNombre(), 0, 3);
        jTabAlumno.setValueAt(objeto.get(0).getGrado(), 0, 4);
        jTabAlumno.setValueAt(objeto.get(0).getGrupo(), 0, 5);

    }//GEN-LAST:event_btnBuscarAActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnImprimirActionPerformed
    {//GEN-HEADEREND:event_btnImprimirActionPerformed
        System.out.println("Aqui VAMOOOOOOOS");
        FileOutputStream archivo;
            String nombreAlumno= objeto.get(0).getNombre().toString() + " " + objeto.get(0).getApellidoP().toString();
            System.out.println(nombreAlumno);
            try {
                archivo = new FileOutputStream(nombreAlumno + ".pdf");
                Document documento = new Document();
                try {
                    PdfWriter.getInstance(documento, archivo);
                } catch (DocumentException ex) {
                    Logger.getLogger(Reporte1.class.getName()).log(Level.SEVERE, null, ex);
                }
                documento.open();
                try {
                    
                    documento.add(new Paragraph("Datos del alumno"));
                    documento.add(new Paragraph("Folio Alumno: " + objeto.get(0).getFolioAlumno()));
                    documento.add(new Paragraph("Apellido paterno: " + objeto.get(0).getApellidoP()));
                    documento.add(new Paragraph("Apellido materno: " + objeto.get(0).getApellidoM()));
                    documento.add(new Paragraph("Nombre: " + objeto.get(0).getNombre()));
                    documento.add(new Paragraph("Grado: " + objeto.get(0).getGrado()));
                    documento.add(new Paragraph("Grupo: " + objeto.get(0).getGrupo()));
                    documento.add(new Paragraph("Día: " + jtfdia.getText()));
                    documento.add(new Paragraph("Razon: " + jtfRazon.getText()));
                    documento.add(new Paragraph("Día cita del padre: " + jtfdiaPadre.getText()));
                    
                   
                } catch (DocumentException ex) {
                    Logger.getLogger(Reporte1.class.getName()).log(Level.SEVERE, null, ex);
                }

                documento.close();
                JOptionPane.showMessageDialog(null, "PDF creado correctamente","Reporte",1);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex,"Advertencia",1);
            }
             try {
            File path = new File(nombreAlumno + ".pdf");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex, "Atencion", 2);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegresarActionPerformed
    {//GEN-HEADEREND:event_btnRegresarActionPerformed
        new RJPProfesores().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jtfdiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfdiaKeyPressed
        if (jtfdia.getText().isEmpty() != true)
        {
            Validaciones.enter(this, evt, jtfRazon);
        }
    }//GEN-LAST:event_jtfdiaKeyPressed

    private void jtfdiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfdiaKeyTyped
        Validaciones.validaAlfanumerico(evt);
    }//GEN-LAST:event_jtfdiaKeyTyped

    private void jtfRazonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfRazonKeyPressed
        if (jtfRazon.getText().isEmpty() != true)
        {
            Validaciones.enter(this, evt, jtfdiaPadre);
        }
    }//GEN-LAST:event_jtfRazonKeyPressed

    private void jtfRazonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfRazonKeyTyped
        if (jtfRazon.getText().length() == 70)
        {
            evt.consume();
            Validaciones.validaAlfanumerico(evt);
        }

    }//GEN-LAST:event_jtfRazonKeyTyped

    private void jtfdiaPadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfdiaPadreKeyTyped
        Validaciones.validaAlfanumerico(evt);
    }//GEN-LAST:event_jtfdiaPadreKeyTyped

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
            java.util.logging.Logger.getLogger(Reporte1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Reporte1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Reporte1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Reporte1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Reporte1().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarA;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabAlumno;
    private javax.swing.JTextArea jtfRazon;
    private javax.swing.JTextField jtfdia;
    private javax.swing.JTextField jtfdiaPadre;
    // End of variables declaration//GEN-END:variables
}
