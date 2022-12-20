package Mysqlconnect;
import java.sql.*;

public class Demo{
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.连接到数据"库"上去
//        String url = "jdbc:mysql://192.168.211.10:3306/";
        String url="jdbc:mysql://192.168.211.10:3306/sysinfo";
        String user= "root";
        String passwd= "000000";
        Connection conn= DriverManager.getConnection(url,user,passwd);
        //3.构建SQL命令
        Statement state=conn.createStatement();
        String s="CREATE TABLE test(id int(5));";
        state.executeUpdate(s);

    }
}
