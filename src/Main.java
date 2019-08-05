
public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoal = new Pessoa("João", 15, 154);
		
		
		pessoal.setIdade(16);
		
		System.out.println("A pessoa " + pessoal.getNome() + " foi cadastra com sucesso.");

	}

}
