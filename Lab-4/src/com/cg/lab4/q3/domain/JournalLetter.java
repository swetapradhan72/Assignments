package com.cg.lab4.q3.domain;

public class JournalLetter extends WrittenItem{
       private int pubYear;

	public int getPubYear() {
		return pubYear;
	}

	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}
    public JournalLetter() {
    	   super();
       }
    public JournalLetter(int id,String title,int noOfCopies,String author,int pubYear) {
    	   super();
       }

	
	public String getAuthor() {
		return super.getAuthor();
	}

	@Override
	public int getId() {
		return super.getId();
	}

	@Override
	public String getTitle() {
		return super.getTitle();
	}

	@Override
	public int getNoOfCopies() {
		return super.getNoOfCopies();
	}

	@Override
	public void checkIn() {
		super.checkIn();
	}

	@Override
	public void checkOut() {
		super.checkOut();
	}

	@Override
	public void print() {
		super.print();
	}

	@Override
	public void addItem() {
		super.addItem();
	}
}

