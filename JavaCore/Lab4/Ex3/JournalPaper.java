package com.capg.lab4ex3;

public class JournalPaper extends WrittenItem{
    private int year_pub;
	public JournalPaper(int uID, String title, int copies, String author,int year) {
		super(uID, title, copies, author);
		year_pub = year;
	}
	public int getYear_pub() {
		return year_pub;
	}
	public void setYear_pub(int year_pub) {
		this.year_pub = year_pub;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("Year Published :" + year_pub);
	}
	@Override
	public void checkin() {
		// TODO Auto-generated method stub
		super.checkin();
	}
	@Override
	public void checkout() {
		// TODO Auto-generated method stub
		super.checkout();
	}
	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		super.addItem();
	}

	
}
