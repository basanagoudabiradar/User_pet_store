package EndPoints;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import Payload.User_Pojo;
import Urls.Url_s;
import io.restassured.response.Response;

public class User_EndPoints 
{
  public static Response Create_User(User_Pojo Payload)
    {
    Response response=	given()
    	    .contentType("ContentType.jSON")
    	    .accept("ContentType.jSON")
    	.when()
    	    .post(Url_s.posturl);
        return response;
    }
  public static Response Get_User(String userName)
  {
  Response response=	given()
  	    .pathParam("username", userName)
  	.when()
  	    .get(Url_s.geturl);
      return response;
  }
  public static Response update_User(String username ,User_Pojo Payload)
  {
  Response response=	given()
  	    .contentType("ContentType.JSON")
  	    .accept("ContentType.JSON")
  	    .body(Payload)
  	.when()
  	    .post(Url_s.puturl);
      return response;
  }
  public static Response Delete_User(String userName)
  {
  Response response=	given()
  	    .pathParam("username", userName)
  	.when()
  	    .delete(Url_s.deleteurl);
      return response;
  }
}
