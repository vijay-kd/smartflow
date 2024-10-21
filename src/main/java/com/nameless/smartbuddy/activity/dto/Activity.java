package com.nameless.smartbuddy.activity.dto;

import com.nameless.smartbuddy.process.dto.Process;

import java.util.List;

public interface Activity {

    public List<ActivityParameter> getParameters();

    public List<ActivityRule> getRules();

    public int getOrderId();

    public void setParameters(List<ActivityParameter> parameters);

    public void setRules(List<ActivityRule> rules);

    public void setOrderId();

    public void execute();
}
