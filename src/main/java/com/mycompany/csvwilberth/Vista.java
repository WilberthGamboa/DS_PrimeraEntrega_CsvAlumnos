/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.csvwilberth;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author wmgc5
 */
public class Vista extends javax.swing.JFrame {
    LinkedList<ListaAlumnos> listaAlumnos = new LinkedList<>();

    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Importar = new javax.swing.JToggleButton();
        Guardar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Exportar = new javax.swing.JToggleButton();
        Nuevo = new javax.swing.JToggleButton();
        matriculajTextField1 = new javax.swing.JTextField();
        apellidoPjTextField1 = new javax.swing.JTextField();
        apellidoMjTextField1 = new javax.swing.JTextField();
        nombresjTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Importar.setText("Importar");
        Importar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportarActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Matricula");

        jLabel2.setText("Apellido P");

        jLabel3.setText("Apellido M");

        jLabel4.setText("Nombres");

        Exportar.setText("Exportar");

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        matriculajTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculajTextField1ActionPerformed(evt);
            }
        });

        apellidoPjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoPjTextField1ActionPerformed(evt);
            }
        });

        apellidoMjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoMjTextField1ActionPerformed(evt);
            }
        });

        nombresjTextField1.setText("jTextField1");
        nombresjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresjTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Importar)
                        .addGap(53, 53, 53)
                        .addComponent(Nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(Exportar)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(matriculajTextField1)
                            .addComponent(apellidoPjTextField1)
                            .addComponent(apellidoMjTextField1)
                            .addComponent(nombresjTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                        .addContainerGap(180, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(matriculajTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(apellidoPjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(apellidoMjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nombresjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Importar)
                    .addComponent(Nuevo)
                    .addComponent(Guardar)
                    .addComponent(Exportar))
                .addGap(134, 134, 134))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void guardarArchivo(File archivo){
        FileWriter fichero = null;
        PrintWriter pw= null;
        try {
            fichero = new FileWriter(archivo);
            pw  = new PrintWriter(fichero);
            for(ListaAlumnos u:  listaAlumnos){
                String linea = u.getMatricula()+","+u.getPrimerApellido()+","+u.getSegundoApellido()+","+u.getNombres();
                pw.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
            //TODO: handle exception
        }
        finally{
            try {
                if(fichero!=null){
                    fichero.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                //TODO: handle exception
            }
        }
    }
    private void apellidoPjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoPjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoPjTextField1ActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        // TODO add your handling code here:

        ListaAlumnos nuevoAlumno = new ListaAlumnos();
        nuevoAlumno.setMatricula(matriculajTextField1.getText());
        nuevoAlumno.setPrimerApellido(apellidoPjTextField1.getText());
        nuevoAlumno.setSegundoApellido(apellidoMjTextField1.getText());
        nuevoAlumno.setNombres(nombresjTextField1.getText());
        listaAlumnos.add(nuevoAlumno);
        
    }//GEN-LAST:event_NuevoActionPerformed

    private void ImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImportarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed

        JFileChooser seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos csv", "csv");
        seleccionarArchivo.setFileFilter(filtro);
        /*
        int seleccionar = seleccionarArchivo.showOpenDialog(this);
        if(seleccionar == JFileChooser.APPROVE_OPTION){
            File archivo =seleccionarArchivo.getSelectedFile();
            guardarArchivo(archivo);
        }
        */

        if(seleccionarArchivo.showDialog(this, "GUARDAR CSV")==JFileChooser.APPROVE_OPTION){
            File archivo =seleccionarArchivo.getSelectedFile();
            guardarArchivo(archivo);

        }


    }//GEN-LAST:event_GuardarActionPerformed

    private void matriculajTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculajTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculajTextField1ActionPerformed

    private void apellidoMjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoMjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoMjTextField1ActionPerformed

    private void nombresjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresjTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Exportar;
    private javax.swing.JToggleButton Guardar;
    private javax.swing.JToggleButton Importar;
    private javax.swing.JToggleButton Nuevo;
    private javax.swing.JTextField apellidoMjTextField1;
    private javax.swing.JTextField apellidoPjTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField matriculajTextField1;
    private javax.swing.JTextField nombresjTextField1;
    // End of variables declaration//GEN-END:variables
}
