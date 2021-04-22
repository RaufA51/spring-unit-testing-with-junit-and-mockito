package com.in28minutes.unittesting.unittesting.spike;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {
	
	String actualResponse = "{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}";


	@Test
	// uygun \ lari yigisdirsan hecne deyismiyecek
	public void jsonAssert_StrictTrue_ExactMatchExceptForSpaces() throws JSONException {
		String expectedResponse = "{\"id\": 1, \"name\":\"Ball\" , \"price\":10, \"quantity\":100}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, true);
	}

	@Test
	public void jsonAssert_StrictFalse() throws JSONException {
		String expectedResponse = "{\"id\": 1, \"name\":\"Ball\", \"price\":10}";
		// false yazdiqda her hansi bir property yoxdursa onu teleb elemir meselen burda "quantity"
		JSONAssert.assertEquals(expectedResponse, actualResponse, false);
	}

	@Test
	public void jsonAssert_WithoutEscapeCharacters() throws JSONException {
		String expectedResponse = "{id:1, name:Ball, price:10}";
		// eger asagida false yazsan bire bir yoxlayacaq
		// ama false yazilmasa olan propertylerin qiymetlerinin uygun oldugunu check eliyir meselen id varsa 1 olmalidi name varsa Ball olmalidir
		JSONAssert.assertEquals(expectedResponse, actualResponse, false);
	}
}
