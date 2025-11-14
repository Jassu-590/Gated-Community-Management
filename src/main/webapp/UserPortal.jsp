<%@ page language="java" import="java.util.List,com.models.Complaints" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
a{
text-decoration:none;
color:black;
}

th,td{
padding:5px;
}
table{
  width: 90%;
    margin: auto;
    border-collapse: collapse;
    background: white;
    box-shadow: 0 4px 12px rgba(0,0,0,0.1);
    border-radius: 12px;
    overflow: hidden;
}
th {
    background-color: black;
    color: white;
  }

  th, td {
    padding: 14px 16px;
    text-align: left;
  }

  tr:nth-child(even) {
    background-color: #f8faff;
  }

  tr:hover {
    background-color: #e8eeff;
    transition: 0.2s;
  }

  th {
    font-weight: 600;
    text-transform: uppercase;
    font-size: 13px;
  }

  td {
    color: #333;
    font-size: 14px;
  }
  
    .btn {
    background-color: black;
    color: white;
    padding: 6px 12px;
    border-radius: 6px;
    text-decoration: none;
    font-size: 13px;
    transition: 0.3s;
    font-weight:bold;
  }
  
</style>
</head>
<body>
<center><h1 style="background-color:black;color:white">Birla Gated Community </h1></center>
<marquee style="margin-bottom:-5px;margin-top:-18px;"><p><b><i>Hello ${applicationScope.name}</i></b></p></marquee>
<div>
<button  class="btn">
<a href="compliantform.jsp" style="text-decoration:none;color:white">Raise a Complaint</a></button>
&nbsp;&nbsp;
<button  class="btn" style="float:right;">
<a href="index.html" style="text-decoration:none;color:white;">Logout</a></button>
</div>
<br>
<center>
<table border="1" style="border-collapse:collapse;padding:5px">
<tr>
<th>Compliant Id </th>
<th>Name </th>
<th>Flat No </th>
<th>Email </th>
<th>Mobile </th>
<th>Complaint Type </th>
<th>Urgency Level </th>
<th>Status </th>
<th>Action</th>
</tr>
<% List<Complaints> list = (List<Complaints>) session.getAttribute("complaints");
for(Complaints c:list){
%>
<tr>
<td><%= c.getCid() %></td>
<td><%= c.getName() %></td>
<td><%= c.getFlatNo() %></td>
<td><%= c.getEmail() %></td>
<td><%= c.getMobile() %></td>
<td><%= c.getComplaintType() %></td>
<td><%= c.getUrgencyLevel() %></td>
<td><%= c.getStatusid() %></td>
<td style="padding:3px">
&nbsp;&nbsp;
<a href="view?id=<%= c.getCid() %>" ><button style="background-color:green;border-radius:5px;font-weight:bold" >View</button></a>&nbsp;&nbsp;
<a href="updatetransfer?id=<%= c.getCid() %>" ><button style="background-color:yellow;border-radius:5px;;font-weight:bold">Update</button></a>&nbsp;&nbsp;
<a href="delete?id=<%= c.getCid() %>" ><button style="background-color:red;border-radius:5px;;font-weight:bold">Delete</button></a>&nbsp;&nbsp;
</td>
<% } %>
</tr>
</table>
</center>
</body>
</html>