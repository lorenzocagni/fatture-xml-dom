package fatturaxml;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.io.File;
import java.util.Scanner;
import javax.xml.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
import java.lang.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author Cagni Lorenzo
 */
public class FatturaXML {

    public static final String xmlFilePath = "fattura.xml";
    
    public static void main(String argv[]) throws InterruptedException {
 
        gestioneFatture fatturaNuova = new  gestioneFatture();
        fatturaNuova.gestioneFatture();
       
        
    }
        
        
    
}
