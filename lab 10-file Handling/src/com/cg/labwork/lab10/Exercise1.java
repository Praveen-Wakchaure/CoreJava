package com.cg.labwork.lab10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercise1 {
	public static void main(String[] args) throws IOException, FileNotFoundException{
		int lineNumber = 1;
		FileInputStream fis = new FileInputStream("C:\\Users\\Praveen\\eclipse-workspace\\lab 10-file Handling\\src\\com\\cg\\labwork\\lab10\\file.txt");
		int data;
		System.out.print(lineNumber++ + " ");
		while((data=fis.read()) != -1) {
			System.out.print((char)data);
			if((char)data == '\n')
				System.out.print(lineNumber++ + " ");			
		}
		fis.close();
	}
}