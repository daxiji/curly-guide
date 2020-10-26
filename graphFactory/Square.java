package graphFactory;

public class Square implements Graph {
	private String name;
	private double a;
	
	public Square() {
		this.name = "Square";
		this.a = 0;
	}
	
	public Square(double a) {
		this.name = "Square";
		this.a = a;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getArea() {
		return Math.pow(this.a, 2);
	}
}
