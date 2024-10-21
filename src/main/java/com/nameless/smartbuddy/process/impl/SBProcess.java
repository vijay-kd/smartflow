package com.nameless.smartbuddy.process.impl;

import com.nameless.smartbuddy.activity.dto.Activity;
import com.nameless.smartbuddy.process.dto.Process;
import common.dto.BasicInfo;

import java.util.List;

public class SBProcess extends BasicInfo implements Process {

    private List<Activity> activities;

    @Override
    public List<Activity> getActivities() {
        return this.activities;
    }

    @Override
    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

}
