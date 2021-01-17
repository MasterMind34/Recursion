public class Recursion
{

   static String indent = "";   
   static long count = 0;

   public static void main(String[] args)
   {
      count = 0;
      String possiblePal = "racecar";
      if( isPal(possiblePal) ) 
      {
         System.out.println( possiblePal + " is a palindrome!");
      }
      else
      {
         System.out.println( possiblePal + " is NOT a palindrome!");
      }
      System.out.println( "recursions = " + count );
      
      count  = 0;
      String s1 = "gattagtagttcagtgag";
      String s2 = "ggatgatgatggatcgg";
      String s3 = lcs(s1, s2);
      System.out.println( s1 + "\n" + s2 + "\nLCS = " + s3 );
      System.out.println( "recursions = " + count );
      
      count = 0;
      int s = 10;
      int n = 20;
      System.out.println( "Sum of all values from " + s + " to " + n + " is: " + sum(s, n) );
      System.out.println( "recursions = " + count );

      count = 0; 
      n = 12;
      System.out.println( "fibonacci(" + n + ") is: " + fibonacci(n) );
      System.out.println( "recursions = " + count );
      
      count = 0; 
      n = 12;
      System.out.println( "factorial(" + n + ") is: " + factorial(n) );
      System.out.println( "recursions = " + count );

      count = 0; 
      int r = 16;
      int c = 15;
      System.out.println( "minimum # of shortest paths from " + r + "," + c + " to 0,0 is: " + minPaths(r,c) );
      System.out.println( "recursions = " + count );
      
   }
   /* this is the method the user would call */
   public static boolean isPal(String s)
   {
      return isPal(s, 0, s.length()-1);
   }
   public static boolean isPal(String s, int start, int end)
   {
      count++;
            
      return false;
   }
   public static int factorial(int n)
   {
      indent += "  ";
      System.out.println( indent + "factorial(" + n + ")" );
      //stop and recursion calls go here

      indent = indent.substring(2);
      count++;
      return 0;
   }

   public static int fibonacci(int n)
   {
      int retVal = 0;
      System.out.println( indent + "fibonacci(" + n + ")" );
      count++;
      indent += "  ";
      //stop and recursion go here

      indent = indent.substring(2);
      System.out.println( indent + "returning " + retVal );
      return 0;
   }
   
   public static int sum(int s, int n)
   {
      int retVal = 0;
      System.out.print( indent + "sum(" + s + ", " + n + ") = " );
      count++;
      indent += "  ";
      //stop and recursion go here

      indent = indent.substring(2);
      System.out.println( indent + "returning " + retVal );
      return retVal;
   }
      
   public static long minPaths(int r, int c)
   {
      /* count the number of paths that use the fewest steps to get from 
         location (r,c) to location (0,0).  There is generally more than one */   
      /* use recursion - when is the value 0?  when is it 1? */
      long retVal = 0;
      count = count + 1;
      
      return retVal;
   }
   
   /* rewrite the lcs method keeping the Strings unchanged 
         use aIdx and bIdx as your starting indices.
         eg. stopping condition is if aIdx >= length of a, etc */ 
   public static String lcs( String a, String b, int aIdx, int bIdx)
   {
      return "";      
   }
   /* here is the version we worked out in class */
   public static String lcs( String s1, String s2 )
   {  
      /* find the longest common subsequence between char arrays a and b */
      /* aIdx and bIdx are indices into the respective arrays */
      /* what is our stopping condition? */
      /* what if the characters at aIdx and bIdx are the same?  what if they are not? */
      count++;
      if( s1.length() == 0 || s2.length() == 0 )
         return "";
      if( s1.charAt(0) == s2.charAt(0) ) 
      {
         return s1.charAt(0) + lcs( s1.substring(1), s2.substring(1));
      }
      String a = lcs(s1.substring(1), s2);
      String b = lcs(s1, s2.substring(1));
      if( a.length() > b.length() )
      {
         return a;
      }        
      return b;         
   }
}