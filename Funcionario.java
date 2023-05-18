

//não pode instanciar dessa classe pois é abstrata
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
//método sem corpo, não há implementação na mãe apenas nos filhos
	public abstract double getBonificacao(); /*{
	  System.out.println("Chamando o método de bonificacao do Funcionário"); return
	  this.salario * 0.05; 
	}*/ 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	/*
	 * private int senha;
	 * 
	 * public void setSenha(int senha) { this.senha = senha; }
	 * 
	 * public boolean autentica(int senha) { if(this.senha == senha) { return true;
	 * } else { return false; } }
	 */
}
