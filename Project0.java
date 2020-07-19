/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project0;

import java.util.ArrayList;
import java.util.Scanner;

public class Project0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
//        String name = question1("What is your name?", user_input);
        makeTheQuestionsAndPrint(user_input);
    }
    
    // question template   
    public static String makeAQuestion(String message, Scanner uinput) {
        System.out.println(message);
        String rinput = uinput.next();
        return(rinput);
    }
    
    // What is your name?
    public static String question1(String message, Scanner uinput) {
        String rinput = makeAQuestion(message,uinput);
        return(rinput);
    }
    
    // What year you were born?
    public static Integer question2(String message, Scanner uinput) {
        String answer = makeAQuestion(message,uinput);
        Integer rinput = Integer.parseInt(answer);
        return(rinput);
    }
    
    // What is the name of the city you were born?
    public static String question3(String message, Scanner uinput) {
        String rinput = makeAQuestion(message,uinput);
        return(rinput);
    }
    
    // Are you married?
    public static boolean question4(String message, Scanner uinput) {
        String answer = makeAQuestion(message,uinput);
        boolean rinput;
        if(answer.equals("yes") || answer.equals("Yes") || answer.equals("YES")) 
            rinput = true; 
        else 
            rinput = false; 
        return(rinput);
    }
    
    // How many years have you been married?
    public static int question4a(String message, Scanner uinput) {
        String answer = makeAQuestion(message,uinput);
        int rinput = Integer.parseInt(answer);
        return(rinput);
    }
    
    // What year did you get married?
    public static int question4b(String message, Scanner uinput) {
        String answer = makeAQuestion(message,uinput);
        int rinput = Integer.parseInt(answer);
        return(rinput);
    }
    
    // Do you have any children?
    public static boolean question4c(String message, Scanner uinput) {
        String answer = makeAQuestion(message,uinput);
        boolean rinput;
        if(answer.equals("yes") || answer.equals("Yes") || answer.equals("YES")) 
            rinput = true; 
        else 
            rinput = false; 
        return(rinput);
    }
    
    // How many children do you have?
    public static int question4d(String message, Scanner uinput) {
        String answer = makeAQuestion(message,uinput);
        int rinput = Integer.parseInt(answer);
        return(rinput);
    }
    
    // What is the name of your i child?
    public static String question4e(String message, Scanner uinput) {
        String rinput = makeAQuestion(message,uinput);
        return(rinput);
    }
    
    // What is the age of your i child?
    public static int question4f(String message, Scanner uinput) {
        String answer = makeAQuestion(message,uinput);
        int rinput = Integer.parseInt(answer);
        return(rinput);
    }
        
    // What is your favourite color?
     public static String question5(String message, Scanner uinput) {
        String rinput = makeAQuestion(message,uinput);
        return(rinput);
    }
    
    // group all questions together
    public static void makeTheQuestionsAndPrint(Scanner uinput) {
        int q4aa = 0;
        int q4ba = 0;
        boolean q4ca = false;
        int q4da = 0;
        ArrayList<String> names_of_children = new ArrayList<String>();
        ArrayList<Integer> ages_of_children = new ArrayList<Integer>();
        
        String q1a = question1("What is your name? ", uinput);
        Integer q2a = question2("What year you were born? ", uinput);
        String q3a = question3("What is the name of the city you were born? ", uinput);
        boolean q4a = question4("Are you married? ", uinput);
        if(q4a == true) {
            q4aa = question4a("How many years have you been married? ", uinput);
            q4ba = question4b("What year did you get married? ", uinput);
            q4ca = question4c("Do you have any children? ", uinput);
            if(q4ca) {
                q4da = question4d("How many children do you have? ", uinput);
                if(q4da > 0) {
                    for (int i = 0; i < q4da; i++) {
                        String name = question4e("What is the name of your " + (i + 1) + " child? ", uinput);
                        Integer age = question4f("What is the age of your "  + (i + 1) + " child? ", uinput);
                        names_of_children.add(name);
                        ages_of_children.add(age);
                    }
                }
            }
        }
        String q5a = question5("What is your favourite color? ", uinput);
        printTheOutput(q1a, q2a, q3a, q4a, q4aa, q4ba, q4ca, q4da, names_of_children, ages_of_children, q5a);
        
    }
    
    // Dear {name}, your were born in {year} so you are {age} and born in the city of {city}.
    // You are not married and your favourite color is {color}.
    // and you don't have any children.
    // and you have X children.
    // The name of your i child is {nameOfChild_i} and was born in the year of {bornYearChild_i}.
    // Your favourite color is {color}.
    public static void printTheOutput(String name, Integer year, String city, boolean married, int years_married, int year_of_marriage, boolean have_children, int no_of_children, ArrayList<String> names_of_children, ArrayList<Integer> ages_of_children, String color) {
        System.out.println("Dear " + name + ", your were born in " + 
                year + " so you are " +
                (2020 - year) + " and born in the city of " +
                city + ".");
        if(married == true) {
            System.out.print("You have been married for " + years_married + " years and you got married in " + year_of_marriage);
            if(!have_children) 
                System.out.println(" and you don't have any children.");
            else {
                System.out.println(" and you have " + no_of_children + " children.");
                // print the details of all the children
                for (int i = 0; i < names_of_children.size(); i++) {
                    System.out.println("Name of child: " + names_of_children.get(i));
                    System.out.println("Age of child: " + ages_of_children.get(i));
                }
            }
            System.out.println("Your favourite color is " + color + ".");
        } else {
            System.out.println("You are not married and your favourite color is " + color + ".");
        }
    }
}
