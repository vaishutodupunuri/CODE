import java.util.Scanner.*;
import java.util.*;
import javax.servlet.HttpServlet.*;
import javax.servlet.*;
public class App{
public void commerce(HttpServletRequest request,httpServletResponse response) throws ServletException,IOException{
PrintWriter out=response.getWriter();
Class.forName("jdbc.oracle.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
Statement stmt=con.createStatement();
String name=request.getParameter("NAME");
String price=request.getParameter("PRICE");
String cat=request.getParameter("CAT");
String quant=request.getParameter("QUANT");
String pdate=request.getParameter("PDATE");
String edate=request.getParameter("EDATE");
stmt.executeUpdate("INSERT INTO TABLE store VALUES(name,price,cat,quant,pdate,edate)");
stmt.close();
con.close();
out.close();
}
}