package com.atpco.yqyr.change.service;

import com.atpco.yqyr.change.model.QueryCondition;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by ydc on 2019/12/2.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)//用一个绑定的annotation用来说明网络协议和格式
public interface YqyrChangeQuery {

    public QueryCondition query(QueryCondition condition);

}
