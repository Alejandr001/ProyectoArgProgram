
package universidadgrupo20.Vistas.interfaz1;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo20.Entidades.Alumno;
import universidadgrupo20.Entidades.Materia;
import universidadgrupo20.accesoADatos.AlumnoData;
import universidadgrupo20.accesoADatos.InscripcionData;
import universidadgrupo20.accesoADatos.MateriaData;


public class FormCargarNoa extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel();
    public boolean isCellEditable(int fila, int columna) {
        return false;}
     private List<Materia> listaM;
     private List<Alumno> listaA;
     private InscripcionData inscData;
     private MateriaData mData;
     private AlumnoData aData;
    
    public FormCargarNoa() {
        initComponents();
        aData = new AlumnoData();
        modelo = new DefaultTableModel();
        inscData =new InscripcionData();
        mData = new MateriaData();
        
        cargarAlumnos();
        armarCabezera();
    }
    private void armarCabezera() {
        modelo.addColumn("idMateria");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        modelo.addColumn("Nota");
       jTableNotas.setModel(modelo);
    }
     private void cargarAlumnos() {
        listaA = aData.listarAlumnos();
    DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
    for (Alumno alumno : listaA) {
        comboBoxModel.addElement(alumno.getApellido() + ", " + alumno.getNombre());
    }
    
    jComboBoxAlumno.setModel(comboBoxModel);
}
   private void cargarMatAlumn() {
        int selectedIndex = jComboBoxAlumno.getSelectedIndex();
        if (selectedIndex != -1) {
        
        Alumno alumnSelec = listaA.get(selectedIndex);
        int idAlumnSeleccionado = alumnSelec.getIdAlumno();
        
        listaM = inscData.obtenerMateriasCursadasConNotas(idAlumnSeleccionado);
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

        jPanel1 = new javax.swing.JPanel();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jComboBoxAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNotas = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cargar Notas");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario de Notas Alumnos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbGuardar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 103, 37));

        jbSalir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 103, 37));

        jComboBoxAlumno.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBoxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAlumnoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 281, 30));

        jTableNotas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableNotas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTableNotas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableNotas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 860, 211));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Seleccione un Alumno");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 127, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 870, 364);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAlumnoActionPerformed
        cargarMatAlumn();
        actualizarTablaMaterias();
    }//GEN-LAST:event_jComboBoxAlumnoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
         dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
      int numRows = jTableNotas.getRowCount();

    
    for (int row = 0; row < numRows; row++) {
        
        Object newValue = jTableNotas.getValueAt(row, 3);

        
        if (newValue != null && !newValue.equals(listaM.get(row).getNota())) {
           
            int idAlumno = listaA.get(jComboBoxAlumno.getSelectedIndex()).getIdAlumno();
            int idMateria = listaM.get(row).getIdMateria();

            
            try {
                Double notaModificada = Double.parseDouble(newValue.toString());

                
                inscData.actualizarNota(idAlumno, idMateria, notaModificada);
            } catch (NumberFormatException e) {
               
                JOptionPane.showMessageDialog(null, "Error: La nota debe ser un número válido.");
            }
        }
    }

    
    cargarMatAlumn();
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxAlumno;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableNotas;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    // End of variables declaration//GEN-END:variables
}
