import java.util.*;
interface Polygon{
	default void getPerimeter(int sides[]){
		
		double perimeter=0;
		
		if(sides.length==1){
			
			perimeter=2*3.141593*sides[0];
		}
		else
			for(int i=0;i<sides.length;i++){
				
				perimeter+=sides[i];
			}
	
		System.out.println("Perimeter of the polygon is:" + perimeter);
	}


	 void getArea(double a);
}

class Circle implements Polygon{
			
	 public void getArea(double r){
		System.out.println("Area of circle is: " +(r*3.141593*r));
	}
}

class Square implements Polygon{
		
		public void getArea(double length){
		System.out.println("Area of rectangle is: " +(length*length));
	}
}

class Main{
	public static void main(String [] args){
		Circle c1= new Circle();
		int m[]={5};
		c1.getPerimeter(m);
		c1.getArea(5);
		Square r1= new Square();
		int sides[]={5,5,5,5};
		r1.getPerimeter(sides);
		r1.getArea(5);
    System.out.println("Name:Crevan Neil Fernandes");
    System.out.println("USN:1BM23CS082");

	}
}
