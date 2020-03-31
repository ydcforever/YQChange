package com.atpco.yqyr.change.service;

import com.atpco.yqyr.change.exception.EnumRespMsg;
import com.atpco.yqyr.change.exception.MonitorException;
import com.atpco.yqyr.change.mapper.YqyrChangeMapper;
import com.atpco.yqyr.change.model.AtpcoYQYRS1;
import com.atpco.yqyr.change.model.QueryCondition;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by ydc on 2019/12/2.
 */
@WebService(endpointInterface = "com.atpco.yqyr.change.service.YqyrChangeQuery", serviceName = "YQChange")
public class YqyrChangeQueryImpl implements YqyrChangeQuery {

    @Autowired
    private YqyrChangeMapper mapper;

    @Override
    public QueryCondition query(QueryCondition condition) throws MonitorException{
        boolean init = condition.check();
        if(init) {
            try{
                List<AtpcoYQYRS1> list = mapper.query(condition);
                condition.setChanges(list);
                return condition;
            } catch (Exception e) {
                throw new MonitorException(EnumRespMsg.PROGRAM_EXCEPTION);
            }
        } else {
            throw new MonitorException(EnumRespMsg.CHECK_REQUEST_PARAMETERS);
        }
    }
}
