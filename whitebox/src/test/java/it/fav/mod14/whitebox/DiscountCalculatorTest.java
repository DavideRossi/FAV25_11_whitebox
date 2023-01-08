package it.fav.mod14.whitebox;

import static org.junit.jupiter.api.Assertions.*;

import java.time.DayOfWeek;

import org.junit.jupiter.api.Test;

class DiscountCalculatorTest {

	@Test
	void noDiscount() {
		DiscountCalculator discountCalculator = new DiscountCalculator(DayOfWeek.FRIDAY, 0.05, 65, 0.1, 300, 0.05);
		assertEquals(1.0, discountCalculator.calculateDiscount(DayOfWeek.MONDAY, 30, 100), 1E-5);
	}
}
