package src;

import java.util.LinkedList;
import java.util.Scanner;

public class InManagement implements ClaimProcessManager{
    LinkedList<ListOfClaim> list;

    public InManagement(){
        list = new LinkedList<>();
    }

    public void getAll(){}
    public boolean find (int id){
        for(ListOfClaim b : list){
            if(b.getId() == id){
                System.out.println(b);
                return true;
            }
        }
        return false;
    }

    public void add(ListOfClaim claim)
    {

        // Checking if a id already exists or not,
        // if not add it to Record list, Otherwise
        // error display message
        if (!find(claim.getId())) {
            list.add(claim);
        } else {

            // Print statement
            System.out.println(
                    "Record already exists in the Record list");
        }
    }

    public void deleteClaim(int recIdNumber)
    {
        ListOfClaim claimDelete = null;

        // Iterating record list
        for (ListOfClaim ll : list) {

            // Finding id to be deleted
            if (ListOfClaim.getId() == recIdNumber) {
                claimDelete = ll;
            }
        }

        // If claimDelete is null, then show error message,
        // otherwise remove the record from Record list
        if (claimDelete == null) {

            // Displaying no id found
            System.out.println("Invalid Id");
        }
        else {

            list.remove(claimDelete);

            // Display message for successful deletion of id
            System.out.println("Successfully removed record from the list");
        }
    }

    public ListOfClaim findRecord(int idNumber)
    {

        // Iterate id list
        // using for each loop
        for (ListOfClaim l : list) {

            // Checking record by id Number.
            if (l.getId() == idNumber) {
                return l;
            }
        }

        return null;
    }

    public void updateClaim(int id, Scanner input)
    {

        if (find(id)) {
            ListOfClaim rec = findRecord(id);

            // Display message only
            System.out.println("What is the new Student id Number ? ");
            int idNumber = input.nextInt();

            System.out.println("Enter new cardNumber: ");
            int cardNumber = input.nextInt();

            System.out.println("Enter new insurance number: ");
            int insuranceNumber = input.nextInt();

            System.out.println("Enter other status: ");
            String status = input.next();

            ListOfClaim.setId(idNumber);
            ListOfClaim.setCardNumber(cardNumber);
            ListOfClaim.setInsuranceNumber(insuranceNumber);
            ListOfClaim.setStatus(status);
            System.out.println(
                    "Record Updated Successfully");
        }
        else {

            // Print statement
            System.out.println(
                    "Record Not Found in the Student list");
        }
    }

    @Override
    public void updateClaim(int id, Scanner input, InManagement claim) {

    }

    @Override
    public boolean addClaim(InManagement claim) {
        return false;
    }

    @Override
    public void deleteClaim(InManagement claim) {

    }

    @Override
    public void updateClaim(InManagement claim) {

    }


    @Override
    public void getOne(ListOfClaim claim) {

    }

    @Override
    public void getAll(ListOfClaim claim) {

    }
}