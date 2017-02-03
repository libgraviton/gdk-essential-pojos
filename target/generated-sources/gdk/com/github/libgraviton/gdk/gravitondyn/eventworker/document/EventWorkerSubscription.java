
package com.github.libgraviton.gdk.gravitondyn.eventworker.document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Subscription
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "event"
})
public class EventWorkerSubscription {

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
     * Subscriptions
     * <p>
     * An array of strings containing event names this worker should be notified of
     * (Required)
     * 
     */
    @JsonProperty("event")
    @JsonPropertyDescription("")
    private String event;

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
     * Subscriptions
     * <p>
     * An array of strings containing event names this worker should be notified of
     * (Required)
     * 
     * @return
     *     The event
     */
    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    /**
     * Subscriptions
     * <p>
     * An array of strings containing event names this worker should be notified of
     * (Required)
     * 
     * @param event
     *     The event
     */
    @JsonProperty("event")
    public void setEvent(String event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}