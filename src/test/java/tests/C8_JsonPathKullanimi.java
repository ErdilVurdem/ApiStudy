package tests;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

public class C8_JsonPathKullanimi {
    /*
        {
        "firstName": "John",
        "lastName": "doe",
        "age": 26,
        "address": {
            "streetAddress": "naist street",
            "city": "Nara",
            "postalCode": "630-0192"
                    },
        "phoneNumbers": [
                        {
                            "type": "iPhone",
                            "number": "0123-4567-8888"
                        },
                        {
                            "type": "home",
                            "number": "0123-4567-8910"
                        }
                        ]
        }
       */

    @Test
    public void JsonPathKullanimi(){
        JSONObject iphoneTel=new JSONObject();
        JSONObject homeTel=new JSONObject();
        homeTel.put("type", "home");
        homeTel.put("number", "0123-4567-8910");

        iphoneTel.put("type", "iPhone");
        iphoneTel.put("number", "0123-4567-8888");

        JSONObject address=new JSONObject();
        address.put("streetAddress", "naist street");
        address.put("city", "Nara");
        address.put("postalCode", "630-0192");

        JSONArray phoneNumbers=new JSONArray();
        phoneNumbers.put(0,iphoneTel);
        phoneNumbers.put(1,homeTel);

        JSONObject personalInfo=new JSONObject();
        personalInfo.put("firstName", "John");
        personalInfo.put("lastName", "doe");
        personalInfo.put("age", 26);
        personalInfo.put("adress",address);
        personalInfo.put("phoneNumbers",phoneNumbers);

        System.out.println("İsim: "+personalInfo.get("firstName"));
        System.out.println("Soyisim: "+personalInfo.get("lastName"));
        System.out.println("Age: "+personalInfo.get("age"));
        System.out.println("Phone Numbers: "+personalInfo.getJSONArray("phoneNumbers").getJSONObject(0).get("type")
                                            +personalInfo.getJSONArray("phoneNumbers").getJSONObject(0).get("number")
                                            +personalInfo.getJSONArray("phoneNumbers").getJSONObject(1).get("type")
                                            +personalInfo.getJSONArray("phoneNumbers").getJSONObject(1).get("number"));

        System.out.println("Adress: "+personalInfo.getJSONObject("adress").get("streetAddress")
                                     +personalInfo.getJSONObject("adress").get("city")
                                     +personalInfo.getJSONObject("adress").get("postalCode"));

    }
}
