package com.xt.design.pattern.structural.适配器模式.电池充电案例;

/**
 * @Description: 具体适配
 * @Author: xietao
 * @Date: 2021-10-27 22:01
 **/
public class PowerAdapter implements DC5 {

    AC220 ac220 = new AC220();

    @Override
    public int outputDC5() {
        int adapterInput = ac220.outputAC220V();

        //业务逻辑--变压器
        int adapterOutput = adapterInput / 44;

        System.out.println("使用PowerAdapter输入AC:" + adapterInput + "V 输出DC:" + adapterOutput + "V");

        return adapterOutput;
    }
}
