package com.esiea.glpoo.pokemon;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class BoutonAttaque implements ActionListener {
	JButton attaque;
	int etat=0,tirage=1,cpt=1,temp=5,vitesse=200;
	
	ImagePoke image=ImagePoke.getInstance();
	
	BoutonAttaque(){
		attaque = new JButton("Attaque !");
		attaque.setBounds(486, 389, 90, 50);
		Frame.etat=1;
		attaque.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		Panel.boule1.setText("?");
		Panel.boule2.setText("?");
		attaque.setVisible(false);
		final Thread t1 = new Thread(){
		      @Override
		      public void run(){
		    	  while(temp!=0){
		    		  	Musique.battle.stop();
		    		  	Musique.loto.loop(100);
						Panel.console.setText("Tirage aléatoire des boules en cours ...");
						if(tirage<=6){
						Panel.boule1.setVisible(false);
						Panel.boule2.setVisible(false);
						Panel.vsImg.setVisible(false);
						}
						else {
							Panel.boule1.setVisible(false);
							Panel.boule2.setVisible(false);
							Panel.vsImg.setVisible(false);
							Panel.niveauEnd.setVisible(true);
						}
					
						try {
							Thread.sleep(vitesse);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if(tirage<=6){
						Panel.boule1.setVisible(true);
						Panel.boule2.setVisible(true);
						Panel.vsImg.setVisible(true);
						}
						else Panel.niveauEnd.setVisible(false);
						try {
							Thread.sleep(vitesse);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						vitesse+=100;
						temp--;
					}
		      }
		   };
		   t1.start();
		  Thread t2= new Thread(){
		      @Override
		      public void run(){
		    	  
		         try {
					t1.join();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        Musique.loto.stop();
		        Musique.battle.loop(100);
		        attaque.setVisible(true);
		 		temp=5;
		 		vitesse=200;
		 		
		 		if(tirage<=6){
		 		new Score();
		 		LoadExcel.nextBoule();

		 		Panel.blueBall.setIcon(new ImageIcon(new ImageIcon("src/main/java/img/blueBalls-"+cpt+".png").getImage()
		 				.getScaledInstance
		 				(100, 15,Image.SCALE_DEFAULT)));
		 		Panel.redBall.setIcon(new ImageIcon(new ImageIcon("src/main/java/img/redBalls-"+cpt+".png").getImage()
		 				.getScaledInstance
		 				(100, 15,Image.SCALE_DEFAULT)));
		 		cpt++;
		 		tirage++;
		 		}
		 		else{
		 			LoadExcel.setColonne();
		 			cpt=0;
		 			tirage=1;
		 			
		 			Panel.blueBall.setIcon(new ImageIcon(new ImageIcon("src/main/java/img/blueBalls-"+cpt+".png").getImage()
		 					.getScaledInstance
		 					(100, 15,Image.SCALE_DEFAULT)));
		 			Panel.redBall.setIcon(new ImageIcon(new ImageIcon("src/main/java/img/redBalls-"+cpt+".png").getImage()
		 					.getScaledInstance
		 					(100, 15,Image.SCALE_DEFAULT)));
		 		}
		 				}
		 		};     
		 		t2.start();
		   };
}
