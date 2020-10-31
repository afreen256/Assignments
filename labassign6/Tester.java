package labassign6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tester {
	public static void main(String[] args) {
		
		Book book = new Book(1, " c", "abc");
		Book book1 = new Book(2, "java", "cde");
		Book book2 = new Book(3, "c++", "efg");
		Book book3 = new Book(4, "python","ghi");
		
		
		BookCollect bookCol = new BookCollect();
		bookCol.bookList.add(book);
		bookCol.bookList.add(book1);
		bookCol.bookList.add(book2);
		bookCol.bookList.add(book3);
		
		System.out.println("---------------before sorting---------------");
		printBooks(bookCol.bookList);
		
		
		Book bookUpdate = new Book("html", "ijk");
		bookCol.hasBook(bookUpdate);
		System.out.println("---------------after sorting by book title---------------");
		bookCol.sortByBookName();
		
		System.out.println("---------------after sorting by author ---------------");
		bookCol.sortByAuthor();
	}
	
	private static void printBooks(List<Book> bookList) {
		
		for(Book book: bookList) {
			System.out.println(book);
		}
	}


}
