/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author Rocio
 */
public class Menú extends javax.swing.JFrame {

    /**
     * Creates new form Menú
     */
    public Menú() {
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

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmFormAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmFormMateria = new javax.swing.JMenuItem();
        jmManejoInscripciones = new javax.swing.JMenu();
        jmInscripciones = new javax.swing.JMenuItem();
        jmManipulacionNotas = new javax.swing.JMenuItem();
        jmAlumnosMateria = new javax.swing.JMenu();
        jmAluxMateria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumno");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jmFormAlumno.setText("Formulario de Alumno");
        jmFormAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jmFormAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");

        jmFormMateria.setText("Formulario de Materia");
        jmFormMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormMateriaActionPerformed(evt);
            }
        });
        jMenu2.add(jmFormMateria);

        jMenuBar1.add(jMenu2);

        jmManejoInscripciones.setText("Administración");

        jmInscripciones.setText("Manejo de Inscripciones");
        jmInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInscripcionesActionPerformed(evt);
            }
        });
        jmManejoInscripciones.add(jmInscripciones);

        jmManipulacionNotas.setText("Manipulación de notas");
        jmManipulacionNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManipulacionNotasActionPerformed(evt);
            }
        });
        jmManejoInscripciones.add(jmManipulacionNotas);

        jMenuBar1.add(jmManejoInscripciones);

        jmAlumnosMateria.setText("Consultas");

        jmAluxMateria.setText("Alumnos por Materia");
        jmAluxMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAluxMateriaActionPerformed(evt);
            }
        });
        jmAlumnosMateria.add(jmAluxMateria);

        jMenuBar1.add(jmAlumnosMateria);

        jMenu5.setText("Salir");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmFormAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormAlumnoActionPerformed
        
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FormularioAlumno alu=new FormularioAlumno();
        alu.setVisible(true);
        jDesktopPane1.add(alu);
        jDesktopPane1.moveToFront(alu);  
        
    }//GEN-LAST:event_jmFormAlumnoActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

          
        
        
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jmFormMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormMateriaActionPerformed
         
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FormularioMateria alu=new FormularioMateria();
        alu.setVisible(true);
        jDesktopPane1.add(alu);
        jDesktopPane1.moveToFront(alu);  
        
    }//GEN-LAST:event_jmFormMateriaActionPerformed

    private void jmInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInscripcionesActionPerformed
        
         jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FormularioInscripcion alu=new FormularioInscripcion();
        alu.setVisible(true);
        jDesktopPane1.add(alu);
        jDesktopPane1.moveToFront(alu);  
        
    }//GEN-LAST:event_jmInscripcionesActionPerformed

    private void jmManipulacionNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManipulacionNotasActionPerformed
        
         jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FormularioNotas note=new FormularioNotas();
        note.setVisible(true);
        jDesktopPane1.add(note);
        jDesktopPane1.moveToFront(note); 
        
    }//GEN-LAST:event_jmManipulacionNotasActionPerformed

    private void jmAluxMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAluxMateriaActionPerformed
        
          jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        AlumnosPorMateria note=new AlumnosPorMateria();
        note.setVisible(true);
        jDesktopPane1.add(note);
        jDesktopPane1.moveToFront(note); 
        
    }//GEN-LAST:event_jmAluxMateriaActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenu5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menú().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAlumnosMateria;
    private javax.swing.JMenuItem jmAluxMateria;
    private javax.swing.JMenuItem jmFormAlumno;
    private javax.swing.JMenuItem jmFormMateria;
    private javax.swing.JMenuItem jmInscripciones;
    private javax.swing.JMenu jmManejoInscripciones;
    private javax.swing.JMenuItem jmManipulacionNotas;
    // End of variables declaration//GEN-END:variables
}
