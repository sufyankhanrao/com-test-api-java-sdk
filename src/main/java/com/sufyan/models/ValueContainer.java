/*
 * JsonValueTesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.sufyan.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.sufyan.utilities.JsonValue;
import io.apimatic.core.types.BaseModel;
import java.util.List;
import java.util.Map;

/**
 * This is a model class for ValueContainer type.
 */
public class ValueContainer
        extends BaseModel {
    private String name;
    private String id;
    private JsonValue value;
    private List<JsonValue> valueArray;
    private JsonValue valueMap;

    /**
     * Default constructor.
     */
    public ValueContainer() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  id  String value for id.
     * @param  value  JsonValue value for value.
     * @param  valueArray  List of JsonValue value for valueArray.
     * @param  valueMap  JsonValue value for valueMap.
     */
    public ValueContainer(
            String name,
            String id,
            JsonValue value,
            List<JsonValue> valueArray,
            JsonValue valueMap) {
        this.name = name;
        this.id = id;
        this.value = value;
        this.valueArray = valueArray;
        this.valueMap = valueMap;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Value.
     * @return Returns the JsonValue
     */
    @JsonGetter("value")
    public JsonValue getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for JsonValue
     */
    @JsonSetter("value")
    public void setValue(JsonValue value) {
        this.value = value;
    }

    /**
     * Getter for ValueArray.
     * @return Returns the List of JsonValue
     */
    @JsonGetter("valueArray")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<JsonValue> getValueArray() {
        return valueArray;
    }

    /**
     * Setter for ValueArray.
     * @param valueArray Value for List of JsonValue
     */
    @JsonSetter("valueArray")
    public void setValueArray(List<JsonValue> valueArray) {
        this.valueArray = valueArray;
    }

    /**
     * Getter for ValueMap.
     * @return Returns the JsonValue
     */
    @JsonGetter("valueMap")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public JsonValue getValueMap() {
        return valueMap;
    }

    /**
     * Setter for ValueMap.
     * @param valueMap Value for JsonValue
     */
    @JsonSetter("valueMap")
    public void setValueMap(JsonValue valueMap) {
        this.valueMap = valueMap;
    }

    /**
     * Converts this ValueContainer into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ValueContainer [" + "name=" + name + ", id=" + id + ", value=" + value
                + ", valueArray=" + valueArray + ", valueMap=" + valueMap
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ValueContainer.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ValueContainer.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, id, value)
                .valueArray(getValueArray())
                .valueMap(getValueMap());
        return builder;
    }

    /**
     * Class to build instances of {@link ValueContainer}.
     */
    public static class Builder {
        private String name;
        private String id;
        private JsonValue value;
        private List<JsonValue> valueArray;
        private JsonValue valueMap;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  id  String value for id.
         * @param  value  JsonValue value for value.
         */
        public Builder(String name, String id, JsonValue value) {
            this.name = name;
            this.id = id;
            this.value = value;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for value.
         * @param  value  JsonValue value for value.
         * @return Builder
         */
        public Builder value(JsonValue value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for valueArray.
         * @param  valueArray  List of JsonValue value for valueArray.
         * @return Builder
         */
        public Builder valueArray(List<JsonValue> valueArray) {
            this.valueArray = valueArray;
            return this;
        }

        /**
         * Setter for valueMap.
         * @param  valueMap  JsonValue value for valueMap.
         * @return Builder
         */
        public Builder valueMap(JsonValue valueMap) {
            this.valueMap = valueMap;
            return this;
        }

        /**
         * Builds a new {@link ValueContainer} object using the set fields.
         * @return {@link ValueContainer}
         */
        public ValueContainer build() {
            return new ValueContainer(name, id, value, valueArray, valueMap);
        }
    }
}
