package za.ac.cput.Exercise_2;

public class PetParlour {

    public String petIn, petOut, Balance;

    public String getPetIn() {
        return petIn;
    }

    public String getPetOut() {
        return petOut;
    }

    public String getBalance() {
        return Balance;
    }

    public void setPetIn(String petIn) {
        this.petIn = petIn;
    }

    public void setPetOut(String petOut) {
        this.petOut = petOut;
    }

    public void setBalance(String balance) {
        Balance = balance;
    }

    @Override
    public String toString() {
        return "PetParlour{" +
                "petIn='" + petIn + '\'' +
                ", petOut='" + petOut + '\'' +
                ", Balance='" + Balance + '\'' +
                '}';
    }
}
