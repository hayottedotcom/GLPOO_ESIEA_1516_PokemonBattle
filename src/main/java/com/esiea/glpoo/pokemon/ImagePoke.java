package com.esiea.glpoo.pokemon;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class ImagePoke {
	public ImageIcon Fond,Pokemon1,Pokemon2,BulleGauche,BulleDroite,VsImg, blueBalls,redBalls;
	public ImageIcon BarreHP1,BarreHP2,BarreHP3,BarreHP4,BarreHP5,BarreHP6,BarreHP7,BarreHP8,BarreHP9,BarreHP10,
	BarreHP11,BarreHP12,BarreHP13,BarreHP14,BarreHP15,BarreHP16,BarreHP17,BarreHP18,BarreHP19,BarreHP20;
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
		
		//---------BarreHP
		BarreHP1= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp1.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		BarreHP2= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp2.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		BarreHP3= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp3.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		BarreHP4= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp4.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		BarreHP5= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp5.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		BarreHP6= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp6.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		BarreHP7= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp7.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		BarreHP8= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp8.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		BarreHP9= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp9.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		BarreHP10= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp10.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		BarreHP11= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp11.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		BarreHP12= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp12.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		BarreHP13= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp13.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		BarreHP14= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp14.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		BarreHP15= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp15.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		BarreHP16= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp16.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		BarreHP17= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp17.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		BarreHP18= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp18.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		BarreHP19= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp19.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		BarreHP20= new ImageIcon(new ImageIcon("src/main/java/img/hp/hp20.png").getImage()
				.getScaledInstance
				(100, 15,Image.SCALE_DEFAULT));
		
	}

}
