
package com.github.libgraviton.gdk.gravitondyn.eventstatus.document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Action
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "$ref"
})
public class EventStatusStatusAction {

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
     * Action
     * <p>
     * Action done for this event, EventWorkerAction
     * 
     */
    @JsonProperty("$ref")
    @JsonPropertyDescription("")
    private String $ref;

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
     * Action
     * <p>
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
     * <p>
     * Action done for this event, EventWorkerAction
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
