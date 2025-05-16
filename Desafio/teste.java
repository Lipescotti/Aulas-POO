package Desafio;

public class teste {
	public static void main(String[] args)
	{
		
		Marca a = new Marca();
		Marca b = new Marca();
		Marca c = new Marca();
		Moto m1 = new Moto();
		
		a.setNome("Honda");
		
		
		m1.setModelo("CG");
		m1.setAno(2000);
		m1.setNome(a);
		m1.setCilindradas(160);
		m1.calcIpva();
		
		System.out.println("Marca da morto: "+m1.getNome().getNome());
		System.out.println("Modelo da morto: "+m1.getModelo());
		System.out.println("Valor da morto: R$"+m1.getValor());
		System.out.println("Cilindradas da morto: "+m1.getCilindradas());
		System.out.println("IPVA da morto: "+m1.getIpva());
	}
}
