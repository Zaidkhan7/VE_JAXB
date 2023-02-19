package com.ve.JAXBDemo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.ve.JAXBDemo.StudentData.Student;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
    		ArrayList<StudentData> list = new ArrayList<>();
			File file = new File("src/main/java/test.xml");
			JAXBContext objJAXB = JAXBContext.newInstance(StudentData.class);
			Unmarshaller objUnmarshaller = objJAXB.createUnmarshaller();
			StudentData sb = (StudentData) objUnmarshaller.unmarshal(file);
			
			List<Student> s = sb.getStudent();
			
			for(Student stu : s)
			{
				System.out.println("First Name : "+stu.getFirstname());
				System.out.println("Last Name : "+stu.getLastname());
				System.out.println("Roll No : "+stu.getRollno());
				System.out.println("Marks : "+stu.getMarks());
				System.out.println("--------------------------------------");
			}
			
			
			
			
			//list.add((studentBean)objUnmarshaller.unmarshal(file));
			
		
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
