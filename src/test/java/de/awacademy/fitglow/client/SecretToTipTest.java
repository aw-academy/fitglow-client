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
		String bill = tresor.bill("<.secret.key>");
		
		TipMapper tipMapper = new TipMapper();
		TipCategory tipCategory = TipCategory.valueOf("<position-category.txt>");
		BigDecimal tip = tipMapper.fetchTip(tipCategory, new BigDecimal(bill));
		
		System.out.println();
		System.out.println(tip + " Euro");
		System.out.println();
	}
	
}
