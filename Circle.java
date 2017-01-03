public class Circle
{
	private double radius;
	
	public Circle(double r) {
		radius = r;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String toString(){
		String s;
		s= "Radius:  " + getRadius() + "\nArea: " + getArea();
		return s;
	}
	
	public boolean equals(Circle otherCircle){
		if(radius == otherCircle.getRadius() && getArea() == otherCircle.getArea()){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean greaterThan(Circle otherCircle){
		if (getArea() > otherCircle.getArea()) {
			return true;
		}
		else return false;
	}
}