package pack1;

public class A {
	void meth1() {
		System.out.println("class A meth1");
	}
	A(){
		System.out.println("A class constructor");
	}
	A(String s){
		this();
		System.out.println(s);
	}
}
