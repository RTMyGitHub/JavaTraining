<%@page language="java"%>

<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<table bordercolor="blue" border="1">
  <tr>
    <th>Cell Id</th>
    <th>CompanyName</th>
    <th>Model</th>
    <th>Price</th>
    <th> Action</th>
    
  </tr>
<logic:iterate id="aCellph" name="RajCellphones">

<tr>
<td>  <bean:write name="aCellph" property="cellid"/> <br/></td>
<td> <bean:write name="aCellph" property="cellCompanyname"/> <br/></td>
<td> <bean:write name="aCellph" property="model"/> <br/></td>
<td> <bean:write name="aCellph" property="price"/> <br/></td>
<td> <a href="/Raj-CellphonestoreStruts/edit.do?id=<bean:write name="aCellph" property="cellid"/>"> click</a> 
</tr>
</logic:iterate>
</table>
