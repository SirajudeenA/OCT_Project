package com.helperfile.learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class File_Data_Reader {

	public static Properties p;

	public File_Data_Reader() throws IOException {

		File f = new File("C:\\Users\\Sirajudeen A\\eclipse-workspace\\Project_sep_22\\Test_Data.properties");

		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}

	public String get_Browser() {

		String browser = p.getProperty("browser");
		return browser;
	}

	public String getUrl() {

		String url = p.getProperty("url");
		return url;

	}

	public String getUsername() {

		String username = p.getProperty("username");
		return username;
	}

	public String getPassword() {

		String password = p.getProperty("password");
		return password;
	}
}
