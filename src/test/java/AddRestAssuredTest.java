import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.junit.jupiter.api.Test;


public class AddRestAssuredTest {
    @Test
    public void addRestAssuredTest() {
        Response response = RestAssured
                .get("http://playground.learnqa.ru/api/hello")
                .andReturn();
        response.prettyPrint();
    }
}
