package dao;

import java.io.*;

public class PathChecker {
	public static int checkPath(String path) throws IOException, FileNotFoundException{ //0: malformed path. 1: path exists, file doesnt 2: file exists.
		File file = new File (path);
		if (!file.isDirectory()) //invalid directory
			return 0;
		else if (file.exists()){ //file exists
			return 2;
		}
		else return 1; //valid directory, file doesn't exist.
	}
}
