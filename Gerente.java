
public class Gerente extends Funcionario implements Autenticavel{
	
	/*
	 * private int senha;
	 * 
	 * public void setSenha(int senha) { this.senha = senha; }
	 * 
	 * public boolean autentica(int senha) { if(this.senha == senha) { return true;
	 * } else { return false; } }
	 */
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Gerente");
		//return super.getBonificacao() + super.getSalario();
		return super.getSalario();
	}

	/*
	 * private int senha;
	 * 
	 * @Override public void setSenha(int senha) { this.senha = senha; }
	 * 
	 * @Override public boolean autentica(int senha) { if(this.senha == senha) {
	 * return true; } else { return false; } }
	 */
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		 this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) { 
		/*
		 * if(this.senha == senha) { return true; } else { return false; }
		 */
		return this.autenticador.autentica(senha);
		
	}	 
}