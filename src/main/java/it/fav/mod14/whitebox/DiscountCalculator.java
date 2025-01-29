package it.fav.mod14.whitebox;

import java.time.DayOfWeek;

public class DiscountCalculator {
	private DayOfWeek discountDow;
	private double dowDiscount;
	private int discountAge;
	private double ageDiscount;
	private double discountAmount;
	private double amountDiscount;
	
	public DiscountCalculator(DayOfWeek discountDow, double dowDiscount, int discountAge, double ageDiscount, double discountAmount, double amountDiscount) {
		this.discountDow = discountDow;
		this.dowDiscount = dowDiscount;
		this.discountAge = discountAge;
		this.ageDiscount = ageDiscount;
		this.discountAmount = discountAmount;
		this.amountDiscount = amountDiscount;
	}
	
	public double calculateDiscount(DayOfWeek dow, int age, double total) {
		double discount = 0;
		if(dow == this.discountDow) {
			discount += this.dowDiscount;
		}
		if(this.ageDiscount > this.amountDiscount) {
			if(age >= this.discountAmount) {
				discount += this.amountDiscount;
			} else if(age >= this.discountAge) {
				discount += this.ageDiscount;
			}
		} else {
			if(age >= this.discountAge) {
				discount += this.ageDiscount;
			} else if(total >= this.discountAmount) {
				discount += this.amountDiscount;
			}
		}
		return discount;
	}
}
