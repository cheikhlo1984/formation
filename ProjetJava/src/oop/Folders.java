package oop;

import java.util.ArrayList;
import java.util.Collection;

public class Folders {
    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
    	  String[] s = xml.split("<folder name");
    	 
    	  Collection<String> col = new ArrayList<>();
    	  for (String val : s) {
			if (val.startsWith("=" + '"'+ startingLetter)) {
				val.replaceAll("/></folder>", "");
				System.out.println(val);
				col.add(val);
			}
		}
    	  
    	  return col;
    }
    
    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<folder name=\"c\">" +
                    "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                    "</folder>" +
                    "<folder name=\"users\" />" +
                "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        for(String name: names)
            System.out.println(name);
    }
}
