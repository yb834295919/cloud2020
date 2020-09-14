package com.atguigu.springcloud.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author BinYi
 * @create 2020-09-14 14:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private Integer id;
    private String job;

    public static void main(String[] args) {
        User user = new User();


    }

}
