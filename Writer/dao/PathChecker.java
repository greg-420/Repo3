package dao;

import java.io.*;

public class PathChecker {
	public static boolean checkPath(String path) throws IOException, FileNotFoundException{ //0: malformed path. 1: path exists, file doesnt 2: file exists.
		File file = new File(path);
		boolean bool = file.isDirectory();
		if (bool)
			System.out.println("Valid path!");
		else System.out.println("Invalid path!");
		System.out.println(path);
		return bool;
	}
}
