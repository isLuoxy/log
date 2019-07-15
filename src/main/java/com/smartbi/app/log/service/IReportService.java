package com.smartbi.app.log.service;

import com.smartbi.app.log.vo.CommonResult;
import com.smartbi.app.log.vo.CreateReportRequest;

/**
 *
 * @author L99
 * @createDate 2019/7/12
 *
 */
public interface IReportService {

    CommonResult getReportByElement(CreateReportRequest Request);

}
