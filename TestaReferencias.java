
public class TestaReferencias {

	public static void main(String[] args) {
		
		ControleBinificacao controle = new ControleBinificacao();
		
		Gerente gerente = new Gerente();
		gerente.setNome("Marcos");
		gerente.setSalario(5000.0);
		
		controle.registra(gerente);
		System.out.println(controle.getSoma());
		
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(2000.0);
		
		controle.registra(funcionario);
		System.out.println(controle.getSoma());
		
		EditorDeVideo editorDeVideo = new EditorDeVideo();
		editorDeVideo.setSalario(2500.0);
		
		controle.registra(editorDeVideo);
		System.out.println(controle.getSoma());
	}

}
