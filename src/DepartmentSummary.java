import java.sql.*;


public class DepartmentSummary {
    public static void main (String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "morrevah";
        String  password = "mor27195";
        Connection conn =DriverManager.getConnection(url,username,password);
        Statement st = conn.createStatement();
        String query = "SELECT Department.name AS department_name, COUNT(Employee.id) AS employee_count\n" +
                "FROM Department\n" +
                "LEFT JOIN Employee ON Department.id = Employee.dept_id\n" +
                "GROUP BY Department.id\n" +
                "ORDER BY employee_count DESC, department_name ASC";

        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            System.out.println(rs.getInt("employee_count"));
            System.out.println(rs.getString("department_name"));
        }
        st.close();
        conn.close();
    }
}
