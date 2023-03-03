
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
 * Information
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "workerId",
    "type",
    "$ref",
    "content"
})
public class EventStatusInformation {

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
     * Information type
     * The type of information the worker published
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of information the worker published")
    private EventStatusInformation.Type type;
    /**
     * Ref
     * An optional $ref that can be written by the worker
     * 
     */
    @JsonProperty("$ref")
    @JsonPropertyDescription("An optional $ref that can be written by the worker")
    private String $ref;
    /**
     * Worker output
     * A place where a worker can put any information content
     * (Required)
     * 
     */
    @JsonProperty("content")
    @JsonPropertyDescription("A place where a worker can put any information content")
    private String content;

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
     * Information type
     * The type of information the worker published
     * (Required)
     * 
     */
    @JsonProperty("type")
    public EventStatusInformation.Type getType() {
        return type;
    }

    /**
     * Information type
     * The type of information the worker published
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(EventStatusInformation.Type type) {
        this.type = type;
    }

    /**
     * Ref
     * An optional $ref that can be written by the worker
     * 
     */
    @JsonProperty("$ref")
    public String get$ref() {
        return $ref;
    }

    /**
     * Ref
     * An optional $ref that can be written by the worker
     * 
     */
    @JsonProperty("$ref")
    public void set$ref(String $ref) {
        this.$ref = $ref;
    }

    /**
     * Worker output
     * A place where a worker can put any information content
     * (Required)
     * 
     */
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    /**
     * Worker output
     * A place where a worker can put any information content
     * (Required)
     * 
     */
    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }


    /**
     * Information type
     * The type of information the worker published
     * 
     */
    public enum Type {

        DEBUG("debug"),
        INFO("info"),
        WARNING("warning"),
        ERROR("error");
        private final String value;
        private final static Map<String, EventStatusInformation.Type> CONSTANTS = new HashMap<String, EventStatusInformation.Type>();

        static {
            for (EventStatusInformation.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static EventStatusInformation.Type fromValue(String value) {
            EventStatusInformation.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
