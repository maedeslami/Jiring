package jiring.service;

import jiring.entity.Person;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.List;

/**
 * Created by Lenovo on 8/15/2021.
 */
public interface UploadService {
    void uploadToExcel() throws IOException;
}
