
package com.github.libgraviton.gdk.gravitondyn.eventstatus.document;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Status
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "workerId",
    "action",
    "id",
    "status"
})
public class EventStatusStatus {

    /**
     * Worker ID
     * <p>
     * ID of a worker
     * (Required)
     * 
     */
    @JsonProperty("workerId")
    @JsonPropertyDescription("")
    private String workerId;
    /**
     * Action
     * <p>
     * 
     * 
     */
    @JsonProperty("action")
    private EventStatusStatusAction action;
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
     * Status
     * <p>
     * A string representing the status (opened, working, failed, done)
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("")
    private EventStatusStatus.Status status;

    /**
     * Worker ID
     * <p>
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
     * <p>
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
     * Action
     * <p>
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
     * <p>
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
     * Status
     * <p>
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
     * <p>
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
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
