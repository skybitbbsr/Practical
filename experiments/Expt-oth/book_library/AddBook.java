package book_library;
import java.util.*;
public class AddBook {
	BookList newbook= new BookList();
	
	public AddBook(){
	
	newbook.createbookdetails();
	newbook.display();
	ArrayList<BookList> booklist=new ArrayList<BookList>();
	booklist.add(newbook);
	

	}

}
