package com.capg.lab4ex3;

public abstract class Item 
{
   private int UID;
   private String title;
   private int copies;
   
public Item(int uID, String title, int copies) {
	super();
	UID = uID;
	this.title = title;
	this.copies = copies;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + UID;
	result = prime * result + copies;
	result = prime * result + ((title == null) ? 0 : title.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Item other = (Item) obj;
	if (UID != other.UID)
		return false;
	if (copies != other.copies)
		return false;
	if (title == null) {
		if (other.title != null)
			return false;
	} else if (!title.equals(other.title))
		return false;
	return true;
}
@Override
public String toString() {
	return "Item [UID=" + UID + ", title=" + title + ", copies=" + copies + ", hashCode()=" + hashCode()
			+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
}
public int getUID() {
	return UID;
}
public void setUID(int uID) {
	UID = uID;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getCopies() {
	return copies;
}
public void setCopies(int copies) {
	this.copies = copies;
}
   
   public void print()
   {
	   System.out.println("Unique Identification Number :" + UID);
	   System.out.println("Title :" + title);
	   System.out.println("Copies :" + copies);
   }
   
   public void checkin()
   {
	   
   }
   
   public void checkout()
   {
	   
   }
   
   public void addItem()
   {
	   
   }
}
