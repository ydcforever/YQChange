package com.atpco.yqyr.change.mapper;

import com.atpco.yqyr.change.exception.MonitorException;
import com.atpco.yqyr.change.model.AtpcoYQYRS1;
import com.atpco.yqyr.change.model.QueryCondition;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ydc on 2019/12/2.
 */
@Repository
public interface YqyrChangeMapper {

    List<AtpcoYQYRS1> query(@Param("condition") QueryCondition condition) throws MonitorException;

}
