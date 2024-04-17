package tests;

import org.json.JSONObject;
import org.junit.Test;

public class C3_JsonObjesiOlusturma {
    /*
         Asagidaki JSON Objesini olusturup konsolda yazdirin.
          {
          "title":"Ahmet",
          "body":"Merhaba",
          "userId":1
          }
     */

    @Test
    public void JSONDataOlustur01(){
        JSONObject jsonData=new JSONObject();
        jsonData.put("Title","Ahmet");
        jsonData.put("body","Merhaba");
        jsonData.put("userId",1);

        System.out.println("JSON Data Bilgileri: "+jsonData);

    }

    @Test
    public void JSONDATAOlustur02(){
        /*
       Asagidaki JSON Objesini olusturup konsolda yazdirin.
{
    "firstname":"Jim",
    "lastname":"Brown",
    "bookingdates": {
            "checkin":"2018-01-01",
            "checkout":"2019-01-01"
                     },
     "totalprice":111,
    "depositpaid":true,
    "additionalneeds":"Breakfast"
 }
         */

        JSONObject innderData=new JSONObject();
        innderData.put("checkin","2018-01-01");
        innderData.put( "checkout","2019-01-01");

        JSONObject jsonData2=new JSONObject();
        jsonData2.put("firstname","Jim");
        jsonData2.put("lastname","Brown");
        jsonData2.put("bookingdates",innderData);
        jsonData2.put("totalprice",111);
        jsonData2.put("depositpaid",true);
        jsonData2.put("additionalneeds","Breakfast");

        System.out.println("2. JSON Data: "+jsonData2);
    }
}
