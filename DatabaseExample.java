/**Dhvani Uday Parekh
 * AIML-B3
 * 21070126126
*/
import java.sql.*;

public class DatabaseExample {
    public static void main(String[] args) {
        try {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        final String DB_URL="jdbc:mysql://localhost:3306/info?serverTimezone=UTC";
        final String USERNAME="root";
        final String PASSWORD="DhvaniP@22";
    
            // Establish a connection to the database
            Connection conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            
            // Create a statement object
            Statement stmt = conn.createStatement();
            
            // Execute a query and get the results
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            
            // Loop through the results and print them
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }
            
            // Close the resources
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
