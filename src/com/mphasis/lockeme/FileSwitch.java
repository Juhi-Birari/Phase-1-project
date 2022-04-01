package com.mphasis.lockeme;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class FileSwitch {
public static void main(String[] args) throws IOException {
	String path="D:\\simplilearn\\";
	
	int ch;
	char ch2;
	Scanner sc=new Scanner(System.in);
	
	while(true) {
		System.out.println("****MENU****");
		System.out.println("1.Retreive file in ascending order");
		System.out.println("2 Business levels operation ");
		System.out.println("3 Goto main menu");
		System.out.println("4 Exit");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
	switch(ch) {
	case 1:
		File f1=new File(path);
		File finame[]=f1.listFiles();
		System.out.println("Your file list..");
		for(File ff:finame) {
			System.out.println(ff.getName());
		}
		
		break;
	case 2:
		
		System.out.println("A. add file \nB. delete file \nC. search for file");
		System.out.println("What do you want to do : ");
				ch2=sc.next().charAt(0);
		switch(ch2) {
		case 'A':
			ArrayList<String> al=new ArrayList<>();
			while(true) {
				
			System.out.println("enter the file name to create");
			String filename=sc.next();
			String finalname=path+filename;
			System.out.println(finalname);

			//create a file 

			File f=new File(finalname);
			boolean b=f.createNewFile();
			if(b!=true) {
				System.out.println("the file not created");
				
			}
			else {
				al.add(filename);
				System.out.println("file created");
				break;
			}

			System.out.println("the collection of files is "+ al);
		}
			
		
		case 'B':
			System.out.println("Enter the file name to be deleted: ");
			String filname=sc.next();
			String finalfile=path+filname;
			File file=new File(finalfile);
			file.delete();
			System.out.println("File deleted");
			break;
			
		case 'C':
			File f=new File(path);
			System.out.println("Enter the file name to search");
			String filsearchname=sc.next();
			File filename[]=f.listFiles();
			int flag=0;
			for(File ff:filename) {
				if(ff.getName().equals(filsearchname)) {
					flag=1;
					break;
				}
				else {
					flag=0;
				}
			}
			if(flag==1) {
				System.out.println("Found the file");
			}
			else {
				System.out.println("File is not Found");
				
			}
			break;
		default:
			System.out.println("Uhave entered a invalid choice ");
			
			
		}
		break;
	
	case 3:
		System.ot.println("Goto main menu");
		System.out.println();
		break;
	case 4:
		System.exit(0);
		
	default:
		System.out.println("Process completed");
	}
}
}
}
