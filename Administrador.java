
public class Administrador extends Funcionario implements Autenticavel {
	
	/*
	 * private int senha;
	 * 
	 * public void setSenha(int senha) { this.senha = senha; }
	 * 
	 * public boolean autentica(int senha) { if(this.senha == senha) { return true;
	 * } else { return false; } }
	 */
	
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 50;
	}
	
	private AutenticacaoUtil autenticador;
	
	public Administrador() {
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
