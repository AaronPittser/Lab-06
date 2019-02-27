
public class Square extends Rectangle {
	
	private double size;
	
	public Square(String id, double size) {
		super(id, size, size);
	}

	@Override
	public double getArea() {
		return size * size;
	}

	@Override
	public double getPerimeter() {
		return size * 4;
	}

	@Override
	public String getShapeType() {
		return "Square";
	}

}
