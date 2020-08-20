package de.awacademy.fitglow.client;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.awacademy.fitglow.service.Tresor;

public class KeyToTipTest {
	
	@Test
	public void fetchValue() {
		Tresor tresor = new Tresor();
		String tip = tresor.decrypt("<SECRET GOES HERE>");
		assertNotNull("Wrong secret key given", tip);
		
		System.out.println();
		System.out.println(tip);
		System.out.println();
		
		assertTrue(true);
	}

}
