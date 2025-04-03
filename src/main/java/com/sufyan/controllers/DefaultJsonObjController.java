/*
 * JsonValueTesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.sufyan.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sufyan.ApiHelper;
import com.sufyan.Server;
import com.sufyan.exceptions.ApiException;
import com.sufyan.http.request.HttpMethod;
import com.sufyan.models.SchemaContainer;
import com.sufyan.models.SendSchemaasFormInput;
import com.sufyan.models.SendSchemaasQueryInput;
import com.sufyan.models.ServerResponse;
import com.sufyan.utilities.JsonObject;
import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultJsonObjController extends BaseController implements JsonObjController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultJsonObjController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Send Schema in Model.
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendSchemainModel(
            final SchemaContainer body) throws ApiException, IOException {
        return prepareSendSchemainModelRequest(body).execute();
    }

    /**
     * Send Schema in Model.
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendSchemainModelAsync(
            final SchemaContainer body) {
        try { 
            return prepareSendSchemainModelRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendSchemainModel.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendSchemainModelRequest(
            final SchemaContainer body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/sendSchemaInModel")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Send Schema as Body.
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendSchemaasBody(
            final JsonObject body) throws ApiException, IOException {
        return prepareSendSchemaasBodyRequest(body).execute();
    }

    /**
     * Send Schema as Body.
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendSchemaasBodyAsync(
            final JsonObject body) {
        try { 
            return prepareSendSchemaasBodyRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendSchemaasBody.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendSchemaasBodyRequest(
            final JsonObject body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/sendSchema")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Send Schema as Form.
     * @param  input  SendSchemaasFormInput object containing request parameters
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendSchemaasForm(
            final SendSchemaasFormInput input) throws ApiException, IOException {
        return prepareSendSchemaasFormRequest(input).execute();
    }

    /**
     * Send Schema as Form.
     * @param  input  SendSchemaasFormInput object containing request parameters
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendSchemaasFormAsync(
            final SendSchemaasFormInput input) {
        try { 
            return prepareSendSchemaasFormRequest(input).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendSchemaasForm.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendSchemaasFormRequest(
            final SendSchemaasFormInput input) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/sendSchema")
                        .formParam(param -> param.key("id")
                                .value(input.getId()).isRequired(false))
                        .formParam(param -> param.key("model")
                                .value(input.getModel()))
                        .formParam(param -> param.key("modelArray")
                                .value(input.getModelArray()).isRequired(false))
                        .formParam(param -> param.key("modelMap")
                                .value(input.getModelMap()).isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value((input.getContentType() != null) ? input.getContentType().value() : null).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Send Schema as Query.
     * @param  input  SendSchemaasQueryInput object containing request parameters
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendSchemaasQuery(
            final SendSchemaasQueryInput input) throws ApiException, IOException {
        return prepareSendSchemaasQueryRequest(input).execute();
    }

    /**
     * Send Schema as Query.
     * @param  input  SendSchemaasQueryInput object containing request parameters
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendSchemaasQueryAsync(
            final SendSchemaasQueryInput input) {
        try { 
            return prepareSendSchemaasQueryRequest(input).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendSchemaasQuery.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendSchemaasQueryRequest(
            final SendSchemaasQueryInput input) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/sendSchema")
                        .queryParam(param -> param.key("id")
                                .value(input.getId()).isRequired(false))
                        .queryParam(param -> param.key("model")
                                .value(input.getModel()))
                        .queryParam(param -> param.key("modelArray")
                                .value(input.getModelArray()).isRequired(false))
                        .queryParam(param -> param.key("modelMap")
                                .value(input.getModelMap()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Get Schema.
     * @return    Returns the JsonObject response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public JsonObject getSchema() throws ApiException, IOException {
        return prepareGetSchemaRequest().execute();
    }

    /**
     * Get Schema.
     * @return    Returns the JsonObject response from the API call
     */
    public CompletableFuture<JsonObject> getSchemaAsync() {
        try { 
            return prepareGetSchemaRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getSchema.
     */
    private ApiCall<JsonObject, ApiException> prepareGetSchemaRequest() throws IOException {
        return new ApiCall.Builder<JsonObject, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/getSchema")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> JsonObject.fromJsonString(response))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Get Schema Array.
     * @return    Returns the List of JsonObject response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<JsonObject> getSchemaArray() throws ApiException, IOException {
        return prepareGetSchemaArrayRequest().execute();
    }

    /**
     * Get Schema Array.
     * @return    Returns the List of JsonObject response from the API call
     */
    public CompletableFuture<List<JsonObject>> getSchemaArrayAsync() {
        try { 
            return prepareGetSchemaArrayRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getSchemaArray.
     */
    private ApiCall<List<JsonObject>, ApiException> prepareGetSchemaArrayRequest() throws IOException {
        return new ApiCall.Builder<List<JsonObject>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/getSchemaArray")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        JsonObject[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Get Schema Map.
     * @return    Returns the JsonObject response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public JsonObject getSchemaMap() throws ApiException, IOException {
        return prepareGetSchemaMapRequest().execute();
    }

    /**
     * Get Schema Map.
     * @return    Returns the JsonObject response from the API call
     */
    public CompletableFuture<JsonObject> getSchemaMapAsync() {
        try { 
            return prepareGetSchemaMapRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getSchemaMap.
     */
    private ApiCall<JsonObject, ApiException> prepareGetSchemaMapRequest() throws IOException {
        return new ApiCall.Builder<JsonObject, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/getSchemaMap")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> JsonObject.fromJsonString(response))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Get Schema in Model.
     * @return    Returns the SchemaContainer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SchemaContainer getSchemainModel() throws ApiException, IOException {
        return prepareGetSchemainModelRequest().execute();
    }

    /**
     * Get Schema in Model.
     * @return    Returns the SchemaContainer response from the API call
     */
    public CompletableFuture<SchemaContainer> getSchemainModelAsync() {
        try { 
            return prepareGetSchemainModelRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getSchemainModel.
     */
    private ApiCall<SchemaContainer, ApiException> prepareGetSchemainModelRequest() throws IOException {
        return new ApiCall.Builder<SchemaContainer, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/getSchemaInModel")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SchemaContainer.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}