package Aula1604;

public abstract class Veiculo {
	private String modelo;
	private Integer ano;
	private Double valor;
	
	public abstract void acelerar();
	
	
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public void exibirDados()
	{
		System.out.println("Modelo: " +getModelo());
		System.out.println("Ano: "+ getAno());
		System.out.println("Valor: R$ "+ getValor() + "\n");
	}
	
	
}
