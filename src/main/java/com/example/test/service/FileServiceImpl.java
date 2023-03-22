package com.example.test.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.util.Objects;

@Service
@Slf4j
public class FileServiceImpl implements FileService {
	@Override public ResponseEntity<Resource> fileDownload(final MultipartFile file) throws  FileNotFoundException {

		final HttpHeaders headers = new HttpHeaders();

		headers.setContentDisposition(
				ContentDisposition.builder("attachment")
								  .filename(file.getName())
								  .build()
		);

		
		return ResponseEntity.ok().headers(headers).body(file.getResource());
	}
}
