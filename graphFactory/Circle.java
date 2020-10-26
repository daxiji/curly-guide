package graphFactory;

public class Circle implements Graph {
	private String name;
	private double radius;
	
	public Circle() {
		this.name = "Circle";
		this.radius = 0;
	}
	public Circle(double r) {
		this.name = "Circle";
		this.radius = r;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
}
