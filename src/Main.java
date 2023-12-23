import db.DB;

import java.util.Scanner;

public class Main {
    static Scanner  scI = new Scanner(System.in);
    static Scanner  scS = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu() {
        if(DB.session == null) {
            System.out.println("1. Register \n2. Login");
        } else {
            System.out.println("3. Logout");
        }
        System.out.println("0. Exit");

        int choose = scI.nextInt();

        switch (choose) {
            case 0 -> {return;}
            case 1 -> {
                register();
            }
            case 2 -> {
                Login();
            }
            case 3 -> {
                DB.session = null;
            }
        }

        showMenu();
    }

    private static void register() {
        System.out.println("Enter login: ");
        String login = scS.next();
        System.out.println("Enter password: ");
        Integer password = scI.nextInt();

    }
    private static void Login() {

    }





}