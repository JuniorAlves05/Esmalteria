package Controller;

import Controller.Helper.LoginHelper;
import model.Usuario;
import view.Login;

public class LoginController {

    private final Login view;
    private LoginHelper helper;
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view); // Ajudante do Login ( O Que executa o serviço )
    }
    
    public void entrarNoSistema (){
        
       //Pegar um Usuario da View
        Usuario usuario = helper.obterModelo(); //Obtendo o modelo do usuario.
       
        //Pesquisar o Usuario no banco de dados
        //Se o Usario da view tiver o mesmo usuario e senha que o usuario que veio do banco
        //direicione para o Menu Principal
        //Se nao for igual mostre na tela uma mensagem de erro ao usuario.
    }
    
    public void fizTarefa(){ // Metodo para personalizar a mensagem de login
        System.out.println("Busquei algo do banco de dados.");
        
        this.view.exibeMensagem("Login Sucess");
        
    }
    
}
