package conclusaomoduloclasseobjetos;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Maria Jos�", 65.2);
		
		Comida spaghetti = new Comida("Macarr�o", 0.250);
		Comida meat = new Comida("Carne bovina", 0.200);
		
		
		pessoa1.comendo(spaghetti);
		pessoa1.pesoDuranteJantar();
		pessoa1.comendo(meat);
		pessoa1.pesoDuranteJantar();
		pessoa1.impressaoDadosPessoa();
	}

}
