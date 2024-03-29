
package com.github.libgraviton.gdk.gravitondyn.eventstatus.document;

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
    "action",
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
    @JsonPropertyDescription("ID of a worker")
    private String workerId;
    /**
     * Action
     * 
     * 
     */
    @JsonProperty("action")
    private EventStatusStatusAction action;
    /**
     * Status
     * A string representing the status (opened, working, failed, done)
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A string representing the status (opened, working, failed, done)")
    private EventStatusStatus.Status status;

    /**
     * Worker ID
     * ID of a worker
     * (Required)
     * 
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
     */
    @JsonProperty("workerId")
    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    /**
     * Action
     * 
     * 
     */
    @JsonProperty("action")
    public EventStatusStatusAction getAction() {
        return action;
    }

    /**
     * Action
     * 
     * 
     */
    @JsonProperty("action")
    public void setAction(EventStatusStatusAction action) {
        this.action = action;
    }

    /**
     * Status
     * A string representing the status (opened, working, failed, done)
     * (Required)
     * 
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
     */
    @JsonProperty("status")
    public void setStatus(EventStatusStatus.Status status) {
        this.status = status;
    }


    /**
     * Status
     * A string representing the status (opened, working, failed, done)
     * 
     */
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

        Status(String value) {
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
