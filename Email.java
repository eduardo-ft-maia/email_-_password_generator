package emailapp;

import java.util.Scanner;

public class Email {
    private String full_name;
    private String first_name;
    private String last_name;
    private String password;
    private String department;
    private String email;
    private int default_password_lenght = 8;
    private String company = "company.com";

    public Email() {

        this.full_name = set_name();
        // this.first_name = first_name;
        // this.last_name = last_name;
        System.out.println("\nHello, " + this.full_name + ". Choose your department.");

        // make_department -> return department;
        this.department = set_department();
        System.out.println("Department: " + this.department);

        this.password = random_password(default_password_lenght);
        System.out.println("Your password is: " + this.password);

        this.email = first_name.toLowerCase() + "." + last_name.toLowerCase() + "@" + department + "." + company;
        System.out.println("Your email is: " + email);
    }

    // ask for name
    private String set_name() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your First Name: ");
        first_name = sc.nextLine();
        
        System.out.println("Insert your Last Name: ");
        last_name = sc.nextLine();
        
        return first_name + " " + last_name;
    }

    // ask for department
    private String set_department() {

        System.out.print("\nDEPARTMENT CODES:\n 1 - Sales; \n 2 - Development; \n 3 - Accounting; \n 0 - None.\nEnter Department: ");
        Scanner sc = new Scanner(System.in);
        int department_choice = sc.nextInt();
        if (department_choice == 1) { return "sales"; }
        else if (department_choice == 2) { return "dev";}
        else if (department_choice == 3) { return "acct";}
        else { return "null"; }
    }

    // generate random password
    private String random_password(int lenght) {
        String password_set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMMOPQRSTUVWXYZ0123456789!@#$%&*(){}[]<>";
        char[] password = new char[lenght];
        for (int i = 0; i < lenght; i++) {
            int rand = (int) (Math.random() * password_set.length());
            password[i] = password_set.charAt(rand);
        }
        return new String(password);
    }

}