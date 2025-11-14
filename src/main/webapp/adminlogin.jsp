<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Birla Community - Admin Login</title>
<style>
  body {
    font-family: 'Poppins', sans-serif;
    background: white;
    display: flex;
    align-items: center;
    justify-content: center;
    height: 100vh;
    margin: 0;
  }

  .login-container {
    background-color: #fff;
    width: 380px;
    padding: 40px 35px;
    border-radius: 18px;
    box-shadow: 0 6px 18px rgba(0,0,0,0.2);
    text-align: center;
  }

  .login-container h2 {
    margin-bottom: 25px;
    color: #2b4eff;
    font-size: 26px;
  }

  .input-group {
    margin-bottom: 20px;
    text-align: left;
  }

  .input-group label {
    display: block;
    font-weight: 600;
    margin-bottom: 6px;
    color: #333;
  }

  .input-group input {
    width: 100%;
    padding: 10px;
    border-radius: 8px;
    border: 1px solid #ccc;
    font-size: 15px;
    transition: 0.2s;
  }

  .input-group input:focus {
    border-color: #2b4eff;
    outline: none;
  }

  button {
    width: 100%;
    background-color: #2b4eff;
    color: white;
    border: none;
    padding: 12px;
    border-radius: 8px;
    font-size: 16px;
    font-weight: 600;
    cursor: pointer;
    transition: 0.3s;
  }

  button:hover {
    background-color: #1a33b8;
  }

  .footer {
    margin-top: 15px;
    font-size: 13px;
    color: #555;
  }

  .footer a {
    color: #2b4eff;
    text-decoration: none;
    font-weight: 600;
  }

  .footer a:hover {
    text-decoration: underline;
  }

</style>
</head>
<body>

  <div class="login-container">
    <h2>Admin Login</h2>

    <form action="adminlogin" method="post">
      <div class="input-group">
        <label for="email">Admin UserName</label>
        <input type="text"  name="username" placeholder="Enter your admin username" required>
      </div>

      <div class="input-group">
        <label for="password">Password</label>
        <input type="password" id="password" name="password" placeholder="Enter your password" required>
      </div>

      <button type="submit">Login</button>
    </form>

    <div class="footer">
      <p>Back to <a href="index.html">Home Page</a></p>
    </div>
  </div>

</body>
</html>
    