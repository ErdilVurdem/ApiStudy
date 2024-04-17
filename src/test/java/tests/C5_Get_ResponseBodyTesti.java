package tests;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.internal.RealSystem;

import java.util.regex.Matcher;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class C5_Get_ResponseBodyTesti {
    /*
        https://jsonplaceholder.typicode.com/posts/44 url'ine bir GET request yolladigimizda
        donen Response'in
        status code'unun 200,
        ve content type'inin aplication.JSON,
        ve response body'sinde bulunan userId'nin 5,
         ve response body'sinde bulunan title'in "optio dolor molestias sit"
        oldugunu test edin.
    */

    @Test
    public void get01(){
        // 1-EndPoint belirlenir
        String url="https://jsonplaceholder.typicode.com/posts/44";

        // 2- Soruda verilmişse expected data hazırlanır

        // 3- Dönen response kaydedilir
        Response response=given().when().get(url);

        // 4- Assertion islemi
        response.then().assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .body("userId", equalTo(5))
                .body("title", equalTo("optio dolor molestias sit"));

        System.out.println(response.prettyPrint());

    }


}
