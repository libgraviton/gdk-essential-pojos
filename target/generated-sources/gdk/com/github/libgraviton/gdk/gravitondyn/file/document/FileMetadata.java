
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
    "isSigned",
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
    @JsonPropertyDescription("Additional information for this file.")
    private String additionalInformation;
    /**
     * Modification date
     * Timestamp of the last file change.
     * 
     */
    @JsonProperty("modificationDate")
    @JsonPropertyDescription("Timestamp of the last file change.")
    private Date modificationDate;
    /**
     * File name
     * Name of the file as it should get displayed to the user.
     * 
     */
    @JsonProperty("filename")
    @JsonPropertyDescription("Name of the file as it should get displayed to the user.")
    private String filename;
    /**
     * File size
     * Size of file.
     * 
     */
    @JsonProperty("size")
    @JsonPropertyDescription("Size of file.")
    private Integer size;
    /**
     * Is Signed
     * Defines if the file is digitally signed
     * 
     */
    @JsonProperty("isSigned")
    @JsonPropertyDescription("Defines if the file is digitally signed")
    private Boolean isSigned;
    /**
     * MIME Type
     * MIME-Type of file.
     * 
     */
    @JsonProperty("mime")
    @JsonPropertyDescription("MIME-Type of file.")
    private String mime;
    /**
     * Action
     * todo replace me
     * 
     */
    @JsonProperty("action")
    @JsonPropertyDescription("@todo replace me")
    private List<FileMetadataAction> action = new ArrayList<FileMetadataAction>();
    /**
     * Language Iso
     * Short language iso code, in lowercase.
     * 
     */
    @JsonProperty("language")
    @JsonPropertyDescription("Short language iso code, in lowercase.")
    private FileMetadata.Language language;
    /**
     * Additional properties
     * todo replace me
     * 
     */
    @JsonProperty("additionalProperties")
    @JsonPropertyDescription("@todo replace me")
    private List<FileMetadataAdditionalProperties> additionalProperties = new ArrayList<FileMetadataAdditionalProperties>();
    /**
     * Unique file content hash value
     * File content hash encoded sha256
     * 
     */
    @JsonProperty("hash")
    @JsonPropertyDescription("File content hash encoded sha256")
    private String hash;
    /**
     * Creation date
     * Timestamp of file upload.
     * 
     */
    @JsonProperty("createDate")
    @JsonPropertyDescription("Timestamp of file upload.")
    private Date createDate;
    /**
     * order information if needed by client
     * can be set by clients to persist a specific order to display files
     * 
     */
    @JsonProperty("order")
    @JsonPropertyDescription("can be set by clients to persist a specific order to display files")
    private Integer order;

    /**
     * Additional Information
     * Additional information for this file.
     * 
     */
    @JsonProperty("additionalInformation")
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Additional Information
     * Additional information for this file.
     * 
     */
    @JsonProperty("additionalInformation")
    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    /**
     * Modification date
     * Timestamp of the last file change.
     * 
     */
    @JsonProperty("modificationDate")
    public Date getModificationDate() {
        return modificationDate;
    }

    /**
     * Modification date
     * Timestamp of the last file change.
     * 
     */
    @JsonProperty("modificationDate")
    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    /**
     * File name
     * Name of the file as it should get displayed to the user.
     * 
     */
    @JsonProperty("filename")
    public String getFilename() {
        return filename;
    }

    /**
     * File name
     * Name of the file as it should get displayed to the user.
     * 
     */
    @JsonProperty("filename")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * File size
     * Size of file.
     * 
     */
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    /**
     * File size
     * Size of file.
     * 
     */
    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * Is Signed
     * Defines if the file is digitally signed
     * 
     */
    @JsonProperty("isSigned")
    public Boolean getIsSigned() {
        return isSigned;
    }

    /**
     * Is Signed
     * Defines if the file is digitally signed
     * 
     */
    @JsonProperty("isSigned")
    public void setIsSigned(Boolean isSigned) {
        this.isSigned = isSigned;
    }

    /**
     * MIME Type
     * MIME-Type of file.
     * 
     */
    @JsonProperty("mime")
    public String getMime() {
        return mime;
    }

    /**
     * MIME Type
     * MIME-Type of file.
     * 
     */
    @JsonProperty("mime")
    public void setMime(String mime) {
        this.mime = mime;
    }

    /**
     * Action
     * todo replace me
     * 
     */
    @JsonProperty("action")
    public List<FileMetadataAction> getAction() {
        return action;
    }

    /**
     * Action
     * todo replace me
     * 
     */
    @JsonProperty("action")
    public void setAction(List<FileMetadataAction> action) {
        this.action = action;
    }

    /**
     * Language Iso
     * Short language iso code, in lowercase.
     * 
     */
    @JsonProperty("language")
    public FileMetadata.Language getLanguage() {
        return language;
    }

    /**
     * Language Iso
     * Short language iso code, in lowercase.
     * 
     */
    @JsonProperty("language")
    public void setLanguage(FileMetadata.Language language) {
        this.language = language;
    }

    /**
     * Additional properties
     * todo replace me
     * 
     */
    @JsonProperty("additionalProperties")
    public List<FileMetadataAdditionalProperties> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * Additional properties
     * todo replace me
     * 
     */
    @JsonProperty("additionalProperties")
    public void setAdditionalProperties(List<FileMetadataAdditionalProperties> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    /**
     * Unique file content hash value
     * File content hash encoded sha256
     * 
     */
    @JsonProperty("hash")
    public String getHash() {
        return hash;
    }

    /**
     * Unique file content hash value
     * File content hash encoded sha256
     * 
     */
    @JsonProperty("hash")
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * Creation date
     * Timestamp of file upload.
     * 
     */
    @JsonProperty("createDate")
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Creation date
     * Timestamp of file upload.
     * 
     */
    @JsonProperty("createDate")
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * order information if needed by client
     * can be set by clients to persist a specific order to display files
     * 
     */
    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    /**
     * order information if needed by client
     * can be set by clients to persist a specific order to display files
     * 
     */
    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
    }


    /**
     * Language Iso
     * Short language iso code, in lowercase.
     * 
     */
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

        Language(String value) {
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
