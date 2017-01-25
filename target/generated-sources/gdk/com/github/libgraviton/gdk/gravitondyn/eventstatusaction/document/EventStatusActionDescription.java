
package com.github.libgraviton.gdk.gravitondyn.eventstatusaction.document;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Description
 * <p>
 * A translated description for action done
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "de",
    "en",
    "fr"
})
public class EventStatusActionDescription {

    /**
     * Translated String
     * <p>
     * String in de locale.
     * 
     */
    @JsonProperty("de")
    @JsonPropertyDescription("")
    private String de;
    /**
     * Translated String
     * <p>
     * String in en locale.
     * (Required)
     * 
     */
    @JsonProperty("en")
    @JsonPropertyDescription("")
    private String en;
    /**
     * Translated String
     * <p>
     * String in fr locale.
     * 
     */
    @JsonProperty("fr")
    @JsonPropertyDescription("")
    private String fr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Translated String
     * <p>
     * String in de locale.
     * 
     * @return
     *     The de
     */
    @JsonProperty("de")
    public String getDe() {
        return de;
    }

    /**
     * Translated String
     * <p>
     * String in de locale.
     * 
     * @param de
     *     The de
     */
    @JsonProperty("de")
    public void setDe(String de) {
        this.de = de;
    }

    /**
     * Translated String
     * <p>
     * String in en locale.
     * (Required)
     * 
     * @return
     *     The en
     */
    @JsonProperty("en")
    public String getEn() {
        return en;
    }

    /**
     * Translated String
     * <p>
     * String in en locale.
     * (Required)
     * 
     * @param en
     *     The en
     */
    @JsonProperty("en")
    public void setEn(String en) {
        this.en = en;
    }

    /**
     * Translated String
     * <p>
     * String in fr locale.
     * 
     * @return
     *     The fr
     */
    @JsonProperty("fr")
    public String getFr() {
        return fr;
    }

    /**
     * Translated String
     * <p>
     * String in fr locale.
     * 
     * @param fr
     *     The fr
     */
    @JsonProperty("fr")
    public void setFr(String fr) {
        this.fr = fr;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
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
