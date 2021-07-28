package org.example.springboot.springboot01mybatis.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SystemNotification implements Serializable {
    private Integer id;

    private String code;

    private String name;

    private String object;

    private String cluster;

    private String namespace;

    private String status;

    private Integer jobId;

    private String notifiedUser;

    private Integer isRead;

    private String creator;

    private String modifier;

    private Date createTime;

    private Date updateTime;

    private String remark;

    public SystemNotification(String code, String name, String object, String status, String notifiedUser,
                              Integer isRead, String creator, String modifier, Date createTime, Date updateTime, String remark) {
        this.code = code;
        this.name = name;
        this.object = object;
        this.status = status;
        this.notifiedUser = notifiedUser;
        this.isRead = isRead;
        this.creator = creator;
        this.modifier = modifier;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.remark = remark;
    }
}