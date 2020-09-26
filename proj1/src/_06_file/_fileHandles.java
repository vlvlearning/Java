package _06_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
 
import org.apache.commons.io.FileUtils;

public class _fileHandles {

	public static void _writeFile_() {
		try {
			File file = new File("./FileLocation/test1.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter wr = new FileWriter(file, true);
			BufferedWriter bwr = new BufferedWriter(wr);
			bwr.write("This is program");
			bwr.write("Java");
			bwr.flush();
			bwr.close();
			System.out.println("Successfully write the data in a file");
		} catch (Exception e) {
			System.out.println("Method level - " + e);
		}
	}
 
	public static void _read_() {
		try {
			File file = new File("./FileLocation/test1.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileReader wr = new FileReader(file);
			BufferedReader bwr = new BufferedReader(wr);
			String line = bwr.readLine();
			while(line!=null)
			{ 
				System.out.println(line);
				line =  bwr.readLine();
			}
			System.out.println("Successfully read the data in a file");
		} catch (Exception e) {
			System.out.println("Method level - " + e);
		}
	}

	
	public static void _writeAppend_() {
		try {
			File file = new File("./FileLocation/test1.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter wr = new FileWriter(file, true);
			BufferedWriter bwr = new BufferedWriter(wr);
			bwr.write("This is program");
			bwr.write("Python");
			bwr.flush();
			bwr.close();
			System.out.println("Successfully append the data in a file");
		} catch (Exception e) {
			System.out.println("Method level - " + e);
		}
	}
	
	
	public static void _copy_()
	{
		try
		{
		FileUtils.copyFile(new File("./FileLocation/test1.txt"), new File("./FileLocation2/test1.txt"));
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

	public static void _move_()
	{
		try
		{
		FileUtils.moveFile(new File("./FileLocation/test1.txt"), new File("./FileLocation2/test1.txt"));
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

	public static void _delete_()
	{
		File file = new File("./FileLocation2/test1.txt");
		file.delete();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
