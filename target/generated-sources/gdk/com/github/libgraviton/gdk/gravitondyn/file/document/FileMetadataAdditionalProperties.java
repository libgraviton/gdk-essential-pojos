
package com.github.libgraviton.gdk.gravitondyn.file.document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AdditionalProperties
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "id",
    "value"
})
public class FileMetadataAdditionalProperties {

    /**
     * property name
     * <p>
     * additional property name
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("")
    private String name;
    /**
     * ID
     * <p>
     * Unique identifier
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("")
    private String id;
    /**
     * property value
     * <p>
     * additional property value
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("")
    private String value;

    /**
     * property name
     * <p>
     * additional property name
     * (Required)
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * property name
     * <p>
     * additional property name
     * (Required)
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ID
     * <p>
     * Unique identifier
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Unique identifier
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * property value
     * <p>
     * additional property value
     * (Required)
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * property value
     * <p>
     * additional property value
     * (Required)
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
