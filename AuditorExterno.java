
public class AuditorExterno implements Autenticavel {
	
	//private int senha;
	private AutenticacaoUtil autenticador;
	
	public AuditorExterno() {
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