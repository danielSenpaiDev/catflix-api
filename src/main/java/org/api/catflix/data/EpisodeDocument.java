package org.api.catflix.data;

public class EpisodeDocument {
	private String name;
	private String description;
	private int number;
	private String episodeUrl;
	private String thumbnailUrl;
	private String backgroundUrl;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getEpisodeUrl() {
		return episodeUrl;
	}
	public void setEpisodeUrl(String episodeUrl) {
		this.episodeUrl = episodeUrl;
	}
	public String getThumbnailUrl() {
		return thumbnailUrl;
	}
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
	public String getBackgroundUrl() {
		return backgroundUrl;
	}
	public void setBackgroundUrl(String backgroundUrl) {
		this.backgroundUrl = backgroundUrl;
	}
}
