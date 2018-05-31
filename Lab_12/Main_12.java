package ua.lpnuai.oop.heletiy12;


import java.util.Scanner;

public class Main_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        while(!str.equals("break")){
            System.out.println("What do you check?");
            str = scanner.next();
            if(str.equals("string")){
                System.out.println("Enter the line of English letters");
                str = scanner.next();
                if(str.matches("[a-zA-Z]*")){
                    System.out.println("Correct input");
                }
                else{
                    System.out.println("Incorect input");
                }
            }
            else if(str.equals("number")){
                        System.out.println("Enter the number");
                        str = scanner.next();
                        if(str.matches("[0-9]*")){
                    System.out.println("Correct input");
                }
                else{
                    System.out.println("Incorect input");
                }
            }
            else if(str.equals("data")){
                System.out.println("Enter data DD.MM.YYYY");
                str = scanner.next();
                if(str.matches("^(0[1-9]|[12][0-9]|3[01])[.](0[1-9]|1[012])[.]\\d\\d\\d\\d$")){
                    System.out.println("Correct input");
                }
                else{
                    System.out.println("Incorect input");
                }
            }
        }

    }
}