public class  TwoNumbers{
 public static void main(String[] args){
   int firstArg = Integer.parseInt(args[0]);
   int secondArg = Integer.parseInt(args[1]);
   System.out.println("Numbers entered: " + firstArg + ", " +secondArg);

   if(firstArg > secondArg){ System.out.println(firstArg + " is larger than " + secondArg);}
   if(firstArg < secondArg){System.out.println(firstArg + " is smaller than " + secondArg);}
   if(firstArg == secondArg){System.out.println(firstArg + " is equal to " + secondArg);}
   if(firstArg != secondArg){System.out.println(firstArg + " is not equal to " + secondArg);}
}}