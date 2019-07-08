package OOPConceptPart1;

public class Singleton {

	// In OOP , a Singleton class is a Class that can have only one object(instance
	// of the class) at a time

	// How to design Singleton Class in Java:
	// 1) Make Constructor as Private
	// 2)Write a public static method (getInstance) that has return type of object
	// of this Singleton Class(Lazy Initialization)
	private static Singleton Singleton_instance = null;
	public String str;

	// diff bw Normal Class and Singleton Class

	// for Normal Class we use constructor whereas for Singleton Class we use
	// getInstance() method for instantiate

	private Singleton() {
		str = "I am using Singleton Class Pattern ";

	}

	public static Singleton getInstance() { // Lazy Initialization
		if (Singleton_instance == null)
			Singleton_instance = new Singleton(); // Initialize

		return Singleton_instance;
	}

	public static void main(String[] args) {

		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();

		x.str = (x.str).toUpperCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

		z.str = (z.str).toLowerCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

	}

}
