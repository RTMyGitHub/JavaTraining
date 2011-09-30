<%@page language="java"%>

<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<table bordercolor="blue" border="1">
  <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Rating</th>
    <th>Release Date</th>
    <th>Genre</th>
  </tr>
<logic:iterate id="aMovie" name="Movies">

<tr>
<td>ID : <bean:write name="aMovie" property="id"/> <br/></td>
<td>Name : <bean:write name="aMovie" property="name"/> <br/></td>
<td>Rating : <bean:write name="aMovie" property="rating"/> <br/></td>
<td>Release Date : <bean:write name="aMovie" property="releaseDate"/> <br/></td>
<td>Genre : <bean:write name="aMovie" property="genre"/> <br/></td>
</tr>
</logic:iterate>
</table>


