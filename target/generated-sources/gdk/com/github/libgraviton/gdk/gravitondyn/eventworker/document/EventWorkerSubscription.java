
package com.github.libgraviton.gdk.gravitondyn.eventworker.document;

import java.util.Date;
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
    "deletedDate",
    "id",
    "event",
    "tenant"
})
public class EventWorkerSubscription {

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
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("")
    private String id;
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
