package List;
import java.util.*;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "kadu-response")
public class JAXBListType {
       List<JAXBebayListType> kadu_response = new ArrayList<JAXBebayListType>();

       @XmlElement(name = "server")
       List<JAXBebayListType> getkadu_response() {return kadu_response;}

       public static class JAXBebayListType {

/*              List<String> id = new ArrayList<String>();
              @XmlAttribute(name = "id") List<String> getId()              {return id;}*/

              List<String> url = new ArrayList<String>();
              @XmlElement(name = "url") List<String> geturl() {return url;}

              List<String> orig_kw = new ArrayList<String>();
              @XmlElement(name = "orig-kw") List<String> getorig_kw()   {return orig_kw;}
              
              List<String> normalized_kw = new ArrayList<String>();
              @XmlElement(name = "normalized-kw") List<String> getnormalized_kw()          {return normalized_kw;}
              
              List<String> engine = new ArrayList<String>();
              @XmlElement(name = "engine") List<String> getengine()    {return engine;}
              
              List<String> database = new ArrayList<String>();
              @XmlElement(name = "database") List<String> getdatabase()          {return database;}
              
              List<String> lang_id = new ArrayList<String>();
              @XmlElement(name = "lang_id") List<String> getlang_id()          {return lang_id;}
       }
}