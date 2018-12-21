package com.refactoring;

public class ChildrensPrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.CHILDRENS;
	}
	
	double getCharge(int daysRented){
		return daysRented * 3;
	}

}
