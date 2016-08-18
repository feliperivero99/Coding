package xmlxpath;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
 
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/*
Reading XML with XPATH

XPath (XML Path Language) is a query language for selecting nodes from an XML document. In addition, XPath may be used to compute values
(e.g., strings, numbers, or Boolean values) from the content of an XML document. XPath was defined by the World Wide Web Consortium (W3C)

*/


 
public class consultaXML {
     public void query() throws ParserConfigurationException, SAXException,IOException, XPathExpressionException {
       
        //Basic Xml Reader
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder;
        Document doc = null;
        XPathExpression expr = null;
        builder = factory.newDocumentBuilder();
        doc = builder.parse("doument.xml");
 
        //type XPathFactory object
        XPathFactory xFactory = XPathFactory.newInstance();
 
        //type Xpath object
        XPath xpath = xFactory.newXPath();
 
        // Xpath compilation
        expr = xpath.compile("//person[name='Silvia']/lastname/text()");
        
		// query inside the DOM (Document Object Model)
        Object result = expr.evaluate(doc, XPathConstants.NODESET);
 
        // The DOM (Document Object Model) query search is save in a nodelist
        NodeList nodes = (NodeList) result;
        for (int i = 0; i < nodes.getLength(); i++) {
            System.out.println(nodes.item(i).getNodeValue());
        }
 
        // Xpath compilation again to search all the registries with the name Silvia
        expr = xpath.compile("count(//person[name='Silvia'])");
        
		
		// Another query to find how many rows are registries with the name Silvia.
        
		Double number = (Double) expr.evaluate(doc, XPathConstants.NUMBER);
        
		System.out.println("Result: " + number);
 
        // Query asking if is more than two registries with the name Silvia
        expr = xpath.compile("count(//person[name='Silvia']) >2");
        // the query is executed 
        Boolean check = (Boolean) expr.evaluate(doc, XPathConstants.BOOLEAN);
        System.out.println(check);
    }
 
}