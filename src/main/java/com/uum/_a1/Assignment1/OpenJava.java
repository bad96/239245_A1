//Semester: #A173HAWAU
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #239245
//Name: #Muhammad Badrul Amin Bin Abdul Razak
package com.uum._a1.Assignment1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Badrul
 */
public class OpenJava {

    File file;
    String fileContent[][];
    LinkedList<String> listFileContent;
    public int noIssue;
    public int totalJava;

    public void Filter(String[] listJavaFile) {
        for (int i = 0; i < listJavaFile.length; i++) {
            try (BufferedReader br = new BufferedReader(new FileReader(listJavaFile[i]))) {
                String readLine;
                while ((readLine = br.readLine()) != null) {
                    if (readLine.contains("public static void main")) {
                        noIssue++;
                    }
                }
            } catch (IOException e) {

            }
            totalJava++;
        }
    }
}
