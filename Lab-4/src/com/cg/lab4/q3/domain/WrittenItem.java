package com.cg.lab4.q3.domain;

public abstract class WrittenItem extends Item {
    private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int getId() {
		return super.getId();
	}

	@Override
	public void addItem(int id, String title, int noOfCOpies) {
		super.addItem(id, title, noOfCOpies);
	}

	@Override
	public String getTitle() {
		return super.getTitle();
	}

	@Override
	public int getNoOfCopies() {
		return super.getNoOfCopies();
	}
		public boolean equals(Object obj) {
			if(obj==null) {
				return false;
			}
			WrittenItem wt=(WrittenItem) obj;
			return super.equals(wt)&& author==wt.author;
			
		}
	}

