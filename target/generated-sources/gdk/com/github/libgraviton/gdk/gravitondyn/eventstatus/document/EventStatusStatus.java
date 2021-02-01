
package com.github.libgraviton.gdk.gravitondyn.eventstatus.document;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Status
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "workerId",
    "deletedDate",
    "action",
    "id",
    "tenant",
    "status"
})
public class EventStatusStatus {

    /**
     * Worker ID
     * ID of a worker
     * (Required)
     * 
     */
    @JsonProperty("workerId")
    @JsonPropertyDescription("")
    private String workerId;
    /**
     * 
     * 
     * 
     */
    @JsonProperty("deletedDate")
    @JsonPropertyDescription("")
    private Date deletedDate;
    /**
     * Action
     * 
     * 
     */
    @JsonProperty("action")
    private EventStatusStatusAction action;
    /**
     * ID
     * Unique identifier
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("")
    private String id;
    /**
     * 
     * 
     * 
     */
    @JsonProperty("tenant")
    @JsonPropertyDescription("")
    private Integer tenant;
    /**
     * Status
     * A string representing the status (opened, working, failed, done)
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("")
    private EventStatusStatus.Status status;

    /**
     * Worker ID
     * ID of a worker
     * (Required)
     * 
     * @return
     *     The workerId
     */
    @JsonProperty("workerId")
    public String getWorkerId() {
        return workerId;
    }

    /**
     * Worker ID
     * ID of a worker
     * (Required)
     * 
     * @param workerId
     *     The workerId
     */
    @JsonProperty("workerId")
    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

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
     * Action
     * 
     * 
     * @return
     *     The action
     */
    @JsonProperty("action")
    public EventStatusStatusAction getAction() {
        return action;
    }

    /**
     * Action
     * 
     * 
     * @param action
     *     The action
     */
    @JsonProperty("action")
    public void setAction(EventStatusStatusAction action) {
        this.action = action;
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

    /**
     * Status
     * A string representing the status (opened, working, failed, done)
     * (Required)
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public EventStatusStatus.Status getStatus() {
        return status;
    }

    /**
     * Status
     * A string representing the status (opened, working, failed, done)
     * (Required)
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(EventStatusStatus.Status status) {
        this.status = status;
    }

    public enum Status {

        OPENED("opened"),
        WORKING("working"),
        IGNORED("ignored"),
        DONE("done"),
        FAILED("failed");
        private final String value;
        private final static Map<String, EventStatusStatus.Status> CONSTANTS = new HashMap<String, EventStatusStatus.Status>();

        static {
            for (EventStatusStatus.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static EventStatusStatus.Status fromValue(String value) {
            EventStatusStatus.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
