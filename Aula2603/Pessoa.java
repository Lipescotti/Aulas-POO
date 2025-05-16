package Aula2603;

public class Pessoa {
	private String nome;
	private Integer idade;
	private Double renda;
	private Bairro bairro;
	
	public Integer getIdade()
	{
		return idade;
	}
	public void setIdade(Integer idade)
	{
		this.idade = idade;
	}
	
	public Double getRenda()
	{
		return renda;
	}
	public void setRenda(Double renda)
	{
		this.renda = renda;
	}
	
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public Bairro getBairro()
	{
		return bairro;
	}
	public void setBairro(Bairro bairro)
	{
		this.bairro = bairro;
	}
}
