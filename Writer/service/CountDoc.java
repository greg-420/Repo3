package service;

import java.io.FileNotFoundException;
import java.io.IOException;

import dao.DocReader;

public class CountDoc {//returns the total number of words in a document.
	
	public static int countDoc(String path) throws FileNotFoundException, IOException
	{
		return DocReader.readLine(path);
	}
}
