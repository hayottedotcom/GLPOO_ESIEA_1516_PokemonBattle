package com.esiea.glpoo.pokemon;

public class HpBarre {
	ImagePoke image = ImagePoke.getInstance();
	HpBarre(){
		int Hp1=Integer.parseInt(Panel.nombreHP1.getText().replaceAll("/100", ""));
		int Hp2=Integer.parseInt(Panel.nombreHP2.getText().replaceAll("/100", ""));
		
		if(Hp1 >=95 && Hp1<100){
			Panel.barreHP1.setIcon(image.BarreHP[2]);
		}
		else if(Hp2 >=95 && Hp2<100){
			Panel.barreHP2.setIcon(image.BarreHP[2]);
		}
		if(Hp1 >=90 && Hp1<95){
			Panel.barreHP1.setIcon(image.BarreHP[3]);
		}
		else if(Hp2 >=90 && Hp2<95){
			Panel.barreHP2.setIcon(image.BarreHP[3]);
		}
		if(Hp1 >=85 && Hp1<90){
			Panel.barreHP1.setIcon(image.BarreHP[4]);
		}
		else if(Hp2 >=85 && Hp2<90){
			Panel.barreHP2.setIcon(image.BarreHP[4]);
		}
		if(Hp1 >=80 && Hp1<85){
			Panel.barreHP1.setIcon(image.BarreHP[5]);
		}
		else if(Hp2 >=80 && Hp2<85){
			Panel.barreHP2.setIcon(image.BarreHP[5]);
		}
		if(Hp1 >=75 && Hp1<80){
			Panel.barreHP1.setIcon(image.BarreHP[6]);
		}
		else if(Hp2 >=75 && Hp2<80){
			Panel.barreHP2.setIcon(image.BarreHP[6]);
		}
		if(Hp1 >=70 && Hp1<75){
			Panel.barreHP1.setIcon(image.BarreHP[7]);
		}
		else if(Hp2 >=70 && Hp2<75){
			Panel.barreHP2.setIcon(image.BarreHP[7]);
		}
		if(Hp1 >=65 && Hp1<70){
			Panel.barreHP1.setIcon(image.BarreHP[8]);
		}
		else if(Hp2 >=65 && Hp2<70){
			Panel.barreHP2.setIcon(image.BarreHP[8]);
		}
		if(Hp1 >=60 && Hp2<65){
			Panel.barreHP1.setIcon(image.BarreHP[9]);
		}
		else if(Hp2 >=60 && Hp2<65){
			Panel.barreHP2.setIcon(image.BarreHP[9]);
		}
		if(Hp1 >=55 && Hp1<60){
			Panel.barreHP1.setIcon(image.BarreHP[10]);
		}
		else if(Hp2 >=55 && Hp2<60){
			Panel.barreHP2.setIcon(image.BarreHP[10]);
		}
		if(Hp1 >=50 && Hp1<55){
			Panel.barreHP1.setIcon(image.BarreHP[11]);
		}
		else if(Hp2 >=50 && Hp2<55){
			Panel.barreHP2.setIcon(image.BarreHP[11]);
		}
		if(Hp1 >=45 && Hp1<50){
			Panel.barreHP1.setIcon(image.BarreHP[12]);
		}
		else if(Hp2 >=45 && Hp2<50){
			Panel.barreHP2.setIcon(image.BarreHP[12]);
		}
		if(Hp1 >=40 && Hp1<45){
			Panel.barreHP1.setIcon(image.BarreHP[13]);
		}
		else if(Hp2 >=40 && Hp2<45){
			Panel.barreHP2.setIcon(image.BarreHP[13]);
		}
		if(Hp1 >=35 && Hp1<40){
			Panel.barreHP1.setIcon(image.BarreHP[14]);
		}
		else if(Hp2 >=35 && Hp2<40){
			Panel.barreHP2.setIcon(image.BarreHP[14]);
		}
		if(Hp1 >=30 && Hp1<35){
			Panel.barreHP1.setIcon(image.BarreHP[15]);
		}
		else if(Hp2 >=30 && Hp2<35){
			Panel.barreHP2.setIcon(image.BarreHP[15]);
		}
		if(Hp1 >=25 && Hp1<30){
			Panel.barreHP1.setIcon(image.BarreHP[16]);
		}
		else if(Hp2 >=25 && Hp2<30){
			Panel.barreHP2.setIcon(image.BarreHP[16]);
		}
		if(Hp1 >=20 && Hp1<25){
			Panel.barreHP1.setIcon(image.BarreHP[17]);
		}
		else if(Hp2 >=20 && Hp2<25){
			Panel.barreHP2.setIcon(image.BarreHP[17]);
		}
		if(Hp1 >=15 && Hp1<20){
			Panel.barreHP1.setIcon(image.BarreHP[18]);
		}
		else if(Hp2 >=15 && Hp2<20){
			Panel.barreHP2.setIcon(image.BarreHP[18]);
		}
		if(Hp1 >=10 && Hp1<15){
			Panel.barreHP1.setIcon(image.BarreHP[19]);
		}
		else if(Hp2 >=10 && Hp2<15){
			Panel.barreHP2.setIcon(image.BarreHP[19]);
		}
		if(Hp1 ==0 && Hp1<10){
			Panel.barreHP1.setIcon(image.BarreHP[20]);
		}
		else if(Hp2 ==0 && Hp2<10){
			Panel.barreHP2.setIcon(image.BarreHP[20]);
		}
	}
}
