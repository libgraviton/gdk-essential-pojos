
package com.github.libgraviton.gdk.gravitondyn.eventstatus.document;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EventResource
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "deletedDate",
    "$ref",
    "tenant"
})
public class EventStatusEventResource {

    /**
     * 
     * 
     * 
     */
    @JsonProperty("deletedDate")
    @JsonPropertyDescription("")
    private Date deletedDate;
    /**
     * Ref to event resource
     * A $ref pointing to the resource that triggered this event. If the resource was deleted, it may not exist anymore.
     * 
     */
    @JsonProperty("$ref")
    @JsonPropertyDescription("")
    private String $ref;
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
     * Ref to event resource
     * A $ref pointing to the resource that triggered this event. If the resource was deleted, it may not exist anymore.
     * 
     * @return
     *     The $ref
     */
    @JsonProperty("$ref")
    public String get$ref() {
        return $ref;
    }

    /**
     * Ref to event resource
     * A $ref pointing to the resource that triggered this event. If the resource was deleted, it may not exist anymore.
     * 
     * @param $ref
     *     The $ref
     */
    @JsonProperty("$ref")
    public void set$ref(String $ref) {
        this.$ref = $ref;
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
