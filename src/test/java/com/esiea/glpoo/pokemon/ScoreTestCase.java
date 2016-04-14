package com.esiea.glpoo.pokemon;

import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ScoreTestCase {
	Score scoreTest;

    @Before
    public void doBefore(){
        scoreTest = new Score();
    }

    @Test
    public void testCalculDegat() {
        final int boule1 = 3;
        final int boule2 = 2;
        final int degat = scoreTest.calculDegat(boule1,boule2);     
        System.out.print(degat);
        assertEquals(1, degat);
    }
    
    @Test
    public void testCalculDegat2(){
    	final int boule1 = 2;
        final int boule2 = 3;
        final int degat = scoreTest.calculDegat(boule1,boule2);     
        assertEquals(1, degat);
    }
    
    @Test
    public void testMajHP(){
    	final int formerHP = 100;
        final int degat = 50;
        final int maj = scoreTest.majHP(degat,formerHP);     
        assertEquals(50, maj);
    }
    
    @Test
    public void testMajHP2(){
    	final int formerHP = 20;
        final int degat = 50;
        final int maj = scoreTest.majHP(degat,formerHP);     
        assertEquals(0, maj);
    }
}
