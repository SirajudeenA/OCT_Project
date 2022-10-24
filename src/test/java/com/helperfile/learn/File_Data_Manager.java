package com.helperfile.learn;

import java.io.IOException;

public class File_Data_Manager {

	
	private  File_Data_Manager() {

		//private constructor to avoid creating object in other class
		}
	
	public static File_Data_Manager getInstanceFRM() {

		File_Data_Manager manager= new File_Data_Manager();
	
		return manager;
	
		//return Current Class Object 
	
	}
	
	
	public File_Data_Reader getInstanceReader() throws IOException {

	File_Data_Reader reader = new File_Data_Reader();
	
	return reader;
	
	
	//return other Class objects
	
	}
	
}
