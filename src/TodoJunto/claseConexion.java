package TodoJunto;

import java.sql.*;
import javax.swing.*;

public class claseConexion {

    private Connection con = null;
    private ResultSet rs = null;

    public claseConexion() {
        AbrirConexion();
    }

    private void AbrirConexion() {
        try {
            String sUrl = "jdbc:mysql://localhost:3306/biblioteca";
            con = DriverManager.getConnection(sUrl, "root", "");
            JOptionPane.showMessageDialog(null, "¡Conectado!");
        } catch (SQLException ex) {
            con = null;
            throw new RuntimeException("¡Se ha producido un error con la conexión!");
        }
    }

    public void ejecutarConsulta(String sql) throws SQLException {
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        rs = stmt.executeQuery(sql);
    }
    
    public ResultSet getRs() {
        return rs;
    }
    
    public int ejecutarActualizacion(String sql) throws SQLException {
        int i=0;
        Statement stmt = con.createStatement();
        i = stmt.executeUpdate(sql);
        return i;
    }
}