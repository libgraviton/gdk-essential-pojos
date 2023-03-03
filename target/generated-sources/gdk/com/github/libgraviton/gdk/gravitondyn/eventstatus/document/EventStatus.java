
package com.github.libgraviton.gdk.gravitondyn.eventstatus.document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.libgraviton.workerbase.gdk.data.GravitonBase;


/**
 * Eventstatus
 * A service providing resources providing status' on events subscribed by workers.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "eventName",
    "information",
    "id",
    "userId",
    "eventResource",
    "createDate",
    "status"
})
public class EventStatus implements GravitonBase
{

    /**
     * Event Name
     * Name of the created event
     * 
     */
    @JsonProperty("eventName")
    @JsonPropertyDescription("Name of the created event")
    private String eventName;
    /**
     * Information
     * todo replace me
     * 
     */
    @JsonProperty("information")
    @JsonPropertyDescription("@todo replace me")
    private List<EventStatusInformation> information = new ArrayList<EventStatusInformation>();
    /**
     * ID
     * Unique identifier
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique identifier")
    private String id;
    /**
     * User Identifier
     * User who created the event entry
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("User who created the event entry")
    private String userId;
    /**
     * EventResource
     * 
     * 
     */
    @JsonProperty("eventResource")
    private EventStatusEventResource eventResource;
    /**
     * Creation date
     * Creation date
     * 
     */
    @JsonProperty("createDate")
    @JsonPropertyDescription("Creation date")
    private Date createDate;
    /**
     * Status
     * todo replace me
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("@todo replace me")
    private List<EventStatusStatus> status = new ArrayList<EventStatusStatus>();

    /**
     * Event Name
     * Name of the created event
     * 
     */
    @JsonProperty("eventName")
    public String getEventName() {
        return eventName;
    }

    /**
     * Event Name
     * Name of the created event
     * 
     */
    @JsonProperty("eventName")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * Information
     * todo replace me
     * 
     */
    @JsonProperty("information")
    public List<EventStatusInformation> getInformation() {
        return information;
    }

    /**
     * Information
     * todo replace me
     * 
     */
    @JsonProperty("information")
    public void setInformation(List<EventStatusInformation> information) {
        this.information = information;
    }

    /**
     * ID
     * Unique identifier
     * (Required)
     * 
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
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * User Identifier
     * User who created the event entry
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User Identifier
     * User who created the event entry
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * EventResource
     * 
     * 
     */
    @JsonProperty("eventResource")
    public EventStatusEventResource getEventResource() {
        return eventResource;
    }

    /**
     * EventResource
     * 
     * 
     */
    @JsonProperty("eventResource")
    public void setEventResource(EventStatusEventResource eventResource) {
        this.eventResource = eventResource;
    }

    /**
     * Creation date
     * Creation date
     * 
     */
    @JsonProperty("createDate")
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Creation date
     * Creation date
     * 
     */
    @JsonProperty("createDate")
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * Status
     * todo replace me
     * 
     */
    @JsonProperty("status")
    public List<EventStatusStatus> getStatus() {
        return status;
    }

    /**
     * Status
     * todo replace me
     * 
     */
    @JsonProperty("status")
    public void setStatus(List<EventStatusStatus> status) {
        this.status = status;
    }

}
