package com.LockedMe;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("************************************Welcome to LockedMe App************************************");
		System.out.println("");
		System.out.println("                                    Mohd Ahsan(Web Developer)");
		System.out.println("                                    Current Company:-Simplilearn");
		System.out.println("                                    Work Experience:- Ten Years");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("                                Want to be a part of LockedMe family");
		System.out.println("                                             (Enter 1)");
		int saw=sc.nextInt();
		if(saw==1) {
		
		FileUtil util = new FileUtil();
		int ch;
		
		do {
			System.out.println("1.Add File");
			System.out.println("2.Delete File");
			System.out.println("3.Diaplay Files");
			System.out.println("4.search");
			System.out.println("5.exit");
			System.out.println("enter the choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				String fileName;
				System.out.println("Enter the filename");
				fileName=sc.next();
				util.addFile(fileName);
				System.out.println(fileName+ " is added successfully");
				
				break;
			case 2:
				String fileName1;
				System.out.println("Enter the filename");
				fileName1=sc.next();
				util.deleteFile(fileName1);
				System.out.println("File "+fileName1+" is deleted successfully");
				break;
			case 3:
				List<MyFile> files = util.getFiles();
				for (MyFile f : files)
					System.out.println(f.getId() + "\t" + f.getFileName());
				
				break;
			case 4:
				String fileName2;
				System.out.println("Enter the filename");
				fileName2=sc.next();
				if(util.search(fileName2))
					System.out.println("File is existed");
				else
					System.out.println("File not existed");
				break;
			}
		} while (ch < 5);
	}
		else{System.out.println("Wrong choice");}

}}