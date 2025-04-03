public class Lab00
{

   public static void main(String[] args)
   {
      // variables
      int x = 5;
      String y = "hello";
      float z = 9.8F;

      // printing variables
      System.out.println("x: " + x + " y: " + y + " z: " + z);

      // making a list (array in Java)
      int[] nums = {3, 6, -1, 2};

      // print numbers in nums
      for (int num : nums) {
         System.out.println(num);
      }

      // calling function
      char c = 'l';
      int numFound = char_count(y, c);
      System.out.println("Found: " + numFound);

      // counting for loop printing numbers
      for (int i = 1; i < 11; i = i + 1){
         System.out.print(i + " ");
      }

      System.out.println();

   }

   // char_count function
   public static int char_count(String s, char c)
   {
      int count = 0;
      // for loop which goes from 0 to the length of the string
      for (int i = 0; i < s.length(); i++) {
         if (s.charAt(i) == c) { // if the character at the index == the character
            count++;
         }
      }
      return count;
      }
      
}
