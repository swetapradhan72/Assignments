package com.cg.lab4.q3.util;

import java.util.Scanner;

import com.cg.lab4.q3.domain.Book;
import com.cg.lab4.q3.domain.Cd;
import com.cg.lab4.q3.domain.Item;
import com.cg.lab4.q3.domain.JournalLetter;
import com.cg.lab4.q3.domain.MediaItem;
import com.cg.lab4.q3.domain.Video;
import com.cg.lab4.q3.domain.WrittenItem;

public class ItemUtil {
     
	public void start() {
		Scanner sc=new Scanner(System.in);
		show();
		System.out.println("Enter your choice :");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Item item=new Book();
			item.getId();
			item.setTitle("Java OOPS");
			item.setNoOfCopies(20);
			item.addItem();
			item.print();
			break;
		case 2:
			WrittenItem w=new JournalLetter();
			JournalLetter j=new JournalLetter();
			w.setAuthor("Sweta");
			j.setPubYear(1990);
			w.addItem(w.setId(sc.nextInt()),w.setTitle(sc.next()),w.setNoOfCopies(sc.nextInt()));
			w.print();
			System.out.println("Author name : "+w.getAuthor());
			System.out.println("Published in : "+j.getPubYear());
			break;
		case 3:
			MediaItem med= new Cd();
			Video v=new Video();
			med.setRunTime(40);
			v.setDirector("Yashraj");
			v.setGenre("T=series");
			v.setYear(2000);
			System.out.println("Run time- "+v.getRunTime());
			System.out.println("Director "+v.getDirector());
			System.out.println("Genre "+v.getGenre());
			break;
		case 4:
			System.exit(0);
			break;
		}
		}
	public void show() {
		System.out.println("1. Book Details");
		System.out.println("2. Journal Details");
		System.out.println("3. Media Details");
		System.out.println("4. Exit");
	}

}
