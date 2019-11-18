package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dushyant
 */
public class Connectionclass
{
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public Connection getConnection()
    {
        try
        { 
            Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost/practiseproject", "root", "");
        }
        catch(Exception e)
        {
            System.out.println("connection not stablish");
        }
       return con;
    }
    public int save(beanForMe m)
    {
        int i=0;
        try
        {
         Connection conn= getConnection();
         PreparedStatement  ps=conn.prepareStatement("insert into accountant(name,password,email,address,contact) values(?,?,?,?,?)");
         ps.setString(1, m.getName());
         ps.setString(2, m.getPassword());
         ps.setString(3, m.getEmail());
         ps.setString(4,m.getAddress());
         ps.setString(5, m.getContact());
         i=ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return i;
    }
    public List getRecord()
    {
        List<beanForMe> l=new ArrayList<beanForMe>();
        int i=0;
        try
        {
            Connection conn= getConnection();
        PreparedStatement  ps=conn.prepareStatement("select * from accountant(name,password,email,address,contact)");
        beanForMe m=new beanForMe();
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            m.setName(rs.getString(1));
            l.add(m);
        }
        }
        catch(Exception e)
        {
            
        }
        return l;
    }
    public int update(beanForMe k)
    {
        int j=0;
        try
            {
                Connection con=getConnection();
                PreparedStatement ps=con.prepareStatement("update accountant set name=?, password=?,email=?,address=?,contact=? where id=?");
                ps.setString(1, k.getName());
                ps.setString(2, k.getPassword());
                ps.setString(3, k.getEmail());
                ps.setString(4,k.getAddress());
                ps.setString(5, k.getContact());
                ps.setInt(6,k.getId());
                j=ps.executeUpdate();
    
            }
        catch(Exception e)
            {
                System.out.println(e);
            }
        return j;
        
       }
    public int delete(beanForMe d)
    {
    int l=0;
    try
        {
            Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement("delete from accountant where id=?");
            ps.setInt(1,d.getId());
            l=ps.executeUpdate();
        }
    catch(Exception e)
        {
            System.out.println(e);
        }
     return l;       
    }
}
