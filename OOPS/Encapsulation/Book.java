package Encapsulation;

public class Book {
	
	private String BookName;
	private double Price;
	private int qtyInStock;



public Book(String bookName, double price, int qtyInStock) {
	super();
	BookName = bookName;
	Price = price;
	this.qtyInStock = qtyInStock;
}

public String getBookName() {
	return BookName;
}
public void setBookName(String bookName) {
	BookName = bookName;
}
public double getPrice() {
	return Price;
}
public void setPrice(double price) {
	Price = price;
}
public int getQtyInStock() {
	return qtyInStock;
}
public void setQtyInStock(int qtyInStock) {
	this.qtyInStock = qtyInStock;
}

@Override
public String toString() {
	return "Book [BookName=" + BookName + ", Price=" + Price + ", qtyInStock=" + qtyInStock + "]";
}
}
