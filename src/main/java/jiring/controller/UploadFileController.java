package jiring.controller;

import jiring.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class UploadFileController {
    @Autowired
    UploadService uploadService;

    @RequestMapping("/upload")
    public void exportToExcel() throws IOException {
        uploadService.uploadToExcel();
    }

}