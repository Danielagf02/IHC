/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Interno.ManipulaBD;
import Interno.Alumnno1;
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
public class Justificante extends javax.swing.JFrame
{
    ArrayList<Object> datos = new ArrayList<Object>();
    ArrayList<Object> datos2 = new ArrayList<Object>();
    public static ArrayList<Alumnno1> objeto;
    Querys q = new Querys();

    DefaultTableModel modelo;
   

    /**
     * Creates new form Justificante
     */
    public Justificante()
    {
        initComponents();
        String condicion;
        jTabAlumno.setValueAt(objeto.get(0).getFolioAlumno(), 0, 0);
        jTabAlumno.setValueAt(objeto.get(0).getApellidoP(), 0, 1);
        jTabAlumno.setValueAt(objeto.get(0).getApellidoM(), 0, 2);
        jTabAlumno.setValueAt(objeto.get(0).getNombre(), 0, 3);
        jTabAlumno.setValueAt(objeto.get(0).getGrado(), 0, 4);
        jTabAlumno.setValueAt(objeto.get(0).getGrupo(), 0, 5);
        condicion = String.valueOf(objeto.get(0).getId());
        objeto = ManipulaBD.ConsultasAlumnos("id_Alumno=", condicion);
        
        ImageIcon icono = new ImageIcon("C:/Users/HP/Desktop/ProyectoIHC/IHC/src/Imagenes/regresa (1).png");
        btnRegresar.setIcon(icono);
    }
    public void abrir(String nombre)
    {
        try {
            File path = new File(nombre + ".pdf");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex, "Atencion", 2);
        }
    }
          public void generar(String nombre)
    {
       

            FileOutputStream archivo;
            try {
                archivo = new FileOutputStream(nombre + ".pdf");
                Document documento = new Document();
                try {
                    PdfWriter.getInstance(documento, archivo);
                } catch (DocumentException ex) {
                    Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
                }
                documento.open();
                try {
                    
                    documento.add(new Paragraph("Datos del alumno"));
                    documento.add(new Paragraph("Folio Alumno: " + datos2.get(11)));
                    documento.add(new Paragraph("Apellido paterno: " + datos2.get(0)));
                    documento.add(new Paragraph("Apellido materno: " + datos2.get(1)));
                    documento.add(new Paragraph("Nombre: " + datos2.get(2)));
                    documento.add(new Paragraph("Grado: " + datos2.get(6)));
                    documento.add(new Paragraph("Grupo: " + datos2.get(7)));
                    documento.add(new Paragraph("Día: " + jtfdia.getText()));
                    documento.add(new Paragraph("Razon: " + jtfRazon.getText()));                 
                   
                } catch (DocumentException ex) {
                    Logger.getLogger(Justificante.class.getName()).log(Level.SEVERE, null, ex);
                }

                documento.close();
                JOptionPane.showMessageDialog(null, "PDF creado correctamente","Reporte",1);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex,"Advertencia",1);
            }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BuscarA = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabAlumno = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtfdia = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtfRazon = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Imprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Justificante");

        BuscarA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BuscarA.setText("Buscar Alumno ");
        BuscarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarAActionPerformed(evt);
            }
        });

        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jTabAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Folio Alumno", "Apellido Paterno", "Apelido Paterno", "Nombre", "Grado", "Grupo"
            }
        ));
        jScrollPane1.setViewportView(jTabAlumno);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Día:");

        jtfdia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfdiaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfdiaKeyTyped(evt);
            }
        });

        jtfRazon.setColumns(20);
        jtfRazon.setRows(5);
        jtfRazon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfRazonKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jtfRazon);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Razón:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Firma Director:____________________ ");

        Imprimir.setText("PDF");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BuscarA)
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfdia, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(153, 153, 153)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Imprimir))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(BuscarA)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Imprimir)
                        .addGap(30, 30, 30))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(btnRegresar)
                    .addContainerGap(439, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarAActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BuscarAActionPerformed
    {//GEN-HEADEREND:event_BuscarAActionPerformed
         new BuscarAlumno().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BuscarAActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ImprimirActionPerformed
    {//GEN-HEADEREND:event_ImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImprimirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegresarActionPerformed
    {//GEN-HEADEREND:event_btnRegresarActionPerformed
         new ReporteJustufcante().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jtfdiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfdiaKeyPressed
        if (jtfdia.getText().isEmpty() != true) {
            Validaciones.enter(this, evt, jtfRazon);
        }
    }//GEN-LAST:event_jtfdiaKeyPressed

    private void jtfdiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfdiaKeyTyped
        Validaciones.validaAlfanumerico(evt);
    }//GEN-LAST:event_jtfdiaKeyTyped

    private void jtfRazonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfRazonKeyTyped
        if (jtfRazon.getText().length() == 70) {
            evt.consume();
            Validaciones.validaAlfanumerico(evt);
        }
    }//GEN-LAST:event_jtfRazonKeyTyped

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
            java.util.logging.Logger.getLogger(Justificante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Justificante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Justificante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Justificante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Justificante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarA;
    private javax.swing.JButton Imprimir;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabAlumno;
    private javax.swing.JTextArea jtfRazon;
    private javax.swing.JTextField jtfdia;
    // End of variables declaration//GEN-END:variables
}
