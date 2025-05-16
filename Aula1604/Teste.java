package Aula1604;

public class Teste {
	public static void main(String[] args)
	{
		CarroEletrico carro = new CarroEletrico();
		MotoCombustivel moto = new MotoCombustivel();
		
		carro.setModelo("Ferrari");
		carro.setAno(2004);
		carro.setValor(50000.00);
		carro.acelerar();
		carro.carregarBateria();
		carro.exibirDados();
		
		moto.abastecer();
		moto.acelerar();
		moto.setAno(2006);
		moto.setModelo("Harley");
		moto.setValor(20000.00);
		moto.exibirDados();
	}
	
}
