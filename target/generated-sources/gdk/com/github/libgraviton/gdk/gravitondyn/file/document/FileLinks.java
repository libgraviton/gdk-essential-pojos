
package com.github.libgraviton.gdk.gravitondyn.file.document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Links
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "type",
    "$ref"
})
public class FileLinks {

    /**
     * ID
     * Unique identifier
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("")
    private String id;
    /**
     * Type
     * Type of the link.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("")
    private String type;
    /**
     * Link
     * Link to any document.
     * 
     */
    @JsonProperty("$ref")
    @JsonPropertyDescription("")
    private String $ref;

    /**
     * ID
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
     * Type
     * Type of the link.
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type
     * Type of the link.
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Link
     * Link to any document.
     * 
     * @return
     *     The $ref
     */
    @JsonProperty("$ref")
    public String get$ref() {
        return $ref;
    }

    /**
     * Link
     * Link to any document.
     * 
     * @param $ref
     *     The $ref
     */
    @JsonProperty("$ref")
    public void set$ref(String $ref) {
        this.$ref = $ref;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
