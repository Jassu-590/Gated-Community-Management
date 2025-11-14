<%@ page language="java" import="com.models.Complaints" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Update Complaint Status - Birla Gated Community</title>
<style>
  body {
    font-family: 'Poppins', sans-serif;
    background-color: #f2f6ff;
    margin: 0;
    padding: 0;
  }

  .container {
    width: 400px;
    margin: 70px auto;
    background: white;
    padding: 30px 40px;
    border-radius: 15px;
    box-shadow: 0 6px 18px rgba(0,0,0,0.1);
  }

  h2 {
    text-align: center;
    color: #2b4eff;
    margin-bottom: 25px;
  }

  label {
    font-weight: 600;
    display: block;
    margin-top: 15px;
  }

  select, input[type="text"] {
    width: 100%;
    padding: 10px;
    margin-top: 5px;
    border-radius: 8px;
    border: 1px solid #ccc;
    font-size: 14px;
    transition: all 0.2s ease;
  }

  select:focus {
    border-color: #2b4eff;
    outline: none;
  }

  button {
    margin-top: 20px;
    width: 100%;
    background-color: #2b4eff;
    color: white;
    border: none;
    padding: 12px;
    border-radius: 8px;
    cursor: pointer;
    font-size: 16px;
    font-weight: 600;
    transition: background 0.3s;
  }

  button:hover {
    background-color: #1a33b8;
  }

  .back-link {
    display: block;
    text-align: center;
    margin-top: 15px;
  }

  .back-link a {
    text-decoration: none;
    color: #2b4eff;
    font-weight: 600;
  }

  .back-link a:hover {
    text-decoration: underline;
  }

</style>
</head>
<body>

  <div class="container">
    <h2>Update Complaint Status</h2>
    <% 
       Complaints c = (Complaints) session.getAttribute("view");
       if (c != null) {
    %>

    <form action="statusupdate" method="post">
      <input type="hidden" name="cid" value="<%= c.getCid() %>">

      <label for="name">Complaint By</label>
      <input type="text" name="name" value="<%= c.getName() %>" readonly>

      <label for="flat">Flat No</label>
      <input type="text" name="flat" value="<%= c.getFlatNo() %>" readonly>

      <label for="status">Select New Status</label>
      <select id="status" name="status" required>
        <option selected disabled>-- Choose Status --</option>
        <option>Pending</option>
        <option>In Progress</option>
        <option>Resolved</option>
      </select>

      <button type="submit">Update Status</button>
    </form>

    <% } else { %>
      <p style="text-align:center; color:#888;">No complaint selected for update.</p>
    <% } %>

    <div class="back-link">
      <a href="adminportal">← Back to Dashboard</a>
    </div>
  </div>

</body>
</html>
