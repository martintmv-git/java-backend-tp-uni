package com.ThirdPerson.demo.services;

import com.ThirdPerson.demo.models.Image;
import com.ThirdPerson.demo.models.ImageResponse;
import com.ThirdPerson.demo.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ImageService implements ImageServiceInterface{

    @Autowired
    private ImageRepository imageRepository;

    @Override
    public Image save(Image image) throws NullPointerException {
        if (image == null)
            throw new NullPointerException("Image Data NULL");
        return imageRepository.save(image);
    }

    @Override
    public Image findByFileName(String fileName) {
        return this.imageRepository.findByFileName(fileName);
    }


    @Override
    public List<ImageResponse> findAllImageResponse() {
        return this.imageRepository.findAllImageResponse();
    }

}
