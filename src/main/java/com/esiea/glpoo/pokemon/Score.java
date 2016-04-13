package com.esiea.glpoo.pokemon;

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
			dégat=boule1-boule2;
			if(Hp1-dégat <=0)
				Panel.nombreHP1.setText("0/100");
			else
			Panel.nombreHP1.setText(""+(Hp1-dégat)+"/100");
		}
		else { dégat=boule2-boule1;
			if(Hp2-dégat <=0)
				Panel.nombreHP1.setText("0/100");
			else
			Panel.nombreHP2.setText(""+(Hp2-dégat)+"/100");
		}
		new HpBarre();
		
	}
	public static int getDegat(){
		return (100-dégat);
	}
}
