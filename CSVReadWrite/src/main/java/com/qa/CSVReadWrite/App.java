package com.qa.CSVReadWrite;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class App 
{
	
	static String path = System.getProperty("user.dir");
	static String filePath = path + "\\Test.csv";
	
    public static void main( String[] args )
    {
    	//System.out.println("File path is : "+filePath); 
    	System.out.println("----------------------------------------------------------"); 
    	writeDataLineByLine(filePath); 
    	readDataLineByLine(filePath);
        
    }
    

	 // CSV file line by line 
	 public static void readDataLineByLine(String filePath) 
	 { 
	     try { 
	         // class with CSV file as a parameter. 
	         FileReader filereader = new FileReader(filePath); 
	   
	         // create csvReader object passing 
	         // file reader as a parameter 
	         CSVReader csvReader = new CSVReader(filereader); 
	         String[] nextRecord; 
	   
	         // we are going to read data line by line 
	         while ((nextRecord = csvReader.readNext()) != null) { 
	             for (String cell : nextRecord) { 
	                 System.out.print(cell + "\t | \t");
	             } 
	             System.out.println(); 
	             System.out.print("----------------------------------------------------------"); 
	             System.out.println(); 
	         } 
	     } 
	     catch (Exception e) { 
	         e.printStackTrace(); 
	     } 
	 } 
    
    

public static void writeDataLineByLine(String filePath) 
{ 
    // first create file object for file placed at location 
    // specified by filepath 
    File file = new File(filePath); 
    try { 
        // create FileWriter object with file as parameter 
        FileWriter outputfile = new FileWriter(file); 
  
        // create CSVWriter object filewriter object as parameter 
        CSVWriter writer = new CSVWriter(outputfile); 
  
        // adding header to csv 
        String[] header = { "NAME", "CLASS", "MARKS", "GRADE" }; 
        writer.writeNext(header); 
  
        // add data to csv 
        String[] data1 = { "Aman", "10", "620", "A" }; 
        writer.writeNext(data1); 
        String[] data2 = { "Suraj", "10", "630", "A" }; 
        writer.writeNext(data2); 
        String[] data3 = { "Ali", "10", "640", "A+" }; 
        writer.writeNext(data3); 
        String[] data4 = { "Polash", "10", "650", "A+" }; 
        writer.writeNext(data4); 
  
        // closing writer connection 
        writer.close(); 
    } 
    catch (IOException e) { 
        e.printStackTrace(); 
    } 
} 
    
    
}
