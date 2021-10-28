import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
//
//
//				https://www.youtube.com/watch?v=TT04MU5MyKA
//
//


public class Driver_SchoolDB {

	public static void main(String[] args) {

		
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("SchoolDB_Initial.txt"));
			
			String readFile;
			
			while((readFile = br.readLine()) != null) {
				System.out.println(readFile);
			}
			
			
			br.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("SchoolDB_Updated"));
			
		bw.write("\n**************************************************************\n");
		bw.write("SCHOOL DATABASE INFO:\n\n");
		bw.write("************************************************\n");
		bw.write("COURSES:\n");
		bw.write("Course: MAT-771 | Number of Credits: 04 | Graduate\nCourse: CMP-777 | Number of Credits: 04 | Graduate\nCourse: CMP-711 | Number of Credits: 04 | Graduate\nCourse: MAT-723 | Number of Credits: 04 | Graduate\nCourse: CMP-168 | Number of Credits: 04 | Undergraduate\nCourse: CMP-338 | Number of Credits: 04 | Undergraduate\n");
		bw.write("************************************************\n");
		bw.write("************************************************\n");
		bw.write("PERSONS:\n");
		bw.write("************************************************\n");
		bw.write("************************************************\n");
		bw.write("EMPLOYEES:\n");
		bw.write("************************************************\n");
		bw.write("************************************************\n");
		bw.write("GENERAL STAFF:\n");
		bw.write("Person: Name:                                | Birth Year:    0 Employee: Department:                      | Employee Number:   5 GeneralStaff: Duty:           \n");
		bw.write("Person: Name:                                | Birth Year:    0 Employee: Department:                      | Employee Number:   6 GeneralStaff: Duty: advise students\n");
		bw.write("Person: Name:                                | Birth Year:    0 Employee: Department:           Sanitation | Employee Number:   7 GeneralStaff: Duty:      clean\n");
		bw.write("Person: Name:                   Flash Gordon | Birth Year: 1934 Employee: Department:             Security | Employee Number:   8 GeneralStaff: Duty:     safety\n");
		bw.write("************************************************\n");
		bw.write("************************************************\n");
		bw.write("FACULTY:\n");
		bw.write("Person: Name:                                | Birth Year:    0 Employee: Department:                      | Employee Number:   1 Faculty: Not Tenured | Number of Courses Taught:   0 | Courses Taught: \n");
		bw.write("Person: Name:                                | Birth Year:    0 Employee: Department:                      | Employee Number:   2 Faculty:  Is Tenured | Number of Courses Taught:   0 | Courses Taught: \n");
		bw.write("Person: Name:                                | Birth Year:    0 Employee: Department:                  MAT | Employee Number:   3 Faculty: Not Tenured | Number of Courses Taught:   0 | Courses Taught: \n");
		bw.write("Person: Name:                       Superman | Birth Year: 1938 Employee: Department:                  PHY | Employee Number:   4 Faculty:  Is Tenured | Number of Courses Taught:   0 | Courses Taught: \n");
		bw.write("************************************************\n");
		bw.write("************************************************\n");
		bw.write("STUDENTS:\n");
		bw.write("Person: Name:                                | Birth Year:    0 Student: studentID: 0001 | Major           undeclared |  Undergraduate | Number of Courses Taken:   0 | Courses Taken: \n");
		bw.write("Person: Name:                                | Birth Year:    0 Student: studentID: 0002 | Major           undeclared |  Undergraduate | Number of Courses Taken:   0 | Courses Taken: \n");
		bw.write("Person: Name:                                | Birth Year:    0 Student: studentID: 0003 | Major                 Math |  Undergraduate | Number of Courses Taken:   0 | Courses Taken: \n");
		bw.write("Person: Name:                    Wonderwoman | Birth Year: 1941 Student: studentID: 0004 | Major                  JST |       Graduate | Number of Courses Taken:   0 | Courses Taken: \n");
		bw.write("************************************************\n");
		bw.write("**************************************************************\n\n");
		
		
		bw.close();
		String readFile2;	
		BufferedReader bReader = new BufferedReader(
				new FileReader("SchoolDB_Updated"));
		
		while((readFile2 = bReader.readLine()) != null) {
			System.out.println(readFile2);
		}
		
			
		} catch (Exception e) {
			System.out.println("File not found");
		}
		
	
		
	}
}
