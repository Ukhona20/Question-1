import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestClass {
    //Test class for total
    @Test
    public void GetTotalProductsSold_WithValidData_ReturnsCorrectValue() {
        String[] Products={"Cozy Nights","Restonic Barbados","Sealy Phuket"};
        int[][] Sales=new int[3][3];
        Product gon =new Product(Products, Sales);
        assertEquals (153, gon.GetTotalProductsSold());
    }
    //Test class for Average
    @Test
    public void GetAverageProductSold_WithVaildData_ReturnsCorrectValue(){
        String[] Products={"Cozy Nights","Restonic Barbados","Sealy Phuket"};
        int[][] Sales=new int[3][3];
        Product gon =new Product(Products, Sales);
        assertEquals (17.0, 0.01);
    }


}
