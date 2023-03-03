
package com.github.libgraviton.gdk.gravitondyn.file.document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Links
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "$ref"
})
public class FileLinks {

    /**
     * Type
     * Type of the link.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of the link.")
    private String type;
    /**
     * Link
     * Link to any document.
     * 
     */
    @JsonProperty("$ref")
    @JsonPropertyDescription("Link to any document.")
    private String $ref;

    /**
     * Type
     * Type of the link.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type
     * Type of the link.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Link
     * Link to any document.
     * 
     */
    @JsonProperty("$ref")
    public String get$ref() {
        return $ref;
    }

    /**
     * Link
     * Link to any document.
     * 
     */
    @JsonProperty("$ref")
    public void set$ref(String $ref) {
        this.$ref = $ref;
    }

}
