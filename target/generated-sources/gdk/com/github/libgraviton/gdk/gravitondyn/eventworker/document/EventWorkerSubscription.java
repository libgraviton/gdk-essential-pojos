
package com.github.libgraviton.gdk.gravitondyn.eventworker.document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Subscription
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "event"
})
public class EventWorkerSubscription {

    /**
     * Subscriptions
     * An array of strings containing event names this worker should be notified of
     * (Required)
     * 
     */
    @JsonProperty("event")
    @JsonPropertyDescription("")
    private String event;

    /**
     * Subscriptions
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

}
