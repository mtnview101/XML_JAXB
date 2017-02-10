package List;
	import java.io.File;
	import java.util.*;
	import javax.xml.bind.*;
	import javax.xml.parsers.*;
	import org.w3c.dom.Document;

	public class JAXBList {
	       public static void main(String[] args) throws Exception {

	    	   String url_xml = "http://alex.academy/ebay.xml";

	              DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	              DocumentBuilder db = dbf.newDocumentBuilder();
	              Document doc = db.parse(url_xml);
	              doc.getDocumentElement().normalize(); //File file = new File("employees.xml");
	              
	              JAXBListType o = (JAXBListType) JAXBContext.newInstance(JAXBListType.class).createUnmarshaller().unmarshal(doc);
	       
	              for (JAXBListType.JAXBebayListType emp : o.getkadu_response()) {
	                     
	                     /*List<String> id = new ArrayList<String>(); id.addAll(emp.getId());*/
	                     List<String> u = new ArrayList<String>(); u.addAll(emp.geturl());
	                     List<String> okw = new ArrayList<String>(); okw.addAll(emp.getorig_kw());
	                     List<String> nkw = new ArrayList<String>(); nkw.addAll(emp.getnormalized_kw());
	                     List<String> eng = new ArrayList<String>(); eng.addAll(emp.getengine());
	                     List<String> dbe = new ArrayList<String>(); dbe.addAll(emp.getdatabase());
	                     List<String> li = new ArrayList<String>(); li.addAll(emp.getlang_id());

	              System.out.println("url: \t\t\t" + u.toString().replaceAll("\\[|\\]", "") 
	                                + "orig_kw: \t\t"  + okw.toString().replaceAll("\\[|\\]", "") + ";\r\n"
	                                + "normalized_kw: \t\t"      + nkw.toString().replaceAll("\\[|\\]", "")  + ";\r\n"
	                                + "engine: \t\t"  + eng.toString().replaceAll("\\[|\\]", "") + ";\r\n"
	                                + "database: \t\t"      + dbe.toString().replaceAll("\\[|\\]", "")  + ";\r\n"
	                                + "lang_id: \t\t"      + li.toString().replaceAll("\\[|\\]", "")
	                                );
	              }
	}}