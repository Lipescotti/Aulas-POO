package Aula2603;

import java.util.Scanner;

public class teste 
{
	public static void main(String[] args)
	{
		Bairro B1 = new Bairro();
		Bairro B2 = new Bairro();
		Pessoa p1 = new Pessoa();
		
		Scanner into = new Scanner(System.in);
		B1.setID(10);
		B1.setNome("Centro");
		B2.setID(10);
		B2.setNome("Taruma");
	
/*		System.out.println("O ID " + B1.getID());
		System.out.println("O nome "+ B1.getNome());
		
		System.out.println("Digite o ID do bairro: ");
		B2.setID(into.nextInt());
		System.out.println("Digite o nome do bairro: ");
		B2.setNome(into.next());
		
		System.out.println("O ID " + B2.getID());
		System.out.println("O nome "+ B2.getNome());
*/		
		System.out.println("\n\nDigite o nome da pessoa: ");
		p1.setNome(into.next());
		System.out.println("Digite a idade da pessoa: ");
		p1.setIdade(into.nextInt());
		System.out.println("Digite a renda da pessoa: ");
		p1.setRenda(into.nextDouble());
		
		System.out.println("Digite 1 para o bairro "+B1.getNome() + " ou 2 para o bairro " +B2.getNome());
		int a = into.nextInt();
		
		if(a == 1)
		{
			p1.setBairro(B1);
		}
		else
		{
			p1.setBairro(B2);
		}
		
		System.out.println("\nNome da pessoa:  " + p1.getNome());
		System.out.println("Idade: "+ p1.getIdade());
		System.out.println("Renda: R$" + p1.getRenda());
		System.out.println("Bairro: "+ p1.getBairro().getNome());
	}
}
