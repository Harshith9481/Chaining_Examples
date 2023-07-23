class Brick{
	static String name;
	static String strength;
	String material;
	String person;
	
	Brick(String name,String strength,String material,String person)
	{
		System.out.println("invking main in brick materials");
		this.name=name;
		this.strength=strength;
		this.material=material;
		this.person=person;
	}
	static
	{
		name="name";
		strength="strength";
	}
	static void printstatic()
	{
		System.out.println("invking main in brick materials");
		System.out.println(name);
		System.out.println(strength);
	}
	void printinstance()
	{
		System.out.println("invking main in brick materials");
		System.out.println(material);
		System.out.println(person);
	}
	
}