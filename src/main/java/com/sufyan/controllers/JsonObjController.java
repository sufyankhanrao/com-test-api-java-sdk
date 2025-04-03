/*
 * JsonValueTesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.sufyan.controllers;

import com.sufyan.exceptions.ApiException;
import com.sufyan.models.SchemaContainer;
import com.sufyan.models.SendSchemaasFormInput;
import com.sufyan.models.SendSchemaasQueryInput;
import com.sufyan.models.ServerResponse;
import com.sufyan.utilities.JsonObject;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface JsonObjController {
    /**
     * Send Schema in Model.
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendSchemainModel(
            final SchemaContainer body) throws ApiException, IOException;

    /**
     * Send Schema in Model.
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendSchemainModelAsync(
            final SchemaContainer body);

    /**
     * Send Schema as Body.
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendSchemaasBody(
            final JsonObject body) throws ApiException, IOException;

    /**
     * Send Schema as Body.
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendSchemaasBodyAsync(
            final JsonObject body);

    /**
     * Send Schema as Form.
     * @param  input  SendSchemaasFormInput object containing request parameters
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendSchemaasForm(
            final SendSchemaasFormInput input) throws ApiException, IOException;

    /**
     * Send Schema as Form.
     * @param  input  SendSchemaasFormInput object containing request parameters
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendSchemaasFormAsync(
            final SendSchemaasFormInput input);

    /**
     * Send Schema as Query.
     * @param  input  SendSchemaasQueryInput object containing request parameters
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendSchemaasQuery(
            final SendSchemaasQueryInput input) throws ApiException, IOException;

    /**
     * Send Schema as Query.
     * @param  input  SendSchemaasQueryInput object containing request parameters
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendSchemaasQueryAsync(
            final SendSchemaasQueryInput input);

    /**
     * Get Schema.
     * @return    Returns the JsonObject response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    JsonObject getSchema() throws ApiException, IOException;

    /**
     * Get Schema.
     * @return    Returns the JsonObject response from the API call
     */
    CompletableFuture<JsonObject> getSchemaAsync();

    /**
     * Get Schema Array.
     * @return    Returns the List of JsonObject response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    List<JsonObject> getSchemaArray() throws ApiException, IOException;

    /**
     * Get Schema Array.
     * @return    Returns the List of JsonObject response from the API call
     */
    CompletableFuture<List<JsonObject>> getSchemaArrayAsync();

    /**
     * Get Schema Map.
     * @return    Returns the JsonObject response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    JsonObject getSchemaMap() throws ApiException, IOException;

    /**
     * Get Schema Map.
     * @return    Returns the JsonObject response from the API call
     */
    CompletableFuture<JsonObject> getSchemaMapAsync();

    /**
     * Get Schema in Model.
     * @return    Returns the SchemaContainer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    SchemaContainer getSchemainModel() throws ApiException, IOException;

    /**
     * Get Schema in Model.
     * @return    Returns the SchemaContainer response from the API call
     */
    CompletableFuture<SchemaContainer> getSchemainModelAsync();

}