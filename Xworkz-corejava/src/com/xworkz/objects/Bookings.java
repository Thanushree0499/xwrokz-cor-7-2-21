package com.xworkz.objects;

public class Bookings {
	String city;
	String eventName;
	int date;
	int priceOfTicket;
	String category;
	String language;
	String genre;
	String format;
	public void bookMovieTicket() {
		System.out.println("select the movie name "+eventName+" in the city "+city+ " language "+language+" genre "+genre+" format "+format+ "date "+date+" price of the ticket"+priceOfTicket);
	}
	public void bookEventTicket() {
		System.out.println("select the event name "+eventName+" in the city "+city+ " language "+language+ "date "+date+" price of the ticket"+priceOfTicket);
}
	public void bookplaysTicket() {
		System.out.println("select the play name "+eventName+" in the city "+city+ " language "+language+" genre "+genre+" category "+category+ "date "+date+" price of the ticket"+priceOfTicket);
	}
	public void bookonlineSportsTrainingTicket() {
		System.out.println("select the sport name "+eventName+" in the city "+city+ " category "+category+" date "+date+" price of the ticket"+priceOfTicket);
}
}
