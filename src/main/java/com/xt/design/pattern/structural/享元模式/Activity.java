package com.xt.design.pattern.structural.享元模式;

import lombok.Data;

import java.util.Date;

/**
 * @Description: 不变的数据，活动信息
 * @Author: xietao
 * @Date: 2021-10-26 13:51
 **/
@Data
public class Activity {

    private Long id; // 活动ID
    private String name; // 活动名称
    private String desc; // 活动描述
    private Date startTime; // 开始时间
    private Date stopTime; // 结束时间
    private Stock stock; // 活动库存

}
