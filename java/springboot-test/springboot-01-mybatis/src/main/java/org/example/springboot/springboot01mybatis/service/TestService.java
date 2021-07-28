package org.example.springboot.springboot01mybatis.pojo;

import org.example.springboot.springboot01mybatis.mapper.SystemNotificationMapper;
import org.example.springboot.springboot01mybatis.mapper.TimeTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author liusenze
 * @Description:
 * @since 2021/7/28 12:06 下午
 */
@Service
public class TestService {

    @Autowired
    private TimeTestMapper timeTestMapper;

    @Autowired
    private SystemNotificationMapper systemNotificationMapper;

    public List<TimeTest> list() {
        return timeTestMapper.selectAll();
    }

    public void insert() {
        TimeTest test = new TimeTest();
        Date now = new Date();
        System.out.println(now);
        test.setDatetime1(now);
        test.setTimestamp1(now);
        //imeTestMapper.insert(test);

        SystemNotification systemNotification=new SystemNotification();
        systemNotification.setName("test");
        systemNotification.setCreateTime(new Date());
        systemNotification.setUpdateTime(new Date());
        systemNotification.setStatus("");
        systemNotification.setIsRead(1);
        systemNotificationMapper.addSystemNotification(systemNotification);
    }
}
