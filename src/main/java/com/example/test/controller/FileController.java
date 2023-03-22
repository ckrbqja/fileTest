package com.example.test.controller;

import com.example.test.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;

@RestController
@RequiredArgsConstructor
public class FileController {

	final FileService fileService;

	@PostMapping("/aa") 
	public ResponseEntity<Resource> aa(@RequestParam MultipartFile file) throws FileNotFoundException {
		return fileService.fileDownload(file);
	}
}
