package com.travelcard.core;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class EditDoc {
	
	public static Logger log;
	String verify, putData;
    File file = new File("LoggingTest.txt");
    FileHandler fileTxt;
    SimpleFormatter formatterTxt;
    public EditDoc(){

        try{
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            if (fileTxt == null) {
				fileTxt = new FileHandler("Logging.txt");
			} else {
				formatterTxt = new SimpleFormatter();
				fileTxt.setFormatter(formatterTxt);
				log.addHandler(fileTxt);
			}
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Some text here for a reason");
            bw.flush();
            bw.close();
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while( (verify=br.readLine()) != null ){ //***editted
                       //**deleted**verify = br.readLine();**
                if(verify != null){ //***edited
                    putData = verify.replaceAll("here", "there");
                    bw.write(putData);
                }
            }
            br.close();


        }catch(IOException e){
        e.printStackTrace();
        }
    }

}