/*
 * JsonValueTesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.sufyan.controllers;

import com.sufyan.exceptions.ApiException;
import com.sufyan.models.SendValueasFormInput;
import com.sufyan.models.SendValueasQueryInput;
import com.sufyan.models.ServerResponse;
import com.sufyan.models.ValueContainer;
import com.sufyan.utilities.JsonValue;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface JsonValController {
    /**
     * Send Value in Model.
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendValueinModel(
            final ValueContainer body) throws ApiException, IOException;

    /**
     * Send Value in Model.
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendValueinModelAsync(
            final ValueContainer body);

    /**
     * Send Value as Body.
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendValueasBody(
            final JsonValue body) throws ApiException, IOException;

    /**
     * Send Value as Body.
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendValueasBodyAsync(
            final JsonValue body);

    /**
     * Send Value as Form.
     * @param  input  SendValueasFormInput object containing request parameters
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendValueasForm(
            final SendValueasFormInput input) throws ApiException, IOException;

    /**
     * Send Value as Form.
     * @param  input  SendValueasFormInput object containing request parameters
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendValueasFormAsync(
            final SendValueasFormInput input);

    /**
     * Send Value as Query.
     * @param  input  SendValueasQueryInput object containing request parameters
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendValueasQuery(
            final SendValueasQueryInput input) throws ApiException, IOException;

    /**
     * Send Value as Query.
     * @param  input  SendValueasQueryInput object containing request parameters
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendValueasQueryAsync(
            final SendValueasQueryInput input);

    /**
     * Get Value.
     * @return    Returns the JsonValue response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    JsonValue getValue() throws ApiException, IOException;

    /**
     * Get Value.
     * @return    Returns the JsonValue response from the API call
     */
    CompletableFuture<JsonValue> getValueAsync();

    /**
     * Get Value Array.
     * @return    Returns the List of JsonValue response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    List<JsonValue> getValueArray() throws ApiException, IOException;

    /**
     * Get Value Array.
     * @return    Returns the List of JsonValue response from the API call
     */
    CompletableFuture<List<JsonValue>> getValueArrayAsync();

    /**
     * Get Value Map.
     * @return    Returns the JsonValue response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    JsonValue getValueMap() throws ApiException, IOException;

    /**
     * Get Value Map.
     * @return    Returns the JsonValue response from the API call
     */
    CompletableFuture<JsonValue> getValueMapAsync();

    /**
     * Get Value in Model.
     * @return    Returns the ValueContainer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ValueContainer getValueinModel() throws ApiException, IOException;

    /**
     * Get Value in Model.
     * @return    Returns the ValueContainer response from the API call
     */
    CompletableFuture<ValueContainer> getValueinModelAsync();

}