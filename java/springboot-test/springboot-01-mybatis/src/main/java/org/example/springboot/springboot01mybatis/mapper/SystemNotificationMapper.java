package org.example.springboot.springboot01mybatis.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.example.springboot.springboot01mybatis.pojo.SystemNotification;

@Mapper
public interface SystemNotificationMapper {

    /*SystemNotification findById(String id);

    SystemNotification findByConfigName(String configName);

    List<SystemNotification> findByConfigType(String configType);*/


    //void updateSystemNotification(SystemNotification systemNotification);


    void addSystemNotification(SystemNotification systemNotification);


}