package com.atguigu.springcloud.entitles;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author BinYi
 * @create 2020-09-11 21:18
 */
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Payment implements Serializable {
    private long id;
    private String serial;
}
