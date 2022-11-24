package com.ThirdPerson.demo.Controller;

import com.ThirdPerson.demo.models.Image;
import com.ThirdPerson.demo.models.ImageResponse;
import com.ThirdPerson.demo.services.ImageService;
import com.ThirdPerson.demo.services.ImageServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("image")
public class ImageController {

    @Autowired
    private ImageServiceInterface imageService;


    /**
     * Get all images information without data.
     *
     * @return return list of all images information.
     */
    @GetMapping("/images")
    public ResponseEntity<List<ImageResponse>> getAllImageInfo() throws Exception {
        List<ImageResponse> imageResponses = imageService.findAllImageResponse();
        return ResponseEntity.ok().body(imageResponses);
    }

    /**
     * Upload single file to database.
     *
     * @param file file data
     * @return return saved image info with ImageResponse class.
     */
    @PostMapping("/upload")
    public ImageResponse uploadSingleFile(@RequestParam("file") MultipartFile file) {
        Image image = Image.buildImage(file);
        imageService.save(image);
        return new ImageResponse(image);
    }

    /**
     * Upload multiple files to database.
     *
     * @param files files data
     * @return return saved images info list with ImageResponse class.
     */
    @PostMapping("/uploads")
    public List<ImageResponse> uploadMultiFiles(@RequestParam("files") MultipartFile[] files) {
        return Arrays.asList(files).stream().map(file -> uploadSingleFile(file)).collect(Collectors.toList());
    }

    /**
     * Sends valid or default image bytes with given fileName pathVariable.
     *
     * @param fileName
     * @return return valid byte array
     */
    @GetMapping("/show/{fileName}")
    public ResponseEntity<byte[]> getImage(@PathVariable String fileName) throws Exception {
        Image image = getImageByName(fileName);
        return ResponseEntity.ok().contentType(MediaType.valueOf(image.getFileType())).body(image.getData());
    }
    public Image getImageByName(String name) throws Exception {
        Image image = imageService.findByFileName(name);
        if (image == null) {
            return null;
        }
        return image;
    }




}
