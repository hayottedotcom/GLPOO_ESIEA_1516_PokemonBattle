package com.esiea.glpoo.pokemon;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class ImagePoke {
	public ImageIcon Fond,Pokemon1,Pokemon2,BulleGauche,BulleDroite,VsImg, blueBalls,redBalls,console,
	nouveauTirage,victoire;
	public ImageIcon[] BarreHP=new ImageIcon[21];
	BufferedImage Fond2;
	ImagePoke(){
		try {
			Fond2=ImageIO.read(new File("src/main/java/img/pokemon3.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Fond= new ImageIcon(new ImageIcon("src/main/java/img/pokemon3.png").getImage()
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
		VsImg= new ImageIcon(new ImageIcon("src/main/java/img/vs.png").getImage()
				.getScaledInstance
				(400, 144,Image.SCALE_DEFAULT));
		blueBalls= new ImageIcon(new ImageIcon("src/main/java/img/blueBalls.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		redBalls= new ImageIcon(new ImageIcon("src/main/java/img/redBalls.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		
		console=new ImageIcon(new ImageIcon("src/main/java/img/console.png").getImage()
				.getScaledInstance
				(640, 80,Image.SCALE_DEFAULT));
		nouveauTirage=new ImageIcon(new ImageIcon("src/main/java/img/nouveauTirage.png").getImage()
				.getScaledInstance
				(300, 160,Image.SCALE_DEFAULT));
		victoire=new ImageIcon(new ImageIcon("src/main/java/img/victoryEnd.png").getImage()
				.getScaledInstance
				(300, 78,Image.SCALE_DEFAULT));
		
		
		//---------BarreHP
		for(int i=1;i<=20;i++){
		BarreHP[i]= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp"+i+".png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		}
		
	}

}
