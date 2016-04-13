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
	//LoadExcel boule= new LoadExcel();
	BoutonAttaque bAttaque=new BoutonAttaque();
	static JLabel score;
	
	static JLabel boule1;
	static JLabel boule2;
	static JLabel vsImg;
	static JLabel nombreHP1;
	static JLabel nombreHP2;
	static JLabel barreHP1;
	static JLabel barreHP2;
	
	Panel(){
		
	}
	public Panel(Image image){
		this.image = image;
		
		//----------Déclaration éléments
		JLabel nomPokemon1 = new JLabel("Rondoudou :");
		JLabel nomPokemon2 = new JLabel("Pikachu :");
		boule1 = new JLabel ();
		boule2 = new JLabel ();
		Font font = new Font("Arial",Font.BOLD,30);
		boule1.setFont(font);
		boule2.setFont(font);
		JLabel blueBall = new JLabel(picture.blueBalls);
		JLabel redBall = new JLabel(picture.redBalls);
		JLabel pokemon1 = new JLabel(picture.Pokemon1);
		JLabel pokemon2 = new JLabel(picture.Pokemon2);
		JLabel bulleG = new JLabel(picture.BulleGauche);
		JLabel bulleD = new JLabel(picture.BulleDroite);
		barreHP1 = new JLabel(picture.BarreHP1);
		barreHP2 = new JLabel(picture.BarreHP1);
		nombreHP1 = new JLabel("100/100");
		nombreHP2 = new JLabel("100/100");
		vsImg = new JLabel(picture.VsImg);
		this.setLayout(null);
		//mainPanel.setLayout( new FlowLayout(FlowLayout.RIGHT));
		//mainPanel.setOpaque(false);
		
		//----------Position des éléments
		pokemon1.setBounds(60, 200,240,240);
		pokemon2.setBounds(460, 40, 100, 240);
		bulleG.setBounds(80, -20, 240, 240);
		bulleD.setBounds(300, 200, 240, 240);
		barreHP1.setBounds(300, 200, 300, 260);
		barreHP2.setBounds(65, -20, 300, 260);
		nombreHP1.setBounds(450, 185, 300, 260);
		nombreHP2.setBounds(215, -35, 300, 260);
		blueBall.setBounds(310, 145, 300, 260);
		redBall.setBounds(80, -75, 300, 260);
		vsImg.setBounds(115, 135, 400, 144);
		nomPokemon1.setBounds(115, -50, 300, 260);
		nomPokemon2.setBounds(350, 170, 300, 260);
		boule1.setBounds(170, 130, 400, 144);
		boule2.setBounds(426, 133, 400, 144);
		//mainPanel.add(pokemon1);
		
		//------------Visibilité éléments
		
		boule1.setVisible(false);
		boule2.setVisible(false);
		vsImg.setVisible(false);
		
		//------------Ajout Element dans le panel
		this.add(blueBall);
		this.add(redBall);
		this.add(nombreHP1);
		this.add(nombreHP2);
		this.add(boule1);
		this.add(boule2);
		this.add(vsImg);
		this.add(nomPokemon1);
		this.add(nomPokemon2);
		this.add(barreHP1);
		this.add(barreHP2);
		this.add(pokemon1);
		this.add(pokemon2);
		this.add(bAttaque.attaque);
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
