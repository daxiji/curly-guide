package graphFactory;

public class Main {
	public static void main(String[] args) {
		String graphType = "Circle";
		Graph g = Factory.creatGraph(graphType);
		System.out.println("The Area of " + g.getName() + " is " + g.getArea());
	}
}
