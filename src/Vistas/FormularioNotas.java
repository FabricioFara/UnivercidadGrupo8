/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo8.accesoADatos.AlumnoData;
import universidadgrupo8.accesoADatos.InscripcionData;
import universidadgrupo8.entidad.Alumno;
import universidadgrupo8.entidad.Inscripcion;

/**
 *
 * @author Rocio
 */
public class FormularioNotas extends javax.swing.JInternalFrame {

    private ArrayList<Alumno> listaA;
    private AlumnoData aData;
    private InscripcionData inscData;
    private ArrayList<Inscripcion> listaI;
    private DefaultTableModel modelo;
    /**
     * Creates new form FormularioNotas
     */
    public FormularioNotas() {
        initComponents();
        aData = new AlumnoData();
        inscData = new InscripcionData();
        listaA = (ArrayList<Alumno>) aData.listarAlumnos();
        modelo = new DefaultTableModel();
        cargarAlumnos();
        armarCabeceraTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jcAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Seleccione un alumno:");

        jcAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcAlumnosItemStateChanged(evt);
            }
        });
        jcAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAlumnosActionPerformed(evt);
            }
        });

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTabla);

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2)
                                .addGap(40, 40, 40)
                                .addComponent(jcAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int filaSeleccionada = jTabla.getSelectedRow();
        if (filaSeleccionada != -1){
            Alumno a = (Alumno)jcAlumnos.getSelectedItem();
            int idAlumno = a.getIdAlumno();
            int idMateria = (Integer)modelo.getValueAt(filaSeleccionada, 0);
            double nota = Double.parseDouble((String)modelo.getValueAt(filaSeleccionada, 2));
            inscData.actualizarNota(idAlumno, idMateria, nota);
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado una fila");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jcAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcAlumnosActionPerformed

    private void jcAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcAlumnosItemStateChanged
        cargaNotas();
    }//GEN-LAST:event_jcAlumnosItemStateChanged

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTabla;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcAlumnos;
    // End of variables declaration//GEN-END:variables

    private void cargarAlumnos() {
        for (Alumno item : listaA) {
            jcAlumnos.addItem(item);
        }
    }

    private void armarCabeceraTabla() {
         ArrayList<Object> filaCabecera = new ArrayList<>();
         filaCabecera.add("Código");
         filaCabecera.add("Nombre");
         filaCabecera.add("Nota");
         for (Object it : filaCabecera) {
            modelo.addColumn(it);
         }
         jTabla.setModel(modelo);
                 
    }
    
    private void borrarFilaTabla(){
        int indice = modelo.getRowCount() - 1;
        
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    private void cargaNotas(){
        borrarFilaTabla();
        Alumno selec = (Alumno)jcAlumnos.getSelectedItem();
        listaI = (ArrayList<Inscripcion>) inscData.obtenerInscripcionesPorAlumno(selec.getIdAlumno());
        
        for (Inscripcion insc : listaI) {
            int idMateria = insc.getMateria().getIdMateria();
            String nombre = insc.getMateria().getNombre();
            double nota = insc.getNota();
            modelo.addRow(new Object[] {idMateria, nombre, nota});
        }
            
        
    }
}
