class CircleWithRadiusException{
 private double radius;
 private static int numberOfObjects = 0;
	
 public CircleWithRadiusException(){}
	
 public CircleWithRadiusException(double newRadius){
	 setRadius(newRadius);
	 numberOfObjects++;
	 }

 public double getRadius(){
		return radius;
		}

 public void setRadius(double newRadius) throws IllegalArgumentException{
	 
	if(newRadius > 0 && newRadius < 100)
		 radius = newRadius;
	else
		 throw new IllegalArgumentException("Radius cannot be negative");
	 }
	
 public static int getNumberOfObjects(){
	 	return numberOfObjects;
		 }
	 }
	
 public class TestCircleWithRadiusException{
	 public static void main(String[] args){
		 try{
			 CircleWithRadiusException c1 = new CircleWithRadiusException(-5);
			 CircleWithRadiusException c2 = new CircleWithRadiusException(0);
			 CircleWithRadiusException c3 = new CircleWithRadiusException(200);
			 }
		 catch(IllegalArgumentException ex){
			System.out.println("ex");
			}
	System.out.println("Number of objects created: "+CircleWithRadiusException.getNumberOfObjects());
		 }
 }