package metaSDL;
import java.io.IOException;
import java.io.PrintWriter;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import metaSDL.*;
import metaSDL.util.*;

public class ModelSDL {
	
	AdapterFactoryEditingDomain domain;

	public ModelSDL( ) {
		// Constructor to init the ModelLoader
		EPackage.Registry.INSTANCE.put(MetaSDLPackage.eNS_URI,
				MetaSDLPackage.eINSTANCE);
		domain = new AdapterFactoryEditingDomain(new MetaSDLAdapterFactory(),
				new BasicCommandStack());

		domain.getResourceSet().getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put("xmi", new XMIResourceFactoryImpl());
	}

	public MetaSysSDL loadModel(String fileName) {
		// Loading a model contents in XMI format and return a Doc model instance
		
		URI uri = URI.createFileURI(fileName);
		//System.out.println( "file URI  " + uri.toString() );

		Resource resource = domain.loadResource(uri.toString());
		
		System.out.println(resource.getContents());

	MetaSysSDL myDoc = (MetaSysSDL) resource.getContents().get(0);
		
		return myDoc;
	}
	
	void saveModel(MetaSysSDL aDoc, String fileName) throws IOException {
		// save an instance of a Doc model in XMI format
		
		Resource resource = domain.createResource(fileName);
		resource.getContents().add(aDoc);
		resource.save(null);
	}
	
	public static void main(String[] args) throws IOException {
        // Retrieve the default factory singleton
        MetaSDLFactory factory = MetaSDLFactory.eINSTANCE;
		// Example to load and save a model and use the ModelPrinter
		ModelSDL loader = new ModelSDL();
        
         SDLmeta myPrinter = new SDLmeta();
        String file = "C:\\Users\\PackardBell\\Documents\\javaEcore\\metaSDL\\sdl.xmi";
		// the names of the output for the text and XMI. Arguments of the run configuration 
        String sdlOutFile = "f.sdl";
        String sdlOutFile2 = "f2.xmi";
	

		MetaSysSDL aDoc = loader.loadModel( file );
		
		PrintWriter writer = new PrintWriter( sdlOutFile );
		writer.println( myPrinter.doSwitch(aDoc) );
		writer.close();
		
		try {
		if(SDLmeta.valid==true)loader.saveModel( aDoc , sdlOutFile2 );
		}
		catch(Exception e) {System.out.println(e.getLocalizedMessage());}

		

		System.out.println(myPrinter.doSwitch(aDoc) );

}
}