package pack1;

public class B extends A{
	void meth2() {
		System.out.println("class B meth2");
		super.meth1();
	}
	void meth3() {
		System.out.println("meth3()called");
	}
	B(){
		super("java is awesome");
		System.out.println("B default constructor");
		super.meth1();
		this.meth3();
	}
	B(int a){
		System.out.println("B parameterized constructor");
	}
	
	public static void main(String args[]) {
		B obj=new B();
		//obj.meth1();
		obj.meth2();
		
	}
	
}
