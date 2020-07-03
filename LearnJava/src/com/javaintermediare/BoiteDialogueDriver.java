package com.javaintermediare;

import javax.swing.JOptionPane;

public class BoiteDialogueDriver{

	public static void main(String[] args){
		int nbre1 = Integer.parseInt(JOptionPane.showInputDialog("Entrer le premier nombre"));
		int nbre2 = Integer.parseInt(JOptionPane.showInputDialog("Entrer le second nombre"));

		int somme = nbre1 + nbre2;
		String message = String.format("La somme est %d ", somme);
		JOptionPane.showMessageDialog(null, message);

	}
}
