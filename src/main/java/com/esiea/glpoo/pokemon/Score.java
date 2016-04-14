package com.esiea.glpoo.pokemon;

import javax.swing.JOptionPane;

public class Score {
	
	LoadExcel boule= new LoadExcel();
	static int dégat=0;
	Score(){
		int boule1=Integer.valueOf(boule.boule1.replaceAll(".0", ""));
		int boule2=Integer.valueOf(boule.boule2.replaceAll(".0", ""));
		int Hp1=Integer.parseInt(Panel.nombreHP1.getText().replaceAll("/100", ""));
		int Hp2=Integer.parseInt(Panel.nombreHP2.getText().replaceAll("/100", ""));
		Panel.boule1.setText(""+boule1);
		Panel.boule2.setText(""+boule2);
		System.out.println(boule1);
		System.out.println(boule2);
		
		if(boule1>=boule2){
			Panel.console.setText("Rondoudou tire le numéro : "+boule2+"\nPikachu tire le numéro"
					+ " : "+boule1+"\nPikachu prend le dessus et inflige : "+(boule1-boule2)+" ("+boule1+"-"+boule2+")" );
			dégat=boule1-boule2;
			if(Hp1-dégat <=0){
				Panel.nombreHP1.setText("0/100");
				Musique.battle.stop();
				Musique.victory.start();
				Panel.boule1.setVisible(false);
				Panel.boule2.setVisible(false);
				Panel.vsImg.setVisible(false);
				Panel.victoryEnd.setVisible(true);
				JOptionPane.showMessageDialog(null, "Pikachu gagne le duel !");
				System.exit(0);
			}
			else
			Panel.nombreHP1.setText(""+(Hp1-dégat)+"/100");
		}
		else { 
			Panel.console.setText("Rondoudou tire le numéro : "+boule2+"\nPikachu tire le numéro"
					+ " : "+boule1+"\nRondoudou prend le dessus et inflige : "+(boule2-boule1)+" ("+boule2+"-"+boule1+")" );
			dégat=boule2-boule1;
			if(Hp2-dégat <=0){
				Panel.nombreHP1.setText("0/100");
				Musique.battle.stop();
				Musique.victory.start();
				Panel.boule1.setVisible(false);
				Panel.boule2.setVisible(false);
				Panel.vsImg.setVisible(false);
				Panel.victoryEnd.setVisible(true);
				JOptionPane.showMessageDialog(null, "Rondoudou gagne le duel !");
				System.exit(0);
			}
			else
			Panel.nombreHP2.setText(""+(Hp2-dégat)+"/100");
		}
		new HpBarre();
		
	}
	public static int getDegat(){
		return (100-dégat);
	}
}
