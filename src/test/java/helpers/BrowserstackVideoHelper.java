package helpers;

import static drivers.BrowserstackDriver.credentialsConfig;
import static io.restassured.RestAssured.given;

public class BrowserstackVideoHelper {

    public static String videoUrl(String sessionId) {

        String url = String.format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        String user = credentialsConfig.getUser();
        String key = credentialsConfig.getKey();

        return given()
                .auth().basic(user, key)
                .get(url)
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}