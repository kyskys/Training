import java.util.Random;


public class Task5 {

	final static Random r = new Random();
	public static int random (){
		return (int) ((Math.random()*100)+899);
	}
	public static void main(String[] args) {
		System.out.println(Integer.valueOf((random()+""+random()))/random());
	}

}
