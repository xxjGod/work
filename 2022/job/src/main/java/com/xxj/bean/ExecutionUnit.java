package com.xxj.bean;

import java.time.Instant;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2022/2/25 17:56
 * All Rights Reserved
 */
public interface ExecutionUnit {
    String getCreationThreadName();


    Instant getStart();

    Instant getStop();

    Instant getComplete();

    long getActualDuration();

    long getEffectiveDuration();

    boolean isAsync();

    boolean isStarted();

    boolean isStopped();

    boolean isCompleted();

    void start();

    void stop();

    void complete();


    long toEffectiveEpochSecond();

    long toEffectiveEpochMilli();

    String asLongText();

    String asShortText();

    static void test1() {
        System.out.println("xxj");
    }


    default boolean isGoblinInstruction() {
        return true;
    }

    enum Mode {
        ASY,
        SYN
    }
}
