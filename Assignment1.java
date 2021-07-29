
class Author{
	private String Name;
	private String Email;
	private char Gender;
	
	public Author(String Name, String Email, char Gender) {
		super();
		this.Name = Name;
		this.Email = Email;
		this.Gender = Gender;
	}
	public String getName() {
		return Name;
	}
	
	public String getEmail() {
		return Email;
	}
	public char getGender() {
		return Gender;
	}
	
	public String toString() {
		return (Name +" . His Email ID is: " + Email + " and the Gender is " + Gender + "]");
		}
}

class Book{
	private String name;
	private Author author;		//inherited from the upper class
	private double price;
	private int qtyInStock;
	
	public Book(String name, Author author, double price, int qtyInStock){
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	public String getname() {
		return name;
	}
	public Author getauthor() {
		return author;
	}
	public double getprice() {
		return price;
	}
	public int getqtyInStock() {
		return qtyInStock;
	}
	public void setprice() {
		this.price = price;
	}
	public void setqtyInStock() {
		this.qtyInStock = qtyInStock;
	}
	
	public String toString() {
		return ("BOOK [The name of the book is: " +name+ " by "+author+" qty in stock is "+qtyInStock+" with a price of "+price +"]");
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		Author author = new Author("hemant","hemant@gmail.com",'M');
		Book book = new Book("Jod",author,199,12);
		System.out.println(book);

	}

}
