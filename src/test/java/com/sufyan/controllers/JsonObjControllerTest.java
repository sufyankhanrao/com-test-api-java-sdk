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
import com.sufyan.models.SchemaContainer;
import com.sufyan.models.SendSchemaasFormInput;
import com.sufyan.models.SendSchemaasQueryInput;
import com.sufyan.models.ServerResponse;
import com.sufyan.utilities.JsonObject;
import io.apimatic.core.utilities.TestHelper;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JsonObjControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static JsonValueTesterClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static JsonObjController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getJsonObjController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Send Schema in Model.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendSchemaInModel() throws Exception {
        // Parameters for the API call
        SchemaContainer body = ApiHelper.deserialize(
                "{\"name\":\"a name\",\"id\":\"definition-123\",\"schemaMap\":{\"key1\":{\"$id\":"
                + "\"https://example.com/person.schema.json\",\"$schema\":\"https://json-schema.org"
                + "/draft/2020-12/schema\",\"title\":\"Person\",\"type\":\"object\",\"properties\":"
                + "{\"firstName\":{\"type\":\"string\",\"description\":\"The person's first name."
                + "\"},\"lastName\":{\"type\":\"string\",\"description\":\"The person's last name."
                + "\",\"test\":null},\"age\":{\"type\":\"integer\",\"description\":\"Age in years"
                + "\",\"minimum\":0}}},\"key2\":{\"$id\":\"https://example.com/person.schema.json"
                + "\",\"$schema\":\"https://json-schema.org/draft/2020-12/schema\",\"title\":\"Pers"
                + "on\",\"type\":\"object\",\"properties\":{\"firstName\":{\"type\":\"string\",\"de"
                + "scription\":\"The person's first name.\"},\"lastName\":{\"type\":\"string\",\"de"
                + "scription\":\"The person's last name.\",\"test\":null},\"age\":{\"type\":\"integ"
                + "er\",\"description\":\"Age in years\",\"minimum\":0}}}},\"schemaArray\":[{\"$id"
                + "\":\"https://example.com/person.schema.json\",\"$schema\":\"https://json-schema."
                + "org/draft/2020-12/schema\",\"title\":\"Person\",\"type\":\"object\",\"properties"
                + "\":{\"firstName\":{\"type\":\"string\",\"description\":\"The person's first name"
                + ".\"},\"lastName\":{\"type\":\"string\",\"description\":\"The person's last name."
                + "\",\"test\":null},\"age\":{\"type\":\"integer\",\"description\":\"Age in years"
                + "\",\"minimum\":0}}},{\"$id\":\"https://example.com/person.schema.json\",\"$schem"
                + "a\":\"https://json-schema.org/draft/2020-12/schema\",\"title\":\"Person\",\"type"
                + "\":\"object\",\"properties\":{\"firstName\":{\"type\":\"string\",\"description"
                + "\":\"The person's first name.\"},\"lastName\":{\"type\":\"string\",\"description"
                + "\":\"The person's last name.\",\"test\":null},\"age\":{\"type\":\"integer\",\"de"
                + "scription\":\"Age in years\",\"minimum\":0}}}],\"schema\":{\"$id\":\"https://exa"
                + "mple.com/person.schema.json\",\"$schema\":\"https://json-schema.org/draft/2020-1"
                + "2/schema\",\"title\":\"Person\",\"type\":\"object\",\"properties\":{\"firstName"
                + "\":{\"type\":\"string\",\"description\":\"The person's first name.\"},\"lastName"
                + "\":{\"type\":\"string\",\"description\":\"The person's last name.\",\"test\":nul"
                + "l},\"age\":{\"type\":\"integer\",\"description\":\"Age in years\",\"minimum\":0}"
                + "}}}",
                SchemaContainer.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendSchemainModel(body);
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
     * Send Schema as Body.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendSchemaAsBody() throws Exception {
        // Parameters for the API call
        JsonObject body = JsonObject.fromJsonString(
                "{\"$id\":\"https://example.com/person.schema.json\",\"$schema\":\"https://json-sch"
                + "ema.org/draft/2020-12/schema\",\"title\":\"Person\",\"type\":\"object\",\"proper"
                + "ties\":{\"firstName\":{\"type\":\"string\",\"description\":\"The person's first "
                + "name.\"},\"lastName\":{\"type\":\"string\",\"description\":\"The person's last n"
                + "ame.\",\"test\":null},\"age\":{\"type\":\"integer\",\"description\":\"Age in yea"
                + "rs\",\"minimum\":0}}}");

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendSchemaasBody(body);
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
                "{\"passed\":true,\"message\":\"OK\",\"nullableNumberMap\":{\"luckydraw1\":null,\"l"
                + "uckydraw2\":88.1,\"luckydraw3\":89.1,\"luckydraw4\":null,\"luckydraw5\":91.1},"
                + "\"nullableNumberArray\":[null, 88.1, 89.1, null, 91.1]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Send Schema as Form.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendSchemaAsForm() throws Exception {
        // Parameters for the API call
        SendSchemaasFormInput input = new SendSchemaasFormInput();
        input.setContentType(ContentTypeEnum.fromString(
                "application/x-www-form-urlencoded"));
        input.setId(54);
        input.setModel(JsonObject.fromJsonString(
                "{\"$id\":\"https://example.com/person.schema.json\",\"$schema\":\"https://json-sch"
                + "ema.org/draft/2020-12/schema\",\"title\":\"Person\",\"type\":\"object\",\"proper"
                + "ties\":{\"firstName\":{\"type\":\"string\",\"description\":\"The person's first "
                + "name.\"},\"lastName\":{\"type\":\"string\",\"description\":\"The person's last n"
                + "ame.\",\"test\":null},\"age\":{\"type\":\"integer\",\"description\":\"Age in yea"
                + "rs\",\"minimum\":0}}}"));
        input.setModelArray(ApiHelper.deserializeArray(
                "[{\"$id\":\"https://example.com/person.schema.json\",\"$schema\":\"https://json-sc"
                + "hema.org/draft/2020-12/schema\",\"title\":\"Person\",\"type\":\"object\",\"prope"
                + "rties\":{\"firstName\":{\"type\":\"string\",\"description\":\"The person's first"
                + " name.\"},\"lastName\":{\"type\":\"string\",\"description\":\"The person's last "
                + "name.\",\"test\":null},\"age\":{\"type\":\"integer\",\"description\":\"Age in ye"
                + "ars\",\"minimum\":0}}},{\"$id\":\"https://example.com/person.schema.json\",\"$sc"
                + "hema\":\"https://json-schema.org/draft/2020-12/schema\",\"title\":\"Person\",\"t"
                + "ype\":\"object\",\"properties\":{\"firstName\":{\"type\":\"string\",\"descriptio"
                + "n\":\"The person's first name.\"},\"lastName\":{\"type\":\"string\",\"descriptio"
                + "n\":\"The person's last name.\",\"test\":null},\"age\":{\"type\":\"integer\",\"d"
                + "escription\":\"Age in years\",\"minimum\":0}}}]",
                JsonObject[].class));
        input.setModelMap(JsonObject.fromJsonString(
                "{\"key1\":{\"$id\":\"https://example.com/person.schema.json\",\"$schema\":\"https:"
                + "//json-schema.org/draft/2020-12/schema\",\"title\":\"Person\",\"type\":\"object"
                + "\",\"properties\":{\"firstName\":{\"type\":\"string\",\"description\":\"The pers"
                + "on's first name.\"},\"lastName\":{\"type\":\"string\",\"description\":\"The pers"
                + "on's last name.\",\"test\":null},\"age\":{\"type\":\"integer\",\"description\":"
                + "\"Age in years\",\"minimum\":0}}},\"key2\":{\"$id\":\"https://example.com/person"
                + ".schema.json\",\"$schema\":\"https://json-schema.org/draft/2020-12/schema\",\"ti"
                + "tle\":\"Person\",\"type\":\"object\",\"properties\":{\"firstName\":{\"type\":\"s"
                + "tring\",\"description\":\"The person's first name.\"},\"lastName\":{\"type\":\"s"
                + "tring\",\"description\":\"The person's last name.\",\"test\":null},\"age\":{\"ty"
                + "pe\":\"integer\",\"description\":\"Age in years\",\"minimum\":0}}}}"));

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendSchemaasForm(input);
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
     * Send Schema as Query.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendSchemaAsQuery() throws Exception {
        // Parameters for the API call
        SendSchemaasQueryInput input = new SendSchemaasQueryInput();
        input.setId(54);
        input.setModel(JsonObject.fromJsonString(
                "{\"$id\":\"https://example.com/person.schema.json\",\"$schema\":\"https://json-sch"
                + "ema.org/draft/2020-12/schema\",\"title\":\"Person\",\"type\":\"object\",\"proper"
                + "ties\":{\"firstName\":{\"type\":\"string\",\"description\":\"The person's first "
                + "name.\"},\"lastName\":{\"type\":\"string\",\"description\":\"The person's last n"
                + "ame.\",\"test\":null},\"age\":{\"type\":\"integer\",\"description\":\"Age in yea"
                + "rs\",\"minimum\":0}}}"));
        input.setModelArray(ApiHelper.deserializeArray(
                "[{\"$id\":\"https://example.com/person.schema.json\",\"$schema\":\"https://json-sc"
                + "hema.org/draft/2020-12/schema\",\"title\":\"Person\",\"type\":\"object\",\"prope"
                + "rties\":{\"firstName\":{\"type\":\"string\",\"description\":\"The person's first"
                + " name.\"},\"lastName\":{\"type\":\"string\",\"description\":\"The person's last "
                + "name.\",\"test\":null},\"age\":{\"type\":\"integer\",\"description\":\"Age in ye"
                + "ars\",\"minimum\":0}}},{\"$id\":\"https://example.com/person.schema.json\",\"$sc"
                + "hema\":\"https://json-schema.org/draft/2020-12/schema\",\"title\":\"Person\",\"t"
                + "ype\":\"object\",\"properties\":{\"firstName\":{\"type\":\"string\",\"descriptio"
                + "n\":\"The person's first name.\"},\"lastName\":{\"type\":\"string\",\"descriptio"
                + "n\":\"The person's last name.\",\"test\":null},\"age\":{\"type\":\"integer\",\"d"
                + "escription\":\"Age in years\",\"minimum\":0}}}]",
                JsonObject[].class));
        input.setModelMap(JsonObject.fromJsonString(
                "{\"key1\":{\"$id\":\"https://example.com/person.schema.json\",\"$schema\":\"https:"
                + "//json-schema.org/draft/2020-12/schema\",\"title\":\"Person\",\"type\":\"object"
                + "\",\"properties\":{\"firstName\":{\"type\":\"string\",\"description\":\"The pers"
                + "on's first name.\"},\"lastName\":{\"type\":\"string\",\"description\":\"The pers"
                + "on's last name.\",\"test\":null},\"age\":{\"type\":\"integer\",\"description\":"
                + "\"Age in years\",\"minimum\":0}}},\"key2\":{\"$id\":\"https://example.com/person"
                + ".schema.json\",\"$schema\":\"https://json-schema.org/draft/2020-12/schema\",\"ti"
                + "tle\":\"Person\",\"type\":\"object\",\"properties\":{\"firstName\":{\"type\":\"s"
                + "tring\",\"description\":\"The person's first name.\"},\"lastName\":{\"type\":\"s"
                + "tring\",\"description\":\"The person's last name.\",\"test\":null},\"age\":{\"ty"
                + "pe\":\"integer\",\"description\":\"Age in years\",\"minimum\":0}}}}"));

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendSchemaasQuery(input);
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
     * Get Schema.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetSchema() throws Exception {

        // Set callback and perform API call
        JsonObject result = null;
        try {
            result = controller.getSchema();
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
                "{\"$id\":\"https://example.com/person.schema.json\",\"$schema\":\"https://json-sch"
                + "ema.org/draft/2020-12/schema\",\"title\":\"Person\",\"type\":\"object\",\"proper"
                + "ties\":{\"firstName\":{\"type\":\"string\",\"description\":\"The person's first "
                + "name.\"},\"lastName\":{\"type\":\"string\",\"description\":\"The person's last n"
                + "ame.\",\"test\":null},\"age\":{\"type\":\"integer\",\"description\":\"Age in yea"
                + "rs\",\"minimum\":0}}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Get Schema Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetSchemaArray() throws Exception {

        // Set callback and perform API call
        List<JsonObject> result = null;
        try {
            result = controller.getSchemaArray();
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
                TestHelper.isArrayOfJsonObjectsProperSubsetOf(
                "[{\"$id\":\"https://example.com/person.schema.json\",\"$schema\":\"https://json-sc"
                + "hema.org/draft/2020-12/schema\",\"title\":\"Person\",\"type\":\"object\",\"prope"
                + "rties\":{\"firstName\":{\"type\":\"string\",\"description\":\"The person's first"
                + " name.\"},\"lastName\":{\"type\":\"string\",\"description\":\"The person's last "
                + "name.\",\"test\":null},\"age\":{\"type\":\"integer\",\"description\":\"Age in ye"
                + "ars\",\"minimum\":0}}},{\"$id\":\"https://example.com/person.schema.json\",\"$sc"
                + "hema\":\"https://json-schema.org/draft/2020-12/schema\",\"title\":\"Person\",\"t"
                + "ype\":\"object\",\"properties\":{\"firstName\":{\"type\":\"string\",\"descriptio"
                + "n\":\"The person's first name.\"},\"lastName\":{\"type\":\"string\",\"descriptio"
                + "n\":\"The person's last name.\",\"test\":null},\"age\":{\"type\":\"integer\",\"d"
                + "escription\":\"Age in years\",\"minimum\":0}}}]",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Get Schema Map.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetSchemaMap() throws Exception {

        // Set callback and perform API call
        JsonObject result = null;
        try {
            result = controller.getSchemaMap();
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
                "{\"key1\":{\"$id\":\"https://example.com/person.schema.json\",\"$schema\":\"https:"
                + "//json-schema.org/draft/2020-12/schema\",\"title\":\"Person\",\"type\":\"object"
                + "\",\"properties\":{\"firstName\":{\"type\":\"string\",\"description\":\"The pers"
                + "on's first name.\"},\"lastName\":{\"type\":\"string\",\"description\":\"The pers"
                + "on's last name.\",\"test\":null},\"age\":{\"type\":\"integer\",\"description\":"
                + "\"Age in years\",\"minimum\":0}}},\"key2\":{\"$id\":\"https://example.com/person"
                + ".schema.json\",\"$schema\":\"https://json-schema.org/draft/2020-12/schema\",\"ti"
                + "tle\":\"Person\",\"type\":\"object\",\"properties\":{\"firstName\":{\"type\":\"s"
                + "tring\",\"description\":\"The person's first name.\"},\"lastName\":{\"type\":\"s"
                + "tring\",\"description\":\"The person's last name.\",\"test\":null},\"age\":{\"ty"
                + "pe\":\"integer\",\"description\":\"Age in years\",\"minimum\":0}}}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Get Schema in Model.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetSchemaInModel() throws Exception {

        // Set callback and perform API call
        SchemaContainer result = null;
        try {
            result = controller.getSchemainModel();
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
                "{\"name\":\"a name\",\"id\":\"definition-123\",\"schemaMap\":{\"key1\":{\"$id\":"
                + "\"https://example.com/person.schema.json\",\"$schema\":\"https://json-schema.org"
                + "/draft/2020-12/schema\",\"title\":\"Person\",\"type\":\"object\",\"properties\":"
                + "{\"firstName\":{\"type\":\"string\",\"description\":\"The person's first name."
                + "\"},\"lastName\":{\"type\":\"string\",\"description\":\"The person's last name."
                + "\",\"test\":null},\"age\":{\"type\":\"integer\",\"description\":\"Age in years"
                + "\",\"minimum\":0}}},\"key2\":{\"$id\":\"https://example.com/person.schema.json"
                + "\",\"$schema\":\"https://json-schema.org/draft/2020-12/schema\",\"title\":\"Pers"
                + "on\",\"type\":\"object\",\"properties\":{\"firstName\":{\"type\":\"string\",\"de"
                + "scription\":\"The person's first name.\"},\"lastName\":{\"type\":\"string\",\"de"
                + "scription\":\"The person's last name.\",\"test\":null},\"age\":{\"type\":\"integ"
                + "er\",\"description\":\"Age in years\",\"minimum\":0}}}},\"schemaArray\":[{\"$id"
                + "\":\"https://example.com/person.schema.json\",\"$schema\":\"https://json-schema."
                + "org/draft/2020-12/schema\",\"title\":\"Person\",\"type\":\"object\",\"properties"
                + "\":{\"firstName\":{\"type\":\"string\",\"description\":\"The person's first name"
                + ".\"},\"lastName\":{\"type\":\"string\",\"description\":\"The person's last name."
                + "\",\"test\":null},\"age\":{\"type\":\"integer\",\"description\":\"Age in years"
                + "\",\"minimum\":0}}},{\"$id\":\"https://example.com/person.schema.json\",\"$schem"
                + "a\":\"https://json-schema.org/draft/2020-12/schema\",\"title\":\"Person\",\"type"
                + "\":\"object\",\"properties\":{\"firstName\":{\"type\":\"string\",\"description"
                + "\":\"The person's first name.\"},\"lastName\":{\"type\":\"string\",\"description"
                + "\":\"The person's last name.\",\"test\":null},\"age\":{\"type\":\"integer\",\"de"
                + "scription\":\"Age in years\",\"minimum\":0}}}],\"schema\":{\"$id\":\"https://exa"
                + "mple.com/person.schema.json\",\"$schema\":\"https://json-schema.org/draft/2020-1"
                + "2/schema\",\"title\":\"Person\",\"type\":\"object\",\"properties\":{\"firstName"
                + "\":{\"type\":\"string\",\"description\":\"The person's first name.\"},\"lastName"
                + "\":{\"type\":\"string\",\"description\":\"The person's last name.\",\"test\":nul"
                + "l},\"age\":{\"type\":\"integer\",\"description\":\"Age in years\",\"minimum\":0}"
                + "}}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

}
