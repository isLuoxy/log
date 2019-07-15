package com.smartbi.app.log;

import com.smartbi.app.log.dao.PDao;
import com.smartbi.app.log.entity.P;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LogApplicationTests {

    @Autowired
    PDao pDao;

    @Test
    public void contextLoads() {
        P p = new P();

        File file = new File("C:\\Users\\10487\\Pictures\\thumb.jpg");
        byte[] bytes ;
        try {
            InputStream inputStream = new FileInputStream(file);
            bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            p.setPicture(bytes);
            p.setId(1);
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        pDao.insert(p);
    }

}
