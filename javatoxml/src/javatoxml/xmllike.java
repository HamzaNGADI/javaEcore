package javatoxml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

import org.jdom2.*;
import org.jdom2.input.*;
import org.jdom2.input.sax.XMLReaders;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.jdom2.filter.Filters;
import org.jdom2.util.IteratorIterable;



public class xmllike {
	static int ire=0,iree=0;
    static String sb ="";

	
	public static void toStringRecursive(Object o) throws Exception {
	    
		String sr="";
		for(int j=0;j<iree;j++)  sr+="\t";
		iree++;
		sb+=sr+"begin "+o.getClass().getSimpleName()+"\n";
          Method m = o.getClass().getMethod("toString");
	 	    sb +=sr+ m.invoke(o)+"\n";
	 	    
		for (Field f : o.getClass().getDeclaredFields()) {
	        if (Modifier.isStatic(f.getModifiers()))
	            continue;
	        f.setAccessible(true);
	       
	        toStringRecursive(f.get(o));
	    }
		sb+=sr+"end "+o.getClass().getSimpleName()+"\n";
		iree--;
	}
	
	
	static void recu(Element rootin)
	{
	
		for(Element l : rootin.getChildren())
  		{
			ire++;
			for(int j=0;j<ire;j++)  System.out.print("\t");
  			System.out.println(l.getName());
  			recu(l);
  			ire--;
  		}
	}


	public static void main(String[] args) throws JDOMException,IOException {
		// TODO Auto-generated method stub
		Document document = null;
        Element root = null;
        /*File xmlFile = new File("compte.xml");
        int solde = 2000, id = 1;
     
            document = new Document();
            root = new Element("banque");
        
     for(int i=0;i<3;i++) {
        Element compte = new Element("compte");
        compte.setAttribute(new Attribute("idCompte", Integer.toString(id)));
        
        Element numecmt = new Element("numCompte");
        numecmt.setAttribute((new Attribute("idcheck", Integer.toString(1))));
        Element nume = new Element("nume");
        nume.setText("cmt+"+i);
        
        numecmt.addContent(nume);
        
        compte.addContent(numecmt);
        compte.addContent(new Element("solde").setText(Integer.toString(solde)));

        root.addContent(compte);
        id++; solde+=20;
        }
        document.setContent(root);

        FileWriter writer = new FileWriter("compte.xml");
          XMLOutputter outputter = new XMLOutputter();
          outputter.setFormat(Format.getPrettyFormat());
          outputter.output(document, writer);
          outputter.output(document, System.out);
          writer.close();     */
          
        SAXBuilder builder = new SAXBuilder();
        File xmm = new File("compte.xml");

  	  try {

  		Document doc = (Document) builder.build(xmm);
  		Element rootNode = doc.getRootElement();
  
  			System.out.println(rootNode.getName());
  			recu(rootNode);
  		
  	  }
  	  catch(Exception e) {System.out.print(e.getMessage());}

  	//File xmmv = new File("compte.xml");
      String sv="";

  	  try {
  	     System.out.println("\n-----------------------");

  		SAXBuilder builderS = new SAXBuilder();
        File xmmS = new File("SDL.xml");


  		Document doc = (Document) builderS.build(xmmS);
  		Element rootNode = doc.getRootElement();
  
  			System.out.println(rootNode.getName());
  			recu(rootNode);
  		
  	  
  		  
  	InputStream xmmv = new FileInputStream("SDL.xml");

     SAXBuilder build = new SAXBuilder(XMLReaders.DTDVALIDATING);
     Document validDocument = build.build(xmmv);
     System.out.println("Public root "+validDocument.getRootElement());

     DocType docType = validDocument.getDocType();
     
   
     System.out.println("Public ID: " + docType.getPublicID());
     System.out.println("System ID: " + docType.getSystemID());
  	  }
  	  catch(Exception e) {System.out.println(e.getMessage());
  	  sv = e.getMessage();
  	  }
  	  finally {
  	System.out.print(sv+" haaa\n");
  	  }
  	  
  	  
  	a aa = new a();
	try {
		toStringRecursive(aa);
	  System.out.print(	sb);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  	  
  	  
	}
	

}


class a
{
	b bb = new b();
	c cc = new c();
	public String toString ()
	{
		return "its a\n";
	}
}
class b
{
	d dd = new d();

	public String toString ()
	{
		return "its b\n";
	}
}
class c
{
	d dd = new d();
	public String toString ()
	{
		return "its c\n";
	}
}
class d
{
	public String toString ()
	{
		return "its d\n";
	}
}