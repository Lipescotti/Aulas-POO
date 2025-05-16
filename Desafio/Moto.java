package Desafio;

public class Moto extends Veiculo{
	private Integer cilindradas;
	
	public Integer getCilindradas()
	{
		return cilindradas;
	}
	public void setCilindradas(Integer cilindradas)
	{
		this.cilindradas = cilindradas;
	}
	
	

	public void calcIpva()
	{
		if(getNome().getNome().equals("Honda"))
		setIpva(getValor()*0.02);
		
		else if(getNome().getNome().equals("Yamaha"))
		setIpva(getValor()*0.03);
		
		else
		setIpva(getValor()*0.04);
	}
}
