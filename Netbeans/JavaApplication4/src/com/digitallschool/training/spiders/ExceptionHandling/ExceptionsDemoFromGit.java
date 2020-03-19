/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

/**
 *
 * @author DigitallSchool <rupeshkumar@digitallschool.com>
 */
public class ExceptionsDemoFromGit {

    public static void main(String[] args) {
        FileReader in = null;

        try {
            in = new FileReader("C:\\Users\\rkvod\\Desktop\\multi.txtx");
            int v;

            while ((v = in.read()) != -1) {
                System.out.print((char) v);
            }

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {

        } finally {
            try {
                /*if (in != null) {
                    in.close();
                }*/

                if (Objects.nonNull(in)) {
                    in.close();
                }
            } catch (IOException ex) {

            }
        }

    }
}

