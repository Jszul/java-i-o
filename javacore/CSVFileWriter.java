package javacore;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFileWriter {

	private static final String FILE_HEADER = "id,firstName,lastName,gender,age";

	public static void writeCsvFile(String fileName) {
		Customer customer1 = new Customer(1, "Ahmed", "Mohamed", "M", 25);
		Customer customer2 = new Customer(2, "Sara", "Said", "F", 23);
		Customer customer3 = new Customer(3, "Ali", "Hassan", "M", 24);
		Customer customer4 = new Customer(4, "Sama", "Karim", "F", 20);
		Customer customer5 = new Customer(5, "Khaled", "Mohamed", "M", 22);
		Customer customer6 = new Customer(6, "Ghada", "Sarhan", "F", 21);


		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4); 
		customers.add(customer5);
		customers.add(customer6);

		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(fileName);

			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());

			// Add a new line separator after the header
			fileWriter.append("\n");

			for (Customer customer : customers) {
				fileWriter.append(String.valueOf(customer.getId()));
				fileWriter.append(",");
				fileWriter.append(customer.getFirstName());
				fileWriter.append(",");
				fileWriter.append(customer.getLastName());
				fileWriter.append(",");
				fileWriter.append(customer.getGender());
				fileWriter.append(",");
				fileWriter.append(String.valueOf(customer.getAge()));
				fileWriter.append("\n");
			}
			System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
				e.printStackTrace();
			}
		}
	}
}
