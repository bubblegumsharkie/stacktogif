
package com.stacktogif.demo.gifs;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "height",
    "width",
    "size",
    "url",
    "mp4_size",
    "mp4",
    "webp_size",
    "webp",
    "frames",
    "hash"
})
public class Original {

    @JsonProperty("height")
    private String height;
    @JsonProperty("width")
    private String width;
    @JsonProperty("size")
    private String size;
    @JsonProperty("url")
    private String url;
    @JsonProperty("mp4_size")
    private String mp4Size;
    @JsonProperty("mp4")
    private String mp4;
    @JsonProperty("webp_size")
    private String webpSize;
    @JsonProperty("webp")
    private String webp;
    @JsonProperty("frames")
    private String frames;
    @JsonProperty("hash")
    private String hash;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("height")
    public String getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(String height) {
        this.height = height;
    }

    @JsonProperty("width")
    public String getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(String width) {
        this.width = width;
    }

    @JsonProperty("size")
    public String getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(String size) {
        this.size = size;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("mp4_size")
    public String getMp4Size() {
        return mp4Size;
    }

    @JsonProperty("mp4_size")
    public void setMp4Size(String mp4Size) {
        this.mp4Size = mp4Size;
    }

    @JsonProperty("mp4")
    public String getMp4() {
        return mp4;
    }

    @JsonProperty("mp4")
    public void setMp4(String mp4) {
        this.mp4 = mp4;
    }

    @JsonProperty("webp_size")
    public String getWebpSize() {
        return webpSize;
    }

    @JsonProperty("webp_size")
    public void setWebpSize(String webpSize) {
        this.webpSize = webpSize;
    }

    @JsonProperty("webp")
    public String getWebp() {
        return webp;
    }

    @JsonProperty("webp")
    public void setWebp(String webp) {
        this.webp = webp;
    }

    @JsonProperty("frames")
    public String getFrames() {
        return frames;
    }

    @JsonProperty("frames")
    public void setFrames(String frames) {
        this.frames = frames;
    }

    @JsonProperty("hash")
    public String getHash() {
        return hash;
    }

    @JsonProperty("hash")
    public void setHash(String hash) {
        this.hash = hash;
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
