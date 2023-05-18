//transformando uma classe em interface
//interface é uma classe com todos os métodos abstrado
//classe abstrastada e interface não pode haver implementação
//Interface = polimorfismo

public abstract interface Autenticavel {

	//dentro da interface não pode haver nada concreto
	//private int senha;
	 
	public abstract void setSenha(int senha); /*{ 
		 this.senha = senha; 
	 }*/

	public boolean autentica(int senha); /*{ 
		 if(this.senha == senha) { 
			 return true;
		 } else { 
			 return false; 
		 } 
	}*/
}
