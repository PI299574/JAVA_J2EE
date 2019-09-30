package Immutable;

public class Book {

	 private String bookname ;

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	@Override
	public String toString() {
		return "Book [bookname=" + bookname + "]";
	}
	 
	 
	 
}
