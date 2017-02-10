
package com.github.libgraviton.gdk.gravitondyn.file.document;

import java.util.ArrayList;
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
     * links
     * todo replace me
     * 
     */
    @JsonProperty("links")
    @JsonPropertyDescription("")
    private List<FileLinks> links = new ArrayList<FileLinks>();
    /**
     * ID
     * Unique identifier
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("")
    private String id;

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
     * links
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
     * links
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

}
