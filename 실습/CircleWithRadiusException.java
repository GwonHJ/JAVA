class TCWRE {
 public static void main(String args[]) {
 try {
	 CircleWithRadiusException c1 = new CircleWithRadiusException(210);
	 CircleWithRadiusException c2 = new CircleWithRadiusException(0);
	 CircleWithRadiusException c3 = new CircleWithRadiusException(200);
	 }

	catch (IllegalArgumentException ex) {
		 System.out.println(ex); }
	System.out.println("Number of objects created :"+CircleWithRadiusException.getNumberOfObjects()); } 
}

public class CircleWithRadiusException {
 private double radius;
 private static int numberOfObjects = 0;

 public CircleWithRadiusException() { }
 
 public CircleWithRadiusException(double newRadius) {
	 setRadius(newRadius);
	 numberOfObjects++; }

 public void setRadius(double newRadius) throws IllegalArgumentException {
	 
	if(newRadius>0&&newRadius<100)
		 radius = newRadius;
	else if(newRadius<=0) throw new IllegalArgumentException("Radius cannot be negative");
 	 
	else throw new IllegalArgumentException("Radius cannot be larger than 100"); }

public static int getNumberOfObjects() { 
	return numberOfObjects; }
}