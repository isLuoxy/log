package com.smartbi.app.log.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author L99
 * @createDate 2019/7/12
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateReportRequest {

    private String tableName;

    private String className;

    private String name;
}
