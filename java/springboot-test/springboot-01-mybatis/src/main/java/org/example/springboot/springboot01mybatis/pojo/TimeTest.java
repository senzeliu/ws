package org.example.springboot.springboot01mybatis.pojo;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author liusenze
 * @Description:
 * @since 2021/7/28 11:58 上午
 */
@Data
public class TimeTest {
    private Integer id;
    private LocalDateTime datetime1;
    private Date timestamp1;
}
