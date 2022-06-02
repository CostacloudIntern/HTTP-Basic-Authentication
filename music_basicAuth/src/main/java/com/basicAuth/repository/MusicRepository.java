package com.basicAuth.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.basicAuth.model.Music;


public interface MusicRepository extends MongoRepository<Music, Long>{

		List<Music> findByUploader(String musicUploader);
}