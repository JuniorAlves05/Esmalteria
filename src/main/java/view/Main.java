package view;

import model.Agendamento;
import model.Cliente;
import model.Servico;
import model.Usuario;

public class Main {
    
     public static void main (String []args){
         
         String nome = "tiago";
         System.out.println(nome);
         
         Servico barba = new Servico(1, "Barba", 30   );
         
         System.out.println(barba.getDescricao());
         System.out.println(barba.getValor());
         
         Cliente cliente = new Cliente(1, "Tiago", "Teste", "52071160");
         System.out.println(cliente.getNome());
         
         Usuario usuario = new Usuario(1, "Alce", "senha");
         System.out.println(usuario.getNome());
         
         Agendamento agendamento = new Agendamento(1, cliente, barba, 30, "18/10/2023 08:25" );
         System.out.println(agendamento);
     }
}
