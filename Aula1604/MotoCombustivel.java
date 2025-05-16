package Aula1604;

public class MotoCombustivel extends Veiculo implements Combustivel {
	
	public void acelerar()
	{
		System.out.println("A moto acelera");
	}
	
	
	public void abastecer()
	{
		System.out.println("O tanque esta cheio");
	}
}
