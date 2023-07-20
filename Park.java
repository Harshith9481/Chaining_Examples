class Park{
	
	String name;
	String location;
	String area;
	int price;
	int acres;
	int noOfChair;
	int noOfGameActivity;
	int noOfTrees;
	int noOfPeople;
	
	Park(String name)
	{
		this.name="name";
		System.out.println("invoking String const of park");
	}
	Park(String name,String location)
	{
		this(name);
		this.location="location";
		System.out.println("invoking String and String const of park");
	}
	Park(String name,String location,String area)
	{
		this(name,location);
		this.area="area";
		System.out.println("invoking String,String and String const of park");
	}
	Park(String name,String location,String area,int price)
	{
		this(name,location,area);
		this.price=price;
		System.out.println("invoking String,String and String and int const of park");
	}
	Park(String name,String location,String area,int price,int acres)
	{
		this(name,location,area,price);
		this.acres=acres;
		System.out.println("invoking String,String,String,int and int const of park");
	}
	Park(String name,String location,String area,int price,int acres,int noOfChair)
	{
		this(name,location,area,price,acres);
		this.noOfChair=noOfChair;
		System.out.println("invoking String,String,String,int,int and int const of park");
	}
	Park(String name,String location,String area,int price,int acres,int noOfChair,int noOfGameActivity)
	{
		this(name,location,area,price,acres,noOfChair);
		this.noOfGameActivity=noOfGameActivity;
		System.out.println("invoking String,String,String,int,int,int and int const of park");
	}
	Park(String name,String location,String area,int price,int acres,int noOfChair,int noOfGameActivity,int noOfTrees)
	{
		this(name,location,area,price,acres,noOfChair,noOfGameActivity);
		this.noOfTrees=noOfTrees;
		System.out.println("invoking String,String,String,int,int,int,int and int const of park");
	}
	Park(String name,String location,String area,int price,int acres,int noOfChair,int noOfGameActivity,int noOfTrees,int noOfPeople)
	{
		this(name,location,area,price,acres,noOfChair,noOfGameActivity,noOfTrees);
		this.noOfPeople=noOfPeople;
		System.out.println("invoking String,String,String,int,int,int,int,int and int const of park");
	}
	
	
}