package graphFactory;

public class Rectangle implements Graph {
	private String name;
	private double a;
	private double b;
	
	public Rectangle() {
		this.name = "Rectangle";
		this.a = 0;
		this.b = 0;
	}
	public Rectangle(double a, double b) {
		this.name = "Rectangle";
		this.a = a;
		this.b = b;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getArea() {
		return this.a * this.b;
	}
}
