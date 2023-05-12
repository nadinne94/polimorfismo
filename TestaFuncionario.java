
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Nico Steppat");
		funcionario.setCpf("222.222.222-22");
		funcionario.setSalario(2600.0);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getBonificacao());
		
		/*
		 * funcionario.salario = 300; System.out.println(funcionario.salario);
		 */
	
	}

}
