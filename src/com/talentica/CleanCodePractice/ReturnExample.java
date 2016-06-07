package com.talentica.CleanCodePractice;

public class ReturnExample {

	public static void main(String[] args) {
		System.out.println(" The result returned by isEligible is " + isEligible(1));
		System.out.println(" The result returned by isEligible2 is " + isEligible2(50));	
		System.out.println(" The result returned by isEligible3 is " + isEligible3(50));	
		System.out.println(" The result returned by isEligible4 is " + isEligible4(50));
		System.out.println(" The result returned by isEligible5 is " + isEligible5(50));
	}

	//Bad Code as it has multiple exit point
	private static boolean isEligible(int age){
		  if(age > 18){
		    return true;
		  }else{
		    return false;
		  }
		}
	
	//Good Code as it has only one return
	private static boolean isEligible2(int age){
		  boolean result;
		  if(age > 18)
		    result = true;
		  else
		    result = false;
		  return result;
		}
	
	//Better Code as if else blocks are removed.
	private static boolean isEligible3(int age){
		  return age > 18;
		}
	
	//Better Code as curly braces  are provided around block statements.
	private static boolean isEligible4(int age){
		if(age > 18){
			  return true;
			}else {
			  return false;
			}
		}
	
	//Better Code as method parameters are marked as final, wherever applicable.
		private static boolean isEligible5(final int age){
			  return age > 18;
					}
}
