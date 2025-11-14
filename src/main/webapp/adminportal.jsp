
<%@ page language="java" import="java.util.*,com.models.Complaints" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Birla Gated Community - Admin Dashboard</title>
<style>
  body {
    font-family: 'Poppins', sans-serif;
    background-color: #f4f7ff;
    margin: 0;
    padding: 0;
  }

  header {
    background: linear-gradient(135deg, #2b4eff, #1a33b8);
    color: white;
    text-align: center;
    padding: 25px 0;
    box-shadow: 0 4px 10px rgba(0,0,0,0.1);
  }

  header h1 {
    margin: 0;
    font-size: 30px;
    letter-spacing: 1px;
  }

  .container {
    width: 90%;
    margin: 40px auto;
    background: white;
    border-radius: 15px;
    box-shadow: 0 6px 18px rgba(0,0,0,0.1);
    padding: 30px;
  }

  h2 {
    color: #2b4eff;
    text-align: center;
    margin-bottom: 20px;
  }

  table {
    width: 100%;
    border-collapse: collapse;
    overflow: hidden;
    border-radius: 10px;
  }

  thead {
    background-color: #2b4eff;
    color: white;
  }

  th, td {
    padding: 14px 16px;
    text-align: left;
  }

  th {
    text-transform: uppercase;
    font-size: 13px;
  }

  tr:nth-child(even) {
    background-color: #f8faff;
  }

  tr:hover {
    background-color: #e8eeff;
    transition: 0.2s;
  }

  td {
    font-size: 14px;
    color: #333;
  }

  .btn {
    background-color: #2b4eff;
    color: white;
    padding: 6px 12px;
    border-radius: 6px;
    text-decoration: none;
    font-size: 13px;
    transition: 0.3s;
  }

  .btn:hover {
    background-color: #1a33b8;
  }

  .logout {
    position: absolute;
    right: 40px;
    top: 25px;
    background: white;
    color: #2b4eff;
    padding: 6px 12px;
    border-radius: 6px;
    font-weight: 600;
    text-decoration: none;
  }

  .logout:hover {
    background: #f1f3ff;
  }

</style>
</head>
<body>

<header>
  <h1>Birla Gated Community</h1>
  <a href="adminlogin.jsp" class="logout">Logout</a>
</header>

<div class="container">
  <h2>Complaint Dashboard</h2>

  <table>
    <thead>
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Flat</th>
        <th>Email</th>
        <th>Type</th>
        <th>Urgency</th>
        <th>Status</th>
        <th>Action</th>
      </tr>
    </thead>
    <tbody>
      <%
        List<Complaints> list = (List<Complaints>) session.getAttribute("complaints");
        if (list != null && !list.isEmpty()) {
          for (Complaints c : list) {
      %>
      <tr>
        <td><%= c.getCid() %></td>
        <td><%= c.getName() %></td>
        <td><%= c.getFlatNo() %></td>
        <td><%= c.getEmail() %></td>
        <td><%= c.getComplaintType() %></td>
        <td><%= c.getUrgencyLevel() %></td>
        <td><%= c.getStatusid() %></td>
        <td>
          <a href="updatestatus?id=<%= c.getCid() %>" class="btn">Update</a>
        </td>
      </tr>
      <%
          }
        } else {
      %>
      <tr>
        <td colspan="8" style="text-align:center; color:#777; padding:20px;">No complaints found.</td>
      </tr>
      <% } %>
    </tbody>
  </table>
</div>

</body>
</html>
    