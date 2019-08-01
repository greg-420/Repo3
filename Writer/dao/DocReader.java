package dao;

import java.io.*;

public class DocReader {//goes line by line for a certain document, counting the words.
	public static int count(String str){
		String[] splitStr = str.trim().split("\\s+"); //split according to spaces and tabs.
		return splitStr.length;
	}
	
	public static int readLine(String path) throws FileNotFoundException, IOException{
		try (BufferedReader br = new BufferedReader(new FileReader(path)))
		{
			int totalNum = 0;
			String s;
			while ((s = br.readLine()) != null){
				totalNum += count(s);
			}
			System.out.println("Total words in document: " + totalNum);
			return totalNum;
		}
		catch (FileNotFoundException e){
			//do nothing	
		}
		catch (IOException e){
			//do nothing
		}
		return 0;
	}
}
