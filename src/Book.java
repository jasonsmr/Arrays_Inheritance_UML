//********************************************************************
//  Book.java       Author: Lewiftus
//
//  Represents a book. Used as the parent of a derived class to
//  demonstrate inheritance.
//********************************************************************

public class Book
{
	protected int pages = 1500;

	public Book (int p) {
		pages = p;
	}

	public Book() {
		super();
		pages = 300;
	}
	
	//----------------------------------------------------------------
	//  Pages mutator.
	//----------------------------------------------------------------
	public void setPages (int pages)
	{
		this.pages = pages;
	}
	//----------------------------------------------------------------
	//  Pages accessor.
	//----------------------------------------------------------------
	public int getPages ()
	{
		return pages;
	}
}
