class Mall{
	String name;
	int noOfStores;
	int noOfProducts;
	String nameOfOwner;
	String productName;
	float price;
	String location;
	
	Mall(String name)
	{
		System.out.println("invoking String const of mall");
		this.name="name";
	}
	Mall(String name,int noOfStores)
	{
		
		this(name);
		this.noOfStores=noOfStores;
		System.out.println("invoking String,int const of mall");
	}
	Mall(String name,int noOfStores,int noOfProducts)
	{
		
		this(name,noOfStores);
		this.noOfProducts=noOfProducts;
		System.out.println("invoking String,int and int const of mall");
	}
	Mall(String name,int noOfStores,int noOfProducts,String nameOfOwner)
	{
		
		this(name,noOfStores,noOfProducts);
		this.nameOfOwner="nameOfOwner";
		System.out.println("invoking String,int int String const of mall");
	}
	Mall(String name,int noOfStores,int noOfProducts,String nameOfOwner,String productName)
	{
		
		this(name,noOfStores,noOfProducts,nameOfOwner);
		this.productName="productName";
		System.out.println("invoking String,int int String and String const of mall");
	}
	Mall(String name,int noOfStores,int noOfProducts,String nameOfOwner,String productName,float price)
	{
		
		this(name,noOfStores,noOfProducts,nameOfOwner,productName);
		this.price=price;
		System.out.println("invoking String,int int String and String and float const of mall");
	}
	Mall(String name,int noOfStores,int noOfProducts,String nameOfOwner,String productName,float price,String location)
	{
		
		this(name,noOfStores,noOfProducts,nameOfOwner,productName,price);
		this.location="location";
		System.out.println("invoking String,int int String and String and float  and location const of mall");
	}
	
	
	
}