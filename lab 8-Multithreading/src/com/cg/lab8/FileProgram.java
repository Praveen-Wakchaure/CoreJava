package com.cg.lab8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram {

	public static void main(String[] args) {
		
		File fObj = new File("C:\\Users\\1UIN\\eclipse-workspace\\java-assignment\\source.txt");
		CopyDataThread threadObj = new CopyDataThread(fObj);
		threadObj.start();
	}
	
}

class CopyDataThread extends Thread {
	
	File fileObj;
	
	public CopyDataThread(File fileObj) {
		this.fileObj = fileObj;
	}
	
	public void run()
	{
		try(FileReader fr = new FileReader(fileObj);
			FileWriter fw = new FileWriter("target.txt");) {
			int i;
			int count = 0;
			
			while((i = fr.read()) != -1) {
				fw.write((char)i);
				count++;
				if(count == 10) {
					System.out.println("10 characters are copied");
					count = 0;
					Thread.sleep(500);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}