<%@ page import="java.sql.DriverManager"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*"%>
<%@ page import="java.io.PrintWriter"%>
<%
String a= request.getParameter("Name");
String b= request.getParameter("Roll");
String c= request.getParameter("Address");
String d= request.getParameter("City");

Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver Loaded");
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root", "root");
System.out.println("Connection established");

PreparedStatement preparedstatement= connection.prepareStatement("insert into Information value(?,?,?,?)");
preparedstatement.setString(1, a);
preparedstatement.setString(2, b);
preparedstatement.setString(3, c);
preparedstatement.setString(4, d);

int returnValue=preparedstatement.executeUpdate();
if (returnValue != 0) {
     out.println("inserted");
}
else
{
    out.println("not inserted");
}
%>


</body>
</html>

