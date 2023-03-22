package com.example.test.service;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;

public interface FileService {

	ResponseEntity<Resource> fileDownload(MultipartFile file) throws FileNotFoundException;
	
}
