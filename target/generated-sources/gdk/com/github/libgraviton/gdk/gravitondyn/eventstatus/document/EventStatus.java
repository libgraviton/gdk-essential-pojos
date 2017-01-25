
package com.github.libgraviton.gdk.gravitondyn.eventstatus.document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.libgraviton.gdk.data.GravitonBase;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Eventstatus
 * <p>
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
     * <p>
     * Name of the created event
     * 
     */
    @JsonProperty("eventName")
    @JsonPropertyDescription("")
    private String eventName;
    /**
     * information
     * <p>
     * @todo replace me
     * 
     */
    @JsonProperty("information")
    @JsonPropertyDescription("")
    private List<EventStatusInformation> information = new ArrayList<EventStatusInformation>();
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
     * User Identifier
     * <p>
     * User who created the event entry
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("")
    private String userId;
    /**
     * EventResource
     * <p>
     * 
     * 
     */
    @JsonProperty("eventResource")
    private EventStatusEventResource eventResource;
    /**
     * Creation date
     * <p>
     * Creation date
     * 
     */
    @JsonProperty("createDate")
    @JsonPropertyDescription("")
    private Date createDate;
    /**
     * status
     * <p>
     * @todo replace me
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("")
    private List<EventStatusStatus> status = new ArrayList<EventStatusStatus>();

    /**
     * Event Name
     * <p>
     * Name of the created event
     * 
     * @return
     *     The eventName
     */
    @JsonProperty("eventName")
    public String getEventName() {
        return eventName;
    }

    /**
     * Event Name
     * <p>
     * Name of the created event
     * 
     * @param eventName
     *     The eventName
     */
    @JsonProperty("eventName")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * information
     * <p>
     * @todo replace me
     * 
     * @return
     *     The information
     */
    @JsonProperty("information")
    public List<EventStatusInformation> getInformation() {
        return information;
    }

    /**
     * information
     * <p>
     * @todo replace me
     * 
     * @param information
     *     The information
     */
    @JsonProperty("information")
    public void setInformation(List<EventStatusInformation> information) {
        this.information = information;
    }

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
     * User Identifier
     * <p>
     * User who created the event entry
     * 
     * @return
     *     The userId
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User Identifier
     * <p>
     * User who created the event entry
     * 
     * @param userId
     *     The userId
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * EventResource
     * <p>
     * 
     * 
     * @return
     *     The eventResource
     */
    @JsonProperty("eventResource")
    public EventStatusEventResource getEventResource() {
        return eventResource;
    }

    /**
     * EventResource
     * <p>
     * 
     * 
     * @param eventResource
     *     The eventResource
     */
    @JsonProperty("eventResource")
    public void setEventResource(EventStatusEventResource eventResource) {
        this.eventResource = eventResource;
    }

    /**
     * Creation date
     * <p>
     * Creation date
     * 
     * @return
     *     The createDate
     */
    @JsonProperty("createDate")
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Creation date
     * <p>
     * Creation date
     * 
     * @param createDate
     *     The createDate
     */
    @JsonProperty("createDate")
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * status
     * <p>
     * @todo replace me
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public List<EventStatusStatus> getStatus() {
        return status;
    }

    /**
     * status
     * <p>
     * @todo replace me
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(List<EventStatusStatus> status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
