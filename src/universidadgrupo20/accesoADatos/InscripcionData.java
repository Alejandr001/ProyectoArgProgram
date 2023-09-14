package universidadgrupo20.accesoADatos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo20.Entidades.Alumno;
import universidadgrupo20.Entidades.Inscripcion;
import universidadgrupo20.Entidades.Materia;
import universidadgrupo20.accesoADatos.AlumnoData;
import universidadgrupo20.accesoADatos.Conexion;
import universidadgrupo20.accesoADatos.MateriaData;


public class InscripcionData {
    
    private Connection con = null;
    private MateriaData md= new MateriaData();
    private AlumnoData ad=new AlumnoData();
    
   
    public InscripcionData(){
    
    this.con = Conexion.getConexion();

}
    public void guardarInscripciones(Inscripcion insc){
        
    String sql = "INSERT INTO Inscripcion (idAlumno, idMateria, nota) VALUES (?, ?, ?)";
    
    try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, insc.getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3,insc.getNota());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                
                insc.setIdInscripcion(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "Inscripcion guardada con exito.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar inscripcion" + ex.getMessage());
        }
    }
    public List<Inscripcion> obtenerInscripciones() {
        
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
        String sql = "SELECT * FROM "
                + "inscripcion";
        try (
           PreparedStatement ps = con.prepareStatement(sql); 
           ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdIncripcion(rs.getInt("idInscripcion"));
                Alumno alu=ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat=md.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                cursadas.add(insc);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error SQL contacte administrador" + ex.getMessage(), "Error Conexion base de datos sql", JOptionPane.ERROR_MESSAGE);
        }
            return cursadas;
    }
    
     public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {
        
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
        String sql = "SELECT * FROM "
                + "inscripcion WHERE idAlumno = ?";
        try {
           PreparedStatement ps = con.prepareStatement(sql); 
           ps.setInt(1, idAlumno);
           
           ResultSet rs = ps.executeQuery(); 
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdIncripcion(rs.getInt("idInscripcion"));
                Alumno alu=ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat=md.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                cursadas.add(insc);
            
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error SQL contacte administrador" + ex.getMessage(), "Error Conexion base de datos sql", JOptionPane.ERROR_MESSAGE);
        }
            return cursadas;
    }
     
  
        public List<Materia> obtenerMateriasCursadas(int idAlumno){
         
         ArrayList<Materia> materias =new ArrayList<>();
         
         String sql ="SELECT inscripcion.idMateria, nombre,año FROM inscripcion,"
                 +"materia WHERE inscripcion.idMateria = materia.idMateria\n"+ "AND inscripcion.idAlumno = ?";
         try {
         PreparedStatement ps= con.prepareStatement(sql);
         ps.setInt(1,idAlumno);
         ResultSet rs = ps.executeQuery();
         while(rs.next()){
             Materia materia=new Materia();
             materia.setIdMateria(rs.getInt("idMateria"));
             materia.setNombre(rs.getString("nombre"));
             materia.setAnioMateria(rs.getInt("año"));
             materias.add(materia);
         }
         ps.close();
         }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error SQL contacte administrador" + ex.getMessage());
         
        }
         
         return materias;
         }
     public List<Materia> obtenerMateriasNoCursadas(int idAlumno){
         
         ArrayList<Materia> materias =new ArrayList<>();
         
         String sql ="SELECT * FROM materia WHERE estado= 1 AND idMateria not in"
                 +"(SELECT idMateria FROM inscripcion WHERE idAlumno=?)";
                         
         try {
         PreparedStatement ps= con.prepareStatement(sql);
         ps.setInt(1,idAlumno);
         ResultSet rs = ps.executeQuery();
         while(rs.next()){
             Materia materia=new Materia();
             materia.setIdMateria(rs.getInt("idMateria"));
             materia.setNombre(rs.getString("nombre"));
             materia.setAnioMateria(rs.getInt("año"));
             materias.add(materia);
         }
         ps.close();
         }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error SQL contacte administrador" + ex.getMessage());
         
        
        }
             return materias;
     }

     
     public List<Alumno> obtenerAlumnosxMateria(int idMateria){
         
         ArrayList<Alumno> alumnosMateria=new ArrayList<>();
         
         String sql = "SELECT a.idAlumno, dni, nombre,apellido,fechaNacimiento,estado"
                 +"FROM inscripcion i, alumno a WHERE i.idAlumno = a.idAlumno AND idMateria = ? AND a.estado = 1";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,idMateria);
            ResultSet rs=ps.executeQuery();
           while(rs.next()){
           Alumno alumno=new Alumno();
           alumno.setIdAlumno(rs.getInt("idAlumno"));
           alumno.setApellido(rs.getString("apellido"));
           alumno.setNombre(rs.getString("nombre"));
           alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
           alumno.setEstado(rs.getBoolean("estado"));
           alumnosMateria.add(alumno);
           }
           ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
     return alumnosMateria;
     }
     public void actualizarNota(int idAlumno, int idMateria,double nota){
     String sql="UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria";
         try {
             PreparedStatement ps=con.prepareStatement(sql);
             
             ps.setDouble(1, nota);
             ps.setInt(2, idAlumno);
             ps.setInt(3, idMateria);
            int filas= ps.executeUpdate();
             if(filas>0){
             JOptionPane.showMessageDialog(null,"Nota Actualizada");
             }
             ps.close();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al actualizar nota");
             
         }
          
     }
     public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
     
     String sql="DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria= ?";
     
         try {
             PreparedStatement ps=con.prepareStatement(sql);
             ps.setInt(1, idAlumno);
             ps.setInt(2, idMateria);
             
             int filas=ps.executeUpdate();
             if(filas>0){
             JOptionPane.showMessageDialog(null,"Inscripcion borrada");
             
             }
          ps.close();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al acceder a la inscripcion");
             
         }
     }
     
     }

