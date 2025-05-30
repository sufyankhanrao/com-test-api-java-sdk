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
 * This is a model class for SchemaContainer type.
 */
public class SchemaContainer
        extends BaseModel {
    private String name;
    private String id;
    private JsonObject schema;
    private List<JsonObject> schemaArray;
    private JsonObject schemaMap;

    /**
     * Default constructor.
     */
    public SchemaContainer() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  id  String value for id.
     * @param  schema  JsonObject value for schema.
     * @param  schemaArray  List of JsonObject value for schemaArray.
     * @param  schemaMap  JsonObject value for schemaMap.
     */
    public SchemaContainer(
            String name,
            String id,
            JsonObject schema,
            List<JsonObject> schemaArray,
            JsonObject schemaMap) {
        this.name = name;
        this.id = id;
        this.schema = schema;
        this.schemaArray = schemaArray;
        this.schemaMap = schemaMap;
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
     * Getter for Schema.
     * @return Returns the JsonObject
     */
    @JsonGetter("schema")
    public JsonObject getSchema() {
        return schema;
    }

    /**
     * Setter for Schema.
     * @param schema Value for JsonObject
     */
    @JsonSetter("schema")
    public void setSchema(JsonObject schema) {
        this.schema = schema;
    }

    /**
     * Getter for SchemaArray.
     * @return Returns the List of JsonObject
     */
    @JsonGetter("schemaArray")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<JsonObject> getSchemaArray() {
        return schemaArray;
    }

    /**
     * Setter for SchemaArray.
     * @param schemaArray Value for List of JsonObject
     */
    @JsonSetter("schemaArray")
    public void setSchemaArray(List<JsonObject> schemaArray) {
        this.schemaArray = schemaArray;
    }

    /**
     * Getter for SchemaMap.
     * @return Returns the JsonObject
     */
    @JsonGetter("schemaMap")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public JsonObject getSchemaMap() {
        return schemaMap;
    }

    /**
     * Setter for SchemaMap.
     * @param schemaMap Value for JsonObject
     */
    @JsonSetter("schemaMap")
    public void setSchemaMap(JsonObject schemaMap) {
        this.schemaMap = schemaMap;
    }

    /**
     * Converts this SchemaContainer into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SchemaContainer [" + "name=" + name + ", id=" + id + ", schema=" + schema
                + ", schemaArray=" + schemaArray + ", schemaMap=" + schemaMap
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link SchemaContainer.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SchemaContainer.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, id, schema)
                .schemaArray(getSchemaArray())
                .schemaMap(getSchemaMap());
        return builder;
    }

    /**
     * Class to build instances of {@link SchemaContainer}.
     */
    public static class Builder {
        private String name;
        private String id;
        private JsonObject schema;
        private List<JsonObject> schemaArray;
        private JsonObject schemaMap;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  id  String value for id.
         * @param  schema  JsonObject value for schema.
         */
        public Builder(String name, String id, JsonObject schema) {
            this.name = name;
            this.id = id;
            this.schema = schema;
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
         * Setter for schema.
         * @param  schema  JsonObject value for schema.
         * @return Builder
         */
        public Builder schema(JsonObject schema) {
            this.schema = schema;
            return this;
        }

        /**
         * Setter for schemaArray.
         * @param  schemaArray  List of JsonObject value for schemaArray.
         * @return Builder
         */
        public Builder schemaArray(List<JsonObject> schemaArray) {
            this.schemaArray = schemaArray;
            return this;
        }

        /**
         * Setter for schemaMap.
         * @param  schemaMap  JsonObject value for schemaMap.
         * @return Builder
         */
        public Builder schemaMap(JsonObject schemaMap) {
            this.schemaMap = schemaMap;
            return this;
        }

        /**
         * Builds a new {@link SchemaContainer} object using the set fields.
         * @return {@link SchemaContainer}
         */
        public SchemaContainer build() {
            return new SchemaContainer(name, id, schema, schemaArray, schemaMap);
        }
    }
}
