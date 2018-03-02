package org.api.catflix.data;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="movies")
public class MovieDocument {
	@Id
	private String id;
	private String title;
	private String description;
	private String director;
	private String genre;
	private String cathegory;
	private String[] tags;
	private int duration;
	private int releaseYear;
	private String movieUrl;
	private String thumbnailUrl;
	private String backgroundUrl;
	private boolean hasEpisodes;
	private EpisodeDocument[] episodes;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCathegory() {
		return cathegory;
	}
	public void setCathegory(String cathegory) {
		this.cathegory = cathegory;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getMovieUrl() {
		return movieUrl;
	}
	public void setMovieUrl(String movieUrl) {
		this.movieUrl = movieUrl;
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
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public boolean isHasEpisodes() {
		return hasEpisodes;
	}
	public void setHasEpisodes(boolean hasEpisodes) {
		this.hasEpisodes = hasEpisodes;
	}
	public EpisodeDocument[] getEpisodes() {
		return episodes;
	}
	public void setEpisodes(EpisodeDocument[] episodes) {
		this.episodes = episodes;
	}
	
}
