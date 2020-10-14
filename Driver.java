public class Driver {

	public static void main(String [] arg){

		//Fish actually is a data type
		Fish nemo = new Fish(); //nemo is a object, fish is a class
		nemo.Swim();
		nemo.color = "red";
		nemo.Swim();

		Fish dory = new Fish();
		dory.Swim();
		dory.color = "green";
		dory.Swim();
		}
}