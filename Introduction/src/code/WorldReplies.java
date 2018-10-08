package code;
import java.util.*;

public class WorldReplies {
	//String Reply;
	
	public WorldReplies() {
		//Reply = "test";
	}
	
	public String reply(String repley) {
		return ("This is what you said:" + repley);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WorldReplies wr = new WorldReplies();
		System.out.println("Say something!");
		String Reply = sc.nextLine();
		System.out.println(wr.reply(Reply));
		sc.close();
	}
}
