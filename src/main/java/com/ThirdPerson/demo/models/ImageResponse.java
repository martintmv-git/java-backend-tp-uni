package com.ThirdPerson.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageResponse {

    private String fileName;
    private String fileType;
    private long size;

    public ImageResponse(Image image) {
        setFileName(image.getFileName());
        setFileType(image.getFileType());
        setSize(image.getSize());

    }

}
