package com.shakhovmv.rostelecom.service.impl;

import com.shakhovmv.rostelecom.service.FileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;

@Service

public class FileServiceImpl implements FileService {

    private static final Logger logger = LoggerFactory.getLogger(FileServiceImpl.class);

    @Value("${filePath}")
    private String filePath;

    @Override
    public void appendFile(String content) {
        try(FileWriter fileWriter = new FileWriter(filePath,true)){
            fileWriter.write(content);
        }catch (IOException e){
            logger.error(e.getMessage());
        }
    }
}
