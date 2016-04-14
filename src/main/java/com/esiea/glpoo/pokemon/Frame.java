package com.esiea.glpoo.pokemon;

import java.awt.Dimension;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Frame{
	static int cpt=3,vitesse=400;
	Panel panel;
	ImagePoke fond= ImagePoke.getInstance();
	static JFrame fenetre;
	static int etat=0;
	
	
	Frame(){
			panel=new Panel(fond.Fond2);
			fenetre = new JFrame("Pokemon");
			//fenetre.setContentPane(new JLabel(fond.Fond));
			fenetre.setSize(640,480);
			fenetre.setTitle("Pokemon Battle GLPOO");
			fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fenetre.setContentPane(panel);
			//fenetre.pack();
			fenetre.setFocusable(false);
			fenetre.setResizable(false);
			fenetre.setVisible(true);
	}
	
	
	public Dimension getFenetreSize() {
		return fenetre.getSize();
	}
	
	

}
