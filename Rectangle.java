
public class Rectangle extends Polygon {
	
	private double height, width;
	
	public Rectangle(String id, double height, double width) {
		super(id);
		this.height = height;
		this.width = width;
	}

	@Override
	public double getArea() {
		return height * width;
	}

	@Override
	public double getPerimeter() {
		return 2 * height + 2 * width;
	}

	@Override
	public String getShapeType() {
		return "Rectangle";
	}

}
