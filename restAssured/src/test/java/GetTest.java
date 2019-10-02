import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetTest {

    @Test
    public void testGet() {
      Response response = given().when().get("http://ergast.com/api/f1/2017/circuits.json");
        System.out.println(response.jsonPath().getMap("$"));

    }
}
