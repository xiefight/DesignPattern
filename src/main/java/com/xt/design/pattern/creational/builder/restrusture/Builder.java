package com.xt.design.pattern.creational.builder.restrusture;

import com.xt.design.pattern.creational.builder.*;

/**
 * @Description: 建造者类具体的各种组装由此类实现
 * @Author: xietao
 * @Date: 2021-09-22 20:15
 **/
public class Builder {

    public IMenu levelOne(Double area){
        return new DecorationPackageMenu(area,"豪华欧式")
                .appendCeiling(new LevelTwoCeiling())
                .appendCoat(new DuluxCoat())
                .appendFloor(new ShengXiangFloor());
    }

    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area, "轻奢⽥田园")
                .appendCeiling(new LevelTwoCeiling()) // 吊顶，⼆二级顶
                .appendCoat(new LiBangCoat()) // 涂料料，⽴立邦
                .appendTile(new MarcoPoloTile());
    }

    public IMenu levelThree(Double area){
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling()) // 吊顶，⼆二级顶
                .appendCoat(new LiBangCoat()) // 涂料料，⽴立邦
                .appendTile(new DongPengTile()); // 地砖，东鹏
    }

}
