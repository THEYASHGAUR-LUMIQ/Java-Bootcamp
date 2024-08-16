import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;
import java.security.*;


public class Solution {

	public static void main(String[] args) throws Exception {
		DoNotTerminate.forbidExit();	

		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine().trim());
			Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private
            // Create an instance of the Inner class
            Solution.Inner inner = new Solution.Inner();
            o = inner.new Private();

            // Get the method and make it accessible
            Method method = o.getClass().getDeclaredMethod("powerof2", int.class);
            method.setAccessible(true);

            // Invoke the method and get the result
            String result = (String) method.invoke(o, num);
            System.out.println(result);
            
            

        
		System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
		
		}//end of try
		
		catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}//end of main
	static class Inner{
		private class Private{
			private String powerof2(int num){
				return ((num&num-1)==0)?"power of 2":"not a power of 2";
			}
		}
	}//end of Inner
	
}//end of Solution

class DoNotTerminate { //This class prevents exit(0)
	 
    public static class ExitTrappedException extends SecurityException {

		private static final long serialVersionUID = 1L;
    }
 
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}	
	
