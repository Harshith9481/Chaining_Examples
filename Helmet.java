class Helmet{
	
	static String brand;
	static String GSTno;
	float price;
	String color;
	
	Helmet(String brand,String GSTno,float price,String color)
	{
		System.out.println("invoking main on String and String brand");
		this.brand=brand;
		this.GSTno=GSTno;
		this.price=price;
		this.color=color;
	}
	static
	{
		brand="vigo";
		GSTno="24AVLPB0268R1Z9";
		System.out.println("invoking main in helmet");
		
	}
	static void printstatic()
	{
		System.out.println("invoking  static void main in helmet");
		System.out.println(brand);
		System.out.println(GSTno);
		
	}
	void printinstance()
	{
		System.out.println("invoking void main instance in helmet");
		System.out.println(price);
		System.out.println(color);
	}
		
		
	
}