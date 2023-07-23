class HelmetSafe{
public static void main(String[] args)
{
System.out.println("invoking main in method HelmetSafe");

Helmet helmet=new Helmet("vigo","24AVLPB0268R1Z9",1990f,"white");
Helmet.printstatic();
helmet.printinstance();
}

}