/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo20.Vistas.interfaz1;

import java.sql.Connection;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo20.Entidades.Alumno;
import universidadgrupo20.Entidades.Materia;
import universidadgrupo20.accesoADatos.InscripcionData;

/**
 *
 * @author User
 */
public class InscripcionMateriaAlumno1 extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    public boolean isCellEditable(int fila, int columna) {
        return false;
    }

    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "universidadulp";
    private static String USUARIO = "root";
    private static String PASSWORD = "";
    private static Connection connection;

    private List<Materia> listaM;
    private List<Alumno> listaA;
    private InscripcionData inscData;
//
    int idAlumno = 4;
//
    public InscripcionMateriaAlumno1() {
       initComponents();
       
    modelo = new DefaultTableModel();
    armarCabezera();
      
    inscData = new InscripcionData();
    
   
    cargarMateriasTable();

    }
    
    
    private void armarCabezera() {
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        modelo.addColumn("Nota");
        jTableMateriaInscripta.setModel(modelo);

    }

    private void cargarMateriasTable() {
     modelo.setRowCount(0);

            List<Materia> listaM = inscData.obtenerMateriasNoCursadas(idAlumno);

                       
             for (Materia m : listaM) {

                modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnioMateria(), m.getNota()});
             
            }
       
        setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMateriaInscripta = new javax.swing.JTable();
        jbinscribirse = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inscripciones a Materias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableMateriaInscripta.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTableMateriaInscripta.setModel(new javax.swing.table.DefaultTableModel(
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
                "Id Materia", "Nombre", "Año"
            }
        ));
        jScrollPane1.setViewportView(jTableMateriaInscripta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 480, 220));

        jbinscribirse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbinscribirse.setText("Inscribirse");
        jbinscribirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbinscribirseActionPerformed(evt);
            }
        });
        jPanel1.add(jbinscribirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 129, 37));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jbinscribirseActionPerformed(java.awt.event.ActionEvent evt) {                                              
 int filaSeleccionada = jTableMateriaInscripta.getSelectedRow();
    if (filaSeleccionada != -1) {
        
        int idMateria = (int) jTableMateriaInscripta.getValueAt(filaSeleccionada, 0);
        double nota = 0.0; 
        Materia materia = new Materia(idMateria);
    Alumno alumno = new Alumno(idAlumno);
       
        
        inscData.guardarInscripciones(nota, idAlumno, idMateria);
        modelo.setRowCount(0);
           modelo.setRowCount(0);
            cargarMateriasTable();
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione una materia para inscribirse");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMateriaInscripta = new javax.swing.JTable();
        jbinscribirse = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inscripciones a Materias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableMateriaInscripta.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTableMateriaInscripta.setModel(new javax.swing.table.DefaultTableModel(
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
                "Id Materia", "Nombre", "Año"
            }
        ));
        jScrollPane1.setViewportView(jTableMateriaInscripta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 480, 220));

        jbinscribirse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbinscribirse.setText("Inscribirse");
        jPanel1.add(jbinscribirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 129, 37));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMateriaInscripta;
    private javax.swing.JButton jbinscribirse;
    // End of variables declaration//GEN-END:variables
}
