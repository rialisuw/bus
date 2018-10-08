package test.resources;

public class Word {
	String value;
	
	public Word(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
 public static void main(String[] args) {
	Word testword = new Word("Haus");
	System.out.println(testword.getValue());
}
}
