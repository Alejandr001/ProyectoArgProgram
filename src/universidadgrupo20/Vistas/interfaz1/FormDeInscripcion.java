
package universidadgrupo20.Vistas.interfaz1;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo20.Entidades.Alumno;
import universidadgrupo20.Entidades.Inscripcion;
import universidadgrupo20.Entidades.Materia;
import universidadgrupo20.accesoADatos.AlumnoData;
import universidadgrupo20.accesoADatos.InscripcionData;
import universidadgrupo20.accesoADatos.MateriaData;


public class FormDeInscripcion extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modelo = new DefaultTableModel();
    public boolean isCellEditable(int fila, int columna) {
        return false;}
     private List<Materia> listaM;
     private List<Alumno> listaA;
     private InscripcionData inscData;
     private MateriaData mData;
     private AlumnoData aData;
     private Inscripcion inscri;
     private Materia mate;

   
    public FormDeInscripcion() {
        initComponents();
        aData = new AlumnoData();
        modelo = new DefaultTableModel();
        inscData =new InscripcionData();
        mData = new MateriaData();
        mate = new Materia();
        
        cargarAlumnos();
        armarCabezera();
        cargarInscr();
    }
    private void armarCabezera() {
        modelo.addColumn("idMateria");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        modelo.addColumn("Nota");
       jTMaterias.setModel(modelo);
    }
    private void cargarAlumnos() {
        listaA = aData.listarAlumnos();
    DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
    for (Alumno alumno : listaA) {
        comboBoxModel.addElement(alumno.getApellido() + ", " + alumno.getNombre());
    }

    cBAlumno.setModel(comboBoxModel);
}  
    private void cargarInscr() {
    DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        comboBoxModel.addElement("Inscribir");
        comboBoxModel.addElement("Desnscribir");
    

    cBMaterias.setModel(comboBoxModel);
}
    private void cargarMatAlumn() {
        int selectedIndex = cBAlumno.getSelectedIndex();
        if (selectedIndex != -1) {
        
        Alumno alumnSelec = listaA.get(selectedIndex);
        int idAlumnSeleccionado = alumnSelec.getIdAlumno();
        
        listaM = inscData.obtenerMateriasCursadasConNotas(idAlumnSeleccionado);
        actualizarTablaMaterias();
            }
        }
    private void cargarMatAlumnNo() {
        int selectedIndex = cBAlumno.getSelectedIndex();
        if (selectedIndex != -1) {
        
        Alumno alumnSelec = listaA.get(selectedIndex);
        int idAlumnSeleccionado = alumnSelec.getIdAlumno();
        
        listaM = inscData.obtenerMateriasNoCursadas(idAlumnSeleccionado);
        actualizarTablaMaterias();
            }
        }
    private void actualizarTablaMaterias(){
        modelo.setRowCount(0); 
        for (Materia materia : listaM) {
        modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(),materia.getAnioMateria(), materia.getNota()});
        }
        
        
        }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cBAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMaterias = new javax.swing.JTable();
        jbSalir3 = new javax.swing.JButton();
        jbDesincribirse = new javax.swing.JButton();
        cBMaterias = new javax.swing.JComboBox<>();
        jbInscribir = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Estado");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Inscripciones");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario De Inscriciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Seleccione un Alumno");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 127, 26));

        cBAlumno.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cBAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBAlumnoActionPerformed(evt);
            }
        });
        jPanel1.add(cBAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 230, 20));

        jTMaterias.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTMaterias.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Año"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTMaterias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 860, 190));

        jbSalir3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbSalir3.setText("Salir");
        jbSalir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalir3ActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 103, 37));

        jbDesincribirse.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbDesincribirse.setText("Desinscribir");
        jbDesincribirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDesincribirseActionPerformed(evt);
            }
        });
        jPanel1.add(jbDesincribirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 103, 37));

        cBMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBMateriasActionPerformed(evt);
            }
        });
        jPanel1.add(cBMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 100, -1));

        jbInscribir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });
        jPanel1.add(jbInscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 103, 37));

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
    }// </editor-fold>//GEN-END:initComponents

    private void cBAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBAlumnoActionPerformed
        String estado = (String)cBMaterias.getSelectedItem();
        if(estado.equals("Inscribir")){
            
            cargarMatAlumnNo();
            actualizarTablaMaterias();
        }else{
            cargarMatAlumn();
            actualizarTablaMaterias();
        
        }
        
    }//GEN-LAST:event_cBAlumnoActionPerformed

    private void jbSalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalir3ActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalir3ActionPerformed

    private void cBMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBMateriasActionPerformed
       String estado = (String)cBMaterias.getSelectedItem();
        if(estado.equals("Inscribir")){
            
            cargarMatAlumnNo();
            actualizarTablaMaterias();
        }else{
            cargarMatAlumn();
            actualizarTablaMaterias();}
        
        
    }//GEN-LAST:event_cBMateriasActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
       
        int selectedIndexAlumno = cBAlumno.getSelectedIndex();
    int filaSeleccionada = jTMaterias.getSelectedRow();

    if (selectedIndexAlumno != -1 && filaSeleccionada != -1) {
        Alumno alumnoSeleccionado = listaA.get(selectedIndexAlumno);
        Object idMateria = jTMaterias.getValueAt(filaSeleccionada, 0);
        int idMateriaSeleccionada = (int) idMateria;

        // Llama al método para guardar la inscripción
        inscData.guardarInscripciones(0.0, alumnoSeleccionado.getIdAlumno(), idMateriaSeleccionada);

        // Actualiza la tabla de materias
        cargarMatAlumn();
        actualizarTablaMaterias();
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione un alumno y una materia para inscribir.");
    }
        
        
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbDesincribirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDesincribirseActionPerformed
        int selectedIndex = cBAlumno.getSelectedIndex();
        Alumno alumnSelec = listaA.get(selectedIndex);
        int idAlumnSeleccionado = alumnSelec.getIdAlumno();
        
        
        int filaSeleccionada = jTMaterias.getSelectedRow();

        Object idMateria = jTMaterias.getValueAt(filaSeleccionada, 0);
   
        int idMat = (int) idMateria;   
           
        inscData.borrarInscripcionMateriaAlumno(idAlumnSeleccionado, idMat);
        actualizarTablaMaterias();
        
    }//GEN-LAST:event_jbDesincribirseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cBAlumno;
    private javax.swing.JComboBox<String> cBMaterias;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTMaterias;
    private javax.swing.JButton jbDesincribirse;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir3;
    // End of variables declaration//GEN-END:variables
}
