package ua.lpnuai.oop;

import java.util.Scanner;

public class Main_11{

    static void auto(){
        System.out.println("Creating list...");
        LinkedList<String> list = new LinkedList<String>();

        list.add("Object 1");
        list.add("Object 2");
        list.add("Object 1");
        list.add("Object 3");
        System.out.println("Using toString:");
        System.out.println(list.toString());
        list.delete(2);
        System.out.println("Converting to Array...");
        Object[] arr = list.toArray();
        for (Object e: arr
                ) {
            System.out.println(e);
        }
        System.out.println("Cleaning list...");
        list.clean();
        System.out.println(list.toString());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Start");
        String in;

        LinkedList<String> list = new LinkedList<String>();

        while(true){
            in = sc.nextLine();
            switch(in.toLowerCase()){

                case "-auto":
                case "--auto":
                    auto();
                    System.exit(0);
                    break;

                case "-add":
                case "--add":
                    System.out.println("Enter new firm:");
                    list.add(sc.nextLine());
                    break;

                case "-r":
                case "--remove":
                    System.out.println("Enter id:");
                    list.delete(Integer.parseInt(sc.nextLine()));
                    break;

                case "-p":
                case "--print":
                    System.out.println(list.toString());
                    break;

                case "-c":
                case "--clean":
                    System.out.println("Cleaning the list...");
                    list.clean();
                    System.out.println("Cleaned.");

                    break;

                case "-array":
                case "--array":
                    System.out.println("Converting to Array...");
                    Object[] arr = list.toArray();
                    for (Object e: arr
                            ) {
                        System.out.println(e);
                    }
                    break;

                case "-e":
                case "--exit":
                    System.out.println("Bye");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid command entered");
                    break;
            }
        }
    }
}
