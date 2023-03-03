
package com.github.libgraviton.gdk.gravitondyn.file.document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Action
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "command"
})
public class FileMetadataAction {

    /**
     * Action command array
     * An array of commands that will be executed by workers on this file.
     * 
     */
    @JsonProperty("command")
    @JsonPropertyDescription("An array of commands that will be executed by workers on this file.")
    private String command;

    /**
     * Action command array
     * An array of commands that will be executed by workers on this file.
     * 
     */
    @JsonProperty("command")
    public String getCommand() {
        return command;
    }

    /**
     * Action command array
     * An array of commands that will be executed by workers on this file.
     * 
     */
    @JsonProperty("command")
    public void setCommand(String command) {
        this.command = command;
    }

}
