package service;

import dao.PathChecker;
import dao.PathPrompter;

import java.io.*;
import java.util.*;

public class GetPath {//return true if file is found. otherwise return false. 
	public static boolean getPath(Scanner sc) throws IOException{
		String path = PathPrompter.prompt(sc);
		switch (PathChecker.checkPath(path)){
		case 0:
			System.out.println("Path not valid!");
			return false;
		case 1:
			System.out.println("File not found..");
			return false;
		case 2:
			System.out.println("File found!");
			return true;
		}
		return false;
	}
}
