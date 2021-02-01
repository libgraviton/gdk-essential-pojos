
package com.github.libgraviton.gdk.gravitondyn.file.document;

import java.util.Date;
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
    "deletedDate",
    "id",
    "command",
    "tenant"
})
public class FileMetadataAction {

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
     * Action command array
     * An array of commands that will be executed by workers on this file.
     * 
     */
    @JsonProperty("command")
    @JsonPropertyDescription("")
    private String command;
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
     * Action command array
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
     * An array of commands that will be executed by workers on this file.
     * 
     * @param command
     *     The command
     */
    @JsonProperty("command")
    public void setCommand(String command) {
        this.command = command;
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
