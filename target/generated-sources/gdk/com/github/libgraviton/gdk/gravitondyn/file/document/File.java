
package com.github.libgraviton.gdk.gravitondyn.file.document;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.libgraviton.gdk.data.GravitonBase;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * File
 * <p>
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
     * <p>
     * 
     * 
     */
    @JsonProperty("metadata")
    private FileMetadata metadata;
    /**
     * links
     * <p>
     * @todo replace me
     * 
     */
    @JsonProperty("links")
    @JsonPropertyDescription("")
    private List<FileLinks> links = new ArrayList<FileLinks>();
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
     * Metadata
     * <p>
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
     * <p>
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
     * <p>
     * @todo replace me
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
     * <p>
     * @todo replace me
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
