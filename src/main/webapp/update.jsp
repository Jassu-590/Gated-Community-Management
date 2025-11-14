<%@ page language="java" import="com.models.Complaints" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Gated Community Complaint Form</title>
  <style>
    body {
      font-family: 'Poppins', sans-serif;
      background-color: #f2f6ff;
      margin: 0;
      padding: 0;
    }

    .container {
      width: 400px;
      margin: 60px auto;
      background: white;
      padding: 30px 40px;
      border-radius: 15px;
      box-shadow: 0 4px 12px rgba(0,0,0,0.1);
    }

    h2 {
      text-align: center;
      color: #2b4eff;
      margin-bottom: 20px;
    }

    label {
      font-weight: 600;
      display: block;
      margin-top: 15px;
    }

    input, select, textarea {
      width: 100%;
      padding: 10px;
      margin-top: 5px;
      border-radius: 8px;
      border: 1px solid #ccc;
      font-size: 14px;
      transition: all 0.2s ease;
    }

    input:focus, select:focus, textarea:focus {
      border-color: #2b4eff;
      outline: none;
    }

    textarea {
      height: 80px;
      resize: none;
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

  </style>
</head>
<body>
  <div class="container">
    <h2> Complaint</h2>
    <% Complaints c =(Complaints) session.getAttribute("updatecomplaint"); %>
    <form action="update" method="post">
    <input type="hidden" name="cid" value="<%= c.getCid() %>" >
      <label for="name">Full Name</label>
      <input type="text"  name="name" value="<%= c.getName() %>" required>

      <label for="flat">Flat/Block Number</label>
      <input type="text" i name="flat" value="<%= c.getFlatNo() %>" required>

      <label for="email">Email</label>
      <input type="email"  name="email"  value="<%= c.getEmail() %>" readonly >

      <label for="phone">Phone Number</label>
      <input type="tel" name="phone" value="<%= c.getMobile() %>" required>

      <label for="type">Complaint Type</label>
      <select  name="ctype" required>
        <option ><%= c.getComplaintType() %></option>
        <option>Water Supply</option>
        <option>Electricity</option>
        <option>Security</option>
        <option>Cleanliness</option>
        <option>Parking</option>
        <option>Other</option>
      </select>

      <label for="urgency">Urgency Level</label>
      <select id="urgency" name="urgency" required >
         <option><%= c.getUrgencyLevel() %></option>
        <option>Low</option>
        <option>Medium</option>
        <option>High</option>
      </select>

      <label for="desc">Complaint Description</label>
      <textarea id="desc" name="desc" placeholder="Describe your complaint in 150 characters..." required><%= c.getComplaintDesp() %></textarea>
      
       <input name="statusid" value="<%= c.getStatusid() %>" type="hidden" >

      <button type="submit">Update Complaint</button>
    </form>
  </div>
</body>
</html>