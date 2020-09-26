package _11_Proc_Run;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Runtime1 {

	public static void main(String args[]) throws Exception {

		List<String> a = new ArrayList<String>();
		a.add("notepad.exe");
		a.add("chrome.exe");
		ProcessBuilder b = new ProcessBuilder("notepad.exe");
		Process p = b.start();
		Thread.sleep(1000);
		if (p.isAlive()) {
			p.destroy();
			System.out.println("Destroy");
		}
		System.out.println("End");
	}

}