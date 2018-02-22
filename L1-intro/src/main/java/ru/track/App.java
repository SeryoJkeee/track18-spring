package ru.track;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

/**
 * TASK:
 * POST request to  https://guarded-mesa-31536.herokuapp.com/track
 * fields: name,github,email
 *
 * LIB: http://unirest.io/java.html
 *
 *
 */
public class App {

    public static final String URL = "http://guarded-mesa-31536.herokuapp.com/track";
    public static final String FIELD_NAME = "name";
    public static final String FIELD_GITHUB = "github";
    public static final String FIELD_EMAIL = "email";

    public static void main(String[] args) throws Exception {
        // 1) Use Unirest.post()
        HttpResponse<JsonNode> jsonResponse = Unirest.post(URL)
                .header("accept", "application/json")
                .queryString("apiKey", "123")
                .field(FIELD_NAME, "Зюзин Сергей Сергеевич")
                .field(FIELD_GITHUB, "github.com/SeryoJkeee")
                .field(FIELD_EMAIL, "sergeywhite@bk.ru")
                .asJson();
       // jsonResponse.getBody().getObject().get("success");

        System.out.println(jsonResponse.getBody().getObject().get("success"));

        // 2) Get response .asJson()
        // 3) Get json body and JsonObject
        // 4) Get field "success" from JsonObject




       // boolean success = false;
    }

}
