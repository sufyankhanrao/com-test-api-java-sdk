/*
 * JsonValueTesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.sufyan.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.sufyan.utilities.JsonObject;
import io.apimatic.core.types.BaseModel;
import java.util.List;
import java.util.Map;

/**
 * This is a model class for ServerResponse type.
 */
public class ServerResponse
        extends BaseModel {
    private boolean passed;
    private String message;
    private JsonObject input;
    private Map<String, Double> nullableNumberMap;
    private List<Double> nullableNumberArray;

    /**
     * Default constructor.
     */
    public ServerResponse() {
    }

    /**
     * Initialization constructor.
     * @param  passed  boolean value for passed.
     * @param  message  String value for message.
     * @param  input  JsonObject value for input.
     * @param  nullableNumberMap  Map of String, value for nullableNumberMap.
     * @param  nullableNumberArray  List of Double value for nullableNumberArray.
     */
    public ServerResponse(
            boolean passed,
            String message,
            JsonObject input,
            Map<String, Double> nullableNumberMap,
            List<Double> nullableNumberArray) {
        this.passed = passed;
        this.message = message;
        this.input = input;
        this.nullableNumberMap = nullableNumberMap;
        this.nullableNumberArray = nullableNumberArray;
    }

    /**
     * Getter for Passed.
     * @return Returns the boolean
     */
    @JsonGetter("passed")
    public boolean getPassed() {
        return passed;
    }

    /**
     * Setter for Passed.
     * @param passed Value for boolean
     */
    @JsonSetter("passed")
    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    /**
     * Getter for Message.
     * @return Returns the String
     */
    @JsonGetter("Message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * @param message Value for String
     */
    @JsonSetter("Message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter for Input.
     * @return Returns the JsonObject
     */
    @JsonGetter("input")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public JsonObject getInput() {
        return input;
    }

    /**
     * Setter for Input.
     * @param input Value for JsonObject
     */
    @JsonSetter("input")
    public void setInput(JsonObject input) {
        this.input = input;
    }

    /**
     * Getter for NullableNumberMap.
     * @return Returns the Map of String, Double
     */
    @JsonGetter("nullableNumberMap")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, Double> getNullableNumberMap() {
        return nullableNumberMap;
    }

    /**
     * Setter for NullableNumberMap.
     * @param nullableNumberMap Value for Map of String, Double
     */
    @JsonSetter("nullableNumberMap")
    public void setNullableNumberMap(Map<String, Double> nullableNumberMap) {
        this.nullableNumberMap = nullableNumberMap;
    }

    /**
     * Getter for NullableNumberArray.
     * @return Returns the List of Double
     */
    @JsonGetter("nullableNumberArray")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Double> getNullableNumberArray() {
        return nullableNumberArray;
    }

    /**
     * Setter for NullableNumberArray.
     * @param nullableNumberArray Value for List of Double
     */
    @JsonSetter("nullableNumberArray")
    public void setNullableNumberArray(List<Double> nullableNumberArray) {
        this.nullableNumberArray = nullableNumberArray;
    }

    /**
     * Converts this ServerResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ServerResponse [" + "passed=" + passed + ", message=" + message + ", input=" + input
                + ", nullableNumberMap=" + nullableNumberMap + ", nullableNumberArray="
                + nullableNumberArray + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ServerResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ServerResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(passed)
                .message(getMessage())
                .input(getInput())
                .nullableNumberMap(getNullableNumberMap())
                .nullableNumberArray(getNullableNumberArray());
        return builder;
    }

    /**
     * Class to build instances of {@link ServerResponse}.
     */
    public static class Builder {
        private boolean passed;
        private String message;
        private JsonObject input;
        private Map<String, Double> nullableNumberMap;
        private List<Double> nullableNumberArray;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  passed  boolean value for passed.
         */
        public Builder(boolean passed) {
            this.passed = passed;
        }

        /**
         * Setter for passed.
         * @param  passed  boolean value for passed.
         * @return Builder
         */
        public Builder passed(boolean passed) {
            this.passed = passed;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Setter for input.
         * @param  input  JsonObject value for input.
         * @return Builder
         */
        public Builder input(JsonObject input) {
            this.input = input;
            return this;
        }

        /**
         * Setter for nullableNumberMap.
         * @param  nullableNumberMap  Map of String, value for nullableNumberMap.
         * @return Builder
         */
        public Builder nullableNumberMap(Map<String, Double> nullableNumberMap) {
            this.nullableNumberMap = nullableNumberMap;
            return this;
        }

        /**
         * Setter for nullableNumberArray.
         * @param  nullableNumberArray  List of Double value for nullableNumberArray.
         * @return Builder
         */
        public Builder nullableNumberArray(List<Double> nullableNumberArray) {
            this.nullableNumberArray = nullableNumberArray;
            return this;
        }

        /**
         * Builds a new {@link ServerResponse} object using the set fields.
         * @return {@link ServerResponse}
         */
        public ServerResponse build() {
            return new ServerResponse(passed, message, input, nullableNumberMap,
                    nullableNumberArray);
        }
    }
}
