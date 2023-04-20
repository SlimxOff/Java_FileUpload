package ru.project.altimage.storage;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {
	File[] checkDir();
	Stream<Path> loadAll();
	Path load(String filename);


	void init();


	void store(MultipartFile file);

	Resource loadAsResource(String filename);
}
