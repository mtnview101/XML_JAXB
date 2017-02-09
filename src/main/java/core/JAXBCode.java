package core;
import javax.xml.bind.*; import java.io.File;

public class JAXBCode { public static void main(String[] args) throws Exception {
File xml = new File("JAXBemployees.xml"); ///XML_JAXB/JAXBemployees.xml

JAXBContext jaxbC = JAXBContext.newInstance(JAXBType.class);
Unmarshaller jaxbU = jaxbC.createUnmarshaller();
JAXBType element = (JAXBType) jaxbU.unmarshal(xml);

      String id = element.employee.id;
      String first_Name = element.employee.name.first;
      String lst_name = element.employee.name.last;
      
      System.out.println("Employee ID:   \t" +  id + "; \r\n"
			              + "First name: \t" + first_Name + "; \r\n"
			              + "Last Name:  \t" +   lst_name + "; " );      


}}


