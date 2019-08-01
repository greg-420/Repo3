package service;

import java.io.*;
import java.util.*;

import dao.WriteDAO;

public class WriteDoc {//write lines to the document.
	public static void writeDoc(Scanner sc, String path){
		 WriteDAO.write(path, sc);
	}
}
