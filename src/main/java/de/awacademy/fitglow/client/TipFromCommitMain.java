package de.awacademy.fitglow.client;

import java.math.BigDecimal;

import de.awacademy.fitglow.service.TipCategory;
import de.awacademy.fitglow.service.TipMapper;

/**
 * Main class to convert USD to Euro. Just replace value parameter which
 * is zero by value from feature branch.
 */
public class TipFromCommitMain {

	/**
	 * Main method as entry point for this currency conversion.
	 */
	public static void main(String[] args) {
		
		TipMapper tipMapper = new TipMapper();
		BigDecimal bill = new BigDecimal("250");
		BigDecimal tip = tipMapper.fetchTip(TipCategory.KITCHEN, bill);
		
		System.out.println();
		System.out.println(tip + " Euro");
		System.out.println();
	}

}
