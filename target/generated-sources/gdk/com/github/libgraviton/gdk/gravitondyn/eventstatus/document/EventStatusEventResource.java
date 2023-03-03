
package com.github.libgraviton.gdk.gravitondyn.eventstatus.document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EventResource
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$ref"
})
public class EventStatusEventResource {

    /**
     * Ref to event resource
     * A $ref pointing to the resource that triggered this event. If the resource was deleted, it may not exist anymore.
     * 
     */
    @JsonProperty("$ref")
    @JsonPropertyDescription("A $ref pointing to the resource that triggered this event. If the resource was deleted, it may not exist anymore.")
    private String $ref;

    /**
     * Ref to event resource
     * A $ref pointing to the resource that triggered this event. If the resource was deleted, it may not exist anymore.
     * 
     */
    @JsonProperty("$ref")
    public String get$ref() {
        return $ref;
    }

    /**
     * Ref to event resource
     * A $ref pointing to the resource that triggered this event. If the resource was deleted, it may not exist anymore.
     * 
     */
    @JsonProperty("$ref")
    public void set$ref(String $ref) {
        this.$ref = $ref;
    }

}
