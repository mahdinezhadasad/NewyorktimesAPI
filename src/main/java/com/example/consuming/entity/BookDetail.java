
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
    "title",
    "description",
    "contributor",
    "author",
    "contributor_note",
    "price",
    "age_group",
    "publisher",
    "primary_isbn13",
    "primary_isbn10"
})
@Generated("jsonschema2pojo")
public class BookDetail {

    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("contributor")
    private String contributor;
    @JsonProperty("author")
    private String author;
    @JsonProperty("contributor_note")
    private String contributorNote;
    @JsonProperty("price")
    private String price;
    @JsonProperty("age_group")
    private String ageGroup;
    @JsonProperty("publisher")
    private String publisher;
    @JsonProperty("primary_isbn13")
    private String primaryIsbn13;
    @JsonProperty("primary_isbn10")
    private String primaryIsbn10;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("contributor")
    public String getContributor() {
        return contributor;
    }

    @JsonProperty("contributor")
    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    @JsonProperty("contributor_note")
    public String getContributorNote() {
        return contributorNote;
    }

    @JsonProperty("contributor_note")
    public void setContributorNote(String contributorNote) {
        this.contributorNote = contributorNote;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("age_group")
    public String getAgeGroup() {
        return ageGroup;
    }

    @JsonProperty("age_group")
    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    @JsonProperty("publisher")
    public String getPublisher() {
        return publisher;
    }

    @JsonProperty("publisher")
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @JsonProperty("primary_isbn13")
    public String getPrimaryIsbn13() {
        return primaryIsbn13;
    }

    @JsonProperty("primary_isbn13")
    public void setPrimaryIsbn13(String primaryIsbn13) {
        this.primaryIsbn13 = primaryIsbn13;
    }

    @JsonProperty("primary_isbn10")
    public String getPrimaryIsbn10() {
        return primaryIsbn10;
    }

    @JsonProperty("primary_isbn10")
    public void setPrimaryIsbn10(String primaryIsbn10) {
        this.primaryIsbn10 = primaryIsbn10;
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
