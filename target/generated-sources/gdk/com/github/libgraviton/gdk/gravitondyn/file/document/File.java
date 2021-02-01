
package com.github.libgraviton.gdk.gravitondyn.file.document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.libgraviton.gdk.data.GravitonBase;


/**
 * File
 * File storage service
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "deletedDate",
    "links",
    "id",
    "tenant"
})
public class File implements GravitonBase
{

    /**
     * Metadata
     * 
     * 
     */
    @JsonProperty("metadata")
    private FileMetadata metadata;
    /**
     * 
     * 
     * 
     */
    @JsonProperty("deletedDate")
    @JsonPropertyDescription("")
    private Date deletedDate;
    /**
     * Links
     * todo replace me
     * 
     */
    @JsonProperty("links")
    @JsonPropertyDescription("")
    private List<FileLinks> links = new ArrayList<FileLinks>();
    /**
     * ID
     * Unique identifier
     * (Required)
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
     * Metadata
     * 
     * 
     * @return
     *     The metadata
     */
    @JsonProperty("metadata")
    public FileMetadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * 
     * 
     * @param metadata
     *     The metadata
     */
    @JsonProperty("metadata")
    public void setMetadata(FileMetadata metadata) {
        this.metadata = metadata;
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
     * Links
     * todo replace me
     * 
     * @return
     *     The links
     */
    @JsonProperty("links")
    public List<FileLinks> getLinks() {
        return links;
    }

    /**
     * Links
     * todo replace me
     * 
     * @param links
     *     The links
     */
    @JsonProperty("links")
    public void setLinks(List<FileLinks> links) {
        this.links = links;
    }

    /**
     * ID
     * Unique identifier
     * (Required)
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
     * (Required)
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

}
