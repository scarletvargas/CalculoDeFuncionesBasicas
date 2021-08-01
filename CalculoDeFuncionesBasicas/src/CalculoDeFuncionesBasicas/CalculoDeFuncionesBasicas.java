package CalculoDeFuncionesBasicas;

import javax.swing.JOptionPane;

public class CalculoDeFuncionesBasicas {
	
	public static void main(String[] args) {
		/*Suma*/
		JOptionPane.showConfirmDialog(null, "Realicemos una Suma");
		String sum1 = JOptionPane.showInputDialog(null, "Ingrese el primer numero: ");
		String sum2 = JOptionPane.showInputDialog(null, "Ingrese el segundo numero: ");
		float Sum1, Sum2, suma;
		Sum1 = Float.parseFloat(sum1);
		Sum2 = Float.parseFloat(sum2);
		suma = Sum1 + Sum2;
		JOptionPane.showConfirmDialog(null, "El resultado de la Suma es: " + suma);
		
		
		/*Resta*/
		JOptionPane.showConfirmDialog(null, "Realicemos una Resta");
		String res1 = JOptionPane.showInputDialog(null, "Ingrese el primer numero: ");
		String res2 = JOptionPane.showInputDialog(null, "Ingrese el segundo numero: ");
		float Res1, Res2, resta;
		Res1 = Float.parseFloat(res1);
		Res2 = Float.parseFloat(res2);
		resta = Res1 + Res2;
		JOptionPane.showConfirmDialog(null, "El resultado de la Resta es: " + resta);
		
		/*Multiplicacion*/
		JOptionPane.showConfirmDialog(null, "Realicemos una Multiplicacion");
		String mult1 = JOptionPane.showInputDialog(null, "Ingrese el primer numero: ");
		String mult2 = JOptionPane.showInputDialog(null, "Ingrese el segundo numero: ");
		float Mult1, Mult2, mult;
		Mult1 = Float.parseFloat(mult1);
		Mult2 = Float.parseFloat(mult2);
		mult = Mult1 + Mult2;
		JOptionPane.showConfirmDialog(null, "El resultado de la Multiplicacion es: " + mult);
		
		/*Division*/
		JOptionPane.showConfirmDialog(null, "Realicemos una Division");
		String div1 = JOptionPane.showInputDialog(null, "Ingrese el primer numero: ");
		String div2 = JOptionPane.showInputDialog(null, "Ingrese el segundo numero: ");
		float Div1, Div2, division;
		Div1 = Float.parseFloat(div1);
		Div2 = Float.parseFloat(div2);
		division = Div1 + Div2;
		JOptionPane.showConfirmDialog(null, "El resultado de la Division es: " + division);
		}

}
