package javacore;


public class JavaioRefresher {
	 public static void main(String[] args) {
		 
	        String fileName = System.getProperty("user.home")+"/customer.csv";
	         
	        System.out.println("Write CSV file:");
	        CSVFileWriter.writeCsvFile(fileName);
	         
	        System.out.println("\nRead CSV file:");
	       ReadFromCsv.readCsvFile(fileName);
	 
	    }
	 
	}

