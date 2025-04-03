/*
 * JsonValueTesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.sufyan.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * ContentTypeEnum to be used.
 */
public enum ContentTypeEnum {
    ENUM_APPLICATIONXWWWFORMURLENCODED;


    private static TreeMap<String, ContentTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_APPLICATIONXWWWFORMURLENCODED.value = "application/x-www-form-urlencoded";

        valueMap.put("application/x-www-form-urlencoded", ENUM_APPLICATIONXWWWFORMURLENCODED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ContentTypeEnum constructFromString(String toConvert) throws IOException {
        ContentTypeEnum enumValue = fromString(toConvert);
        if (enumValue == null) {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static ContentTypeEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of ContentTypeEnum values to list of string values.
     * @param toConvert The list of ContentTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ContentTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ContentTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 