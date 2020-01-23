package Day3Assignment;


public class BookAuthorDetails {

	private int author_id;
	private String author_name;
	private String address;

	
public BookAuthorDetails() { }
	

public BookAuthorDetails(int author_id, String author_name, String address) {
	super();
	this.author_id = author_id;
	this.author_name = author_name;
	this.address = address;
	
	
	
}


public int getAuthor_id() {
	return author_id;
}


public void setAuthor_id(int author_id) {
	this.author_id = author_id;
}


public String getAuthor_name() {
	return author_name;
}


public void setAuthor_name(String author_name) {
	this.author_name = author_name;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}




	@Override
	public String toString() {
		return "\n author id is :: " +author_id+" author is:: "+author_name+"  address is: "+address;
	}
}