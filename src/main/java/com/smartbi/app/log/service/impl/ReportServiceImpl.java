package com.smartbi.app.log.service.impl;

import com.smartbi.app.log.dao.ReportDao;
import com.smartbi.app.log.entity.Report;
import com.smartbi.app.log.service.IReportService;
import com.smartbi.app.log.vo.CommonResult;
import com.smartbi.app.log.vo.CreateReportRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author L99
 * @createDate 2019/7/12
 *
 */
@Service
public class ReportServiceImpl implements IReportService {

    @Autowired
    ReportDao reportDao;

    @Override
    public CommonResult getReportByElement(CreateReportRequest request) {
        Report reportByClassNameAndName = reportDao.getReportByClassNameAndName(request.getTableName(),request.getClassName(), request.getName());
        return new CommonResult(reportByClassNameAndName);
    }
}
