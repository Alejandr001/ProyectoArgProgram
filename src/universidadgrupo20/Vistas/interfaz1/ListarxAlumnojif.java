
package universidadgrupo20.Vistas.interfaz1;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import universidadgrupo20.Entidades.Alumno;
import universidadgrupo20.Entidades.Materia;
import universidadgrupo20.accesoADatos.AlumnoData;
import universidadgrupo20.accesoADatos.InscripcionData;
import universidadgrupo20.accesoADatos.MateriaData;


public class ListarxAlumnojif extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel();
    public boolean isCellEditable(int fila, int columna) {
        return false;}
    private List<Materia> listaM;
     private List<Alumno> listaA;
     private InscripcionData inscData;
     private MateriaData mData;
     private AlumnoData aData;
    
    public ListarxAlumnojif() {
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
        modelo.addColumn("Estado");
       jTableListadoxalumno.setModel(modelo);
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
        
        listaM = mData.listaMateriasPorAlumno(idAlumnSeleccionado);
        actualizarTablaMaterias();
    }
        }
        private void actualizarTablaMaterias() {
        modelo.setRowCount(0); 
        for (Materia materia : listaM) {
        modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnioMateria()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBoxAlumno = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListadoxalumno = new javax.swing.JTable();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Materias Por Alumnos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxAlumno.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBoxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAlumnoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 194, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Seleccione un Alumno");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 127, 26));

        jTableListadoxalumno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableListadoxalumno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTableListadoxalumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Dni", "Apellido", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableListadoxalumno);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 660, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAlumnoActionPerformed
        cargarMatAlumn();
        actualizarTablaMaterias();
    }//GEN-LAST:event_jComboBoxAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxAlumno;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListadoxalumno;
    // End of variables declaration//GEN-END:variables
}
