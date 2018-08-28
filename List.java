import java.util.Scanner.*;
import java.util.*;
import javax.servlet.HttpServlet.*;
import javax.servlet.*;
public class List{
public void listing(HttpServletRequest request,httpServletResponse response) throws ServletException,IOException{
PrintWriter out=response.getWriter();
Class.forName("jdbc.oracle.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("SELECT * FROM store");
out.print("<html><body><table><tr><th>NAME</th><th>PRICE</th><th>CATEGORY</th><th>QUANTITY</th><th>PURCHASE DATE</th><th>EXPIRT DATE</th>");
while(rs.next()){
out.print("<tr>");
out.print("<td>"+getString(1)+"</td><td>"+getString(2)+"</td><td>"
	+getString(3)+"</td><td>"+getString(4)+"</td><td>"
	+getString(5)+"</td><td>"+getString(6)+"</td>");
out.print("</tr>");}
out.print("</table></body></html>");
out.print("<input type=dropdown name=FILTER
<select><option> <a href>cat.java</a>CATEGORY</option>
<option><a href>price.java>PRICE</option></select>");

stmt.close();
con.close();
out.close();

}
}