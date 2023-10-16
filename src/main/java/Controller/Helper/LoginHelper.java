package Controller.Helper;

import model.Usuario;
import view.Login;


public class LoginHelper {
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo (){
         // Vai na view e vai buscar todo o texto digitado no campo
        //  Pegar um Usuario da View
        String nome = view.getTextUsuario().getText();
        String senha = view.getTextSenha().getText();
        
        Usuario modelo = new Usuario(0,nome,senha);
        return modelo;
    }   
    
    public void setarModelo (Usuario modelo){ // Seta o modelo na tela
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTextUsuario().setText(nome);
        view.getTextSenha().setText(senha);
        
    }
    
    public void limparTela(){ // Set a o modelo para vazio
        view.getTextUsuario().setText(""); 
        view.getTextSenha().setText("");
        
    }
}
