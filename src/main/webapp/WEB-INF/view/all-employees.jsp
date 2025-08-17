<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="ru">
<head>
  <meta charset="UTF-8">
  <title>Все сотрудники</title>
</head>
<body>
  <h2>Список сотрудников</h2>
  <a href="/employee/askDetails">ссылка</a>

  <c:choose>
    <c:when test="${not empty employees}">
      <table border="1" cellpadding="6" cellspacing="0">
        <thead>
          <tr>
            <th>Id</th>
            <th>Имя</th>
            <th>Фамилия</th>
            <th>Зарплата</th>
            <th>Отдел</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="emp" items="${employees}">
            <tr>
              <td>${emp.id}</td>
              <td>${emp.name}</td>
              <td>${emp.surname}</td>
              <td>${emp.salary}</td>
              <td>${emp.department}</td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </c:when>
    <c:otherwise>
      <p>Сотрудников не найдено.</p>
    </c:otherwise>
  </c:choose>
  <br/>
  <input type="button" onclick="window.location.href = '/addEmployee'" value="add"/>
</body>
</html>
