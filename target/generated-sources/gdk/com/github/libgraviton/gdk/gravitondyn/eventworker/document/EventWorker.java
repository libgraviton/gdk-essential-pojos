
package com.github.libgraviton.gdk.gravitondyn.eventworker.document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.libgraviton.gdk.data.GravitonBase;


/**
 * Eventworker
 * A service giving the possibility for EventWorkers to register themselves.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "deletedDate",
    "id",
    "subscription",
    "tenant"
})
public class EventWorker implements GravitonBase
{

    /**
     * 
     * 
     * 
     */
    @JsonProperty("deletedDate")
    @JsonPropertyDescription("")
    private Date deletedDate;
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
     * Subscription
     * todo replace me
     * 
     */
    @JsonProperty("subscription")
    @JsonPropertyDescription("")
    private List<EventWorkerSubscription> subscription = new ArrayList<EventWorkerSubscription>();
    /**
     * 
     * 
     * 
     */
    @JsonProperty("tenant")
    @JsonPropertyDescription("")
    private Integer tenant;

    /**
     * 
     * 
     * 
     * @return
     *     The deletedDate
     */
    @JsonProperty("deletedDate")
    public Date getDeletedDate() {
        return deletedDate;
    }

    /**
     * 
     * 
     * 
     * @param deletedDate
     *     The deletedDate
     */
    @JsonProperty("deletedDate")
    public void setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
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

    /**
     * Subscription
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
     * Subscription
     * todo replace me
     * 
     * @param subscription
     *     The subscription
     */
    @JsonProperty("subscription")
    public void setSubscription(List<EventWorkerSubscription> subscription) {
        this.subscription = subscription;
    }

    /**
     * 
     * 
     * 
     * @return
     *     The tenant
     */
    @JsonProperty("tenant")
    public Integer getTenant() {
        return tenant;
    }

    /**
     * 
     * 
     * 
     * @param tenant
     *     The tenant
     */
    @JsonProperty("tenant")
    public void setTenant(Integer tenant) {
        this.tenant = tenant;
    }

}
