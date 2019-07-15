package com.smartbi.app.log.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;

/**
 *
 * @author L99
 * @createDate 2019/7/12
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Report {

    private int id;

    private String bigmodule;

    private String smallmodule;

    private String classname;

    private String name;

    private String description;

    private String result;

    private String log;

    private Blob capture;

    private String date;

    private double duration;
}
