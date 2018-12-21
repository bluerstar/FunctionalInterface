package com.refactoring;

public class NewReleasePrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	
	double getCharge(int daysRented){
		double result = 1.5;
		if(daysRented > 3){
			result += (daysRented - 3) * 1.5;
		}
		return result;
	}
	
	int getFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? 2 : 1;
	}

}
