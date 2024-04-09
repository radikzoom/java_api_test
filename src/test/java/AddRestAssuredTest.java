import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.junit.jupiter.api.Test;


public class AddRestAssuredTest {
    @Test
    public void addRestAssuredTest() {
        Response response = RestAssured
                .get("https://playground.learnqa.ru/api/get_text")
                .andReturn();
        response.prettyPrint();
    }
}
