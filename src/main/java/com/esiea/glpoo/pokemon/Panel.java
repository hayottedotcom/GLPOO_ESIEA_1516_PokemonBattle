package com.esiea.glpoo.pokemon;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel{
	JPanel mainPanel;
	private Image image;
	Pokemon poke;
	ImagePoke picture= new ImagePoke();
	static JLabel score;
	public Panel(Image image){
		this.image = image;
		JLabel pokemon1 = new JLabel(picture.Pokemon1);
		JLabel pokemon2 = new JLabel(picture.Pokemon2);
		JLabel bulleG = new JLabel(picture.BulleGauche);
		JLabel bulleD = new JLabel(picture.BulleDroite);
		JLabel barreHP = new JLabel(picture.BarreHP);
		JLabel vsImg = new JLabel(picture.VsImg);
		JButton attaque = new JButton("Attaque !");
		this.setLayout(null);
		//mainPanel.setLayout( new FlowLayout(FlowLayout.RIGHT));
		//mainPanel.setOpaque(false);
		pokemon1.setBounds(60, 200,240,240);
		pokemon2.setBounds(460, 40, 100, 240);
		bulleG.setBounds(80, -20, 240, 240);
		bulleD.setBounds(300, 200, 240, 240);
		attaque.setBounds(400, 400, 90, 50);
		barreHP.setBounds(300, 200, 300, 260);
		vsImg.setBounds(115, 135, 400, 144);
		//mainPanel.add(pokemon1);
		this.add(vsImg);
		this.add(barreHP);
		this.add(pokemon1);
		this.add(pokemon2);
		this.add(attaque);
		this.add(bulleG);
		this.add(bulleD);
		//this.setLayout(new BorderLayout());
		//this.add(mainPanel,BorderLayout.PAGE_END);
		//this.add(score,BorderLayout.);
		//this.add(poke.pokemon1,BorderLayout.PAGE_END);

	}
	
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
	
	

	
}
