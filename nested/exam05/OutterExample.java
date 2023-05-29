package nested.exam05;

public class OutterExample {
	public static void main(String[] args) {
		Outter o = new Outter();
		
		Outter.Nested n = o.new Nested();
		n.print(); 
	}
}
