import static org.junit.jupiter.api.Assertions.assertEquals;
import com.impact.model.Restaurant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class RestaurantTest {
    @Test
    @DisplayName("Test for restaurant name")
    public void testRestName()  {
        Date d = new Date();
        Restaurant r = new Restaurant(101,"Kohinoor","Central London","Please see all the allergen info provided with menu.",
                d,d,113, "app001","v1");
        assertEquals("Kohinoor", r.getRest_name(), "Restaurant name is incorrect");
    }

    @Test
    @DisplayName("Test for restaurant id")
    public void testRestId(){
            Date d = new Date();
            Restaurant r = new Restaurant(101,"Kohinoor","Central London","Please see all the allergen info provided with menu.",
                    d,d,113, "app001","v1");
            assertEquals(101, 101, "Must enter correct restaurant id");
    }
}





