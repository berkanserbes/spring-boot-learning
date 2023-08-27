package com.jetbrains.berkan.photos.repository;

import com.jetbrains.berkan.photos.models.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotosRepository extends CrudRepository<Photo, Integer> {

}
