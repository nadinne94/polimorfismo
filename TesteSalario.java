
public class TesteSalario {

	public static void main(String[] args) {
		
		FuncionarioTeste funcionario = new FuncionarioTeste();
		funcionario.setSalario(3000.0);
		System.out.println(funcionario.getTipo());
		System.out.println(funcionario.getBonificacao());
		
		FuncionarioTeste funcionario2 = new FuncionarioTeste();
		funcionario2.setTipo(2);
		funcionario2.setSalario(5000.0);
		System.out.println(funcionario2.getTipo());
		System.out.println(funcionario2.getBonificacao());
		
	}

}
