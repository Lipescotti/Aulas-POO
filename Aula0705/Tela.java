package Aula0705;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela implements ActionListener{
	
	Pessoa pes;
	PessoaDao pdao = new PessoaDao();
	JFrame tela = new JFrame("Cadastro de pessoas");
	JPanel painel = new JPanel();
	
	JLabel ldcod = new JLabel("Codigo: ");
	JLabel ldnome = new JLabel("Nome: ");
	JLabel ldidade = new JLabel("Idade: ");
	JLabel ldsalario = new JLabel("Salario: ");
	
	JTextField txtcod = new JTextField();
	JTextField txtnome = new JTextField();
	JTextField txtidade = new JTextField();
	JTextField txtsalario = new JTextField();
	
	JButton btsalvar = new JButton("Salvar");
	JButton btlistar = new JButton("Listar");
	JButton btalterar = new JButton("Alterar");
	JButton btexcluir = new JButton("Excluir");
	JButton btbuscar = new JButton("Buscar");
	
	void criarTela()
	{
		tela.setSize(500,500);
		tela.setLocation(200, 200);
		
		painel.setLayout(null);
		
		
		
		ldcod.setBounds(20,20,100,30);
		ldnome.setBounds(20,70,100,30);
		ldidade.setBounds(20,120,100,30);
		ldsalario.setBounds(20,180,100,30);
		painel.add(ldcod);
		painel.add(ldidade);
		painel.add(ldnome);
		painel.add(ldsalario);
		
		txtcod.setBounds(140,20,100,30);
		txtnome.setBounds(140,70,100,30);
		txtidade.setBounds(140,120,100,30);
		txtsalario.setBounds(140,180,100,30);
		painel.add(txtcod);
		painel.add(txtidade);
		painel.add(txtnome);
		painel.add(txtsalario);
		
		
		btbuscar.setBounds(350, 30, 100, 30);
		btsalvar.setBounds(0, 250, 100, 30);
		btlistar.setBounds(110, 250, 100, 30);
		btalterar.setBounds(220, 250, 100, 30);
		btexcluir.setBounds(330, 250, 100, 30);
		
		btbuscar.addActionListener(this);
		btsalvar.addActionListener(this);
		btexcluir.addActionListener(this);
		btlistar.addActionListener(this);
		btalterar.addActionListener(this);
		
		painel.add(btalterar);
		painel.add(btbuscar);
		painel.add(btexcluir);
		painel.add(btlistar);
		painel.add(btsalvar);
		
		txtcod.disable();
		btbuscar.disable();
		
		tela.getContentPane().add(painel);
		tela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btsalvar)
		{
			String n = txtnome.getText();
			Integer i = Integer.valueOf(txtidade.getText());
			Double s = Double.valueOf(txtsalario.getText());
			
			pes = new Pessoa(n, i, s);
			pdao.salvar(pes);
			JOptionPane.showMessageDialog(null, "Pessoa salva com sucesso");
			txtnome.setText("");
			txtidade.setText("");
			txtsalario.setText("");
			txtcod.setText("");
			txtcod.enable();
			btbuscar.enable();

		}
		if(e.getSource() == btbuscar)
		{
			int x = Integer.valueOf(txtcod.getText());
			pes = new Pessoa();
			pes = pdao.buscar(x);
			
			txtnome.setText(pes.getNome());
			txtidade.setText(String.valueOf(pes.getIdade()));
			txtsalario.setText(String.valueOf(pes.getSalario()));
		}
		if(e.getSource() == btexcluir)
		{
			int z = Integer.valueOf(txtcod.getText());
			pdao.exculir(z);
			txtnome.setText("");
			txtidade.setText("");
			txtsalario.setText("");
			txtcod.setText("");
			JOptionPane.showMessageDialog(null, "Pessoa excluida com sucesso");

		}
		if(e.getSource() == btalterar)
		{
			int z = Integer.valueOf(txtcod.getText());
			
			String n = txtnome.getText();
			Integer i = Integer.valueOf(txtidade.getText());
			Double s = Double.valueOf(txtsalario.getText());
			
			pes = new Pessoa(n, i, s);
			pdao.alterar(z, pes);
			txtnome.setText("");
			txtidade.setText("");
			txtsalario.setText("");
			txtcod.setText("");
			JOptionPane.showMessageDialog(null, "Pessoa altera com sucesso");

			
			

		}
		if(e.getSource() == btlistar)
		{
			pdao.listar();
			
		}
		
	}
	
	public static void main(String[] args)
	{
		Tela t = new Tela();
		t.criarTela();
	}
}
