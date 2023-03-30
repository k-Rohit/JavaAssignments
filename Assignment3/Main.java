// Name - Kumar Rohit
// PRN - 21070126052
// Division - AIML- A3

package Assignment3;

import java.util.Scanner;

public class Main {
        static Student[] students;
        //Main method
        public static void main(String[] args) {
            // Variable for do while loop
            int count;

            // Do-While loop to iterate menu
            do {
                // Displaying Menu
                System.out.println("1. Add Students");
                System.out.println("2. Display");
                System.out.println("3. Search(by prn)");
                System.out.println("4. Search(by name)");
                System.out.println("5. Search(by position)");
                System.out.println("6. Edit Details");
                System.out.println("7. Delete");

                // Scanner object to read choice from prompt
                Scanner sc = new Scanner(System.in);

                // variable to store choice from menu
                int choice;

                // Taking choice input from prompt
                choice = sc.nextInt();

                // Creating object of class Operations
                Functions functions = new Functions();

                // Switch Case for menu
                switch (choice) {

                    // Case to call method search by prn
                    case 3:
                        functions.searchByPrn(students);

                        // Break to get out of the switch case
                        break;

                    // Case to call method search by name
                    case 4:
                        int index = functions.searchByName(students);

                        // Break to get out of the switch case
                        break;

                    // Case to call method search by index
                    case 5:
                        functions.searchByIndex(students);
                        // Break to get out of the switch case
                        break;

                    // Case to edit details
                    case 6:
                        students = functions.updateStudent(students);
                        functions.displayStudents(students);
                        break;

                    // Case to edit student details in array
                    case 7:
                        students = functions.deleteStudent(students);
                        functions.displayStudents(students);
                        break;

                    // Case to call method tp add student details
                    case 1:

                        // Storing Added Details in students array
                        students = functions.addStudent(students);

                        // Case to call method to display all stored details
                    case 2:
                    default:
                        functions.displayStudents(students);

                        // Break to get out of the switch case
                        break;
                }

                // Asking user if he/she wants to continue this menu
                System.out.println("Do you want to perform more operations?(Y=1|N=0): ");

                // Storing reply in count variable
                count = sc.nextInt();
            }while(count == 1); // While condition for do while loop
        }
    }

