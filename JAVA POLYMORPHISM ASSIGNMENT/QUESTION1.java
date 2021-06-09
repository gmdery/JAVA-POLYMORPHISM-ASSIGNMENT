
public class Shape {
/**  The Superclass shape has the common properties of all shapes*/
 
	 //private member variable
	 String color;
	 
	 /** Construction of a shape instance with a given color */
	  Shape (String color) {
		 this.color = color;
	 }
   /**  Expect to return a self descriptive string*/
	 public String toString() {
		 return "Shape[color=" + color + "]";
	 }
		 /**We want all shapes to provide a method called getArea() */
	    public double getArea() {
	    	System.err.println("What shape is it! Otherwise cannot compute area!");
	    	return 0;
	    }
	 }
	 /** The Rectangle class which is a subclass of Shape */
   class Rectangle extends Shape {
	   private int length, width;
	   
	/** Construction of a Rectangle instance from a given color, lengt and width*/
	  Rectangle(String color, int length, int width) {
	 super(color);
	 this.length = length;
	 this.width = width;
	  }
 /**Expect to returns a self-descriptive string */
	 public String toString() {
		 return "Rectangle[length=" + length + ",width=" + width + "," + super.toString() +	"]"; }
	 
   /** Overriding the inherited getArea() to provide the proper implementation for Rectangle */
   public double getArea() {
	   return length*width;
   }
   }
	/**The Triangle class is a subclass of Shape */
   class Triangle extends Shape {
	   // Private member variables
	    int base, height;
	   
   /** Construction of a Triangle instance with a given color,base and height */
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	/** Expect to returns a self-descriptive string */
	public String toString() {
		return "Triangle[base=" + ",height=" + height + "," + super.toString() + "]";
		}
			/** Overriding the inherited getArea() to provide the proper implementation for Triangle */
	public double getArea() {
		return 0.5*base*height;
	}
	}
   /** Inserting a test driver for shape and its subclasses */
    class TestShape {
	   public static void main(String[] args) {
		   Shape s1 = new Rectangle("Grey", 6, 8);  
		   System.out.println(s1);  //Run Rectangle's getArea()
		   System.out.println("Area is " + s1.getArea()); //Run Triangle's getArea()
		   
		   Shape s2 = new Triangle("Sea Blue", 6, 8);  
		   System.out.println(s2);  //Run Triangle's getArea()
		   System.out.println("Area is " + s2.getArea()); //Run Triangle's getArea()
		  
		   Shape s3 = new Shape("green");
		   System.out.println(s3);
		   System.out.println("Area is " + s3.getArea());
	   }
   
}



