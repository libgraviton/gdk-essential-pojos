
package com.github.libgraviton.gdk.gravitondyn.eventworker.document;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.libgraviton.gdk.data.GravitonBase;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Eventworker
 * A service giving the possibility for EventWorkers to register themselves.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "subscription"
})
public class EventWorker implements GravitonBase
{

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
     * subscription
     * todo replace me
     * 
     */
    @JsonProperty("subscription")
    @JsonPropertyDescription("")
    private List<EventWorkerSubscription> subscription = new ArrayList<EventWorkerSubscription>();

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

    /**
     * subscription
     * todo replace me
     * 
     * @return
     *     The subscription
     */
    @JsonProperty("subscription")
    public List<EventWorkerSubscription> getSubscription() {
        return subscription;
    }

    /**
     * subscription
     * todo replace me
     * 
     * @param subscription
     *     The subscription
     */
    @JsonProperty("subscription")
    public void setSubscription(List<EventWorkerSubscription> subscription) {
        this.subscription = subscription;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
