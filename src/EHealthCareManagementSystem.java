import java.sql.*;

public class EHealthCareManagementSystem {
	public static void main(String[] args) {
		try {
			// Connect to the database
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ehealthcare", "root", "password");

			// Create a statement
			Statement stmt = conn.createStatement();

			// Execute a query to create the doctor table
			String createDoctorTable = "CREATE TABLE doctor (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), email VARCHAR(255), specialization VARCHAR(255))";
			stmt.executeUpdate(createDoctorTable);

			// Execute a query to create the patient table
			String createPatientTable = "CREATE TABLE patient (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), email VARCHAR(255), dob DATE)";
			stmt.executeUpdate(createPatientTable);

			// Execute a query to create the hospital table
			String createHospitalTable = "CREATE TABLE hospital (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), address VARCHAR(255), phone VARCHAR(255))";
			stmt.executeUpdate(createHospitalTable);

			// Close the statement and connection
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}