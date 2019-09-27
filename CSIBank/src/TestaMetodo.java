
public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.deposita(100);
		conta1.deposita(50);
		
		System.out.println("Saldo" + conta1.saldo);
		

	}

}
