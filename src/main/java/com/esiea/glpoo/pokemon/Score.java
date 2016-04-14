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
		int majHP1;
		int majHP2;
		Panel.boule1.setText(""+boule1);
		Panel.boule2.setText(""+boule2);
		System.out.println(boule1);
		System.out.println(boule2);
		dégat = calculDegat(boule1, boule2);
		if(boule1>=boule2){
			Panel.console.setText("Rondoudou tire le numéro : "+boule2+"\nPikachu tire le numéro"
					+ " : "+boule1+"\nPikachu prend le dessus et inflige : "+(boule1-boule2)+" ("+boule1+"-"+boule2+")" );
			majHP1 = majHP(dégat, Hp1);
			if(majHP1 <= 0){
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
			Panel.nombreHP1.setText(""+majHP1+"/100");
		}
		else { 
			Panel.console.setText("Rondoudou tire le numéro : "+boule2+"\nPikachu tire le numéro"
					+ " : "+boule1+"\nRondoudou prend le dessus et inflige : "+(boule2-boule1)+" ("+boule2+"-"+boule1+")" );
			majHP2 = majHP(dégat, Hp2);
			if(majHP2 <= 0){
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
			Panel.nombreHP2.setText(""+majHP2+"/100");
		}
		new HpBarre();
		
	}
	public int calculDegat(int boule1, int boule2){
		if(boule1>=boule2){
			return boule1-boule2;
		}
		else{
			return boule2-boule1;
		}
	}
	public int majHP(int degat,int formerHP){
		if(degat >= formerHP){
			return 0;
		}
		else{
			return formerHP-degat;
		}
	}
}
