import com.impact.model.MenuItem;
import com.impact.model.Restaurant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuItemTest {
    @Test
    @DisplayName("Test for food item name")
    public void testMenuItemName()  {
        Date d = new Date();

        MenuItem m = new MenuItem(1001,"Fries","image_url","Fries - Short description","Fries - Full description",
                "Fries - Factory Conatmination info","Fries - Kitchen Conatmination info",
                "Fries - Ingredients", "Starter",2.5,1,d,d,113,"app001","v1");

        assertEquals("Fries", m.getName(), "Food Item name is incorrect");
    }

    @Test
    @DisplayName("Test for food item id")
    public void testMenuItemId(){
        Date d = new Date();
        MenuItem m = new MenuItem(1001,"Fries","image_url","Fries - Short description","Fries - Full description",
                "Fries - Factory Conatmination info","Fries - Kitchen Conatmination info",
                "Fries - Ingredients", "Starter",2.5,1,d,d,113,"app001","v1");
        assertEquals(1001, 1001, "Must enter correct food item id");
    }
}
