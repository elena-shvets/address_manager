<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>--%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Add address</title>
</head>
<body>

<div>

    <form name="add_address" method="POST">
        <div>Country:<select>
            <option></option>
        </select> </div>
        <div>Address: <input id="address" maxlength="40" name="address" placeholder="Enter address..." size="40" value=""></div>
        <div>Phone 1: <input class="phone" maxlength="15" name="phone1" placeholder="Enter phone..." size="40" value=""></div>
        <div>Phone 2: <input class="phone" maxlength="15" name="phone2" placeholder="Enter phone..." size="40" value=""></div>
        <div>Phone 3: <input class="phone" maxlength="15" name="phone3" placeholder="Enter phone..." size="40" value=""></div>
        <div>Phone 4: <input class="phone" maxlength="15" name="phone4" placeholder="Enter phone..." size="40" value=""></div>
        <div>Phone 5: <input class="phone" maxlength="15" name="phone5" placeholder="Enter phone..." size="40" value=""></div>
</form>
</div>

</body>
</html>