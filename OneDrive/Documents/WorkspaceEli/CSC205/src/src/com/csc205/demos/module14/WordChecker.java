package src.com.csc205.demos.module14;

public class WordChecker {


public static void main(String[] args) {
	
	String testWord = "hello";
	boolean isAWord = Dictionary.contatins(testWord);
	
	System.out.println(testWord + (isAWord ? " is " : " is not") + "a word.");
	
}

}
