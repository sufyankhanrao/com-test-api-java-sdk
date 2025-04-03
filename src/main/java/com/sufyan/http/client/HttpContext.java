/*
 * JsonValueTesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.sufyan.http.client;

import io.apimatic.coreinterfaces.http.Context;
import com.sufyan.http.request.HttpRequest;
import com.sufyan.http.response.HttpResponse;

/**
 * Class to wrap the request sent to the server and the response received from the server.
 */
public class HttpContext implements Context {
    private HttpRequest request;
    private HttpResponse response;

    /**
     * Initialization constructor.
     * @param request  Instance of HttpRequest.
     * @param response Instance of HttpResponse.
     */
    public HttpContext(HttpRequest request, HttpResponse response) {
        this.request = request;
        this.response = response;
    }

    /**
     * Getter for the Http Request.
     * @return HttpRequest request.
     */
    public HttpRequest getRequest() {
        return request;
    }

    /**
     * Getter for the Http Response.
     * @return HttpResponse response.
     */
    public HttpResponse getResponse() {
        return response;
    }
}