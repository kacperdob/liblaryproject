<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<jsp:include page="WEB-INF/fragments/header.jsp"/>

<head>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" type="text/css">

</head>
<div class="container mt-4">
<form action="/HomeServlet" method="post">
<table class="table table-hover">
    <thead>
    <tr>
        <th>#</th>
        <th>Titles</th>
        <th>ISBN</th>
<%--        <th>Author</th>--%>
        <th>Type</th>
        <th>Release</th>
        <th>Pages</th>
<%--        <th>Borrower</th>--%>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="book" items="${requestScope.books }" varStatus="loop">
    <tr>
        <th scope="row">${loop.index + 1}</th>
        <td>${book.title}</td>
        <td>${book.isbn}</td>
<%--        <td>${book.authorName}</td>--%>
        <td>${book.category}</td>
        <td>${book.releaseDate}</td>
        <td>${book.pages}</td>
<%--        <td>${not empty book.borrowerName ? book.borrowerName : '-' }</td>--%>
        <td><input class="form-check-input" type="radio" name="bookID" value="${book.idBook}" checked></td>
    </tr>
    </c:forEach>
    </tbody>
</table>
<input type="submit" class="btn btn-outline-success" name=" action" value="ADD">
<input type="submit" class="btn btn-outline-warning" name=" action" value="EDIT">
<input type="submit" class="btn btn-outline-primary" name=" action" value="SHOW">
<input type="submit" class="btn btn-outline-danger" name=" action" value="DELETE">
</form>

</div>
</body>
</html>
