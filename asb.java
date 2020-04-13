package test;

abstract class abstractclass
{
	abstract int disp();
	void disp2()
	{
		System.out.println("Abstract Class");
	}
}
public class asb extends abstractclass implements one{
	
	public int disp()
	{
		System.out.println("test.disp");
		return 0;
		//System.out.println("Concrete class");
		
	}
	public static void main(String[] args) {
		asb object = new asb();
		object.disp();
		object.disp2();
		System.out.println(object.year);
	}
	@Override
	public void method1() {
		
		
	}
	@Override
	public void method2() {
		
		
	}
		
	

}

