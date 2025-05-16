package Aula1604;

public class CarroEletrico extends Veiculo implements Eletrico{
	
	public void acelerar()
	{
		System.out.println("O carro acelera");
	}
	
	
	
	public void carregarBateria()
	{
		System.out.println("Bateria carregada");
	}
}
