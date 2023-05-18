
public class TestaReferencias {

	public static void main(String[] args) {
		
		ControleBonificacao controle = new ControleBonificacao();
		
		Gerente gerente = new Gerente();
		gerente.setNome("Marcos");
		gerente.setSalario(5000.0);
		
		controle.registra(gerente);
		System.out.println(controle.getSoma());
	
		
		EditorDeVideo editorDeVideo = new EditorDeVideo();
		editorDeVideo.setSalario(2500.0);
		
		controle.registra(editorDeVideo);
		System.out.println(controle.getSoma());
		
		
		Designer designer = new Designer();
		designer.setSalario(2500.0);
		
		controle.registra(designer);
		System.out.println(controle.getSoma());
	}

}
