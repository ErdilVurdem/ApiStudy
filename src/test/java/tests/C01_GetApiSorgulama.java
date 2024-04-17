package tests;

import io.restassured.response.Response;
import org.junit.Test;


import static io.restassured.RestAssured.given;

public class C01_GetApiSorgulama {

    /*
            tests.C1_Get_ApiSorgulama
            https://restful-booker.herokuapp.com/booking/10 url'ine bir GET request
            gonderdigimizde donen Response'un,
            status code'unun 200,
            ve content type'inin application/json; charset=utf-8, ve
            Server isimli Header'in degerinin Cowboy,
            ve status Line'in HTTP/1.1 200 OK
            ve response suresinin 5 sn'den kisa oldugunu manuel olarak test ediniz.
   */


    // API Testlerinde 4 işlem ile test yapılır
    /*
    1-EndPoint belirlenir
    2-Gerekli ise Expected Data Hazırlanır
    3-Actual Data kaydedilir
    4-Assertion işlemi gerçekleştirilir
    */



    @Test
    public void get01(){
        //EndPoint belirlenir
        String url="https://restful-booker.herokuapp.com/booking/10";

        //Gerekli ise Expected Data Hazırlanır

        //Actual Data kaydedilir
        Response response=given().when().get(url);

        //Assertion işlemi gerçekleştirilir (Bu test için manuel istenmiş)

        //System.out.println(response.prettyPrint());
        System.out.println("Status Code: "+response.getStatusCode());
        System.out.println("Content Type: "+response.getContentType());
        System.out.println("Server: "+response.getHeader("Server"));
        System.out.println("Status Line: "+response.getStatusLine());
        System.out.println("Test Time: "+response.getTime()+" ms");





    }
}
