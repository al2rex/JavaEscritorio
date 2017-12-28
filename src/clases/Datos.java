
package clases;


public class Datos {
    
    private Usuario misUsuarios[] = new Usuario[50];
    private int conUsu = 0;

    public Datos() {
        Usuario miUsuario = new Usuario("rafa", "Arnaldo Rafael", "Castilla", "123", 1);
        misUsuarios[conUsu] = miUsuario;
        conUsu++;
    }
    
    public Usuario[] getUsuarios(){
        return misUsuarios;
    }
    
    public boolean validarUsuario(String usuario, String clave){
        boolean aux = false;
        for(int i=0;i<conUsu;i++){
            if(misUsuarios[i].getIdUsuario().equals(usuario) && misUsuarios[i].getClave().equals(clave) ){
                return true;
            }
        }
        return false;
    }
}
