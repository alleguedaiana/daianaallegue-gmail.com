package ejercicios;

import javax.swing.JOptionPane;

public class BucleI {

	public static void main(String[] args) {
		String contraseņa="1234";
		String psw="";
		
			while(contraseņa.equals(psw)==false)
			{
				psw= JOptionPane.showInputDialog("Ingrese su contraseņa");
				
				if(contraseņa.equals(psw)==false)
				{
					psw=JOptionPane.showInputDialog("Contraseņa incorrecta. Ingrese nuevamente");
				}
			}
			
			System.out.println("Contraseņa correcta");

	}

}
