package graphFactory;

public class Triangle implements Graph {
	private String name;
	private double a;
	private double h;
	
	public Triangle() {
		this.name = "Triangle";
		this.a = 0;
		this.h = 0;
	}
	public Triangle(double a, double h) {
		this.name = "Triangle";
		this.a = a;
		this.h = h;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getArea() {
		return this.a * this.h / 2;
	}
}
