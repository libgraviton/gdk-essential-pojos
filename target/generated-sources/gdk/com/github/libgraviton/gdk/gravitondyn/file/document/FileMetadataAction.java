
package com.github.libgraviton.gdk.gravitondyn.file.document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Action
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "command"
})
public class FileMetadataAction {

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
     * Action command array
     * <p>
     * An array of commands that will be executed by workers on this file.
     * 
     */
    @JsonProperty("command")
    @JsonPropertyDescription("")
    private String command;

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
     * Action command array
     * <p>
     * An array of commands that will be executed by workers on this file.
     * 
     * @return
     *     The command
     */
    @JsonProperty("command")
    public String getCommand() {
        return command;
    }

    /**
     * Action command array
     * <p>
     * An array of commands that will be executed by workers on this file.
     * 
     * @param command
     *     The command
     */
    @JsonProperty("command")
    public void setCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
