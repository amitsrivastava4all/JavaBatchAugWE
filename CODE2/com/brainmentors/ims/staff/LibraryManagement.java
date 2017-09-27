package com.brainmentors.ims.staff;

public class LibraryManagement {
	private int noOfBooks;
	public LibraryManagement(){
		noOfBooks = 1000;
	}
	public void provideBooks(){
		FeesCollection f = new FeesCollection();
		
		System.out.println("Books Provide...."+f.pendingFees);
		
	}

}
