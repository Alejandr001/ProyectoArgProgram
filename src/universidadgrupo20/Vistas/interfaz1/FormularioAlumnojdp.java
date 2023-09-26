
package universidadgrupo20.Vistas.interfaz1;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import universidadgrupo20.Entidades.Alumno;
import universidadgrupo20.accesoADatos.AlumnoData;

public class FormularioAlumnojdp extends javax.swing.JInternalFrame {
    private AlumnoData aluData = new AlumnoData();
    private Alumno aluActual = null;

    
    public FormularioAlumnojdp() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jTDni = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jRadioBEstado = new javax.swing.JRadioButton();
        jBbuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jDFechaNac = new com.toedter.calendar.JDateChooser();

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Formulario Alumno");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario De Alumnos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTDni.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(jTDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 50, 90, -1));

        jTnombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 180, -1));

        jTApellido.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(jTApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 180, -1));

        jRadioBEstado.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jRadioBEstado.setText("Activo");
        jPanel1.add(jRadioBEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 70, -1));

        jBbuscar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 90, 25));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Dni");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 47, 26));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 56, 26));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 56, 26));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Estado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 47, 26));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Fecha Nac.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 79, 30));

        jBNuevo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jBNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 103, 37));

        jBGuardar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 103, 37));

        jBSalir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 103, 37));

        jBEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 103, 37));
        jPanel1.add(jDFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try{
        Integer dni = Integer.parseInt(jTDni.getText());
        String nombre = jTnombre.getText();
        String apellido = jTApellido.getText();
            if(nombre.isEmpty() || apellido.isEmpty()){
                JOptionPane.showMessageDialog(this,"No puede haber campos vacios");
                return;
            
            }
        java.util.Date sFecha = jDFechaNac.getDate();
        LocalDate fechaNac = sFecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Boolean estado = jRadioBEstado.isSelected();
        if(aluActual == null){
            aluActual = new Alumno(dni, apellido, nombre, fechaNac, estado);
            aluData.guardarAlumno(aluActual);
        }else{
            aluActual.setDni(dni);
            aluActual.setApellido(apellido);
            aluActual.setNombre(nombre);
            aluActual.setFechaNac(fechaNac);
            
            aluData.modificarAlumno(aluActual);
           
        
        }
        
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"debe ingresarse un número");
            
        }
     
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        limpiarCampos();
        aluActual = null;
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        
        try{
        int dni = Integer.parseInt(jTDni.getText());
        
        
        aluActual = aluData.buscarAlumnoPorDni(dni);
            if(aluActual!=null){
                jTnombre.setText(aluActual.getNombre());
                jTApellido.setText(aluActual.getApellido());
                jRadioBEstado.setSelected(aluActual.isEstado());
                LocalDate lc = aluActual.getFechaNac();
                java.util.Date date = java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
                jDFechaNac.setDate(date);
            
            }
        
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"debe ingresarse un número");
            
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        JOptionPane.showMessageDialog(this, "Saliendo");
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
       if(aluActual != null){
       
           aluData.eliminarAlumno(aluActual.getIdAlumno());
           aluActual =null;
           limpiarCampos();
           JOptionPane.showMessageDialog(this, "Alumno Eliminado");
                   
       
       
       }else{
           JOptionPane.showMessageDialog(this, "Seleccione un alumno para eliminar");
       }
    }//GEN-LAST:event_jBEliminarActionPerformed
    private void limpiarCampos(){
        jTDni.setText("");
        jTnombre.setText("");
        jTApellido.setText("");
        jRadioBEstado.setSelected(true);
//        jDFechaNac.setDate(new Date());
//    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBbuscar;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDFechaNac;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioBEstado;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTnombre;
    // End of variables declaration//GEN-END:variables
}
