package com.xt.design.pattern.structural.享元模式;

/**
 * @Description:
 * @Author: xietao
 * @Date: 2021-10-26 14:16
 **/
public class Test {

    private ActivityController activityController = new ActivityController();

    /**
     * 这⾥里里我们通过活动查询控制类，在 for 循环的操作下查询了了⼗十次活动信息，同时为了了保证库存定
     * 时任务的变化，加了了睡眠操作，实际的开发中不不会有这样的睡眠。
     * @throws InterruptedException
     */
    public void test_queryActivityInfo() throws InterruptedException {
        for (int idx = 0; idx < 10; idx++) {
            Long req = 10001L;
            Activity activity = activityController.queryActivityInfo(req);
            System.out.println(activity);
            Thread.sleep(1200);
        }
    }

}
