
package com.github.libgraviton.gdk.gravitondyn.file.document;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.libgraviton.workerbase.gdk.data.GravitonBase;


/**
 * File
 * File storage service
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "links",
    "id"
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
     * Links
     * todo replace me
     * 
     */
    @JsonProperty("links")
    @JsonPropertyDescription("@todo replace me")
    private List<FileLinks> links = new ArrayList<FileLinks>();
    /**
     * ID
     * Unique identifier
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique identifier")
    private String id;

    /**
     * Metadata
     * 
     * 
     */
    @JsonProperty("metadata")
    public FileMetadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * 
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(FileMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Links
     * todo replace me
     * 
     */
    @JsonProperty("links")
    public List<FileLinks> getLinks() {
        return links;
    }

    /**
     * Links
     * todo replace me
     * 
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
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

}
