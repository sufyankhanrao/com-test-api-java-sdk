/*
 * JsonValueTesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.sufyan.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.sufyan.ApiHelper;
import com.sufyan.JsonValueTesterClient;
import com.sufyan.exceptions.ApiException;
import com.sufyan.models.ContentTypeEnum;
import com.sufyan.models.SendValueasFormInput;
import com.sufyan.models.SendValueasQueryInput;
import com.sufyan.models.ServerResponse;
import com.sufyan.models.ValueContainer;
import com.sufyan.utilities.JsonValue;
import io.apimatic.core.utilities.TestHelper;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JsonValControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static JsonValueTesterClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static JsonValController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getJsonValController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Send Value in Model.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendValueInModel() throws Exception {
        // Parameters for the API call
        ValueContainer body = ApiHelper.deserialize(
                "{\"name\":\"a name\",\"id\":\"definition-123\",\"valueMap\":{\"key1\":\"some strin"
                + "g\",\"key2\":true,\"key3\":123},\"valueArray\":[\"some string\",true,123],\"valu"
                + "e\":\"some string value in model\"}",
                ValueContainer.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendValueinModel(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Send Boolean Value as Body.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendBooleanValueAsBody() throws Exception {
        // Parameters for the API call
        JsonValue body = ApiHelper.deserialize(
                "false", JsonValue.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendValueasBody(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Send Integer Value as Body.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendIntegerValueAsBody() throws Exception {
        // Parameters for the API call
        JsonValue body = ApiHelper.deserialize(
                "12345", JsonValue.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendValueasBody(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Send Json Value as Body.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendJsonValueAsBody() throws Exception {
        // Parameters for the API call
        JsonValue body = ApiHelper.deserialize(
                "{\"key1\":\"val1\",\"key2\":\"val2\"}", JsonValue.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendValueasBody(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Send Value as Form.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendValueAsForm() throws Exception {
        // Parameters for the API call
        SendValueasFormInput input = new SendValueasFormInput();
        input.setContentType(ContentTypeEnum.fromString(
                "application/x-www-form-urlencoded"));
        input.setId(54);
        input.setModel(ApiHelper.deserialize(
                "true", JsonValue.class));
        input.setModelArray(ApiHelper.deserializeArray(
                "[true,\"some string\",123]",
                JsonValue[].class));
        input.setModelMap(ApiHelper.deserialize(
                "{\"key1\":true,\"key2\":\"some string\",\"key3\":123}", JsonValue.class));

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendValueasForm(input);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Send Value as Query.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendValueAsQuery() throws Exception {
        // Parameters for the API call
        SendValueasQueryInput input = new SendValueasQueryInput();
        input.setId(54);
        input.setModel(ApiHelper.deserialize(
                "true", JsonValue.class));
        input.setModelArray(ApiHelper.deserializeArray(
                "[true,\"some string\",123]",
                JsonValue[].class));
        input.setModelMap(ApiHelper.deserialize(
                "{\"key1\":true,\"key2\":\"some string\",\"key3\":123}", JsonValue.class));

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendValueasQuery(input);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Get Value.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetValue() throws Exception {

        // Set callback and perform API call
        JsonValue result = null;
        try {
            result = controller.getValue();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertEquals("Response body does not match exactly",
                "978",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

    /**
     * Get Value Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetValueArray() throws Exception {

        // Set callback and perform API call
        List<JsonValue> result = null;
        try {
            result = controller.getValueArray();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertEquals("Response body does not match exactly",
                "[978,\"some string\",false]",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

    /**
     * Get Value Map.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetValueMap() throws Exception {

        // Set callback and perform API call
        JsonValue result = null;
        try {
            result = controller.getValueMap();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"key1\":978,\"key2\":\"some string\",\"key3\":false}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Get Value in Model.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetValueInModel() throws Exception {

        // Set callback and perform API call
        ValueContainer result = null;
        try {
            result = controller.getValueinModel();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"name\":\"a name\",\"id\":\"definition-123\",\"valueMap\":{\"key1\":\"some strin"
                + "g\",\"key2\":true,\"key3\":123},\"valueArray\":[\"some string\",true,123],\"valu"
                + "e\":\"some string value in model\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

}
