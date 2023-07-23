class Candle{
	
	static String candleWax;
	static String Color;
	int temp;
	String Shape;
	
	Candle(String candleWax,String Color,int temp,String Shape)
	{
		System.out.println("invoking main in String of candle");
		this.candleWax=candleWax;
		this.Color=Color;
		this.temp=temp;
		this.Shape=Shape;
		
	}
	static
	{candleWax="candleWax";
		Color="Color";
		System.out.println("invoking main in String of candle");
	}
	static void printstatic()
	{
		System.out.println("invoking  static void main in Candle");
		System.out.println(candleWax);
		System.out.println(Color);
		
	}
	void printinstence()
	{
		System.out.println("invoking void main instance in Candle");
		System.out.println(temp);
		System.out.println(Shape);
	}
}