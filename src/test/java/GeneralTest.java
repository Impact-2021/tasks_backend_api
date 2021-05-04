/*import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.impact.model.Restaurant;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static jdk.javadoc.internal.doclets.toolkit.util.DocFile.readResource;

public class GeneralTest {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

     @Test
    public void testAllowStatement() throws JsonProcessingException {
        Date d = new Date();
        Restaurant r = new Restaurant(101,"Kohinoor","Central London","Please see all the allergen info provided with menu.",
                d,d,113, "app001","v1");

        String json = OBJECT_MAPPER.writeValueAsString(r);

        assertThatJson(json).isEqualTo(readResource("./allow.json"));
    }
}
*/