package io;

import java.io.*;

public class FastaReader {  //TODO Exception empty File

    private File file;
    private StringBuilder sb;
    private FileReader freader;
    private BufferedReader br;
    private String header;
    private String sequence;
    private static String s="";

    public FastaReader(String path){
        int i=0;
        file= new File(path);
        sb= new StringBuilder();
        try{
            freader= new FileReader(file);
            br = new BufferedReader(freader);
            while((s=br.readLine()) != null){
                if(i==0)
                   header=s;
                else
                    sb.append(s);
                i+=1;
            }
            freader.close();
        } catch(Exception e){
            e.printStackTrace();
        }
        sequence=sb.toString();
    }

    public String getHeader(){
        return header;
    }

    public String getSequence(){
        return sequence;
    }

}
