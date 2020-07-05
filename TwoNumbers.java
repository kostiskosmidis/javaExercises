public class  TwoNumbers{
 public static void main(String[] args){
   int firstArg = Integer.parseInt(args[0]);
   int secondArg = Integer.parseInt(args[1]);
   System.out.println("Numbers entered: " + firstArg + ", " +secondArg);

   {System.out.println("Is " + firstArg + " larger than " + secondArg + " ? "+ (firstArg>secondArg));}
   {System.out.println("Is " + firstArg + " smaller than " + secondArg + " ? "+ (firstArg<secondArg));}
   {System.out.println("Is " + firstArg + " equal to " + secondArg + " ? "+ (firstArg == secondArg));}
   {System.out.println("Is " + firstArg + " different from " + secondArg + " ? "+ (firstArg!=secondArg));}
}}
