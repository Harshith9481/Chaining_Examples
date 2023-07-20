class Wood{
	String name;
	char size;
	String strength;
	String color;
	String smell;
	
	Wood(String name)
	{
		System.out.println("invoking String const of Wood");
		this.name=name;
		
	}
	Wood(String name,char size)
	{
		this(name);
		this.size=size;
		System.out.println("invoking String, char const of Wood");
	}
	Wood(String name,char size,String strength)
	
	{
		this(name,size);
		this.strength="strength";
		System.out.println("invoking String,char and String const of Wood");
	}
	Wood(String name,char size,String strength,String color)
	
	{
		this(name,size,strength);
		this.color="color";
		System.out.println("invoking String,char String and String const of Wood");
	}
	Wood(String name,char size,String strength,String color,String smell)
	
	{
		this(name,size,strength,color);
		this.smell="smell";
		System.out.println("invoking String,char String String and String const of Wood");
	}
}