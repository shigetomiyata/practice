public class Book extends TangleAsset{
	private String isbn;
	public Book(String name, int price, String color, String isbn){
		super (name, price, color);
		this = isbn;
	}
	public String getIsbn(){return this.isbn;}
}
