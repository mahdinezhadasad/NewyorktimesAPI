
package com.example.consuming.entity;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isbn10",
    "isbn13"
})
@Generated("jsonschema2pojo")
public class Isbn {

    @JsonProperty("isbn10")
    private String isbn10;
    @JsonProperty("isbn13")
    private String isbn13;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("isbn10")
    public String getIsbn10() {
        return isbn10;
    }

    @JsonProperty("isbn10")
    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    @JsonProperty("isbn13")
    public String getIsbn13() {
        return isbn13;
    }

    @JsonProperty("isbn13")
    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
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
