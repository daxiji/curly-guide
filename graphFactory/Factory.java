package graphFactory;

public class Factory {
	public static Graph creatGraph(String graphType) {
		switch (graphType) {
		case "Circle":
			return new Circle();
		case "Rectangle":
			return new Rectangle();
		case "Square":
			return new Square();
		case "Triangle":
			return new Triangle();
		default:
			throw new inexistException();
		}
	}
}
