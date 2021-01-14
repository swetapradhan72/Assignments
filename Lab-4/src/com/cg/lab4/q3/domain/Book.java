package com.cg.lab4.q3.domain;

public  class Book extends WrittenItem{
     public Book() {
    	 super();
     }
     public Book(int id,String title,int noOfCopies) {
    	 super();
     }
     public boolean equals(Object ob) {
    	 if(ob==null) {
    		 return false;
    	 }
    	 Book b=(Book) ob;
		return super.equals(b);
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
	public void addItem(int id, String title, int noOfCOpies) {
		super.addItem(id, title, noOfCOpies);
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
		System.out.println("Display the details");
		super.print();
	}
	@Override
	public void addItem() {
		super.addItem();
	}
	
     
}
