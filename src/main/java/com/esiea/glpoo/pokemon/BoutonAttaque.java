package com.esiea.glpoo.pokemon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class BoutonAttaque implements ActionListener {
	JButton attaque;
	int etat=0;
	BoutonAttaque(){
		attaque = new JButton("Attaque !");
		attaque.setBounds(400, 400, 90, 50);
		attaque.addActionListener(this);
	}
	public void test(){
		while(true){

			Panel.boule1.setVisible(true);
			Panel.boule2.setVisible(true);
			Panel.vsImg.setVisible(true);

	
			Panel.boule1.setVisible(false);
			Panel.boule2.setVisible(false);
			Panel.vsImg.setVisible(false);
		}
	}
	public void tempo(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int cpt=9;
		int etat=0;
		
		tempo();
		
		Panel.boule1.setVisible(true);
		Panel.boule2.setVisible(true);
		Panel.vsImg.setVisible(true);

		/*	
		Panel.boule1.setVisible(false);
		Panel.boule2.setVisible(false);
		Panel.vsImg.setVisible(false);*/
		//cpt--;
		
	}

}
