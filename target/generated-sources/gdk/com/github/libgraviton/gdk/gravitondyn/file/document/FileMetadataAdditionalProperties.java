
package com.github.libgraviton.gdk.gravitondyn.file.document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AdditionalProperties
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "value"
})
public class FileMetadataAdditionalProperties {

    /**
     * property name
     * additional property name
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("additional property name")
    private String name;
    /**
     * property value
     * additional property value
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("additional property value")
    private String value;

    /**
     * property name
     * additional property name
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * property name
     * additional property name
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * property value
     * additional property value
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * property value
     * additional property value
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

}
