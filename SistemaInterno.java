 
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel a) {
		boolean autenticou = a.autentica(this.senha);
		if(autenticou) {
			System.out.println("Acesso liberado!");
		} else {
			System.out.println("Acesso negado!");
		}
	}
		
	/*
	 * public void autentica(Administrador adm) { boolean autenticou =
	 * adm.autentica(this.senha); if(autenticou) {
	 * System.out.println("Permitida a entranda no sistema"); } else {
	 * System.out.println("Acesso negado!"); } }
	 */
}
