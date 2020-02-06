package test;

import testEtat.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestInit {

    private Conteneur C;

    // Objectif de test : creation d'un conteneur de capacite > 1
    // Resultat attendu : conteneur vide cree de la capacite passee en argument
    @Test
	public void capaciteSup1() {
	try {
	    C = new Conteneur(5);
	} catch (Exception e) {
	    fail();
	    // on force le test a echouer si une exception est levee
	}
	assertNotNull(C);
	assertEquals(0,C.taille());
	assertEquals(5,C.capacite());
	assertTrue(C.estVide());
    }
}
