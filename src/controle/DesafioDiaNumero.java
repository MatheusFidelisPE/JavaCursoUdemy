package controle;

import javax.swing.JOptionPane;

public class DesafioDiaNumero {
	public static void main(String[] args) {
		
		String entrada = JOptionPane.showInputDialog("Dia da Semana: ");
		
		if(entrada.toLowerCase().equals("domingo"))
		{
			System.out.println("1");
		}
		else if(entrada.toLowerCase().equals("segunda"))
		{
			System.out.println("2");
		}
		else if(entrada.toLowerCase().equals("ter�a"))
		{
			System.out.println("3");
		}
		else if(entrada.toLowerCase().equals("quarta"))
		{
			System.out.println("4");
		}
		else if(entrada.toLowerCase().equals("quinta"))
		{
			System.out.println("5");
		}
		else if(entrada.toLowerCase().equals("sexta"))
		{
			System.out.println("6");
		}
		else if(entrada.toLowerCase().equals("s�bado"))
		{
			System.out.println("7");
		}
		else
		{
			System.out.println("Informa��o incorreta.");
		}
	}

}
