package com.atpco.yqyr.change.model;

import org.apache.commons.lang3.StringUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ydc on 2019/12/2.
 */
public class QueryCondition {

    /**
     * 必填项 市场方
     */
    private String mktCxr;

    /**
     * 必填项 F（燃油）/ I（杂费）
     */
    private String feeType;

    /**
     * 发布日期 yyyy-MM-dd
     */
    private String pubBegin;
    /**
     * 发布日期 yyyy-MM-dd
     */
    private String pubEnd;

    /**
     * 有序结果
     */
    private List<AtpcoYQYRS1> changes;

    public QueryCondition() {
    }

    public QueryCondition(String mktCxr, String feeType) {
        this.mktCxr = mktCxr;
        this.feeType = feeType;
    }

    public String getMktCxr() {
        return mktCxr;
    }

    public void setMktCxr(String mktCxr) {
        this.mktCxr = mktCxr;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getPubBegin() {
        return pubBegin;
    }

    public void setPubBegin(String pubBegin) {
        this.pubBegin = pubBegin;
    }

    public String getPubEnd() {
        return pubEnd;
    }

    public void setPubEnd(String pubEnd) {
        this.pubEnd = pubEnd;
    }

    public List<AtpcoYQYRS1> getChanges() {
        return changes;
    }

    public void setChanges(List<AtpcoYQYRS1> changes) {
        this.changes = new LinkedList<AtpcoYQYRS1>();
        this.changes.addAll(changes);
    }

    public boolean check() {
        if(StringUtils.isBlank(this.mktCxr) || StringUtils.isBlank(this.feeType)) {
            return false;
        }
        this.changes = new LinkedList<AtpcoYQYRS1>();
        return true;
    }
}
