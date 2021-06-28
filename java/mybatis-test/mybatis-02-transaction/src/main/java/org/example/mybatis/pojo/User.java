package org.example.mybatis.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author liusenze
 * @Description:
 * @since 2021/6/8 5:08 下午
 */
@Data
public class User {

    private Integer id;
    private String username;
    private Boss boss;
    private List<Address> addressList;
}
