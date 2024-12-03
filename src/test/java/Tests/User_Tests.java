package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import EndPoints.User_EndPoints;
import Payload.User_Pojo;
import io.restassured.response.Response;

public class User_Tests 
{
	Faker faker;
	User_Pojo userpayload;
	@BeforeClass
   public void setdata()
   {
	   faker=new Faker();
	   userpayload=new User_Pojo();
	   
	   userpayload.setId(faker.idNumber().hashCode());
	   userpayload.setUesrname(faker.name().username());
	   userpayload.setFirstrname(faker.name().firstName());
	   userpayload.setLastname(faker.name().lastName());
	   userpayload.setPhnonenumber(faker.phoneNumber().cellPhone());
	   userpayload.setEmail(faker.internet().safeEmailAddress());
	   userpayload.setPassword(faker.internet().password(5, 10));
	   
   }
	@Test(priority=1)
	public void  testpostuser()
	 {
		Response response= User_EndPoints.Create_User(userpayload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(),200);
	 }
	@Test(priority=2)
	public void  testgetuserByname()
	 {
		Response response= User_EndPoints.Get_User(this.userpayload.getUesrname());
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(),200);
	 }
	
	
}
