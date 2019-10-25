
public class TestaAssociacao {

	public static void main(String[] args) {
		Conta contaDaPaula = new Conta();
		contaDaPaula.agencia = 1234;
		contaDaPaula.numero = 1234567;
		contaDaPaula.deposita(100.00);
		if(!contaDaPaula.saca(200.00) {
			System.out.println("Saldo insuficiente");
			
		}
		
		contaDaPaula.saldo = -100;
		
		
		
		Titular paula = new Titular();
		paula.email = "paula@gmail.com";
		paula.cpf = "123.456.789-00";
		paula.nome = "Paula Silva";
		contaDaPaula.titular = paula;

	}

}
