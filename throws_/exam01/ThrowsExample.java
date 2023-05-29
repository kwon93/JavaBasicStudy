package throws_.exam01;

public class ThrowsExample {

	public static void main(String[] args){
		
			try {
				findClass();
			} catch (ClassNotFoundException e) {
				System.out.println("그런 Class 없다.");
			
			}
		
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String");
	}

}
