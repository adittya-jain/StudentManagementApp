import java.util.Scanner;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class App {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Wlcm to Student management app");
        Scanner sc = new Scanner(System.in); 


        while(true){

            System.out.println("PRESS 1 TO ADD");
            System.out.println("PRESS 2 TO DELETE");
            System.out.println("PRESS 3 TO DISPLAY");
            System.out.println("PRESS 4 TO EXIT APP");

            int choice = sc.nextInt();

            if (choice==1) {
                
                System.out.println("Enter User Name");
                String name = sc.next();
                name+= sc.nextLine();
                System.out.println("Enter Phone No.");
                String phone = sc.next();
                System.out.println("Enter city");
                String city = sc.next();

                Student st = new Student(name, phone, city);
                Boolean ans = StudentDao.insertIntoDB(st);
                if(ans){
                    System.out.println("student added successfully");
                }else{
                    System.out.println("Something went wrong");
                }
                System.out.println(st);

            }else if(choice==2){

                System.out.println("Enter the student id to delete");
                int id = sc.nextInt();
                Boolean ans = StudentDao.deleteIntoDB(id);
                if(ans){
                    System.out.println("student deleted");
                } else{
                    System.out.println("error occured");
                }

            }else if(choice==3){

                StudentDao.showAllStudents();

            }else if(choice==4){
                break;
            }
        
            
        }
        sc.close();
    }

    

    
}
