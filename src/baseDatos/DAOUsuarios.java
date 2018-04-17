

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
        Usuario resultado=null;
        Connection con;
        PreparedStatement stmUsuario=null;
        ResultSet rsUsuario;

        con=this.getConexion();
        if(idUsuario!=null && clave!= null){
        try {
        stmUsuario=con.prepareStatement("SELECT usuario,dni,nombre,correo,direccion,telefono,sexo\n" +
                                            "FROM usuarios\n" +
                                            "WHERE usuario=? AND password=(SELECT md5(?))");
        stmUsuario.setString(1, idUsuario);
        stmUsuario.setString(2, clave);
        rsUsuario=stmUsuario.executeQuery();
        if (rsUsuario.next())
        {
            resultado = new Usuario(rsUsuario.getString("usuario"), rsUsuario.getString("password"),rsUsuario.getString("dni"),
                                      rsUsuario.getString("nombre"), rsUsuario.getString("correo"),
                                      rsUsuario.getString("direccion"), rsUsuario.getString("telefono"),rsUsuario.getString("sexo"));

        }
        } catch (SQLException e){
          System.out.println(e.getMessage());
          this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        }finally{
          try {stmUsuario.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
        }
        }
        return resultado;
    }
    
    public Usuario registrarUsuario(String id, String clave, String dni, String nombre, String email, String direccion,String telefono,String sexo){
        Usuario resultado=null;
        Connection con;
        PreparedStatement stmUsuario=null;
        if(validarUsuario(id, clave) == null){

        con=this.getConexion();

        try {
        stmUsuario=con.prepareStatement("INSERT INTO usuarios(\n" +
                                            "usuario, password, dni, nombre, correo, direccion, telefono,sexo)\n" +
                                            "VALUES (?,(SELECT md5(?)),?,?,?,?,?,?);");
        stmUsuario.setString(1, id);
        stmUsuario.setString(2, clave);
        stmUsuario.setString(3, dni);
        stmUsuario.setString(4, nombre);
        stmUsuario.setString(5, email);
        stmUsuario.setString(6, direccion);
        stmUsuario.setString(7, telefono);
        stmUsuario.setString(8, sexo);
        stmUsuario.executeUpdate();

        } catch (SQLException e){
          System.out.println(e.getMessage());
          this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        }finally{
          try {stmUsuario.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
        }
        resultado = new Usuario(id, clave, dni,nombre,  email,  direccion,  telefono,  sexo);
        return resultado;
        }
        else return null;
    }

   
}
