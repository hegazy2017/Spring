package com.Tada.FileManipulation.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
    private String idcardDir;

	/**
	 * @return the idcardDir
	 */
	public String getIdcardDir() {
		return idcardDir;
	}

	/**
	 * @param idcardDir the idcardDir to set
	 */
	public void setIdcardDir(String idcardDir) {
		this.idcardDir = idcardDir;
	}




	

    
}