
package com.github.libgraviton.gdk.gravitondyn.eventstatus.document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Action
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$ref"
})
public class EventStatusStatusAction {

    /**
     * Action
     * Action done for this event, EventWorkerAction
     * 
     */
    @JsonProperty("$ref")
    @JsonPropertyDescription("")
    private String $ref;

    /**
     * Action
     * Action done for this event, EventWorkerAction
     * 
     * @return
     *     The $ref
     */
    @JsonProperty("$ref")
    public String get$ref() {
        return $ref;
    }

    /**
     * Action
     * Action done for this event, EventWorkerAction
     * 
     * @param $ref
     *     The $ref
     */
    @JsonProperty("$ref")
    public void set$ref(String $ref) {
        this.$ref = $ref;
    }

}
