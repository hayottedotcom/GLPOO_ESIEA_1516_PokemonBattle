package com.esiea.glpoo.pokemon;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Frame {
	Panel panel;
	ImagePoke fond= new ImagePoke.getInstance();
	JFrame fenetre;
	Frame(){
	panel=new Panel(fond.Fond2); // fond ou Fond ???
    fenetre = new JFrame("Pokemon");
    //fenetre.setContentPane(new JLabel(fond.Fond));
    fenetre.setSize(640,480);
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
