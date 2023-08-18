class Example00
{
	int x;
	void m1(){
		System.out.println("from m1 x: "  + x);
		x = 30;
		System.out.println("from m1 x: "  + x);
	}

	void m2(){
		System.out.println("from m2 x: "  + x);
	}
}
class Test00 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Example00 e1 = new Example00();
		Example00 e2 = new Example00();

		System.out.println(e1.x);
		e1.m1();
		e1.m2();
	}
}
