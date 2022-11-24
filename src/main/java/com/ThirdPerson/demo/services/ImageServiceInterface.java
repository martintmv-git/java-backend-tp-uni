package com.ThirdPerson.demo.services;

import com.ThirdPerson.demo.models.Image;
import com.ThirdPerson.demo.models.ImageResponse;

import java.util.List;

public interface ImageServiceInterface {

    public Image save(Image image);

    public Image findByFileName(String fileName);


    public List<ImageResponse> findAllImageResponse();


}
