class Butterfly{
	String color;
	static int noOfWings;
	static String food;
	String place;
	
	Butterfly(String color,int noOfWings,String food,String place)
	{
		System.out.println("invoking main in butterfly");
		this.color=color;
		this.noOfWings=noOfWings;
		this.food=food;
		this.place=place;
		
	}
	static
	{
		food="holly blue";
		noOfWings=2;
		
	}
	static void printstatic()
	{
		System.out.println("invoking main in  static butterfly");
		System.out.println(food);
		System.out.println(noOfWings);
	}
	void printinstance()
	{
		System.out.println("invoking main in  instance butterfly");
		System.out.println(color);
		System.out.println(place);
	}
	
	
}