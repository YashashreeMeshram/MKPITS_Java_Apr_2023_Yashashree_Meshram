<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<%

    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("Driver Loaded");
    Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root", "root");
    System.out.println("Connection established");
    Statement statement= connection.createStatement();
    ResultSet resultSet=statement.executeQuery("select*from Information");


%>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <table border="1" align="center">
     <tr>
         <th>Name</th>
         <th>Roll</th>
         <th>Address</th>
         <th>City</th>
     </tr>
     <%
         while(resultSet.next())
         {
     %>
     <tr>
         <td><%=resultSet.getString(1)%></td>
         <td><%=resultSet.getString(2)%></td>
         <td><%=resultSet.getString(3)%></td>
         <td><%=resultSet.getString(4)%></td>
     </tr>
     <%
         }

     %>
 </table>

</body>
</html>
