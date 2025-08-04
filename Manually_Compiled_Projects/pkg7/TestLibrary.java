package pkg7;

public class TestLibrary {
	public static void main(String[] args) {
		Library lib1 = new Library();
		Book book1 = new Book("Gulliver's travels", "Jonathon Swift", "1234");
		lib1.addBook(book1);
		System.out.println(lib1.getAllBooks().get(0).name);
	}
}
