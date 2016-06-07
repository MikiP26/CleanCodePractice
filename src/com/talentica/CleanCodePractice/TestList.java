package com.talentica.CleanCodePractice;

import java.util.ArrayList;
import java.util.List;

public class TestList {

   public static List<Character> getDigitsInString ( String string ) {

      // 'null' as input is not allowed!
      if ( string == null ) throw new IllegalArgumentException ( "Input cannot be null." );

      List<Character> result = new ArrayList<>();

      for ( char ch : string.toCharArray() ) {
         if ( Character.isDigit ( ch ) ) {
            result.add ( ch );
         }
      }
    
      //Bad Code
      if ( result.isEmpty() ) {
   	   return null;
   	} else {
   	   return result;
   	}
      
      //Good Code
      /*if ( result.isEmpty() ) {
    	   return Collections.<Character>emptyList();
    	} else {
    	   return Collections.unmodifiableList ( result );
    	}*/
   }

   public static void main ( String[] i_arguments ) {

      String s = "asd";
      List<Character> digits = getDigitsInString ( s );
      //System.out.println ( "Number of digits found in '" + s + "': " + digits.size() );
      if ( digits != null ) {
    	   System.out.println ( "Number of digits found in '" + s + "': " + digits.size() );
    	} else {
    	   System.out.println ( "Number of digits found in '" + s + "': 0" );
    	}
   }
}