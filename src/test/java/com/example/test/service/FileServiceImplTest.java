package com.example.test.service;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class FileServiceImplTest {

	final static String FILE_NM = "text.txt";

	@Test void copy_file() throws IOException {
		final File file = new File(FILE_NM);
		
		Files.copy(Files.newInputStream(Path.of(FILE_NM)), Path.of("zz.txt"), StandardCopyOption.REPLACE_EXISTING);
		
	}

}