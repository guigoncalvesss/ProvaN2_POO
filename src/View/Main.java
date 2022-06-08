package View;

import Controller.BancoDados;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
            BancoDados bancoDados = new BancoDados();
            Scanner scanner = new Scanner(System.in);
	    bancoDados.conectar();
            int opcao;
            
            if(bancoDados.estaConectado()){
            do {
                System.out.println("1.Listar ");
                System.out.println("2.Inserir ");
                System.out.println("3.Comprar ");
                System.out.println("0.Sair");
            System.out.print("Selecione uma opcao: ");
            opcao = scanner.nextInt();
            switch (opcao) {
            case 1:              
                bancoDados.listar();
            break;
            case 2:
                bancoDados.inserir("");
            break;
            case 3:
                System.out.print("Qual o id do Produto? ");
                int itens = scanner.nextInt();
                System.out.print("Quantidade: ");
                int qtd = scanner.nextInt();
                bancoDados.editar(itens, qtd);
                
            break;
            case 0:
            break;
            default:
                
            }
            }while(opcao != 0);           
		    	
	    }else{		
		    System.out.println("Banco N�O OK");
            }
        }
}  
	

	
