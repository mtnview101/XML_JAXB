package core;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import javax.xml.bind.*;
import javax.xml.bind.annotation.XmlElement;

import java.io.File;

public class JAXBebay_code { public static void main(String[] args) throws Exception {
//File xml = new File("JAXBemployees.xml"); ///XML_JAXB/JAXBemployees.xml

String url_xml = "http://alex.academy/ebay.xml";

DocumentBuilderFactory f = DocumentBuilderFactory.newInstance(); // Get the DOM Builder Factory
DocumentBuilder b = f.newDocumentBuilder(); // Get the DOM Builder
Document d = b.parse(url_xml); // Load and Parse the XML document contains the complete XML as a Tree.
d.getDocumentElement().normalize();// Optional

JAXBContext jaxbC = JAXBContext.newInstance(JAXBebay_type.class);
Unmarshaller jaxbU = jaxbC.createUnmarshaller();
JAXBebay_type element = (JAXBebay_type) jaxbU.unmarshal(d);

String url 			= element.server.url;
String orig_kw 		= element.server.orig_kw;
String normalized_kw = element.server.normalized_kw;
String engine 		= element.server.engine;
String database 	= element.server.database;
String lang_id 		= element.server.lang_id;
String country_id 	= element.server.country_id;
String kadu_branch 	= element.server.kadu_branch;
String kadu_version = element.server.kadu_version;
String kadu_index_info = element.server.kadu_index_info;

      
      System.out.println("url:   \t\t\t" +  url 
			              + "orig_kw: \t\t" + orig_kw + "; \r\n"
			              + "normalized_kw:  \t" +   normalized_kw + "; "
			              + "engine: \t\t" + engine + "; \r\n"
			              + "database: \t\t" + database + "; \r\n"
			              + "lang_id: \t\t" + lang_id + "; \r\n"
			              + "country_id: \t\t" + country_id + "; \r\n"
			              + "kadu_branch: \t\t" + kadu_branch + "; \r\n"
			              + "kadu_version: \t\t" + kadu_version + "; \r\n"
			              + "kadu_index_info: \t" + kadu_index_info + "; \r\n" );      


}}
