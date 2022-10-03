public class MirrorArt {
   /*
   Prints the following output given a SIZE
      #================#
      |      <><>      |
      |    <>....<>    |
      |  <>........<>  |
      |<>............<>|
      |<>............<>|
      |  <>........<>  |
      |    <>....<>    |
      |      <><>      |
      #================#  
      
      #============#
      |    <><>    |
      |  <>....<>  |
      |<>........<>|
      |<>........<>|
      |  <>....<>  |
      |    <><>    |
      #============#
    */   
   public static final int SIZE = 4;
   
   public static void main(String[] args) {
      drawLine();
      drawTop();
      drawBottom();
      drawLine();
   }
   
   public static void drawLine() {
      System.out.print("#");
      for (int i=1; i<=SIZE*4;i++) {
         System.out.print("=");
      }
      System.out.print("#");
      System.out.println();
   }
   
   public static void drawTop() {
      for (int line = 1;  line <= SIZE; line++) { 
         System.out.print("|");
         
         for (int spaces = 1; spaces <= (-2 * line) + SIZE * 2; spaces++) {
            System.out.print(" ");
         }
         System.out.print("<>");
         for (int dots = 1; dots <= 4 * line - 4; dots++) {
            System.out.print(".");
         }
         System.out.print("<>");
         for (int spaces = 1; spaces <= (-2 * line) + SIZE * 2; spaces++) {
            System.out.print(" ");
         }
         System.out.print("|");
         System.out.println();
      }
   }
   
   public static void drawBottom() {
      for (int line = SIZE; line >= 1; line--) {
         System.out.print("|");
         for (int spaces = 1; spaces <= (-2 * line) + SIZE * 2; spaces++) {
            System.out.print(" ");
         }
         System.out.print("<>");
         for (int dots = 1; dots <= 4 * line - 4; dots++) {
            System.out.print(".");
         }
         System.out.print("<>");
         for (int spaces = 1; spaces <= (-2 * line) + SIZE * 2; spaces++) {
            System.out.print(" ");
         }
         System.out.println("|");
      }  
   }  
}