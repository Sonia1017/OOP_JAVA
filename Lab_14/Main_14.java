package ua.lpnuai.oop.heletiy14;

import java.util.*;


class Item {
    private String Name = "";
    private int quantity = 0;
    private String unit = "";
    private ArrayList<String> specification = new ArrayList<String>();
    private Double price;
    private String timestamp;

    public Item(){
        Date date = new Date();
        timestamp = date.toString();
    }

    public void addSpec(String s){
        specification.add(s);
    }

    public String Info(){
    String res = "Name: " + getName() + "\n" +
            "Price: " + getPrice() + "\n" +
            "Quantity: " + getQuantity() + "\n" +
            "Delivery time: " + getTimestamp() + "\n";
    for (String e: specification
            ) {
        res +=  e + "\n";
    }
    return res;
}


    public String getName() {
        return Name;
    }
    public void setName(String s) {
        Name = s;
    }

    public String getPrice() {
        return Double.toString(price) + " UAH";
    }

    public void setPrice(Double i) {
        price = i;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void ResetTimestamp() {
        Date date = new Date();
        timestamp = date.toString();
    }

    public void setUnit(String u) {
        unit = u;
    }

    public String getQuantity() {
        return Integer.toString(quantity) + " " + unit;
    }

    public void setQuantity(int i) {
        quantity = i;
    }

}



class Store {
    private ArrayList<Item> items = new ArrayList<Item>();

    public void List(){
        if (items.size() == 0) {
            System.out.println("Store is empty!");
        } else {
            int c = 0;
            for (Item i: items
                    ) {
                System.out.println("id: " + Integer.toString(c++));
                System.out.println(i.Info());
            }
        }
    }

    public void removeItem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id:");
        String in = sc.nextLine();


        while (!in.matches("^\\d+")) {
            System.out.println("Enter valid id:");
            in = sc.nextLine();
        }
        int i = Integer.parseInt(in);
        if (i < items.size())
            items.remove(i);
    }


    public void addItem(){
        Item item = new Item();

        Scanner sc = new Scanner(System.in);
        String in;

        System.out.println("Enter item name:");
        in = sc.nextLine();

        while (!in.matches("^(?!\\s*$).+")) {
            System.out.println("Enter valid name:");
            in = sc.nextLine();
        }
        item.setName(in);

        System.out.println("Enter item price:");
        in = sc.nextLine();
        while (!in.matches("^\\d+(\\.\\d+)?")) {
            System.out.println("Enter valid price:");
            in = sc.nextLine();
        }

        item.setPrice(Double.parseDouble(in));

        System.out.println("Enter item unit:");
        item.setUnit(sc.nextLine());

        System.out.println("Enter item quantity:");


        in = sc.nextLine();
        while (!in.matches("^\\d+")) {
            System.out.println("Enter valid quantity:");
            in = sc.nextLine();
        }

        item.setQuantity(Integer.parseInt(in));

        while (true) {

            System.out.println("Toe exit enter ~");
            System.out.println("Add specification:");
            in = sc.nextLine();
            if (in.equals("~")) {
                break;
            } else {
                item.addSpec(in);
            }

        }
        items.add(item);
    }
}


public class Main_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start");
        String in;

        Store store = new Store();

        while(true){
            in = sc.nextLine();
            switch(in.toLowerCase()){

                case "-add":
                case "--add":
                    store.addItem();
                    break;

                case "-r":
                case "--remove":
                    store.removeItem();
                    break;

                case "-l":
                case "--list":
                    store.List();
                    break;

                case "-e":
                case "--exit":
                    System.out.println("Bye, bye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong command!");
                    break;
            }
        }
    }
}