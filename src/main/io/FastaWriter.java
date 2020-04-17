package io;

import java.io.*;

public class FastaWriter {
    private File file;
    private FileWriter fr;
    private BufferedWriter bw;
    private String path;

    public FastaWriter(String header1, String header2, String result, String path){

        this.path=path;
        file= new File(path+"Result");
        try {
            fr = new FileWriter(file, true);
            bw = new BufferedWriter(fr);
            bw.write(header1);
            bw.newLine();
            bw.write(header2);
            bw.newLine();
            bw.newLine();
            bw.write(result);
            bw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public String getPath(){
        return path;
    }
}
