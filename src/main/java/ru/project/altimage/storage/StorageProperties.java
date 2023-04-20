package ru.project.altimage.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationProperties("storage")
public class StorageProperties {

	/**
	 * Folder location for storing files
	 */
	private String location = "upload";
	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}

}
