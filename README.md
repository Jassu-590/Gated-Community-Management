# Gated-Community-Management

A complete web-based application built to help gated communities manage resident information, complaints, maintenance, and admin operations.

## 📌 Project Overview

The Gated Community Management System** is designed to simplify daily operations within a gated community.
It supports:

* Resident login & signup
* Complaint registration and status tracking
* Admin dashboard for managing complaints
* Secure authentication
* User-friendly UI for residents and admins

This project follows the MVC architecture using Java Servlet + JSP + JDBC + MySQL.

## 🚀 Features

### 👤 Resident Module

* Resident Signup & Login
* Submit Complaints
* View Submitted Complaints
* Track Complaint Status
* Update Profile

### 🛠️ Admin Module

* Admin Login
* View all complaints
* Update complaint status (Pending → In-Progress → Resolved)
* Manage residents (optional for future enhancement)

### 🗄️ **Database**

* MySQL database with tables like:

  * `residents`
  * `complaints`
  * `users` (if separate)

---

## 🛠️ **Tech Stack**

| Component    | Technology          |
| ------------ | ------------------- |
| Frontend     | HTML, CSS, JSP      |
| Backend      | Java Servlets, JDBC |
| Database     | MySQL               |
| Server       | Apache Tomcat       |
| Architecture | MVC                 |

---

## 📂 **Project Structure**

```
GatedCommunityManagement/
│── src/
│   ├── com.servlets/
│   ├── com.models/
│   ├── com.dao/
│   └── com.config/
│
│── webapp/
│   ├── index.jsp
│   ├── login.jsp
│   ├── signup.jsp
│   ├── admin/
│   │   ├── adminLogin.jsp
│   │   ├── adminHome.jsp
│   │   └── updateStatus.jsp
│   └── resident/
│       ├── complaintForm.jsp
│       ├── complaintList.jsp
│       └── profile.jsp
│
│── sql/
│   └── database.sql
│
└── README.md
```

---

## 🧪 **How to Run the Project Locally**

### **1️⃣ Clone the Repository**

```bash
git clone https://github.com/your-username/gated-community-management.git
cd gated-community-management
```

### **2️⃣ Import into IDE**

* Open **Eclipse / IntelliJ / VS Code**
* Select **Import → Existing Maven/Java project**

### **3️⃣ Set Up the Database**

* Create a database in MySQL:

```sql
CREATE DATABASE gated_community;
```
 Run all queries from `database.sql`

### 4️⃣ Configure Database Connection

Update DB credentials inside your DAO or config class:

```java
String url = "jdbc:mysql://localhost:3306/gated_community";
String username = "root";
String password = "root";
```

### 5️⃣ Deploy on Tomcat

* Add project to **Apache Tomcat Server**
* Run the server
* Visit:

```
http://localhost:8080/GatedCommunityManagement/
```


## 📈 **Future Enhancements**

* Online payment system for maintenance
* Mobile-friendly UI
* Notification system (Email / SMS)
* Visitor Entry Management
* Resident chat support

---

##Author

Vedhuri Jaswanth Sai
M.Tech CSE (2026)
Email: vedhurijaswanthsai@gmail.com
