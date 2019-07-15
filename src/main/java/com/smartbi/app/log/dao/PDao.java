package com.smartbi.app.log.dao;

import com.smartbi.app.log.entity.P;
import org.springframework.stereotype.Repository;

/**
 *
 * @author L99
 * @createDate 2019/7/14
 *
 */
@Repository
public interface PDao {

    void insert(P p);

    P get(int i);
}
