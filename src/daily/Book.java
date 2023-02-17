/**
 * @author N'ZO LAGOU
 * 
 * @return name author price 
 */

package daily;

public class Book extends Author {
	// attribut
	private String name;
	private String author;
	private double price;
	private int qty;


	// constructor with parameter

	public Book(String name, String email, char gender, boolean isMale, String author, double price,
			int qty) {
		super(name, email, gender, isMale);
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty + "]";
	}

}
