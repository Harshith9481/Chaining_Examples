class PowerSupply{
	public static void main(String[] args)
	{
	System.out.println("invoking main in PowerSupply");
	Power power=new Power(230,110,200,25000);
	Power.printstatic();
	power.printinstance();
	}
}