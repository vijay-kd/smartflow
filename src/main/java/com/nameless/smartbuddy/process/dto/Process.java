package com.nameless.smartbuddy.process.dto;

import com.nameless.smartbuddy.activity.dto.Activity;

import java.util.List;

public interface Process {

    public List<Activity> getActivities();
    public void setActivities(List<Activity> activities);
}
