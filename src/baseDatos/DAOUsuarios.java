

package baseDatos;
import aplicacion.*;
import gui.*;
import java.sql.*;
/**
 *
 * @author basesdatos
 */
public class DAOUsuarios extends AbstractDAO {

   public DAOUsuarios (Connection conexion, aplicacion.FachadaAplicacion fa){
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    public Usuario validarUsuario(String idUsuario, String clave){
        return null;
    }
    
    public Usuario registrarUsuario(String id, String clave, String dni, String nombre,String email,String direccion,String telefono,String sexo){
        return null;
    }

   
}
