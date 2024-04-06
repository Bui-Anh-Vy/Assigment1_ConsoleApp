package src;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Account {
    public static void main(String[] arg) throws IOException, ClassNotFoundException, ParseException {
        PrintWriter output = new PrintWriter(new FileWriter("draft.txt", true));
        sample customer1 = new sample();
        sample customer2 = new sample();
        sample customer3 = new sample();
        sample customer4 = new sample();
        sample customer5 = new sample();
        sample customer6 = new sample();
        sample customer7 = new sample();
        sample customer8 = new sample();
        sample customer9 = new sample();
        sample customer10 = new sample();
        sample customer11 = new sample();
        sample customer12 = new sample();
        sample customer13 = new sample();
        sample customer14 = new sample();
        sample customer15 = new sample();

        customer1.insertCustomer(1234569, "A", "0123456789");
        customer2.insertCustomer(1234568, "B", "0987654321");
        customer3.insertCustomer(1234567, "B", "0987654321");
        customer4.insertCustomer(1234566, "B", "0987654321");
        customer5.insertCustomer(1234565, "B", "0987654321");
        customer6.insertCustomer(1234564, "B", "0987654321");
        customer7.insertCustomer(1234563, "B", "0987654321");
        customer8.insertCustomer(1234562, "B", "0987654321");
        customer9.insertCustomer(1234561, "B", "0987654321");
        customer10.insertCustomer(1234560, "B", "0987654321");
        customer11.insertCustomer(1234559, "B", "0987654321");
        customer12.insertCustomer(1234558, "B", "0987654321");
        customer13.insertCustomer(1234557, "B", "0987654321");
        customer14.insertCustomer(1234556, "B", "0987654321");
        customer15.insertCustomer(1234555, "B", "0987654321");


        output.println("Customer id: " + customer1.getId() + "\nCustomer name: " + customer1.getName() + "\nInsurance card: " + customer1.getInsuranceCard());
        output.println("Customer id: " + customer2.getId() + "\nCustomer name: " + customer2.getName() + "\nInsurance card: " + customer2.getInsuranceCard());


        output.flush();
        output.close();

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        try {

            Date date = sd.parse("2/1/2030");
            Date date1 = sd.parse("5/6/2031");
            Date date2 = sd.parse("1/12/2025");
            InsuranceCards n1 = new InsuranceCards();
            InsuranceCards n2 = new InsuranceCards();

            n1.insertInsuranceCard(1, "01", "A", String.valueOf(date));
            n2.insertInsuranceCard(2, "02", "B", String.valueOf(date1));
            n1.showDetail();
            n2.showDetail();
            output.println("Insurance Card Detail");
            output.println("Number: " + InsuranceCards.getNumber() + "\nID: " + n1.getHolder() + "\nName: " + n1.getPolicyOwner());
            output.println("Number: " + InsuranceCards.getNumber() + "\nID: " + n2.getHolder() + "\nName: " + n2.getPolicyOwner());
            output.flush();
            output.close();
        } catch (ParseException a) {
            a.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Enter ID: ");

        String bookId = sc.next();

        InManagement hr = new InManagement();


        ListOfClaim claim = new ListOfClaim();


        // loop runs until number 5\\ is not pressed to exit
        int ch;
        do {
//            menu();
            System.out.println("\n ***Insurance System Application***");
            System.out.println(""" 
                    1. Display all account details\s
                    2. Display insurance card details\s
                    3. List of Claims\s
                    4. Exit\s""");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    sample.showAccount();
                    break;
                case 2:
                    InsuranceCards.showDetail();
                    break;
                case 3:
                    System.out.println("""
                            1. Display List of Claim.
                            2. Add new claim
                            3. Update claim
                            4. Delete claim
                            5. Back""");
                    System.out.println("Enter your choice: ");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            ListOfClaim.showClaim();
                            break;
                        case 2:
                            System.out.println("Enter id: ");
                            int id = sc.nextInt();
//                                System.out.println("Enter claim date: ");
//                                Date claimDate = sc.next();

                            System.out.println("Enter card number: ");
                            int cardNumber = sc.nextInt();

//                                System.out.println("Enter exam date: ");
//                                Date examDate = sc.next();

                            System.out.println("Enter name of document: ");
                            String document = sc.next();

                            System.out.println("Enter insurance number: ");
                            int insuranceNumber = sc.nextInt();

                            System.out.println("Enter status: ");
                            String status = sc.next();

                            claim = new ListOfClaim(id, cardNumber, document, insuranceNumber, status);
                            hr.add(claim);
                            System.out.println(claim);
                            break;
                        case 3:
                            System.out.println("Enter id: ");
                            int idNo = sc.nextInt();
                            hr.updateClaim(idNo, sc);
                            break;
                        case 4:
                            System.out.println("Enter id: ");
                            int deleteId = sc.nextInt();
                            hr.deleteClaim(deleteId);
                            break;
                    }
                    break;
                case 4:
                    System.out.println("See you soon...");
                    break;
            }
        }
        while (ch != 4);
    }
}