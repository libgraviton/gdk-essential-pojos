
package com.github.libgraviton.gdk.gravitondyn.eventstatusaction.document;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Description
 * A translated description for action done
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "en"
})
public class EventStatusActionDescription {

    /**
     * Translated String
     * String in en locale.
     * (Required)
     * 
     */
    @JsonProperty("en")
    @JsonPropertyDescription("String in en locale.")
    private String en;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Translated String
     * String in en locale.
     * (Required)
     * 
     */
    @JsonProperty("en")
    public String getEn() {
        return en;
    }

    /**
     * Translated String
     * String in en locale.
     * (Required)
     * 
     */
    @JsonProperty("en")
    public void setEn(String en) {
        this.en = en;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
