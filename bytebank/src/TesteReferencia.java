
public class TesteReferencia {
	public static void main(String[] args) {
		Conta novaConta = new Conta();
		novaConta.saldo = 300;
		
		Conta segundaConta = novaConta;
		System.out.println(segundaConta.saldo);
	}
}
