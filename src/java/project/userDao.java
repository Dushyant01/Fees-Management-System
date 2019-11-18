package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class userDao 
{
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public Connection getConnection()
    {
        try
        {
           con=DriverManager.getConnection("jdbc:mysql://localhost/practiseproject", "root", "");
        }
        catch(Exception e)
        {
            System.out.println("connection not stablish");
        }
       return con;
    }
    public int setData(String s)
    {
        int i=0;
        try
        {
        Connection conn= getConnection();
         PreparedStatement  ps=conn.prepareStatement(s);
         i=ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println("Data is not updated");
        }
        return i;
    }
     public ResultSet getData(String s)
    {
        
        try
        {
        Connection conn= getConnection();
         PreparedStatement  ps=conn.prepareStatement(s);
         rs=ps.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println("Data is not updated");
        }
        return rs;
    }
    
}
