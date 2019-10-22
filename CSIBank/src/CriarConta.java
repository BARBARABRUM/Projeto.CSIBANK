
public class CriarConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 100.00;
		conta1.agencia = 1234;
		conta1.numero = 123456;
		conta1.titular.nome = "Maria";
		conta1.titular.email = "mariveiga@gmail,com";
		conta1.titular.cpf = "123.456.789-00";		
		
		Conta conta2 = new Conta();
		conta2.saldo = 100.00;
		conta2.agencia = 1234;
		conta2.numero = 123456;
		conta2.titular.nome = "Maria";
		conta2.titular.email = "Mariagomes@gmail.com";
		conta2.titular.cpf = "234.567.890-12";		
		
		
		
		
		
		if(conta1 == conta2){
			System.out.println("Contas iguais");
		} else {
			System.out.println("Contas diferentes");
		}
		
		
	}

}
