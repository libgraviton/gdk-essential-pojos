
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
    "id",
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
    @JsonPropertyDescription("")
    private String workerId;
    /**
     * ID
     * Unique identifier
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("")
    private String id;
    /**
     * Information type
     * The type of information the worker published
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("")
    private EventStatusInformation.Type type;
    /**
     * Ref
     * An optional $ref that can be written by the worker
     * 
     */
    @JsonProperty("$ref")
    @JsonPropertyDescription("")
    private String $ref;
    /**
     * Worker output
     * A place where a worker can put any information content
     * (Required)
     * 
     */
    @JsonProperty("content")
    @JsonPropertyDescription("")
    private String content;

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
     * Information type
     * The type of information the worker published
     * (Required)
     * 
     * @return
     *     The type
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
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(EventStatusInformation.Type type) {
        this.type = type;
    }

    /**
     * Ref
     * An optional $ref that can be written by the worker
     * 
     * @return
     *     The $ref
     */
    @JsonProperty("$ref")
    public String get$ref() {
        return $ref;
    }

    /**
     * Ref
     * An optional $ref that can be written by the worker
     * 
     * @param $ref
     *     The $ref
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
     * @return
     *     The content
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
     * @param content
     *     The content
     */
    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

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

        private Type(String value) {
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
