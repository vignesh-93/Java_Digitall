/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class BufferedStreamDemo {
    
    public static void main(String[] args) throws IOException {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        
        try{
            in = new BufferedInputStream(new FileInputStream("C:\\Vignesh\\paths\\Quantitative Aptitude Model Papers.pdf"));
            out = new BufferedOutputStream(new FileOutputStream("C:\\Vignesh\\paths\\Buffpdffile.pdf"));

            int v;
            while((v = in.read()) != -1)
            {
//                System.out.print((char)v);
//                System.out.print(v);
                out.write(v);
            }
//            int count = 0;
//            byte[] data = new byte[100];
//                    while(in.read(data)>0){
//                        out.write(data);
////                        System.out.println((char)data);
//                        count++;
//                    }System.out.println(count);
        }catch(FileNotFoundException fnf){
        
        }catch(IOException ioe){
        
        } finally {
            if(Objects.nonNull(out)) {
                try{
                    out.close();
                }catch(FileNotFoundException fnf){
                
                }
            }
        }
    }
    
}
