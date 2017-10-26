//Semester: #A172
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #239245
//Name: #Muhammad Badrul Amin Bin Abdul Razak
package com.uum._a1.Assignment1;

/**
 *
 * @author Badrul
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Find find = new Find();
        String[] listJavaFile = find.listJavaFile;
        OpenJava open = new OpenJava();
        open.Filter(listJavaFile);
        System.out.println("Number of Java Files = " + open.totalJava);
        System.out.println("Number of Issues = " + open.noIssue);
    }
}