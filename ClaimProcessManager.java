package src;

import Tutorial.week2.solution.Project;

import java.util.Scanner;

public interface ClaimProcessManager {
    void updateClaim(int id, Scanner input, InManagement claim);

    public boolean addClaim(InManagement claim);
    public void deleteClaim(InManagement claim);
    public void updateClaim(InManagement claim);
    public void getOne(ListOfClaim claim);
    public void getAll(ListOfClaim claim);
}
