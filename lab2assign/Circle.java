package lab2assign;

public class Circle {
	 private double radius;
	    private String color;


	public Circle() {  
	   radius = 1.0;
	   color = "red";
	}


	public Circle(double r) {  
	   radius = r;
	   color = "red";
	}

	/** Returns the radius */
	public double getRadius() {
	  return radius;
	}

	/** Returns the area of this Circle instance */
	public double getArea() {
	   return radius*radius*Math.PI;
	}
	}

