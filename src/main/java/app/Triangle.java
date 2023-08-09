package app;

public class Triangle {
	
	    private double side1;
	    private double side2;
	    private double side3;
	    
	    //Constructor 
	    public Triangle(double side1, double side2, double side3) {
	        this.side1 = side1;
	        this.side2 = side2;
	        this.side3 = side3;
	    }

	    // showType() method
	    public String showType() {
	        if (side1 == side2 && side2 == side3) {
	            return "Equilateral";
	        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
	            return "Isosceles";
	        } else {
	            return "Scalene";
	        }
	    }

}
