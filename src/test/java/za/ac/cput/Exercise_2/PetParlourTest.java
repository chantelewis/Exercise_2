package za.ac.cput.Exercise_2;

import junit.framework.TestCase;

public class PetParlourTest extends TestCase {

    private PetParlour petIn;
    private PetParlour petOut;
    private PetParlour Balance;

    @BeforeEach
    public void setUp() {
        petIn = new PetParlour();
        petOut = petIn;
        Balance = new PetParlour();
    }

    
}