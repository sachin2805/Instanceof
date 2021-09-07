class A{}
class B{}
class C extends A{}
class D extends A{}

public class Instanceof {

	public static void main(String[] args) {
	 boolean m;
	 
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		m= a instanceof A;
		System.out.println(m);   // Using instanceof
		
		//----------- USING instanceof ------------       (whatever key use before instanceof keyword is compare with whatever key present after the instanceof key word is it if chiled object of class then print true otherwise false )
		System.out.println(a instanceof Object);
	System.out.println(b instanceof Object);
//		System.out.println(b instanceof A); //Error   (if object (b) and class (A) is present in different herarchi then throw the error)
		System.out.println(c instanceof A);
		System.out.println(c instanceof Object);
		System.out.println(a instanceof C);
		System.out.println(a instanceof D);
		}

}
