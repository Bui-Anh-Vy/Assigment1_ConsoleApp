package src;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

public class BankingInfo extends ListOfClaim{
    private static int number;
    private static String name;

    public static void showbank() {
        System.out.println("Banking: " + getName() + ", number: " + getNumber());
    }

    public void insertBank(String name, int number){
        this.name =name;
        this.number = number;
    }


//    void showBank(){
//        System.out.println("Banking: " + name + number);
//    }

    public static void main(String[] arg) {
//        PrintWriter output = new PrintWriter(new FileWriter("banking.txt", true));
        BankingInfo bank1 = new BankingInfo();
        BankingInfo bank2 = new BankingInfo();

        bank1.insertBank("BankA", 1);
        bank2.insertBank("BankB", 2);
        bank1.showbank();
        bank2.showBank();
//
//        output.println("Name: " + bank1.name + "\nNumber: " + bank1.number +"\n");
//        output.println("Name: " + bank2.name + "\nNumber: " + bank2.number +"\n");
//        output.flush();
//        output.close();
    }

    private void showBank() {
    }

    public static int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
