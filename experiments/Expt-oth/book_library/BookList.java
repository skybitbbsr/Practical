package book_library;
import java.util.*;
public class BookList {
	Scanner sc =new Scanner(System.in);
	public String bookname;
	public String isbnno;
	public String publishername;
	public String publicationyear;
	public String authorname;
	public String designation;
	public String organisation;
	public String country;
	public BookList(){
		this.bookname=bookname;
		this.isbnno=isbnno;
		this.publishername=publishername;
		this.publicationyear=publicationyear;
		this.authorname = authorname;
		this.designation = designation;
		this.organisation = organisation;
		this.country = country;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getIsbnno() {
		return isbnno;
	}
	public void setIsbnno(String isbnno) {
		this.isbnno = isbnno;
	}
	public String getPublishername() {
		return publishername;
	}
	public void setPublishername(String publishername) {
		this.publishername = publishername;
	}
	public String getPublicationyear() {
		return publicationyear;
	}
	public void setPublicationyear(String publicationyear) {
		this.publicationyear = publicationyear;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getOrganation() {
		return organisation;
	}
	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void createbookdetails(){
		System.out.println("Enter book name");
		bookname=sc.next();
		System.out.println("Enter book isbn no");
		isbnno=sc.next();
		System.out.println("Enter book publisher name");
		publishername=sc.next();
		System.out.println("Enter book publication year");
		publicationyear=sc.next();
		System.out.println("Enter book Author name");
		authorname=sc.next();
		System.out.println("Enter book author designation");
		designation=sc.next();
		System.out.println("Enter book author organisation ");
		organisation=sc.next();
		System.out.println("Enter book outhor country");
		String c=sc.next();
		
	}
	public String display(){
		String bookinfo="book name="+bookname+
				"\n isbn no="+isbnno+" \n publisher name="+publishername+"\n publication year="+publicationyear+
				"\n author name="+authorname+"\n designation="+designation+"\n organisation="+organisation+"\n country="+country;
		return bookinfo;
	}
	

}
