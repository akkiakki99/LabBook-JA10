package com.capg.lab4ex3;

public class Book extends WrittenItem {

	public Book(int uID, String title, int copies, String author) {
		super(uID, title, copies, author);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	
	public void print() {
		// TODO Auto-generated method stub
	}

	public void checkin() {
		// TODO Auto-generated method stub
	}


	public void checkout() {
		// TODO Auto-generated method stub
	}


	public void addItem() {
		// TODO Auto-generated method stub
	}

}
