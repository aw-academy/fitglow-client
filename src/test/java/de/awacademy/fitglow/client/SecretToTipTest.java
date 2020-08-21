package de.awacademy.fitglow.client;

import java.math.BigDecimal;

import org.junit.Test;

import de.awacademy.fitglow.service.TipCategory;
import de.awacademy.fitglow.service.TipMapper;
import de.awacademy.fitglow.service.Tresor;

public class SecretToTipTest {

	@Test
	public void digest() {
		Tresor tresor = new Tresor();
		String bill = tresor.bill("a2f3899661f991dbd8dfa6e36e53ed43");
		
		TipMapper tipMapper = new TipMapper();
		TipCategory tipCategory = TipCategory.valueOf("BOUNCER");
		BigDecimal tip = tipMapper.fetchTip(tipCategory, new BigDecimal(bill));
		
		System.out.println();
		System.out.println(tip + " Euro");
		System.out.println();
	}
	
}
