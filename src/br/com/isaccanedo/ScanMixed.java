package br.com.isaccanedo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Isac Canedo
 */

public class ScanMixed {

    public static void main(String[] args) {
        File file = new File("src/mixed.txt");

        try {
            FileWriter fout = new FileWriter(file);
            fout.write("Isac 2020 6,5 Canedo true Almeida two false");
            fout.close();
        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo " + file + e);
        }
        int i; double d; boolean b;String s;
        try {
            Scanner scan = new Scanner(new FileReader(file));
            while (scan.hasNext()) {
                if (scan.hasNextInt()) {
                    i = scan.nextInt();
                    System.out.println("Eu sou um int: "+i);
                }
                else if (scan.hasNextDouble()) {
                    d = scan.nextDouble();
                    System.out.println("Eu sou um double: "+d);
                }
                else if (scan.hasNextBoolean()) {
                    b = scan.nextBoolean();
                    System.out.println("Eu sou um boolean: "+b);
                }
                else {
                    s = scan.next();
                    System.out.println("Eu sou uma string: "+s);
                }

            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao ler arquivo " + file + e);
        }

    }

}