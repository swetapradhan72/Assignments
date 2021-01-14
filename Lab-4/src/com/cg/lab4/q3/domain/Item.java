package com.cg.lab4.q3.domain;

public abstract class Item {
	/**
	 * id of book
	 */
  private int id;
  /**
   * title of book
   */
  private String title;
  /**
   * no. of copies of book
   */
  private int noOfCopies;
 ;
  public Item() {
	  id=0;
	  title=" ";
	  noOfCopies=0;
  }
  /**public Item(int id,String title, int noOfCopies) {
	  id=id;
	  title=title;
	  noOfCopies=noOfCopies;
  }**/
  public int getId() {
	return id;
  }
  public void setId(int id) {
	this.id = id;
 }
  public String getTitle() {
	return title;
 }
  public void setTitle(String title) {
	this.title = title;
 }
  public int getNoOfCopies() {
	return noOfCopies;
 }
  public void setNoOfCopies(int noOfCopies) {
	this.noOfCopies = noOfCopies;
 }
  /**
   * 
   * @param id of book
   * @param title of book
   * @param noOfCOpies of book
   */
 public void addItem(int id,String title,int noOfCOpies) {
	setId(id);
	setTitle(title);
	setNoOfCopies(noOfCopies);
 }
 /**
  * check in method to find out the no. of copies
  */
 public void checkIn() {
	 noOfCopies= noOfCopies+1;
 }
 /**
  * check out method to find out the no. of copies
  */
  public void checkOut() {
	 noOfCopies= noOfCopies-1;
 }
  /**
   * covert to string method
   */
  public String toString() {
	return "ID : "+id+ "Title : "+title+ "Number of Copies : "+noOfCopies;
	 
 }
  /**
   * print the details 
   */
  public void print() {
	 System.out.println("ID : "+id);
	 System.out.println("Title : "+title);
	 System.out.println("Number of Copies : "+noOfCopies);
 }
  /**
   * adding item 
   */
  public void addItem() {
	 noOfCopies++;
 }
}
