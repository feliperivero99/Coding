package javajaxb;
 
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
 
 
/*
Reading Xml using Java Architecture for XML Binding (JAXB)


Java Architecture for XML Binding (JAXB) is a software framework that allows Java developers to map Java classes to XML representations.
JAXB provides two main features: the ability to marshal Java objects into XML and the inverse, i.e. to unmarshal XML back into Java objects.
In other words, JAXB allows storing and retrieving data in memory in any XML format, without the need to implement a specific set
of XML loading and saving routines for the program's class structure. It is similar to xsd.exe and XmlSerializer in the .NET Framework.

JAXB is particularly useful when the specification is complex and changing. In such a case, regularly changing the XML Schema definitions
to keep them synchronised with the Java definitions can be time consuming and error-prone.


*/ 
 
 
// "library.java" will become the root element 
@XmlRootElement(namespace = "test.xml")
 
public class library {
 
    //Wrapper
    @XmlElementWrapper(name = "Listbook")
    @XmlElement(name = "book")
    private ArrayList<book> Listbook;
    private String name;
    private String place;
 
    public ArrayList<book> getListbook() {
        return Listbook;
    }
 
    public void setListbook(ArrayList<book> Listbook) {
        this.Listbook = Listbook;
    }
 
    public void setname(String name) {
        this.name = name;
    }
 
    public void setplace(String place) {
        this.place = place;
    }
 
    public String getname() {
        return name;
    }
 
    public String getplace() {
        return place;
    }
     
     
 
}
