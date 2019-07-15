package com.smartbi.app.log.dao;

import com.smartbi.app.log.entity.Report;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author L99
 * @createDate 2019/7/12
 *
 */
@Repository
public interface ReportDao {

    /**
     * 通过类名+方法名获取报告
     * @param tableName
     * @param className
     * @param name
     * @return
     */
    Report getReportByClassNameAndName(@Param("tablename") String tableName,@Param("classname") String className, @Param("name") String name);
}
