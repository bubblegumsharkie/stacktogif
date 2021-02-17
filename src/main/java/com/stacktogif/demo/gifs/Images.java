
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
    "original",
    "downsized",
    "downsized_large",
    "downsized_medium",
    "downsized_small",
    "downsized_still",
    "fixed_height",
    "fixed_height_downsampled",
    "fixed_height_small",
    "fixed_height_small_still",
    "fixed_height_still",
    "fixed_width",
    "fixed_width_downsampled",
    "fixed_width_small",
    "fixed_width_small_still",
    "fixed_width_still",
    "looping",
    "original_still",
    "original_mp4",
    "preview",
    "preview_gif",
    "preview_webp",
    "480w_still",
    "hd"
})
public class Images {

    @JsonProperty("original")
    private Original original;
    @JsonProperty("downsized")
    private Downsized downsized;
    @JsonProperty("downsized_large")
    private DownsizedLarge downsizedLarge;
    @JsonProperty("downsized_medium")
    private DownsizedMedium downsizedMedium;
    @JsonProperty("downsized_small")
    private DownsizedSmall downsizedSmall;
    @JsonProperty("downsized_still")
    private DownsizedStill downsizedStill;
    @JsonProperty("fixed_height")
    private FixedHeight fixedHeight;
    @JsonProperty("fixed_height_downsampled")
    private FixedHeightDownsampled fixedHeightDownsampled;
    @JsonProperty("fixed_height_small")
    private FixedHeightSmall fixedHeightSmall;
    @JsonProperty("fixed_height_small_still")
    private FixedHeightSmallStill fixedHeightSmallStill;
    @JsonProperty("fixed_height_still")
    private FixedHeightStill fixedHeightStill;
    @JsonProperty("fixed_width")
    private FixedWidth fixedWidth;
    @JsonProperty("fixed_width_downsampled")
    private FixedWidthDownsampled fixedWidthDownsampled;
    @JsonProperty("fixed_width_small")
    private FixedWidthSmall fixedWidthSmall;
    @JsonProperty("fixed_width_small_still")
    private FixedWidthSmallStill fixedWidthSmallStill;
    @JsonProperty("fixed_width_still")
    private FixedWidthStill fixedWidthStill;
    @JsonProperty("looping")
    private Looping looping;
    @JsonProperty("original_still")
    private OriginalStill originalStill;
    @JsonProperty("original_mp4")
    private OriginalMp4 originalMp4;
    @JsonProperty("preview")
    private Preview preview;
    @JsonProperty("preview_gif")
    private PreviewGif previewGif;
    @JsonProperty("preview_webp")
    private PreviewWebp previewWebp;
    @JsonProperty("480w_still")
    private com.stacktogif.demo.gifs._480wStill _480wStill;
    @JsonProperty("hd")
    private Hd hd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("original")
    public Original getOriginal() {
        return original;
    }

    @JsonProperty("original")
    public void setOriginal(Original original) {
        this.original = original;
    }

    @JsonProperty("downsized")
    public Downsized getDownsized() {
        return downsized;
    }

    @JsonProperty("downsized")
    public void setDownsized(Downsized downsized) {
        this.downsized = downsized;
    }

    @JsonProperty("downsized_large")
    public DownsizedLarge getDownsizedLarge() {
        return downsizedLarge;
    }

    @JsonProperty("downsized_large")
    public void setDownsizedLarge(DownsizedLarge downsizedLarge) {
        this.downsizedLarge = downsizedLarge;
    }

    @JsonProperty("downsized_medium")
    public DownsizedMedium getDownsizedMedium() {
        return downsizedMedium;
    }

    @JsonProperty("downsized_medium")
    public void setDownsizedMedium(DownsizedMedium downsizedMedium) {
        this.downsizedMedium = downsizedMedium;
    }

    @JsonProperty("downsized_small")
    public DownsizedSmall getDownsizedSmall() {
        return downsizedSmall;
    }

    @JsonProperty("downsized_small")
    public void setDownsizedSmall(DownsizedSmall downsizedSmall) {
        this.downsizedSmall = downsizedSmall;
    }

    @JsonProperty("downsized_still")
    public DownsizedStill getDownsizedStill() {
        return downsizedStill;
    }

    @JsonProperty("downsized_still")
    public void setDownsizedStill(DownsizedStill downsizedStill) {
        this.downsizedStill = downsizedStill;
    }

    @JsonProperty("fixed_height")
    public FixedHeight getFixedHeight() {
        return fixedHeight;
    }

    @JsonProperty("fixed_height")
    public void setFixedHeight(FixedHeight fixedHeight) {
        this.fixedHeight = fixedHeight;
    }

    @JsonProperty("fixed_height_downsampled")
    public FixedHeightDownsampled getFixedHeightDownsampled() {
        return fixedHeightDownsampled;
    }

    @JsonProperty("fixed_height_downsampled")
    public void setFixedHeightDownsampled(FixedHeightDownsampled fixedHeightDownsampled) {
        this.fixedHeightDownsampled = fixedHeightDownsampled;
    }

    @JsonProperty("fixed_height_small")
    public FixedHeightSmall getFixedHeightSmall() {
        return fixedHeightSmall;
    }

    @JsonProperty("fixed_height_small")
    public void setFixedHeightSmall(FixedHeightSmall fixedHeightSmall) {
        this.fixedHeightSmall = fixedHeightSmall;
    }

    @JsonProperty("fixed_height_small_still")
    public FixedHeightSmallStill getFixedHeightSmallStill() {
        return fixedHeightSmallStill;
    }

    @JsonProperty("fixed_height_small_still")
    public void setFixedHeightSmallStill(FixedHeightSmallStill fixedHeightSmallStill) {
        this.fixedHeightSmallStill = fixedHeightSmallStill;
    }

    @JsonProperty("fixed_height_still")
    public FixedHeightStill getFixedHeightStill() {
        return fixedHeightStill;
    }

    @JsonProperty("fixed_height_still")
    public void setFixedHeightStill(FixedHeightStill fixedHeightStill) {
        this.fixedHeightStill = fixedHeightStill;
    }

    @JsonProperty("fixed_width")
    public FixedWidth getFixedWidth() {
        return fixedWidth;
    }

    @JsonProperty("fixed_width")
    public void setFixedWidth(FixedWidth fixedWidth) {
        this.fixedWidth = fixedWidth;
    }

    @JsonProperty("fixed_width_downsampled")
    public FixedWidthDownsampled getFixedWidthDownsampled() {
        return fixedWidthDownsampled;
    }

    @JsonProperty("fixed_width_downsampled")
    public void setFixedWidthDownsampled(FixedWidthDownsampled fixedWidthDownsampled) {
        this.fixedWidthDownsampled = fixedWidthDownsampled;
    }

    @JsonProperty("fixed_width_small")
    public FixedWidthSmall getFixedWidthSmall() {
        return fixedWidthSmall;
    }

    @JsonProperty("fixed_width_small")
    public void setFixedWidthSmall(FixedWidthSmall fixedWidthSmall) {
        this.fixedWidthSmall = fixedWidthSmall;
    }

    @JsonProperty("fixed_width_small_still")
    public FixedWidthSmallStill getFixedWidthSmallStill() {
        return fixedWidthSmallStill;
    }

    @JsonProperty("fixed_width_small_still")
    public void setFixedWidthSmallStill(FixedWidthSmallStill fixedWidthSmallStill) {
        this.fixedWidthSmallStill = fixedWidthSmallStill;
    }

    @JsonProperty("fixed_width_still")
    public FixedWidthStill getFixedWidthStill() {
        return fixedWidthStill;
    }

    @JsonProperty("fixed_width_still")
    public void setFixedWidthStill(FixedWidthStill fixedWidthStill) {
        this.fixedWidthStill = fixedWidthStill;
    }

    @JsonProperty("looping")
    public Looping getLooping() {
        return looping;
    }

    @JsonProperty("looping")
    public void setLooping(Looping looping) {
        this.looping = looping;
    }

    @JsonProperty("original_still")
    public OriginalStill getOriginalStill() {
        return originalStill;
    }

    @JsonProperty("original_still")
    public void setOriginalStill(OriginalStill originalStill) {
        this.originalStill = originalStill;
    }

    @JsonProperty("original_mp4")
    public OriginalMp4 getOriginalMp4() {
        return originalMp4;
    }

    @JsonProperty("original_mp4")
    public void setOriginalMp4(OriginalMp4 originalMp4) {
        this.originalMp4 = originalMp4;
    }

    @JsonProperty("preview")
    public Preview getPreview() {
        return preview;
    }

    @JsonProperty("preview")
    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    @JsonProperty("preview_gif")
    public PreviewGif getPreviewGif() {
        return previewGif;
    }

    @JsonProperty("preview_gif")
    public void setPreviewGif(PreviewGif previewGif) {
        this.previewGif = previewGif;
    }

    @JsonProperty("preview_webp")
    public PreviewWebp getPreviewWebp() {
        return previewWebp;
    }

    @JsonProperty("preview_webp")
    public void setPreviewWebp(PreviewWebp previewWebp) {
        this.previewWebp = previewWebp;
    }

    @JsonProperty("480w_still")
    public com.stacktogif.demo.gifs._480wStill get480wStill() {
        return _480wStill;
    }

    @JsonProperty("480w_still")
    public void set480wStill(com.stacktogif.demo.gifs._480wStill _480wStill) {
        this._480wStill = _480wStill;
    }

    @JsonProperty("hd")
    public Hd getHd() {
        return hd;
    }

    @JsonProperty("hd")
    public void setHd(Hd hd) {
        this.hd = hd;
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
