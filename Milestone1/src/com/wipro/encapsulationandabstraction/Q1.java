package com.wipro.encapsulationandabstraction;

class Author
{
	String name;
	String email;
	char gender;
	
	Author(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
		
	}
}
class Book
{
	String name;
	Author author;
	double price;
	int qtyInStock;
	
	Book(String name,Author author,double price,int qtyInStock)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setAuthor(Author author)
	{
		this.author=author;
	}
	void setPrice(double price)
	{
		this.price=price;
	}
	void setQtyInStock(int qtyInStock)
	{
		this.qtyInStock=qtyInStock;
	}
	String getName()
	{
		return name;
	}
	Author getAuthor()
	{
		return author;
	}
	double getPrice()
	{
		return price;
		
	}
	int getQtyInStock()
	{
		return qtyInStock;
	}
}
public class Q1 {
	
	public static void main(String[] args) {
		
		Author auth=new Author("Jenkins Reid","jenkinsreid@gmail.com",'f');
		//To initialize the book using parameterized constructor:
		Book b=new Book("The seven husbands of evelyn hugo",auth,700,12);
		
		System.out.println("Name of the book: "+b.getName());
		System.out.println("Author's name: "+b.getAuthor().name);
		System.out.println("Author's email address: "+b.getAuthor().email);
		System.out.println("Author's gender: "+b.getAuthor().gender);
		System.out.println("Price of the book: "+b.getPrice());
		System.out.println("Quantity of the book in stock: "+b.getQtyInStock());
	}

}
