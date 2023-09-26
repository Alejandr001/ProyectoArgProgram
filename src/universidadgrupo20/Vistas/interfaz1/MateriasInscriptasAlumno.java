
package universidadgrupo20.Vistas.interfaz1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo20.Entidades.Alumno;
import universidadgrupo20.Entidades.Materia;
import universidadgrupo20.accesoADatos.AlumnoData;
import universidadgrupo20.accesoADatos.InscripcionData;
import universidadgrupo20.accesoADatos.MateriaData;

/**
 *
 * @author User
 */
public class MateriasInscriptasAlumno extends javax.swing.JInternalFrame {

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
    private MateriaData mData;
    private AlumnoData aData;
///
    int idAlumno = 4;
////
    public MateriasInscriptasAlumno() {

        initComponents();
        aData = new AlumnoData();
        listaA = aData.listarAlumnos();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData();
        mData = new MateriaData();
        armarCabezera();
        cargarMateriasTable();

    }
    
    
      private void armarCabezera() {
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        modelo.addColumn("Nota");

        jTableMateriaInscripta.setModel(modelo);

    }
    //cabecera para 3 elementos sin la nota
//          private void armarCabezera(){
//        modelo.addColumn("Id");
//        modelo.addColumn("Nombre");
//        modelo.addColumn("Año");
//     jTableMateriaInscripta.setModel(modelo);
//    }

    private void cargarMateriasTable() {

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conx = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);
            Statement sta = conx.createStatement();
            ResultSet resultado = sta.executeQuery("SELECT materia.nombre, materia.año, inscripcion.nota FROM inscripcion INNER JOIN materia ON inscripcion.idmateria = materia.idmateria WHERE inscripcion.idAlumno = " + idAlumno);

            List<Materia> listaM = inscData.obtenerMateriasCursadasConNotas(idAlumno);
            //  List <Materia> listaM = inscData.obtenerMateriasCursadas(idAlumno);
            for (Materia m : listaM) {

                modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnioMateria(), m.getNota()});
                ///modelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
            }
            resultado.close();
            sta.close();
            conx.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println(e.getMessage());
        }

        setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbdesinscribirse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMateriaInscripta = new javax.swing.JTable();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Materias En Curso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbdesinscribirse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbdesinscribirse.setText("Desinscribirse");
        jbdesinscribirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbdesinscribirseActionPerformed(evt);
            }
        });
        jPanel1.add(jbdesinscribirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 129, 37));

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
                "Nombre", "Año", "Nota"
            }
        ));
        jScrollPane1.setViewportView(jTableMateriaInscripta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 490, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jbdesinscribirseActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        int filaSeleccionada = jTableMateriaInscripta.getSelectedRow();

        if (filaSeleccionada != -1) {

            int idMateria = (int) jTableMateriaInscripta.getValueAt(filaSeleccionada, 0);

            inscData.borrarInscripcionMateriaAlumno(idAlumno, idMateria);
modelo.setRowCount(0);
            cargarMateriasTable();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una materia para desinscribirse");
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
        jbdesinscribirse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMateriaInscripta = new javax.swing.JTable();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Materias En Curso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbdesinscribirse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbdesinscribirse.setText("Desinscribirse");
        jPanel1.add(jbdesinscribirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 129, 37));

        jTableMateriaInscripta.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTableMateriaInscripta.setModel(new javax.swing.table.DefaultTableModel(
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
                "Id Materia", "Nombre", "Año", "Nota"
            }
        ));
        jScrollPane1.setViewportView(jTableMateriaInscripta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 490, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMateriaInscripta;
    private javax.swing.JButton jbdesinscribirse;
    // End of variables declaration//GEN-END:variables
}
