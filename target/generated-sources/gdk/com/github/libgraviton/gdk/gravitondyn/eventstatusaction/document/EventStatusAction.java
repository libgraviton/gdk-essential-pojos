
package com.github.libgraviton.gdk.gravitondyn.eventstatusaction.document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.libgraviton.gdk.data.GravitonBase;


/**
 * Eventstatusaction
 * Action translation for worker events
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "id"
})
public class EventStatusAction implements GravitonBase
{

    /**
     * Description
     * A translated description for action done
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("")
    private EventStatusActionDescription description;
    /**
     * ID
     * Unique identifier
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("")
    private String id;

    /**
     * Description
     * A translated description for action done
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public EventStatusActionDescription getDescription() {
        return description;
    }

    /**
     * Description
     * A translated description for action done
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(EventStatusActionDescription description) {
        this.description = description;
    }

    /**
     * ID
     * Unique identifier
     * (Required)
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
     * (Required)
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

}
