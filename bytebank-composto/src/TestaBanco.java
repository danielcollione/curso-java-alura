
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo silveira";
		paulo.cpf = "09815895966";
		paulo.profissao = "programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.titular = paulo;
	}
}
