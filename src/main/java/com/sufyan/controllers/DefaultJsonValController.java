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
import com.sufyan.models.SendValueasFormInput;
import com.sufyan.models.SendValueasQueryInput;
import com.sufyan.models.ServerResponse;
import com.sufyan.models.ValueContainer;
import com.sufyan.utilities.JsonValue;
import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultJsonValController extends BaseController implements JsonValController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultJsonValController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Send Value in Model.
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendValueinModel(
            final ValueContainer body) throws ApiException, IOException {
        return prepareSendValueinModelRequest(body).execute();
    }

    /**
     * Send Value in Model.
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendValueinModelAsync(
            final ValueContainer body) {
        try { 
            return prepareSendValueinModelRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendValueinModel.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendValueinModelRequest(
            final ValueContainer body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/sendValueInModel")
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
     * Send Value as Body.
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendValueasBody(
            final JsonValue body) throws ApiException, IOException {
        return prepareSendValueasBodyRequest(body).execute();
    }

    /**
     * Send Value as Body.
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendValueasBodyAsync(
            final JsonValue body) {
        try { 
            return prepareSendValueasBodyRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendValueasBody.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendValueasBodyRequest(
            final JsonValue body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/sendValue")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("text/plain").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Send Value as Form.
     * @param  input  SendValueasFormInput object containing request parameters
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendValueasForm(
            final SendValueasFormInput input) throws ApiException, IOException {
        return prepareSendValueasFormRequest(input).execute();
    }

    /**
     * Send Value as Form.
     * @param  input  SendValueasFormInput object containing request parameters
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendValueasFormAsync(
            final SendValueasFormInput input) {
        try { 
            return prepareSendValueasFormRequest(input).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendValueasForm.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendValueasFormRequest(
            final SendValueasFormInput input) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/sendValue")
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
     * Send Value as Query.
     * @param  input  SendValueasQueryInput object containing request parameters
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendValueasQuery(
            final SendValueasQueryInput input) throws ApiException, IOException {
        return prepareSendValueasQueryRequest(input).execute();
    }

    /**
     * Send Value as Query.
     * @param  input  SendValueasQueryInput object containing request parameters
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendValueasQueryAsync(
            final SendValueasQueryInput input) {
        try { 
            return prepareSendValueasQueryRequest(input).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendValueasQuery.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendValueasQueryRequest(
            final SendValueasQueryInput input) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/sendValue")
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
     * Get Value.
     * @return    Returns the JsonValue response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public JsonValue getValue() throws ApiException, IOException {
        return prepareGetValueRequest().execute();
    }

    /**
     * Get Value.
     * @return    Returns the JsonValue response from the API call
     */
    public CompletableFuture<JsonValue> getValueAsync() {
        try { 
            return prepareGetValueRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getValue.
     */
    private ApiCall<JsonValue, ApiException> prepareGetValueRequest() throws IOException {
        return new ApiCall.Builder<JsonValue, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/getValue")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, JsonValue.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Get Value Array.
     * @return    Returns the List of JsonValue response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<JsonValue> getValueArray() throws ApiException, IOException {
        return prepareGetValueArrayRequest().execute();
    }

    /**
     * Get Value Array.
     * @return    Returns the List of JsonValue response from the API call
     */
    public CompletableFuture<List<JsonValue>> getValueArrayAsync() {
        try { 
            return prepareGetValueArrayRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getValueArray.
     */
    private ApiCall<List<JsonValue>, ApiException> prepareGetValueArrayRequest() throws IOException {
        return new ApiCall.Builder<List<JsonValue>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/getValueArray")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        JsonValue[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Get Value Map.
     * @return    Returns the JsonValue response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public JsonValue getValueMap() throws ApiException, IOException {
        return prepareGetValueMapRequest().execute();
    }

    /**
     * Get Value Map.
     * @return    Returns the JsonValue response from the API call
     */
    public CompletableFuture<JsonValue> getValueMapAsync() {
        try { 
            return prepareGetValueMapRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getValueMap.
     */
    private ApiCall<JsonValue, ApiException> prepareGetValueMapRequest() throws IOException {
        return new ApiCall.Builder<JsonValue, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/getValueMap")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, JsonValue.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Get Value in Model.
     * @return    Returns the ValueContainer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ValueContainer getValueinModel() throws ApiException, IOException {
        return prepareGetValueinModelRequest().execute();
    }

    /**
     * Get Value in Model.
     * @return    Returns the ValueContainer response from the API call
     */
    public CompletableFuture<ValueContainer> getValueinModelAsync() {
        try { 
            return prepareGetValueinModelRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getValueinModel.
     */
    private ApiCall<ValueContainer, ApiException> prepareGetValueinModelRequest() throws IOException {
        return new ApiCall.Builder<ValueContainer, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/getValueInModel")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ValueContainer.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}