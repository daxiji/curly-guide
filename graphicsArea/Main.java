package graphicsArea;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph a = new Circle(1.0);
		Graph b = new Rectangle(2.0, 3.0);
		Graph c = new Square(2.0);
		Graph d = new Triangle(2.0, 2.0);
		
		Graph[] myGraph = {a, b, c, d};
		
		for(Graph g : myGraph) {
			System.out.println("The Area of " + g.name + " is " + g.getArea());
		}
	}

}