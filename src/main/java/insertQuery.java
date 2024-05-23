import java.sql.*;
import java.util.*;

public class insertQuery {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myData","root","root");

        Scanner sc = new Scanner(System.in);

        //Insertion Operation
//        PreparedStatement ps = con.prepareStatement("INSERT INTO data VALUES(?,?,?)");
//        System.out.println("Enter the number of Users");
//        int n = sc.nextInt();
//        while(n-->0){
//            System.out.println("Enter your rollnum");
//            int roll = sc.nextInt();
//            sc.nextLine();
//            System.out.println("Enter your name");
//            String name = sc.nextLine();
//            System.out.println("Enter Your address");
//            String address = sc.nextLine();
//            ps.setInt(1,roll);
//            ps.setString(2,name);
//            ps.setString(3,address);
//            int c = ps.executeUpdate();
//            if(c>0){
//                System.out.println("USER ADDED SUCCESSFULLY");
//            }else{
//                System.out.println("ERROR OCCURED");
//            }
//        }


        //UPDATE OPERATION
//        System.out.println("Enter the rollnum to be edited");
//        int n = sc.nextInt();
//        System.out.println("Enter new rollnum");
//        int nn = sc.nextInt();
//        PreparedStatement ps = con.prepareStatement("UPDATE data SET id = ? WHERE id = ? ");
//        ps.setInt(1,nn);
//        ps.setInt(2,n);
//        int c = ps.executeUpdate();
//        if(c>0){
//            System.out.println("UPDATE SUCCESS");
//        }else{
//            System.out.println("UPDATE FAILED");
//        }
        //RETRIEVE DATA FROM TABLE
        PreparedStatement ps = con.prepareStatement("SELECT * FROM data");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.println("ID: "+rs.getString("id"));
            System.out.println("NAME: "+rs.getString("name"));
            System.out.println("ADDRESS: "+rs.getString("address"));
            System.out.println("-*-*-*-*-*-*");
        }

        ps.close();
        con.close();
    }
}
