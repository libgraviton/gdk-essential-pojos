
package com.github.libgraviton.gdk.gravitondyn.file.document;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Metadata
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "additionalInformation",
    "modificationDate",
    "filename",
    "size",
    "mime",
    "action",
    "language",
    "additionalProperties",
    "hash",
    "createDate",
    "order"
})
public class FileMetadata {

    /**
     * Additional Information
     * Additional information for this file.
     * 
     */
    @JsonProperty("additionalInformation")
    @JsonPropertyDescription("")
    private String additionalInformation;
    /**
     * Modification date
     * Timestamp of the last file change.
     * 
     */
    @JsonProperty("modificationDate")
    @JsonPropertyDescription("")
    private Date modificationDate;
    /**
     * File name
     * Name of the file as it should get displayed to the user.
     * 
     */
    @JsonProperty("filename")
    @JsonPropertyDescription("")
    private String filename;
    /**
     * File size
     * Size of file.
     * 
     */
    @JsonProperty("size")
    @JsonPropertyDescription("")
    private Integer size;
    /**
     * MIME Type
     * MIME-Type of file.
     * 
     */
    @JsonProperty("mime")
    @JsonPropertyDescription("")
    private String mime;
    /**
     * Action
     * todo replace me
     * 
     */
    @JsonProperty("action")
    @JsonPropertyDescription("")
    private List<FileMetadataAction> action = new ArrayList<FileMetadataAction>();
    /**
     * Language Iso
     * Short language iso code, in lowercase.
     * 
     */
    @JsonProperty("language")
    @JsonPropertyDescription("")
    private FileMetadata.Language language;
    /**
     * Additional properties
     * todo replace me
     * 
     */
    @JsonProperty("additionalProperties")
    @JsonPropertyDescription("")
    private List<FileMetadataAdditionalProperties> additionalProperties = new ArrayList<FileMetadataAdditionalProperties>();
    /**
     * Unique file content hash value
     * File content hash encoded sha256
     * 
     */
    @JsonProperty("hash")
    @JsonPropertyDescription("")
    private String hash;
    /**
     * Creation date
     * Timestamp of file upload.
     * 
     */
    @JsonProperty("createDate")
    @JsonPropertyDescription("")
    private Date createDate;
    /**
     * order information if needed by client
     * can be set by clients to persist a specific order to display files
     * 
     */
    @JsonProperty("order")
    @JsonPropertyDescription("")
    private Integer order;

    /**
     * Additional Information
     * Additional information for this file.
     * 
     * @return
     *     The additionalInformation
     */
    @JsonProperty("additionalInformation")
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Additional Information
     * Additional information for this file.
     * 
     * @param additionalInformation
     *     The additionalInformation
     */
    @JsonProperty("additionalInformation")
    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    /**
     * Modification date
     * Timestamp of the last file change.
     * 
     * @return
     *     The modificationDate
     */
    @JsonProperty("modificationDate")
    public Date getModificationDate() {
        return modificationDate;
    }

    /**
     * Modification date
     * Timestamp of the last file change.
     * 
     * @param modificationDate
     *     The modificationDate
     */
    @JsonProperty("modificationDate")
    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    /**
     * File name
     * Name of the file as it should get displayed to the user.
     * 
     * @return
     *     The filename
     */
    @JsonProperty("filename")
    public String getFilename() {
        return filename;
    }

    /**
     * File name
     * Name of the file as it should get displayed to the user.
     * 
     * @param filename
     *     The filename
     */
    @JsonProperty("filename")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * File size
     * Size of file.
     * 
     * @return
     *     The size
     */
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    /**
     * File size
     * Size of file.
     * 
     * @param size
     *     The size
     */
    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * MIME Type
     * MIME-Type of file.
     * 
     * @return
     *     The mime
     */
    @JsonProperty("mime")
    public String getMime() {
        return mime;
    }

    /**
     * MIME Type
     * MIME-Type of file.
     * 
     * @param mime
     *     The mime
     */
    @JsonProperty("mime")
    public void setMime(String mime) {
        this.mime = mime;
    }

    /**
     * Action
     * todo replace me
     * 
     * @return
     *     The action
     */
    @JsonProperty("action")
    public List<FileMetadataAction> getAction() {
        return action;
    }

    /**
     * Action
     * todo replace me
     * 
     * @param action
     *     The action
     */
    @JsonProperty("action")
    public void setAction(List<FileMetadataAction> action) {
        this.action = action;
    }

    /**
     * Language Iso
     * Short language iso code, in lowercase.
     * 
     * @return
     *     The language
     */
    @JsonProperty("language")
    public FileMetadata.Language getLanguage() {
        return language;
    }

    /**
     * Language Iso
     * Short language iso code, in lowercase.
     * 
     * @param language
     *     The language
     */
    @JsonProperty("language")
    public void setLanguage(FileMetadata.Language language) {
        this.language = language;
    }

    /**
     * Additional properties
     * todo replace me
     * 
     * @return
     *     The additionalProperties
     */
    @JsonProperty("additionalProperties")
    public List<FileMetadataAdditionalProperties> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * Additional properties
     * todo replace me
     * 
     * @param additionalProperties
     *     The additionalProperties
     */
    @JsonProperty("additionalProperties")
    public void setAdditionalProperties(List<FileMetadataAdditionalProperties> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    /**
     * Unique file content hash value
     * File content hash encoded sha256
     * 
     * @return
     *     The hash
     */
    @JsonProperty("hash")
    public String getHash() {
        return hash;
    }

    /**
     * Unique file content hash value
     * File content hash encoded sha256
     * 
     * @param hash
     *     The hash
     */
    @JsonProperty("hash")
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * Creation date
     * Timestamp of file upload.
     * 
     * @return
     *     The createDate
     */
    @JsonProperty("createDate")
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Creation date
     * Timestamp of file upload.
     * 
     * @param createDate
     *     The createDate
     */
    @JsonProperty("createDate")
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * order information if needed by client
     * can be set by clients to persist a specific order to display files
     * 
     * @return
     *     The order
     */
    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    /**
     * order information if needed by client
     * can be set by clients to persist a specific order to display files
     * 
     * @param order
     *     The order
     */
    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    public enum Language {

        DE("de"),
        EN("en"),
        FR("fr"),
        IT("it");
        private final String value;
        private final static Map<String, FileMetadata.Language> CONSTANTS = new HashMap<String, FileMetadata.Language>();

        static {
            for (FileMetadata.Language c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Language(String value) {
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
        public static FileMetadata.Language fromValue(String value) {
            FileMetadata.Language constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
