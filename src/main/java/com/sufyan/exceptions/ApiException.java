/*
 * JsonValueTesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.sufyan.exceptions;

import io.apimatic.core.types.CoreApiException;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is the base class for all exceptions that represent an error response from the server.
 */
public class ApiException extends CoreApiException {
    //UID for serialization
    private static final long serialVersionUID = 1L;

    /**
     * Initialization constructor.
     * @param reason The reason for throwing exception
     */
    public ApiException(String reason) {
        super(reason);
        // TODO Auto-generated constructor stub
    }

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public ApiException(String reason, Context context) {
        super(reason, context);
    }

    /**
     * Converts this ApiException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApiException [" + "statusCode=" + getResponseCode() + ", message=" + getMessage() + "]";
    }
}