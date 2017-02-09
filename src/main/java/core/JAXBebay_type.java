package core;
import javax.xml.bind.annotation.*;
@XmlRootElement(name = "kadu-response")
public class JAXBebay_type {
       @XmlElement(name = "server") protected Level2 server;
        static class Level2 {
                   //@XmlAttribute(name = "id") String id;
                   @XmlElement(name = "url") 				String url;
                   @XmlElement(name = "orig-kw") 			String orig_kw;
                   @XmlElement(name = "normalized-kw") 		String normalized_kw;
                   @XmlElement(name = "engine") 			String engine;
                   @XmlElement(name = "database") 			String database;
                   @XmlElement(name = "lang_id") 			String lang_id;
                   @XmlElement(name = "country_id") 		String country_id;
                   @XmlElement(name = "kadu-branch") 		String kadu_branch;
                   @XmlElement(name = "kadu-version") 		String kadu_version;
                   @XmlElement(name = "kadu-index-info") 	String kadu_index_info;
                   
                   /*protected Level3 name;*/}
        
/*        static class Level3 {
                   @XmlElement(name = "first") String first;
                   @XmlElement(name = "last") String last;}*/}



