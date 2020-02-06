package test;

import testEtat.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestPlein {

    private Conteneur C;
    private Object A1, A2, A3, A4, A5, B1, B2, B3, B4, B5;

    // Creation d'un conteneur plein
    @Before
	public void creerConteneurPlein() {
	try  {
	    C = new Conteneur(5);
	} catch (Exception e) {
	    fail();
	}
	A1 = new Object();
	A2 = new Object();
	A3 = new Object();
	A4 = new Object();
	A5 = new Object();
	B1 = new Object();
	B2 = new Object();
	B3 = new Object();
	B4 = new Object();
	B5 = new Object();
	try  {
	    C.ajouter(A1, B1);
	    C.ajouter(A2, B2);
	    C.ajouter(A3, B3);
	    C.ajouter(A4, B4);
	    C.ajouter(A5, B5);
	} catch (Exception e) {
	    fail();
	}
    }

    // Objectif de test : ajout d'un element dont la cle est deja presente dans un conteneur plein
    // Resultat attendu : ajout possible et ancien couple de meme cle ecrase
    @Test
	public void ajouterPresentPlein() {

	Object B = new Object();
	try {
	    C.ajouter(A2, B);
	} catch (Exception e) {
	    fail();
	}

	assertTrue(C.present(A2));
	try {
	    assertEquals(B,C.valeur(A2));
	} catch (Exception e) {
	    fail();
	}
	assertEquals(5,C.taille());
	assertEquals(5,C.capacite());
    }
}
