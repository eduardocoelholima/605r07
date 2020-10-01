public class TestAllSolution {
	// draw the class diagram, including interface

	// Please check attached drawing.


	// why are these declararions legal?

	// variables are being declared using interface types, which is legal and
	// also has the benefit of allowing different classes instantiations to be
	// used in the future having the same functionality defined by the
	// interface.
	static I1	anI1	=	new C1();
	static I2	anI2	=	new C3();
	static I1	anI1a	=	new C2();
	static I1	anI1b	=	new C4();
	static I2	anI2a	=	new C4();

	// which methods will be called and why?
	public static void test1()	{

		// anI1 is a reference to a C1 object, which inherits from
		// AbstractClass. AbstractClass implements interface I1, thus C1 also
		// does. Method is invoked from C1 and prints a variable created in
		// interface I1.
		anI1.i1method();

		// anI1b is a reference to a C4 object, which does not
		// extend/inherits from any class, however implements both interfaces
		// I1 and I2. Method is invoked from C4 and prints a variable created
		// in interface I1.
		anI1b.i1method();

		// Same variable. Method is invoked from C4 and prints a variable
		// from interface I1 and another one from interface I2. Notice that
		// the variable name from I2 is the same as the one from I1, so a
		// fully qualified name needs the interface name specified as well:
		// "I2.i1and2variable".
		anI1b.i1and2method();

		// Same as the one before the previous one.
		anI1b.i1method();

		// anI2 is a reference to a C3 object, which inherits from/extends
		// AbstractClass. AbstractClass implements interface I1, thus C3 also
		// does. C3 also implements interface I2. Method is invoked from C3
		// without accessing any variable.
		anI2.i2method();

		// Same variable. Method is invoked from C3 and prints a variable
		// from interface I2 and another one from interface I1. Notice that
		// the variable name from I1 is the same as the one from I2, so a
		// fully qualified name needs the interface name specified as well:
		// "I1.i1and2variable".
		anI2.i1and2method();
	}
	// which methods will be called and why?
	public static void test2()	{
		C3 aC3 = new C3();
		C5 aC5 = new C5();
		C3 aaC3 = (C3)aC5;

		// aC3 is a reference to a C3 object, which extends AbstractClass
		// implements interface I2. Method is invoked from the C3 object and
		// prints a variable also from C3.
		aC3.c3andC5m();

		// aC5 is a reference to a C5 object, which extends C3. Since C3
		// implements interface I2. Method is invoked from the
		// C5 object and prints a variable also from C5. C3 has a
		// variable / field with the same name. There is also a method with
		// the same signature in C3, so C5 method implicitly overrides it.
		aC5.c3andC5m();

		// aaC3 is a C3 type variable, however it references a C5 object, so
		// there is an upcasting. In this case, the explicit casting could
		// have been removed without effect, resulting in the casting still
		// being done implicitly. Method is invoked from a C5 object, and
		// prints a variable also from the same object.
		aaC3.c3andC5m();

		// Same variable. In this case, the field is accessed directly, so
		// because the variable is of type C3, the C3 field is accessed (this
		// object has both fields created, what is known as field hiding).
		System.out.println("aaC3.c3andC5 = " + aaC3.c3andC5 );

		// Same field is changed in the C3-defined object field. Then the method
		// is invoked from the C5 object. Because C5 method access the field
		// from the C5 class definition, this one did not change, so the same
		// value is accessed as in the previous method call (before the
		// println line).
		aaC3.c3andC5 = 99999;
		aaC3.c3andC5m();

		// Finally, the field defined in class C3 is accessed since aaC3
		// variable was created with type C3. The fact that the variable
		// references a C5 object makes no difference.
		System.out.println("aaC3.c3andC5 = " + aaC3.c3andC5 );
	}
	public static void main(String[] args)	{
		test1();
		test2();
	}
	// give an example when you would use an abstract class but not an interface

	// If non static fields are required, an abstract class could not be
	// replaced by an interface.

	// give an example when you would use an interface but not an abstract class

	// When methods are expected to be implemented across a range of classes
	// that do not belong to the same inheritance subtree. Methods should
	// implement an expected behaviour defined by the method signature.

	// give an example when you have to use an interface

	// When a class needs to "inherit" from classes that do not belong to the
	// same class subtree, class inheritance could not be used.
}
