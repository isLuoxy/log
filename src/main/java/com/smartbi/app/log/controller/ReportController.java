package com.smartbi.app.log.controller;

import com.smartbi.app.log.dao.PDao;
import com.smartbi.app.log.service.IReportService;
import com.smartbi.app.log.vo.CreateReportRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;


/**
 *
 * @author L99
 * @createDate 2019/7/12
 *
 */
@RestController
public class ReportController {

    @Autowired
    IReportService reportService;

    @PostMapping("/report")
    public Object getReport(@RequestBody CreateReportRequest createReportRequest) {
        return reportService.getReportByElement(createReportRequest);
    }


    @Autowired
    PDao pDao;

    @GetMapping(value = "/get", produces = MediaType.IMAGE_JPEG_VALUE)
    public BufferedImage getImage() throws IOException {
        try (InputStream inputStream = new ByteArrayInputStream(pDao.get(1).getPicture())) {
            return ImageIO.read(inputStream);
        }
    }
}
