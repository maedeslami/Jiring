package jiring.service;

import jiring.PersonExcelExporter;
import jiring.entity.Person;
import jiring.repository.JiringDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Lenovo on 8/15/2021.
 */
@Service
public class UploadServiceImpl implements UploadService {
    @Autowired
    JiringDao jiringDao;

    @Override
    public void uploadToExcel() throws IOException {

        DateFormat dateFormatter = new SimpleDateFormat("HH_mm_ss");
        String currentDateTime = dateFormatter.format(new Date());
        List<Person> personList = jiringDao.findAll();
        PersonExcelExporter.writeToExcel("person_" + currentDateTime + ".xlsx", personList);

    }
}
