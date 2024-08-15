import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public ToDoList() {
    }

    public static void CreateToDoList() {
        ArrayList<String> toDoList = new ArrayList<String>();
        System.out.println("Enter the Entries for your todo list. When finished type done");
        String entry = "";
        Scanner input = new Scanner(System.in);
        while (!entry.equals("done")) {
            entry = input.nextLine();
            if (!entry.equals("done")) {
                toDoList.add(entry);
            }

        }
        System.out.println("This is whats on your todo list " + toDoList);
        System.out.println("Do you need to add something to todolist? Type yes or no.");
        while (!entry.equals("no")) {
            entry = input.nextLine();
            entry = entry.toLowerCase();
            if (entry.equals("yes")) {
                System.out.println("Enter the Entries for your todo list. When finished type done");
                if (!entry.equals("done")) {
                    System.out.println("This is whats on your todo list " + toDoList);
                    entry = input.nextLine();
                    if (!entry.equals("done")) {
                        toDoList.add(entry);
                        System.out.println("This is whats on your todo list " + toDoList);
                    }
                }
            }
            if (!entry.equals("no")) {
                System.out.println("Do you need to add to todolist? Type yes or no.");
            }
        }
        entry = "";
        while (!toDoList.isEmpty()) {
            if (toDoList.isEmpty()){
                System.out.println("You've finished your todolist!");
                break;
            }
            System.out.println("Do you need to cross off first thing on todolist? Type yes or no.");
            entry = input.nextLine();
            entry = entry.toLowerCase();
            if (toDoList.isEmpty()){
                System.out.println("You've finished your todolist!");
                break;
            }
            if (entry.equals("yes")) {
                System.out.println("Crossing off first thing on todolist");
                toDoList.remove(0);
                System.out.println("This is whats on your todo list " + toDoList);
                if (toDoList.isEmpty()) {
                    System.out.println("You've finished your todolist!");
                    break;
                }
                System.out.println("Do you need to cross off next thing on todolist? Type yes or no.");
                }
            }
        }
    }