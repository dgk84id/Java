import java.io.*;
import java.util.*;


class filemanip{

public static void main(String[] args) throws IOException{
	File file = new File("e://testFile1.txt");
	if (file.createNewFile()){
	System.out.println("File is created!");
	}else{
	System.out.println("File already exists.");
	}
	 
	//Write Content
	FileWriter writer = new FileWriter(file);
	writer.write("Test data");
	writer.close();

Scanner input = new Scanner(System.in);

System.out.println("Enter the name of the file:");

String file_name = input.nextLine();

File f = new File(file_name);

if(f.exists())

System.out.println("The file " +file_name+ " exists");

else

System.out.println("The file " +file_name+ " does not exist");

 

if(f.exists()){
if(f.canRead())

System.out.println("The file " +file_name+ " is readable");

else

System.out.println("The file " +file_name+ " is not readable");

 

if(f.canWrite())

System.out.println("The file " +file_name+ " is writeable");

else

System.out.println("The file " +file_name+ " is not writeable");

 

System.out.println("The file type is: " +file_name.substring(file_name.indexOf('.')+1));

 

System.out.println("The Length of the file:" +f.length());

}

 

}

}