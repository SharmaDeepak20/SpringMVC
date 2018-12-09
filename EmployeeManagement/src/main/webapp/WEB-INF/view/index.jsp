<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
  <fieldset>
      <form:form action="saveEmployee">
           <table>
               <tr>
                   <td><label>Employee Name</label></td>
                   <td><form:input path="name"/></td>
               </tr>
               
               <tr>
                   <td><label>Employee Designation</label></td>
                   <td><form:input path="desig"/></td>
               </tr>
               
               <tr>
                   <td><input type="submit" value="Submit"/></td>
                   <td><input type="reset" value="Reset"/></td>
               </tr>
           </table>
      </form:form>
  </fieldset>
</center>
</body>
</html>