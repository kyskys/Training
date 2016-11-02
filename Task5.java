import java.util.Random;


public class Task5 {

	final static Random r = new Random();
	public static int random (){
		String s = "";
		for(int i = 0;i<3;++i){
			s.concat(String.valueOf(r.nextInt(9)));
			}
		return Integer.valueOf(s);
	}
	public static void main(String[] args) {
		System.out.println(Integer.valueOf((random()+""+random()))/random());
	}

}
