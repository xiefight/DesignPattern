package com.xt.design.pattern.creational.factorymethod;

/**
 * 强调产品族（美的 冰箱、空调、洗衣机）
 * 抽象工厂强调产品等级结构（美的、海尔、格兰仕）
 *
 *
 * 工厂 相当于 Collect
 *
 *
 * @Description: 视频工厂
 * @Author: xietao
 * @Date: 2021-09-06 21:18
 **/
public abstract class VideoFactory {

    public abstract Video getVideo();

    /**
     * 如果创建方法不会被继承扩展，可以使用static更方便
     */
   /* public static Video createVideo(String type){
        if ("java".equals(type)){
            return new JavaVideo();
        }else if ("python".equals(type)){
            return new PythonVideo();
        }
        return null;
    }

    public static Video createVideo2(Class clazz) {
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }*/

}
