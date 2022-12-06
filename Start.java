import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.student.manage.Student;
import com.student.manage.StudentDao;
public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		System.out.println("Wellcome To Student Manegement App");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("PRESS 1 TO ADD STUDENT");
			System.out.println("PRESS 2 TO DELETE STUDENT");
			System.out.println("PRESS 3 TO DISPLAY STUDENT");
			System.out.println("PRESS 4 TO EXIT APP");
			System.out.println("PRESS 5 TO UPDATE");
			int c=Integer.parseInt(br.readLine());
			
			if(c==1)
			{
				// add student
			System.out.println("Enter Your name :");
			String name=br.readLine();
			
			System.out.println("Enter usre phone :");
			String phone=br.readLine();
			
			System.out.println("Enter Your City :");
			String city=br.readLine();
			
			// create student object to store student
			
			Student st=new Student(name ,phone,city);
		boolean answer=StudentDao.insertStudentToDB(st);
		if(answer)
		{
			System.out.println("Student added sucessfully...");
		}else {
			System.out.println("something went wrong try again");
		}
			System.out.println(st);
			
			}else if(c==2)
			{
				//delete student
				System.out.println("Enter Student id to Delete");
				int userId=Integer.parseInt(br.readLine());
				boolean abc=StudentDao.deleteStudent(userId);
				if(abc) {
					System.out.println("elemnt deleted sucessfully");
				}else {
					System.out.println("something went wrong please try again");
				}
					
					
			}else if(c==3)
			{
				// display student
				StudentDao.showAllStudent();
				
				
			}else if(c==4)
           	{
				// exit
				break;
			}else if(c==5)
			{
				//Scanner b= Scanner(System.in);
				//Scanner st= Scanner(System.in);
				System.out.println("PLEASE ENTER STUDENT ID THAT U HAVE TO CHANGE");
				int userId=Integer.parseInt(br.readLine());
				//int userId=b.nextInt();
				System.out.println("PLEASE ENTER NAME THAT U HAVE TO CHANGE");
				String name=br.readLine();
				//String name=st.nextLine();
				boolean updt=StudentDao.updateStudent(userId,name);
				if(updt) {
					System.out.println("elemnt updated sucessfully");
				}else {
					System.out.println("something went wrong please try again");
				}
			}
			
		}
		System.out.println("THANK YOU FOR USING MY APLLICATION ...");
		System.out.println("SEE YOU SOON");
	}

	

}
