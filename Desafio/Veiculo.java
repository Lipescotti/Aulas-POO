package Desafio;

public class Veiculo {
	private String modelo;
	private Integer ano;
	private Double valor;
	private Double ipva;
	private Marca nome;
	
	
	public String getModelo()
	{
		return modelo;
	}
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
		
	}	
	
	public Integer getAno()
	{
		return ano;
	}
	public void setAno(Integer ano)
	{
		this.ano = ano;
		
		
	}	public Double getValor()
	{
		return valor;
	}
	public void setValor(Double valor)
	{
		this.valor = valor;
	}	
	
	public Double getIpva()
	{
		return ipva;
	}
	public void setIpva(Double ipva)
	{
		this.ipva = ipva;
		
		
	}	
	public Marca getNome()
	{
		return nome;
	}
	public void setNome(Marca nome)
	{
		this.nome = nome;
	}

}
