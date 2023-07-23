class Power{
	static int voltage;
	static int current;
	int unit;
	float price;
	
	Power(int voltage,int current,int unit,float price)
	{
		System.out.println("invoking main in Power");
		this.voltage=voltage;
		this.current=current;
		this.unit=unit;
		this.price=price;
	}
	static
	{
		voltage=voltage;
		current=current;
	}
	static void printstatic()
	{
		System.out.println("invoking main in Power");
		System.out.println(voltage);
		System.out.println(current);
	}
	void printinstance()
	{
		System.out.println("invoking main in  instance Power");
		System.out.println(unit);
		System.out.println(price);
	}
}