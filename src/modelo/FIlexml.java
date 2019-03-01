/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author carlos.robledo
 */
public class FIlexml {
    public static boolean crearArchivoXML(Map <Integer, LinkedList<Cliente>> m){
        boolean t = false;
        try{
            Element clientes = new Element("clientes");
            Document doc = new Document(clientes);
            
            Iterator<Map.Entry<Integer, LinkedList<Cliente>>> it = m.entrySet().iterator();
        //envia el siguiente y si no hay retorna false
        while(it.hasNext()){
            //Obtener el dato en map
            Map.Entry<Integer, LinkedList<Cliente>> pair = it.next();
            Element key1 = new Element("key");
            key1.setAttribute(new Attribute("id", String.valueOf(pair.getKey())));
            doc.getRootElement().addContent(key1);
            for (int i = 0; i <pair.getValue().size(); i++) {
                Cliente objC = pair.getValue().get(i);
                Element cliente1 = new Element("Cliente");
                cliente1.setAttribute(new Attribute("Nombre", objC.getNombre()));
                cliente1.setAttribute(new Attribute("IdCliente", objC.getIdcliente()));
                cliente1.setAttribute(new Attribute("Empresa", objC.getEmpresa()));
                doc.getRootElement().addContent(cliente1);
            }
        
        }
        
        
            XMLOutputter xmlOutput = new XMLOutputter();
            
            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.output(doc, new FileWriter("fileClientes.xml"));
            t=true;
            
        }catch(IOException ioe){
            
        }
        return t;
    }
    
    public static Map<Integer, LinkedList<Cliente>> LeerArchivoXML(){
    Map<Integer, LinkedList<Cliente>> ml = new HashMap<>();
    
    return ml;
    }
    
}
