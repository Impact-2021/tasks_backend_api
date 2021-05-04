import com.impact.model.MenuAllergen;
import com.impact.model.MenuItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuitemAllergenTest {
    @Test
    @DisplayName("Test for food item_id in MenuItemAllergen")
    public void testMenuItemAllergen_itemId()  {
        Date d = new Date();

        MenuAllergen m = new MenuAllergen(1001,101,d,d,113,"app001","v1");

        assertEquals(1001, m.getItem_id(), "Item id is incorrect");
    }
    @Test
    @DisplayName("Test for food allergen_id in MenuItemAllergen")
    public void testMenuItemAllergen_allergenId()  {
        Date d = new Date();

        MenuAllergen m = new MenuAllergen(1001,101,d,d,113,"app001","v1");

        assertEquals(101, m.getAllergen_id(), "Allergen id is incorrect");

    }
}
