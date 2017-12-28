package clases;

import formularios.FrmLogin;

public class JavaEscritorio {
    
    public static void main(String[] args) {
        Datos misDatos = new Datos();
         
        FrmLogin frmLogin = new FrmLogin();
        frmLogin.setDatos(misDatos);
        frmLogin.setLocationRelativeTo(null);
        frmLogin.setVisible(true);
    }
    
}
