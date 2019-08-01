package service;

import dao.FilePrompter;
import dao.PathChecker;
import dao.PathPrompter;

import java.io.*;
import java.util.*;

public class GetPath {//return true if file is found. otherwise return false. 
	public static String getPath(Scanner sc) throws IOException{
		String path = PathPrompter.prompt(sc);
		if (PathChecker.checkPath(path)){
			String file = FilePrompter.filePrompt(sc);
			System.out.println(path + file);
			return path + "\\" + file;
		}
		else return null;
	}
}
