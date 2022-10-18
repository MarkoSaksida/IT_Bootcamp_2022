package D_23;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class D_23_Marko_Saksida {
    private final String requestBody = "{\n" +
            "    \"id\" : \"356\",\n" +
            "    \"name\" : \"Blue Top\",\n" +
            "    \"price\" : \"Rs. 500\",\n" +
            "    \"brand\" : \"Polo\",\n" +
            "    \"category\" : [\n" +
            "        {\"usertype\" : {\"usertype\" : \"Women\"}\"},\n" +
            "    ]\n"+
            "    \"category\" : \"Tops\",\n" +
            "}";

    @BeforeMethod
    public void setUrl() {
        RestAssured.baseURI = "https://automationexercise.com/";

    }
    //API 1: Get All Products List
    @Test
    public void getAllProductsList() {

        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/api/productsList")
                .then()
                .extract().response();

        Assert.assertEquals(response.getStatusCode(), 200, "status code should be 200");
        System.out.println(response.getBody().print());
    }

    //API 3: Get All Brands List
    @Test
    public void getAllBrands() {

        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/api/brandsList")
                .then()
                .extract().response();

        Assert.assertEquals(response.getStatusCode(), 200, "status code should be 200");
        System.out.println(response.getBody().print());
    }

//    //API 5: POST To Search Product
//    @Test
//    public void postToSearchProduct() {
//
//        Response response = given()
//                .contentType("multipart/form-data")
//                .multiPart("search_product", "Tops")
//                .post("/searchProduct")
//                .then()
//                .extract().response();
//
//        Assert.assertEquals(response.getStatusCode(), 200, "status code should be 200");
//        System.out.println(response.jsonPath().getString(""));
//    }
}