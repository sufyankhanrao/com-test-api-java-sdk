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
import java.util.List;
import java.util.Map;

/**
 * This is a model class for SendSchemaasQueryInput type.
 */
public class SendSchemaasQueryInput {
    private int id;
    private JsonObject model;
    private List<JsonObject> modelArray;
    private JsonObject modelMap;

    /**
     * Default constructor.
     */
    public SendSchemaasQueryInput() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  model  JsonObject value for model.
     * @param  modelArray  List of JsonObject value for modelArray.
     * @param  modelMap  JsonObject value for modelMap.
     */
    public SendSchemaasQueryInput(
            int id,
            JsonObject model,
            List<JsonObject> modelArray,
            JsonObject modelMap) {
        this.id = id;
        this.model = model;
        this.modelArray = modelArray;
        this.modelMap = modelMap;
    }

    /**
     * Getter for Id.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for Model.
     * @return Returns the JsonObject
     */
    @JsonGetter("model")
    public JsonObject getModel() {
        return model;
    }

    /**
     * Setter for Model.
     * @param model Value for JsonObject
     */
    @JsonSetter("model")
    public void setModel(JsonObject model) {
        this.model = model;
    }

    /**
     * Getter for ModelArray.
     * @return Returns the List of JsonObject
     */
    @JsonGetter("modelArray")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<JsonObject> getModelArray() {
        return modelArray;
    }

    /**
     * Setter for ModelArray.
     * @param modelArray Value for List of JsonObject
     */
    @JsonSetter("modelArray")
    public void setModelArray(List<JsonObject> modelArray) {
        this.modelArray = modelArray;
    }

    /**
     * Getter for ModelMap.
     * @return Returns the JsonObject
     */
    @JsonGetter("modelMap")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public JsonObject getModelMap() {
        return modelMap;
    }

    /**
     * Setter for ModelMap.
     * @param modelMap Value for JsonObject
     */
    @JsonSetter("modelMap")
    public void setModelMap(JsonObject modelMap) {
        this.modelMap = modelMap;
    }

    /**
     * Converts this SendSchemaasQueryInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SendSchemaasQueryInput [" + "id=" + id + ", model=" + model + ", modelArray="
                + modelArray + ", modelMap=" + modelMap + "]";
    }

    /**
     * Builds a new {@link SendSchemaasQueryInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SendSchemaasQueryInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, model)
                .modelArray(getModelArray())
                .modelMap(getModelMap());
        return builder;
    }

    /**
     * Class to build instances of {@link SendSchemaasQueryInput}.
     */
    public static class Builder {
        private int id;
        private JsonObject model;
        private List<JsonObject> modelArray;
        private JsonObject modelMap;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  model  JsonObject value for model.
         */
        public Builder(int id, JsonObject model) {
            this.id = id;
            this.model = model;
        }

        /**
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for model.
         * @param  model  JsonObject value for model.
         * @return Builder
         */
        public Builder model(JsonObject model) {
            this.model = model;
            return this;
        }

        /**
         * Setter for modelArray.
         * @param  modelArray  List of JsonObject value for modelArray.
         * @return Builder
         */
        public Builder modelArray(List<JsonObject> modelArray) {
            this.modelArray = modelArray;
            return this;
        }

        /**
         * Setter for modelMap.
         * @param  modelMap  JsonObject value for modelMap.
         * @return Builder
         */
        public Builder modelMap(JsonObject modelMap) {
            this.modelMap = modelMap;
            return this;
        }

        /**
         * Builds a new {@link SendSchemaasQueryInput} object using the set fields.
         * @return {@link SendSchemaasQueryInput}
         */
        public SendSchemaasQueryInput build() {
            return new SendSchemaasQueryInput(id, model, modelArray, modelMap);
        }
    }
}
