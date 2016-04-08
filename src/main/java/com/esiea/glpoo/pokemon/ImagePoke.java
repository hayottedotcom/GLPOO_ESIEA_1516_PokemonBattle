package com.esiea.glpoo.pokemon;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class ImagePoke {
	public ImageIcon Fond,Pokemon1,Pokemon2,BulleGauche,BulleDroite,BarreHP;
	BufferedImage Fond2;
	ImagePoke(){
		
		try {
			Fond2=ImageIO.read(new File("src/main/java/img/pokemon3.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Fond=new ImageIcon(new ImageIcon("src/main/java/img/pokemon3.png").getImage()
			.getScaledInstance
			(640, 480,Image.SCALE_DEFAULT));
	
	
	
		Pokemon1= new ImageIcon(new ImageIcon("src/main/java/img/rondoudou.png").getImage()
				.getScaledInstance
				(300, 300,Image.SCALE_DEFAULT));
		Pokemon2= new ImageIcon(new ImageIcon("src/main/java/img/pikachu.png").getImage()
				.getScaledInstance
				(150, 150,Image.SCALE_DEFAULT));
		BulleGauche= new ImageIcon(new ImageIcon("src/main/java/img/bulleGauche.png").getImage()
				.getScaledInstance
				(200, 80,Image.SCALE_DEFAULT));
		BulleDroite= new ImageIcon(new ImageIcon("src/main/java/img/bulleDroite.png").getImage()
				.getScaledInstance
				(200, 80,Image.SCALE_DEFAULT));
		BarreHP= new ImageIcon(new ImageIcon("src/main/java/img/lifebarTest.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
	}

}
