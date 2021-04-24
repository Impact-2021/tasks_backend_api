import com.impact.model.Allergen;
import com.impact.model.Restaurant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllergenTest {
    @Test
    @DisplayName("Test for allergen name")
    public void testAllergenName() {
        Date d = new Date();
        Allergen a = new Allergen(101,"Gluten","image URL",
                d,d,113, "app001","v1");
        assertEquals("Gluten", a.getAllergen_name(), "Allergen name is incorrect");
    }

    @Test
    @DisplayName("Test for allergen id")
    public void testAllergenId() {
        Date d = new Date();
        Allergen a = new Allergen(101,"Gluten","image URL",
                d,d,113, "app001","v1");
        assertEquals(101, a.getAllergen_id(), "Allergen id is incorrect");
    }
}