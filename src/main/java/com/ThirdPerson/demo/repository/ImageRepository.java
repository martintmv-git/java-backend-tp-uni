package com.ThirdPerson.demo.repository;

import com.ThirdPerson.demo.models.Image;
import com.ThirdPerson.demo.models.ImageResponse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {

    Image findByFileName(String fileName);

    @Query(value = "select new com.ThirdPerson.demo.models.ImageResponse( im.fileName, im.fileType, im.size) from" +
            "  com.ThirdPerson.demo.models.Image im where im.status=true", nativeQuery = false)
    List<ImageResponse> findAllImageResponse();

}
