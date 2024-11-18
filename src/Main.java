import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);
    private static ArrayList<String> list = new ArrayList<>();
    public static void printList() {
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("Current List:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i));
            }
        }
    }
    public static void addItem(String item) {
        list.add(item);
        System.out.println("Item added: " + item);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cmd;
        boolean running = true;

        while (running) {
            Main.printList();
            System.out.println("\nMenu:");
            System.out.println("A - Add an item");

            cmd = SafeInput.getRegExString(in, "Please enter a command", "[AaDdIiPpQq]");

            switch (cmd.toUpperCase()) {
                case "A":
                    String newItem = SafeInput.getRegExString(in, "Enter the item to add: ", ".*");
                    Main.addItem(newItem);
                    break;
            }
            in.close();
        }
    }
}
