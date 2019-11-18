/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

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
    public int save(student.beanForMe m)
    {
        int i=0;
        try
        {
         Connection conn= getConnection();
         PreparedStatement  ps=conn.prepareStatement("insert into student(name,email,sex,stream,fee,paid,due,contact) values(?,?,?,?,?,?,?,?)");
         ps.setString(1, m.getName());
         ps.setString(2, m.getEmail());
         ps.setString(3, m.getSex());
         ps.setString(4, m.getStream());
         ps.setInt(5,m.getFee());
         ps.setInt(6, m.getPaid());
         ps.setInt(7, m.getDue());
         ps.setInt(8, m.getContact());
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
        List<student.beanForMe> l=new ArrayList<student.beanForMe>();
        int i=0;
        try
        {
            Connection conn= getConnection();
        PreparedStatement  ps=conn.prepareStatement("select * from student(name,email,sex,stream,fee,paid,due,contact)");
        student.beanForMe m=new student.beanForMe();
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
    public int update(student.beanForMe k)
    {
        int j=0;
        try
            {
                Connection con=getConnection();
                PreparedStatement ps=con.prepareStatement("update student set name=?, email=?,sex=?,stream=?,fee=?,paid=?,due=?,contact=? where id=?");
                ps.setString(1, k.getName());
                ps.setString(2, k.getEmail());
                ps.setString(3, k.getSex());
                ps.setString(4,k.getStream());
                ps.setInt(6, k.getPaid());
                ps.setInt(7, k.getDue());
                ps.setInt(8, k.getContact());
                ps.setInt(9,k.getId());
                j=ps.executeUpdate();
    
            }
        catch(Exception e)
            {
                System.out.println(e);
            }
        return j;
        
       }
    public int delete(project.beanForMe d)
    {
    int l=0;
    try
        {
            Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement("delete from student where id=?");
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

    

