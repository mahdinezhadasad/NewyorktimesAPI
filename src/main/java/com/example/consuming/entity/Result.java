
package com.example.consuming.entity;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "list_name",
    "display_name",
    "bestsellers_date",
    "published_date",
    "rank",
    "rank_last_week",
    "weeks_on_list",
    "asterisk",
    "dagger",
    "amazon_product_url",
    "isbns",
    "book_details",
    "reviews"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("list_name")
    private String listName;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("bestsellers_date")
    private String bestsellersDate;
    @JsonProperty("published_date")
    private String publishedDate;
    @JsonProperty("rank")
    private Integer rank;
    @JsonProperty("rank_last_week")
    private Integer rankLastWeek;
    @JsonProperty("weeks_on_list")
    private Integer weeksOnList;
    @JsonProperty("asterisk")
    private Integer asterisk;
    @JsonProperty("dagger")
    private Integer dagger;
    @JsonProperty("amazon_product_url")
    private String amazonProductUrl;
    @JsonProperty("isbns")
    private List<Isbn> isbns = null;
    @JsonProperty("book_details")
    private List<BookDetail> bookDetails = null;
    @JsonProperty("reviews")
    private List<Review> reviews = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("list_name")
    public String getListName() {
        return listName;
    }

    @JsonProperty("list_name")
    public void setListName(String listName) {
        this.listName = listName;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("bestsellers_date")
    public String getBestsellersDate() {
        return bestsellersDate;
    }

    @JsonProperty("bestsellers_date")
    public void setBestsellersDate(String bestsellersDate) {
        this.bestsellersDate = bestsellersDate;
    }

    @JsonProperty("published_date")
    public String getPublishedDate() {
        return publishedDate;
    }

    @JsonProperty("published_date")
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    @JsonProperty("rank")
    public Integer getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @JsonProperty("rank_last_week")
    public Integer getRankLastWeek() {
        return rankLastWeek;
    }

    @JsonProperty("rank_last_week")
    public void setRankLastWeek(Integer rankLastWeek) {
        this.rankLastWeek = rankLastWeek;
    }

    @JsonProperty("weeks_on_list")
    public Integer getWeeksOnList() {
        return weeksOnList;
    }

    @JsonProperty("weeks_on_list")
    public void setWeeksOnList(Integer weeksOnList) {
        this.weeksOnList = weeksOnList;
    }

    @JsonProperty("asterisk")
    public Integer getAsterisk() {
        return asterisk;
    }

    @JsonProperty("asterisk")
    public void setAsterisk(Integer asterisk) {
        this.asterisk = asterisk;
    }

    @JsonProperty("dagger")
    public Integer getDagger() {
        return dagger;
    }

    @JsonProperty("dagger")
    public void setDagger(Integer dagger) {
        this.dagger = dagger;
    }

    @JsonProperty("amazon_product_url")
    public String getAmazonProductUrl() {
        return amazonProductUrl;
    }

    @JsonProperty("amazon_product_url")
    public void setAmazonProductUrl(String amazonProductUrl) {
        this.amazonProductUrl = amazonProductUrl;
    }

    @JsonProperty("isbns")
    public List<Isbn> getIsbns() {
        return isbns;
    }

    @JsonProperty("isbns")
    public void setIsbns(List<Isbn> isbns) {
        this.isbns = isbns;
    }

    @JsonProperty("book_details")
    public List<BookDetail> getBookDetails() {
        return bookDetails;
    }

    @JsonProperty("book_details")
    public void setBookDetails(List<BookDetail> bookDetails) {
        this.bookDetails = bookDetails;
    }

    @JsonProperty("reviews")
    public List<Review> getReviews() {
        return reviews;
    }

    @JsonProperty("reviews")
    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
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
