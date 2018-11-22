package shit2;

public class BodyInfo {
	private static int i = 1;
	
	private int index = i++;
	private double weight;
	private double height;
	
	public BodyInfo(String height, String weight) {
		this.weight = Double.parseDouble(weight);
		this.height = Double.parseDouble(height);
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public int getIndex() {
		return index;
	}
}
