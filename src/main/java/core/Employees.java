package core;
import java.io.File;
import javax.xml.bind.*;
import javax.xml.parsers.*;
import org.w3c.dom.Document;

public class Employees {
public static void main(String[] args) throws Exception {

  String xml = "http://alex.academy/xml/employee.xml";
/*  <?xml version="1.0" encoding="utf-8"?>
  <employees xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="employees.xsd">

         <employee id="385450">
                <firstname>Mark</firstname>
                <lastname>Twain</lastname>
                <title>QA</title>
                <hiredate>April 20, 1910</hiredate>
                <phone>2125551212</phone>
                <email>mark_twain@gmail.com</email>

         </employee>
  </employees>*/

  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
  Document doc = dBuilder.parse(xml);
  doc.getDocumentElement().normalize(); 
  
//File file = new File("employee.xml"); // taka XML for file located in your project root directory
//EmployeesType o = (EmployeesType) JAXBContext.newInstance(EmployeesType.class).createUnmarshaller().unmarshal(file); 
  
EmployeesType o = (EmployeesType) JAXBContext.newInstance(EmployeesType.class).createUnmarshaller().unmarshal(doc); // public class EmployeesType.java
       
              System.out.println("Employee ID: \t" +   o.employee.id + "; \r\n"
                                  + "First name: \t" + o.employee.firstname + "; \r\n"
                                  + "Last Name: \t" +   o.employee.lastname + "; \r\n"
                                  + "Title: \t\t" +       o.employee.title + "; \r\n"
                                  + "Hire date: \t" +   o.employee.hiredate + "; \r\n"
                                  + "Phone: \t\t" +       o.employee.phone + "; \r\n"
                                  + "Email: \t\t" +       o.employee.email
                                  );
      }
}
