package file;

import java.io.FileInputStream;
import java.io.ObjectInputStream;



public class DesarilEx {
	public static void main(String[] args) throws Exception {
		
	
	
	FileInputStream fis=new FileInputStream("D://abcd.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	
	
	Object o=ois.readObject();
	Student s=(Student)o;
	
	System.out.println(s.name);
	System.out.println(s.age);
	System.out.println(s.location);
			

}
}