package com.atpco.yqyr.change.mapper;

import com.atpco.yqyr.change.model.AtpcoYQYRS1;
import com.atpco.yqyr.change.model.QueryCondition;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class YqyrChangeMapperTest {

    private YqyrChangeMapper mapper;

    @Autowired
    public void setMapper(YqyrChangeMapper mapper) {
        this.mapper = mapper;
    }

    @Test
    public void testQuery() throws Exception {
        QueryCondition condition = new QueryCondition("BA", "F");
        List<AtpcoYQYRS1> list =  mapper.query(condition);
        for(AtpcoYQYRS1 atpcoYQYRS1 : list) {
            System.out.println(atpcoYQYRS1.toString());
        }
    }
}