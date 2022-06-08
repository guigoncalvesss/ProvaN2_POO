package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BancoDados {

	private Connection con = null;
	private Statement stm  = null;
	private ResultSet result = null;
	
	public void conectar() {
	    String servidor = "jdbc:mysql://localhost:3306/vendaspoo";
	    String usuario = "root";
	    String senha = "";
	    String driver = "com.mysql.jdbc.Driver";
	    try {
	        Class.forName(driver);
		    this.con = DriverManager.getConnection(servidor, usuario, senha);
		    this.stm = this.con.createStatement();
	    } catch (Exception e) {
	        System.out.println("erro na conex�o : " + e.getMessage());
	    }
	}
	public boolean estaConectado() {
	    if (this.con != null) {
	        return true;
	    }
	    else {
	        return false;
	    }
	}
	public void listar() {
	    try {
	        String minhaQuery = "SELECT * FROM produto ORDER BY nome";
                this.result = this.stm.executeQuery(minhaQuery);
                ResultSet rSet = result;
	        while (this.result.next()) {
	            System.out.println("ID: "+this.result.getString("id") + " - Nome: "+this.result.getString("nome") );
		}
	    } catch(Exception e) {
	        System.out.println("Erro na lista: "+ e.getMessage());
	    }
	}
	public void inserir(String nome) {
	    try {
	        String query = "INSERT INTO produto (nome, valorUnitario, tipoUnidade, qtdEstoque) VALUES('"+ nome +"');";
	        this.stm.executeUpdate(query);
	        System.out.println("cliente " +nome + "Incuido com SUCESSO" );
			
	    } catch(Exception e) {
	        System.out.println("Erro na Inclusao: "+ e.getMessage());
	    }
	}
	public void editar(int id, int qtdItem) {
	    try {
	        String query = "UPDATE produto SET qtdEstoque = qtdEstoque -'"+ qtdItem +"'  WHERE id = " + id + ";";
	        this.stm.executeUpdate(query);
		System.out.println("ID: "+ id + " alterado com sucesso" );
	    } catch(Exception e) {
	        System.out.println("Erro na Alteracao: "+ e.getMessage());
	    }
	}
}

