package com.esiea.glpoo.pokemon;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Musique {
	static Clip battle,victory,loto;
	Musique(){
		try {
			battle = AudioSystem.getClip();
			AudioInputStream audio_input;
			audio_input = AudioSystem.getAudioInputStream(new File("src/main/java/sounds/battle.wav"));
			battle.open(audio_input);
			battle.loop(10);
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
		
		try {
			victory = AudioSystem.getClip();
			AudioInputStream audio_input;
			audio_input = AudioSystem.getAudioInputStream(new File("src/main/java/sounds/victory.wav"));
			victory.open(audio_input);
			//victory.start();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
		try {
			loto = AudioSystem.getClip();
			AudioInputStream audio_input;
			audio_input = AudioSystem.getAudioInputStream(new File("src/main/java/sounds/lotoPush.wav"));
			loto.open(audio_input);
			//victory.start();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
	}

}
