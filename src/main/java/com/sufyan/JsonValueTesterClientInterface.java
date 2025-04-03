/*
 * JsonValueTesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.sufyan;

import com.sufyan.controllers.JsonObjController;
import com.sufyan.controllers.JsonValController;

/**
 * Gateway interface for the library.
 * This acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public interface JsonValueTesterClientInterface extends Configuration {
    
    /**
     * Provides access to JsonObj controller.
     * @return Returns the JsonObjController instance
     */
    JsonObjController getJsonObjController();

    /**
     * Provides access to JsonVal controller.
     * @return Returns the JsonValController instance
     */
    JsonValController getJsonValController();

}