import java.sql.*;
import java.util.Scanner;


class FetchAttendanceByDaysPresent {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String url = "jdbc:mysql://localhost/ri_db";
        String username = "test";
        String password = "test123";
        int daysThreshold = scanner.nextInt();
        Connection conn = null;
        PreparedStatementn psmt = null;
        ResultSet rs = null;


        catch(SQLException e){
            System.out.println("SQL Exception pccured: " + e.getMessage());
            e.printStackTrace()
        
        
            finally{
                try{
                    if(rs != null) rs.close();

                }
            }
        }

    }
}
