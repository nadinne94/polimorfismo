
public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Marco");
		gerente.setCpf("222.222.222-22");
		gerente.setSalario(5000.0);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		gerente.setSenha(22222);
		boolean autentica = gerente.autentica(22222);
		
		System.out.println(autentica);
		System.out.println(gerente.getBonificacao());

	}

}
