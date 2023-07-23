class Soil{
	static String color;
	static String name;
	String crop;
	int temp;
	
	Soil(String color,String name,String crop,int temp)
	
	{
		System.out.println("invoking main in Soil");
		this.color=color;
		this.name=name;
		this.crop=crop;
		this.temp=temp;
	}
	static 
	{
		
		color="color";
		name="name";
	}
	static void printstatic()
	{
		System.out.println("invking main in soil");
		System.out.println(name);
		System.out.println(color);
	}
	void printinstance()
	{
		System.out.println("invking main in soil");
		System.out.println(crop);
		System.out.println(temp);
	}
	
}