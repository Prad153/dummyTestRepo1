package gitPush.newtry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class learning_test {

//	public static void main(String[] args) {
	
	@Test
	public void calci() {
		int a=5, b = 10 ;
		System.out.println("sum of a+b: " +(a+b) );
		System.out.println("sum of a+b: " +(a-b) ); //changed in folder level
		System.out.println("1 main end");
				
	}

	@Test
	public void codedInGit(){
		System.out.println("Added this method in Git" );
	}
	
	@Test
	public void assertMethod() {
		System.out.println("Inside assertMethod - 7+2: "+ (7+2) );
		Assert.assertFalse(false);
		
	}
}
