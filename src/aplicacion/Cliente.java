/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author alumnogreibd
 */
public class Cliente extends Usuario{

    public Cliente(String usuario, String password, String dni, String nombre, String correo, String direccion, String telefono, String sexo) {
        super(usuario, password, dni, nombre, correo, direccion, telefono, sexo);
    }
    
}
