package TodoJunto;

import javax.swing.JOptionPane;

public class negocioAlumnos {
    
    claseConexion clconection;
     
    public negocioAlumnos() {
        clconection=new claseConexion();
    }
    
    public void Alta(FrmPrincipal formulario) {
      try {
            String sql = "insert into alumnos values (null, '" + formulario.getTxtDNI() + "', '" + formulario.getTxtNombre() + "', "
            + "'" + formulario.getTxtApellido1() + "', '" + formulario.getTxtApellido2() + "' ";
            if (clconection.ejecutarActualizacion(sql) > 0) {
                JOptionPane.showMessageDialog(null, "Modificación correcta");
            } else {
                JOptionPane.showMessageDialog(null, "Se ha producido un error.");
            }
        } catch (Exception e) {
            
        }
    }
    
    public void Baja(FrmPrincipal formulario) {
      try {
            String sql = "delete from alumnos where registro = " + formulario.getTxtRegistro();
            if (clconection.ejecutarActualizacion(sql) > 0) {
                JOptionPane.showMessageDialog(null, "Modificación correcta");
            } else {
                JOptionPane.showMessageDialog(null, "Se ha producido un error.");
            }
        } catch (Exception e) {
            
        }
    }
    
    public void Modificar(FrmPrincipal formulario) {
      try {
            String sql = "update alumnos set dni='" + formulario.getTxtDNI() + "', nombre='" + formulario.getTxtNombre() + "', "
            + "apellido1='" + formulario.getTxtApellido1() + "', apellido2='" + formulario.getTxtApellido2() + "' "
            + "where registro = " + formulario.getTxtRegistro();
            if (clconection.ejecutarActualizacion(sql) > 0) {
                JOptionPane.showMessageDialog(null, "Modificación correcta");
            } else {
                JOptionPane.showMessageDialog(null, "Se ha producido un error.");
            }
        } catch (Exception e) {
            
        }
    }
}
