package com.basicAuth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
 
@Entity
@Document (collection = "Songs")
public class Music {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
//	@NotEmpty
//    @Size(min = 2, max = 30, message = "Music Title should have 2-30 characters")
    @Indexed(unique=true)
	@Column(nullable = false)
	private String title;
	
//	@NotBlank(message = "Artist name is mandatory")
//    @Size(min = 2, max = 30, message = "Music Artist should have atleast 2-30 characters")
    private String artist; 
	
//	@NotEmpty(message = "Music Genre is required")
//    @Size(min = 3, max = 30, message = "Music Genre should have atleast 3-30 characters")
    private String genre;
	
//	@NotBlank
//    @DecimalMin(value = "0.1", inclusive = false, message = "Music Length should be greater than 0.0")
    private double length;
	
//	@NotBlank
//    @Size(min = 2, max = 30, message = "Music Uploader should have atleast 2-30 characters")
    private String uploader;
	
//	@DateTimeFormat(pattern = "dd-MM-yyyy")
//	@NotNull(message = "Please provide a date.")
    private String uploadDate;
	
//	@NotNull
//	@DateTimeFormat(pattern = "hh:mm:ss")
	private String uploadTime;
	//Constructor
	public Music() {
		
	}
	
	public Music(long id, String title, String artist, String genre, double length, String uploader, String uploadDate, String uploadTime) {
		super();
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.length = length;
		this.uploader = uploader;
		this.uploadDate = uploadDate;
		this.uploadTime = uploadTime;
	}
	
	//Getters and Setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getUploader() {
		return uploader;
	}
	public void setUploader(String uploader) {
		this.uploader = uploader;
	}
	public String getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}
	public String getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}
	
	//toString()
	@Override
	public String toString() {
		return "Music [id=" + id + ", title=" + title + ", artist=" + artist + ", genre=" + genre + ", length=" + length
				+ ", uploader=" + uploader + ", uploadDate=" + uploadDate + ", uploadTime=" + uploadTime + "]";
	}
}