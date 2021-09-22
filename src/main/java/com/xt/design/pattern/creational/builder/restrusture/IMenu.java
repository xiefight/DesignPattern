package com.xt.design.pattern.creational.builder.restrusture;

import com.xt.design.pattern.creational.builder.Matter;

/**
 * @Description: 定义装修包接口
 * 接⼝口类中定义了了填充各项物料料的⽅方法； 吊顶 、 涂料料 、 地板 、 地砖 ，以及最终提供获取全部明细
 * 的⽅方法。
 * @Author: xietao
 * @Date: 2021-09-22 20:16
 **/
public interface IMenu {
    IMenu appendCeiling(Matter matter); // 吊顶

    IMenu appendCoat(Matter matter); // 涂料料

    IMenu appendFloor(Matter matter); // 地板

    IMenu appendTile(Matter matter); // 地砖

    String getDetail(); // 明细
}
