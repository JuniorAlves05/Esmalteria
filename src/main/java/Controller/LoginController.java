package Controller;

import Controller.Helper.LoginHelper;
import model.DAO.UsuarioDAO;
import model.Usuario;
import view.Login;
import view.MenuPrincipal;

public class LoginController {

    private final Login view;
    private LoginHelper helper;
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view); // Ajudante do Login ( O Que executa o serviço )
    }
    
    public void entrarNoSistema (){
        
       //Pegar um Usuario da View
        Usuario usuario = helper.obterModelo(); //Obtendo o modelo do usuario
       
        //Pesquisar o Usuario no banco de dados
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);// Salvando o retorno da função no Usuario
        
   
        //Se o Usario da view tiver o mesmo usuario e senha que o usuario que veio do banco
        if (usuarioAutenticado !=null){
            //Navegar para o menu principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);// Fica ativo na tela
            this.view.dispose();
        }else {
            view.exibeMensagem("Usuario ou senha invalidos");
        }
        
        
        //direicione para o Menu Principal
        //Se nao for igual mostre na tela uma mensagem de erro ao usuario.
    }
    
    public void fizTarefa(){ // Metodo para personalizar a mensagem de login
        System.out.println("Busquei algo do banco de dados.");
        
        this.view.exibeMensagem("Login Sucess");
        
    }
    
}
