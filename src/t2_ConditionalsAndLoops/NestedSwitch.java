package t2_ConditionalsAndLoops;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
//        System.out.println("Nested Switch");
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter Employee ID:");
//        int empID = in.nextInt();
//        switch(empID){
//            case 1:
//                System.out.println("Vinay Joshi");
//                break;
//            case 2:
//                System.out.println("Akshay Huria");
//                break;
//            case 3:
//                System.out.print("Enter Department Name:");
//                String department = in.next();
//
//                System.out.println("Employee Number three");
//                switch (department){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("No department Entered");
//                }
//                break;
//            default:
//                System.out.println("Enter correct Employee ID");
//        }

//                          *****Enhanced version of switch statement*****

        System.out.println("Nested Switch");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empID = in.nextInt();
        switch (empID) {
            case 1 -> System.out.println("Vinay Joshi");
            case 2 -> System.out.println("Akshay Huria");
            case 3 -> {
                System.out.print("Enter Department Name: ");
                String department = in.next();
                System.out.println("Employee Number three");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department Entered");
                }
            }
            default -> System.out.println("Enter correct Employee ID");
        }

    }
}
