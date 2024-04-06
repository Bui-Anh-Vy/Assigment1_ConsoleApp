package src;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class ListOfClaim {
    private static int id;
    private static Date claimDate;
    private static int cardNumber;
    private static Date examDate;
    private ArrayList<File> listOfFile;
    LinkedList<Document> list;

    private static int insuranceNumber;
    private static String status;

    public ListOfClaim(int id, int cardNumber, String document, int insuranceNumber, String status) {
    }

    public static int getId() {
        return id;
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public Date getExamDate() {
        return examDate;
    }

    public int getInsuranceNumber() {
        return insuranceNumber;
    }

    public String getStatus() {
        return status;
    }
//    public void setListOfFile(Document newFile){
//        listOfFile.add((File) newFile);
//    }


    public static void setId(int id) {
        ListOfClaim.id = id;
    }

    public static void setClaimDate(Date claimDate) {
        ListOfClaim.claimDate = claimDate;
    }

    public static void setCardNumber(int cardNumber) {
        ListOfClaim.cardNumber = cardNumber;
    }

    public static void setExamDate(Date examDate) {
        ListOfClaim.examDate = examDate;
    }

    public void setListOfFile(ArrayList<File> listOfFile) {
        this.listOfFile = listOfFile;
    }

    public void setList(LinkedList<Document> list) {
        this.list = list;
    }

    public static void setInsuranceNumber(int insuranceNumber) {
        ListOfClaim.insuranceNumber = insuranceNumber;
    }

    public static void setStatus(String status) {
        ListOfClaim.status = status;
    }

    Scanner sc = new Scanner(System.in);

    public ListOfClaim(){
        id = 0;
//        claimDate= "Default";
        cardNumber = 0;
//        examDate = "Default";
        listOfFile = new ArrayList<>();
insuranceNumber = 0;
    status = "Default";
    }
    public void addClaim(int id, Date claimDate, int cardNumber,
                Date examDate, int insuranceNumber, String status) {
        this.claimDate = claimDate;
        this.id = id;
        this.cardNumber = cardNumber;
        this.examDate = examDate;
        list = new LinkedList<>();
        this.insuranceNumber = insuranceNumber;
        this.status = status;
    }

//    public boolean addFile(Document newFile) {
//        return newFile.addFile(this);
//    }

//    public void addClaim(){
//        System.out.println("Claim detail\n");
//        System.out.println("Enter id: ");
//        id = sc.next();
//        System.out.println("Enter claimDate: ");
//        Date d = new Date();
//        claimDate = sc.next();
//        SimpleDateFormat sd = new SimpleDateFormat(claimDate);
//        String expireDate = sd.format(d);
//    }
    public static void showClaim(){
        System.out.println("Claim information");
        System.out.println("ID: f" + id);
        System.out.println("Claim date: " + claimDate);
        System.out.println("Card number: " + cardNumber);
        System.out.println("Exam date: " + examDate);
//        System.out.println("List of documents: " + ListOfClaim.id +  "_" + InsuranceCards.getNumber() + "_" + Document.getName() + ".pdf");
        System.out.println("Insurance number: " + insuranceNumber);
        System.out.println("Status: " + status);
        BankingInfo.getName();
        BankingInfo.getNumber();
        ;
    }

    @Override
    public String toString() {
        return "ListOfClaim{" +
                "listOfFile=" + listOfFile +
                ", list=" + list +
                '}';
    }
//    public boolean addClaim(ClaimProcessManager){}

    public static void main(String[] args) {

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        try {


            Date date = sd.parse("01/06/2015");
            Date date1 = sd.parse("05/03/2015");
            Date date2 = sd.parse("1/12/2025");
            ListOfClaim n1 = new ListOfClaim();
            ListOfClaim n2 = new ListOfClaim();
            ListOfClaim List1 = new ListOfClaim();
            List1.addClaim(01, date, 012, date1, 123456789, "Done");
            ListOfClaim.showClaim();


        } catch (ParseException a) {
            a.printStackTrace();
        }
    }

}
