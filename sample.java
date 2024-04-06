package src;

import java.util.List;

public class sample {


    private static int id;
    private static String name;
    private static String insuranceCard;
    private List<ListOfClaim> claim;


    public sample(){
        id = 0;
        name = "Default";
        insuranceCard = "Default";
    }

    public sample(int id, String name, String insuranceCard){
        sample.id = id;
        sample.name = name;
        sample.insuranceCard = insuranceCard;
    }

    void insertCustomer(int id, String name, String insuranceCard){
        sample.id = id;
        sample.name = name;
        sample.insuranceCard = insuranceCard;
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        sample.id = id;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        sample.name = name;
    }

    public static String getInsuranceCard() {
        return insuranceCard;
    }

    //method to display account details
    static void showAccount() {

        System.out.println("Customer id: c" + getId());
        System.out.println("Customer name: " + getName());
        System.out.println("Insurance card: " + getInsuranceCard());
    }

    public boolean claim(ListOfClaim c){
        return !c.equals(this);
    }

//    public boolean claims(ListOfClaim c) {
//        if(c.getListOfFile().contains(this)){
//            return false;
//        }
//        claim.add(c);
//        c.setListOfFile((Document) this);
//        return true;
//    }











//    public static void main(String[] arg) throws IOException, ClassNotFoundException, ParseException {
//        PrintWriter output = new PrintWriter(new FileWriter("draft.txt", true));
//
//        sample customer1 = new sample();
//        sample customer2 = new sample();
//
//        customer1.insertCustomer("01", "A", "0123456789");
//        customer2.insertCustomer("02", "B", "0987654321");
//        output.println("Customer id: " + customer1.id + "\nCustomer name: " + customer1.name + "\nInsurance card: " + customer1.insuranceCard);
//        output.println("Customer id: " + customer2.id + "\nCustomer name: " + customer2.name + "\nInsurance card: " + customer2.insuranceCard);
//
//        output.flush();
//        output.close();
//        customer1.showAccount();
//        customer2.showAccount();
//
//    }
}



