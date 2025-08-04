package pkg7;

import java.util.ArrayList;

public class Library {
	ArrayList<Book>books = new ArrayList<>();
	public ArrayList<Book> getAllBooks(){
		return books;
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
}
