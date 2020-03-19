/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javaapplication4.Car;
import javaapplication4.Engine;

/**
 *
 * @author HP
 */
public class DataStreamsDemo {
 
    
    public static void main(String[] args) {
        Car c1 = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Vignesh\\paths\\CarObjects.txt"))){
            
            Object temp = in.readObject();
            c1 = (Car)temp;
            
            System.out.println(c1.brand);
            System.out.println(c1.getEngine().getPrice());
        }catch( Exception ioe){
            ioe.printStackTrace();
        }
    }
    
    public static void main3(String[] args) {
        Car c1 = new Car("BMW","A2",1234567,new Engine());
//        System.out.println(c1);
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Vignesh\\paths\\CarObjects.txt"))){
            out.writeObject(c1);
        }catch( Exception ioe){
            ioe.printStackTrace();
        }
    }
    
    public static void main2(String[] args) {
        try (DataInputStream in
                = new DataInputStream(
                        new FileInputStream("C:\\Vignesh\\paths\\DataStrmGit.txt"))) {

            System.out.println(in.readByte());
            System.out.println(in.readInt());
            System.out.println(in.readShort());
            System.out.println(in.readLong());
            System.out.println(in.readFloat());
            System.out.print(in.readDouble());
            System.out.println(in.readBoolean());
            System.out.println(in.readChar());
            System.out.println(in.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main1(String[] args) {
        try (DataOutputStream out
                = new DataOutputStream(
                        new FileOutputStream("C:\\Vignesh\\paths\\DataStrmGit.txt"))) {

            byte b = 126;
            int i = 567890;
            short s = 4567;
            long l = 9876543210L;
            float f = 2345.67091F;
            double d = 98712345.7681;
            boolean bool = true;
            char c = 'J';
            String str = "James Gosling";

            out.writeByte(b);
            out.writeInt(i);
            out.writeShort(s);
            out.writeLong(l);
            out.writeFloat(f);
            out.writeDouble(d);
            out.writeBoolean(bool);
            out.writeChar(c);
            out.writeUTF(str);

        } catch (IOException ioe) {

        }
    }


}
