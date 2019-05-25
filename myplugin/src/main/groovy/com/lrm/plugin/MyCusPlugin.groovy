package com.lrm.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * 自定义插件练习
 * 参考https://www.jianshu.com/p/26537645566b
 * https://blog.csdn.net/huachao1001/article/details/51810328
 */
public class MyCusPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        println("========================");
        println("hello gradle plugin!");
        println("========================");
    }
}