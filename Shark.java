public class Shark extends Fish {
	private int sharpTeeth = 50;

	public void Eat(){
		System.out.println("eat with " + sharpTeeth + " number of teeth");
	}

	public void SetSharpteeth(int teeth){
		sharpTeeth = teeth; 
	}
}