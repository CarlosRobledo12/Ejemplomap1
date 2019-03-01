/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.FIlexml;

/**
 *
 * @author carlos.robledo
 */
public class Ejemplomap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        LinkedList<Cliente> listac = new LinkedList<>();
        LinkedList<Cliente> listac2 = new LinkedList<>();
        Map<Integer, Cliente> map1 = new HashMap<>();
   
        
        listac.add(new Cliente("David", "1130", "UAO"));
        listac.add(new Cliente("Sofia", "1131", "Tigo"));
        listac.add(new Cliente("Marcos", "1132", "Sura"));
        listac.add(new Cliente("Maria", "1133", "Herbalife"));
         map1.put(4,listac);
        
        listac2.add(new Cliente("David", "1130", "UAO"));
        listac2.add(new Cliente("Sofia", "1131", "Tigo"));
        listac2.add(new Cliente("Marcos", "1132", "Sura"));
        listac2.add(new Cliente("Maria", "1133", "Herbalife"));
          map1.put(6,listac2);
        
        
        
        
        
        
        
        
        Map<Integer, Cliente> map2 = new LinkedHashMap<>();
        Map<Integer, Cliente> map3 = new TreeMap<>();
//        
//        map1.put(55, new Cliente("David", "1130", "UAO"));
//        map1.put(4, new Cliente("Sofia", "1131", "Tigo"));
//        map1.put(5, new Cliente("Marcos", "1132", "Sura"));
//        map1.put(78, new Cliente("Maria", "1133", "Herbalife"));
//        
//        map2.put(55, new Cliente("David", "1130", "UAO"));
//        map2.put(4, new Cliente("Sofia", "1131", "Tigo"));
//        map2.put(5, new Cliente("Marcos", "1132", "Sura"));
//        map2.put(78, new Cliente("Maria", "1133", "Herbalife"));
//        
//        map3.put(55, new Cliente("David", "1130", "UAO"));
//        map3.put(4, new Cliente("Sofia", "1131", "Tigo"));
//        map3.put(5, new Cliente("Marcos", "1132", "Sura"));
//        map3.put(78, new Cliente("Maria", "1133", "Herbalife"));
        
        String m1 = mostrarDatosMap(map1);
//        String m2 = mostrarDatosMap(map2);
//        String m3 = mostrarDatosMap(map3);
        System.out.println(m1);
//        System.out.println("---------------------");
//        System.out.println(m2);
//        System.out.println("---------------------");
//        System.out.println(m3);
        
        boolean t = FIlexml.crearArchivoXML(map1);
        if(t){
            JOptionPane.showMessageDialog(null, "Archivo creado con exito");
        }else{
            JOptionPane.showMessageDialog(null, "No se creo");
        }
    }
    
    public static String mostrarDatosMap(Map<Integer, Cliente> m){
        String mostrar = "";
        Iterator<Map.Entry<Integer, LinkedList<Cliente>>> it = m.entrySet().iterator();
        //envia el siguiente y si no hay retorna false
        while(it.hasNext()){
            //Obtener el dato en map
            Map.Entry<Integer, LinkedList<Cliente>> pair = it.next();
            mostrar+=pair.getKey()+"\n";
        }
        return mostrar;
    }
    
    
}
