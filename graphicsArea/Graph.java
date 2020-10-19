package graphicsArea;

abstract class Graph{
	public String name;
	public abstract double getArea();
}

class Circle extends Graph{
	public String name;
	private double radius;
	
	public Circle() {
		this.name = "Circle";
		this.radius = 0;
	}
	public Circle(double r) {
		this.name = "Circle";
		this.radius = r;
	}
	
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
}

class Rectangle extends Graph{
	public String name;
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
	
	public double getArea() {
		return this.a * this.b;
	}
}

class Square extends Graph{
	public String name;
	private double a;
	
	public Square() {
		this.name = "Square";
		this.a = 0;
	}
	public Square(double a) {
		this.name = "Square";
		this.a = a;
	}
	
	public double getArea() {
		return Math.pow(this.a, 2);
	}
}

class Triangle extends Graph{
	public String name;
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
	
	public double getArea() {
		return this.a * this.h / 2;
	}
}
