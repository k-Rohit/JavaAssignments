package Assignment3;

import java.util.Scanner;

public class Functions {
    public Student[] addStudent(Student[] students) {

        // Scanner object to take input from prompt
        Scanner scanner =  new Scanner(System.in);

        // Asking no of Students
        System.out.println("Enter no of Students you want to add: ");

        // Taking number of students as input in variable number
        int number = scanner.nextInt();

        // Variable to store prn
        int prn;

        // Variable to store name
        String name;

        // variable to store date of Birth
        String dob;

        // variable to store marks
        int marks;

        // variable to store existing array
        int len;

        // Logic block to assign len = 0 if existing array is null else assigning the length of array to len
        if(students == null){
            len =0;
        }
        else{
            len = students.length;
        }

        // Declaring a new array to store students details along with existing details
        Student[] array = new Student[len + number];

        // Storing existing details in array array from array students using a for loop
        for(int i=0;i<len;i++) {
            array[i] = students[i];
        }

        // Using for loop to store the details of said number of students in array array
        for (int i = len; i < len + number; i++) {
            System.out.println("Enter PRN of the student: ");
            prn = scanner.nextInt();
            System.out.println("Enter Name of the student: ");
            name = scanner.next();
            System.out.println("Enter DOB of the student: ");
            dob = scanner.next();
            System.out.println("Enter marks of student: ");
            marks = scanner.nextInt();

            array[i] = new Student(0, "", "", 0);
            array[i].setPrn(prn);
            array[i].setName(name);
            array[i].setDob(dob);
            array[i].setMarks(marks);
        }

        // Returning the new array with existing and added student details
        return array;
    }

    // Method to display student details stored in students array
    public void displayStudents(Student[] students){

        // Variable to store length of array
        int len;

        // Logic block to assign len = 0 if existing array is null else assigning the length of array to len
        if(students == null){
            len = 0;
        }
        else{
            len = students.length;
        }

        // For loop to display the details
        for(int i=0; i<len; i++){
            // If array is empty then display this
            if(students.length == 0){
                System.out.println("No student found");
                return;
            }
            // Using getter method to display details of students
            String name = students[i].getName();
            String dob = students[i].getDob();
            int marks = students[i].getMarks();
            int prn = students[i].getPrn();

            System.out.println(prn+"  "+name+"  "+dob+"  "+marks);
        }
    }

    // Method to search student by PRN
    public void searchByPrn(Student[] students){
        // Taking prn to be searched as input in variable searchPrn
        Scanner scan = new Scanner(System.in);
        int searchPrn = scan.nextInt();

        // For loop to search that prn by traversing through arrays
        for(int i=0; i<students.length; i++){
            if(students[i].getPrn() == searchPrn){
                System.out.println("PRN: "+students[i].getPrn()+"   Name: "+students[i].getName()+" DOB: "+students[i].getDob()+"   Marks: "+students[i].getMarks());
                break;
            }
        }
    }

    // Method to search student details in array using Name
    public int searchByName(Student[] students){

        // Taking name to be searched as input
        Scanner scan = new Scanner(System.in);
        String searchName = scan.nextLine();

        // For loop to traverse through array to search for the given name and display the details if found
        int i=0;
        for (Student student : students) {
            if (student.getName().equals(searchName)) {
                System.out.println("PRN: " + student.getPrn() + "   Name: " + student.getName() + " DOB: " + student.getDob() + "   Marks: " + student.getMarks());
                break;
            }
            i++;
        }
        return i;
    }

    // Method to search student details using Index of array
    public void searchByIndex(Student[] students){

        // taking index to be searched as input and storing in variable idx
        Scanner scan = new Scanner(System.in);
        int idx = scan.nextInt();

        // Displaying found details
        System.out.println("PRN: "+students[idx].getPrn()+"   Name: "+students[idx].getName()+" DOB: "+students[idx].getDob()+"   Marks: "+students[idx].getMarks());
    }

    // Method to edit details of student stored in array students
    public Student[] updateStudent(Student[] students){
        // Allowing user to search the student by name to edit their details
        int idx = searchByName(students);
        Scanner scan = new Scanner(System.in);

        // Menu to update the details
        System.out.println("1. Update PRN");
        System.out.println("2. Update Name");
        System.out.println("3. Update DOB");
        System.out.println("4. Update Marks");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();

        // Creating a switch case so that the users can select which ways to update
        switch (choice){
            case 1:
                int prn = scan.nextInt();
                students[idx].setPrn(prn);
                break;
            case 2:
                String name = scan.nextLine();
                students[idx].setName(name);
                break;
            case 3:
                String dob = scan.nextLine();
                students[idx].setDob(dob);
                break;
            case 4:
                int marks = scan.nextInt();
                students[idx].setMarks(marks);
                break;
        }

        return students;
    }

    // Method to delete student details in the array
    public Student[] deleteStudent(Student[] students){
        // Declaring a new array to store students details along with existing details
        Student[] array = new Student[students.length];

        // Searching students to be deleted by name
        int index = searchByName(students);

        // Storing existing details in array array from array students using a for loop'
        int j=0;
        for(int i=0;i<students.length;i++) {
            // It will skip copying details of that student which needs to be deleted
            if(i == index){
                continue;
            }
            array[j] = students[i];
            j++;
        }

        // Returning final array
        return array;
    }

}
