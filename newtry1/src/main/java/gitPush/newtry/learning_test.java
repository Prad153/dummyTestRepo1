package gitPush.newtry;

import org.testng.Assert;
import org.testng.annotations.Test;


public class learning_test {

	
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
<<<<<<< HEAD:newtry/src/main/java/gitPush/newtry/learning_test.java
	//	Assert.assertFalse(true);
=======
		Assert.assertFalse(false);
>>>>>>> c0c89b5f928408c77c84140e6d7868705854db18:newtry1/src/main/java/gitPush/newtry/learning_test.java
		
	}
}
