package SchoolManagement;

import java.util.Scanner;

import static SchoolManagement.Person.personType;

public class Methods implements SchoolManagement{
    static Scanner input=  new Scanner(System.in);
    @Override
    public void create() {
        System.out.println(" *** Welcome to create " + personType + " page ***");
        // Teacher(String fullName, String idNumber, int age, String department, String teacherID)

        System.out.println("Enter fullname: ");
        String name = input.next();

        System.out.println("Enter ID number: ");
        input.nextLine();
        try {
            String idNumber = input.next();
            idNumber = idNumber.replace(" ", ""); // This line of code is to catch the spaces when they come from the user.

            if (personType.equals("STUDENT")) {
                System.out.println("Enter age: ");
                try {
                    int age = input.nextInt();
                    if (age < 8 || age > 19) {
                        throw new ArithmeticException("Your age is out of the range.");
                    } else {
                        // studentNumber, String course
                        System.out.println("Enter your student number ");
                        int studentNumber = input.nextInt();

                        System.out.println("Enter your course ");
                        String course = input.next();

                        Student std = new Student(name, idNumber, age, studentNumber, course);
                        student.add(std);
                        System.out.println("Added student is " + std.getFullName());

                    }
                } catch (Exception e) {
                    throw new ArithmeticException(e.getMessage());
                }

            } else {

                System.out.println("Enter your age ");
                int age = input.nextInt();


                System.out.println("Enter your department ");
                input.nextLine();
                String department = input.nextLine();

                System.out.println("Enter your teacherId ");
                String teacherId = input.nextLine();

                Teacher teacher = new Teacher(name,idNumber,age,department,teacherId);
                teachers.add(teacher);
                System.out.println(teacher);

            }

        } catch(Exception e){
            System.out.println("You have entered wrong information.");
            create();
        }
    }

    @Override
    public void subMenu() {
        System.out.println("============= OPERATIONS =============\n" +
                "1- ADD\n" +
                "2- SEARCH\n" +
                "3- LIST\n" +
                "4- DELETE\n" +
                "5- UPDATE\n" +
                "6- MAIN MENU\n" +
                "Q- EXIT");
        String option=input.next();

        switch(option){
            case "1":
                create();
                subMenu();
                break;
            case "2":
                search();
                subMenu();
                break;
            case "3":
                list();
                subMenu();
                break;
            case "4":
                delete();
                subMenu();
                break;
            case "5":
                 update();
                 subMenu();
                 break;
            case "6":
                Main.mainMenu();
                break;
            case "Q":
                System.exit(0);
                break;
            default:
                System.out.println("You entered wrong number ");
                subMenu();
                break;
        }
    }

    @Override
    public void search() {
        System.out.println("**** Welcome to search " + personType + " page ***");
        boolean flag = true;

        System.out.println("Please enter ID number ");
        String idNumber = input.next();

        if(personType.equalsIgnoreCase("Student")){
            for (Person each:student) {
                if (idNumber.equalsIgnoreCase(each.getIdNumber())){
                    System.out.println("The student you search " + each.getFullName());
                    flag = false;
                }else {
                    System.out.println("There is no student in our system with such a ID number" + idNumber );
                }
                if (flag){
                    System.out.println("There is no student in our system with such a ID number" + idNumber);
                }
            }
        }else{
            if(personType.equalsIgnoreCase("Student")){
                for (Person each:teachers) {
                    if (idNumber.equalsIgnoreCase(each.getIdNumber())){
                        System.out.println("The student you search " + each.getFullName());
                        flag = false;
                    }else {
                        System.out.println("There is no teacher in our system with such a ID number" + idNumber );
                    }
                    if (flag){
                        System.out.println("There is no teacher in our system with such a ID number" + idNumber );
                    }
                }
            }
        }

    }

    @Override
    public void list() {
        System.out.println("**** Welcome to search " + personType + " page ***");
        if (personType.equalsIgnoreCase("student")){
            for (Person each:student) {
                System.out.println(each);
            }
        }else {
            for (Person each : teachers){
                System.out.println(each);
            }
        }

    }

    @Override
    public void exit() {
        System.out.println("Bye bye come back again ");

    }

    @Override
    public void delete() {
        System.out.println("**** Welcome to delete " + personType + " page ***");

        boolean flag = true;

        System.out.println("Please enter ID number ");
        String idNumber = input.next();

        if(personType.equalsIgnoreCase("Student")){
            for (Person each:student) {
                if (idNumber.equalsIgnoreCase(each.getIdNumber())){
                    System.out.println("deleted student " + each.getFullName());
                    student.remove(each);
                    flag = false;
                }else {
                    System.out.println("There is no student in our system with such a ID number" + idNumber );
                }
                if (flag){
                    System.out.println("There is no student in our system with such a ID number" + idNumber);
                }
            }
        }else{
                for (Person each:teachers) {
                    if (idNumber.equalsIgnoreCase(each.getIdNumber())){
                        System.out.println("The teacher you search " + each.getFullName());
                        teachers.remove(each);
                        flag = false;
                    }
                    if (flag){
                        System.out.println("There is no teacher in our system with such a ID number" + idNumber );
                    }
                }
        }


    }

    @Override
    public void update() {
        System.out.println("**** Welcome to update " + personType + " page ***");
        boolean flag = true;

        System.out.println("Please enter your ID number");
        String idNumber = input.next();
        input.nextLine();

        if(personType.equalsIgnoreCase("Student")){
            for (Student each:student) {
                if (idNumber.equalsIgnoreCase(each.getIdNumber())){
                    System.out.println("student you want to update " + each);

                    System.out.println("Please enter your full name ");
                    String name = input.nextLine();
                    each.setFullName(name);

                    System.out.println("Enter your age");
                    int age = input.nextInt();
                    each.setAge(age);


                    System.out.println("Please enter student number ");
                    int studentNumber = input.nextInt();
                    each.setIdNumber(idNumber);

                    System.out.println("Please enter your course ");
                    String course = input.next();
                    each.setCourse(course);

                    System.out.println("Updated student " + each);

                    flag = false;

                }
                if (flag){
                    System.out.println("There is no student in our system with such a ID number" + idNumber);
                }
            }
        }else{
            for (Teacher each:teachers) {
                if (idNumber.equalsIgnoreCase(each.getIdNumber())){
                    System.out.println("Teacher  you want to update " + each);


                    System.out.println("Enter your Department ");
                    String department = input.nextLine();
                    each.setDepartment(department);

                    System.out.println("Enter your Teacher ID");
                    String teacherId = input.nextLine();
                    each.setTeacherID(teacherId);

                    System.out.println("Enter your full name");
                    String fullName = input.nextLine();
                    each.setFullName(fullName);

                    System.out.println("Enter your age ");
                    int age = input.nextInt();
                    each.setAge(age);

                    System.out.println("Updated teacher  " + each);



                    flag = false;
                }
                if (flag){
                    System.out.println("There is no teacher in our system with such a ID number" + idNumber );
                }
            }
        }

    }
}
