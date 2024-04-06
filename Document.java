package src;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Document extends ListOfClaim{
    static String name;
    public void addDocument(String name){
        Document.name = name;
    }

    public void showInfo(){
        System.out.println("Document name: " + getName());
    }

    void addDocument(){
        Scanner sc = new Scanner(System.in);
        name = sc.next();
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Document.name = name;
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
//        PrintWriter output = new PrintWriter(new FileWriter("document.txt", true));
        Document document = new Document();
        document.addDocument("Document 1");
        document.showInfo();
//        output.println("Document name: " + getName() + "\n");
//        output.flush();
//        output.close();
    }
}
