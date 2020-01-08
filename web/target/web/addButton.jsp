<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Form</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.0.0-2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <form action="/RegisterServlet" method="post">
        <div class="form-group">
            <label for="exampleInputTitle">Title</label>
            <input type="text" class="form-control" id="exampleInputTitle" name="title" placeholder="Title">
        </div>
        <div class="form-group">
            <label for="exampleInputISBN">ISBN</label>
            <input type="text" class="form-control" id="exampleInputISBN" name="ISBN" placeholder="ISBN">
        </div>
        <div class="form-group">
            <label for="exampleInputPages">Pages</label>
            <input type="number" class="form-control" id="exampleInputPages" name="Pages">
        </div>
        <div class="form-group">
            <label for="exampleInputSummary">Summary</label>
            <input type="text" class="form-control" id="exampleInputSummary" name="Summary">
        </div>
        <div class="form-group">
            <label for="exampleInputRelease">Release</label>
            <input type="date" class="form-control" id="exampleInputRelease" name="Release" placeholder="dd-mm-rrrr">
        </div>

        <input type="submit" class="btn btn-outline-success" name=" action" value="ADD">
    </form>
</div>
</body>
</html>
