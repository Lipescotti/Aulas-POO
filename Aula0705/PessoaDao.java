package Aula0705;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PessoaDao {
	
	ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	int a=0;
	
	void salvar(Pessoa p)
	{
		lista.add(p);
	}
	
	void listar()
	{
		for(Pessoa pes: lista)
		{
			JOptionPane.showMessageDialog(null,"O nome: "+ pes.getNome()
												+"\nA idade: " + pes.getIdade()
												+"\nO salario: R$ "+ pes.getSalario());
		}
	}
	
	Pessoa buscar(int cod)
	{
		cod--;
		return lista.get(cod);
	}
	void alterar(int cod, Pessoa p)
	{
		cod--;
		lista.set(cod, p);
	}
	void exculir(int cod)
	{
		cod--;
		lista.remove(cod);
	}
}
