import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    Invoice invoice;

    @BeforeEach
    void setUp() {
        invoice = new Invoice();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testInvoice(){
        assertNotNull(invoice);
    }

    @Test
    void testConstructor(){
        Invoice newInvoice = new Invoice("02", "food", 4, 100.00);
        assertEquals("02", newInvoice.getPartNumber());
    }

    @Test
    void setAndGetPartNumber(){
        invoice.setPartNumber("01");
        assertEquals("01", invoice.getPartNumber());
    }

    @Test
    void setAndGetPartDescription(){
        invoice.setPartDescription("wears");
        assertEquals("wears", invoice.getPartDescription());
    }

    @Test
    void setAndGetQuantityOfItemBeingPurchased(){
        invoice.setQuantity(2);
        assertEquals(2, invoice.getQuantity());
    }

    @Test
    void setAndGetPricePerItem(){
        invoice.setPricePerItem(50.00);
        assertEquals(50.00, invoice.getPricePerItem());
    }

    @Test
    void canGetInvoiceAmountTest(){
        invoice.setPricePerItem(10);
        invoice.setQuantity(2);
        double result = invoice.getInvoiceAmount();
        assertEquals(20, result);
    }

    @Test
    void cannotSetNegativeQuantity(){
        invoice.setQuantity(-5);
        assertEquals(0, invoice.getQuantity());
    }

    @Test
    void cannotSetNegaticePricePerQuantity(){
        invoice.setPricePerItem(-12.12);
        assertEquals(0, invoice.getPricePerItem());
    }


}