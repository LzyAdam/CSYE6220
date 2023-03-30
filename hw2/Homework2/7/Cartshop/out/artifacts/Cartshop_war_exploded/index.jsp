<%--
  Created by IntelliJ IDEA.
  User: Adam
  Date: 2/8/2023
  Time: 8:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>ShoppingCart</title>
  </head>
  <body>
  <form id="form1" name="form1" method="post" action="Add">
    <table border="2" >
      <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Supplier</td>
        <td>Select</td>
      </tr>
      <tr>
        <td>iphone14</td>
        <td>1300</td>
        <td>Apple</td>
        <td><input type="radio" id="iphone14" name="itemID" value="iphone14"></td>>
      </tr>
      <tr>
        <td>macbook</td>
        <td>1999</td>
        <td>Apple</td>
        <td><input type="radio" id="Macbook" name="itemID" value="Macbook"></td>>
      </tr>
      <tr>
        <td>apple-watch</td>
        <td>500</td>
        <td>Apple</td>
        <td><input type="radio" id="apple-Watch" name="itemID" value="apple-Watch"></td>>
      </tr>
      <tr >
        <td colspan="4">



            <input type="submit" name="Submit" value="submit" />


        </td>

      </tr>

      <tr >
        <td colspan="4">
          <a href="List">ShoppingCart</a>
        </td>

      </tr>






    <p>Quantity:(1/-1 to add or remove )
      <label>
        <input name="quantity" type="text" id="quantity" value="1/-1" />
      </label>


     </p>
  </form>



  </body>
</html>
