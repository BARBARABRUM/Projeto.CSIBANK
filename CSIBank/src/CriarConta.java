
public class CriarConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 100.00;
		conta1.agencia = 1234;
		conta1.numero = 123456;
		conta1.titular = "Maria";
		
		
		Conta conta2 = new Conta();
		conta2.saldo = 100.00;
		conta2.agencia = 1234;
		conta2.numero = 123456;
		conta2.titular = "Maria";
		
		
		
		
		if(conta1 == conta2){
			System.out.println("Contas iguais");
		} else {
			System.out.println("Contas diferentes");
		}
		
		
	}

}