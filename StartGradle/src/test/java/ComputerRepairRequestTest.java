import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    @Test
    @DisplayName("First test")
    public void TestExample(){
        ComputerRepairRequest computerRepairRequest = new ComputerRepairRequest();
        assertEquals("",computerRepairRequest.getOwnerName());
        assertEquals("", computerRepairRequest.getOwnerAddress());
    }

    @Test
    @DisplayName("Second test")
    public void TestExample2(){
        ComputerRepairRequest computerRepairRequest = new ComputerRepairRequest();
        computerRepairRequest.setOwnerName("John");
        assertEquals("John",computerRepairRequest.getOwnerName());
        computerRepairRequest.setOwnerAddress("Str Teodor Mihali");
        assertEquals("Str Teodor Mihali",computerRepairRequest.getOwnerAddress());
        computerRepairRequest.setID(2);
        assertEquals(2,computerRepairRequest.getID());
        computerRepairRequest.setPhoneNumber("0770123456");
        assertEquals("0770123456",computerRepairRequest.getPhoneNumber());
        computerRepairRequest.setProblemDescription("Problem1");
        assertEquals("Problem1",computerRepairRequest.getProblemDescription());
        computerRepairRequest.setModel("Model1");
        assertEquals("Model1",computerRepairRequest.getModel());

    }




}
