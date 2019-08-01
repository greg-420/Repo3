package application;


import java.io.*;
import java.util.*;

import dao.PathChecker;
import dao.PathPrompter;
import service.CountDoc;
import service.GetPath;
import service.WriteDoc;

public class Writer {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner (System.in);
		String filepath = GetPath.getPath(sc); //grab the whole line. then attempt to create a new file.
//		String filepath = "C:\\Users\\gregory.gao\\Desktop\\abc1.txt"; can use this as an alternative.
		WriteDoc.writeDoc(sc, filepath);
		CountDoc.countDoc(filepath);
	}

}
