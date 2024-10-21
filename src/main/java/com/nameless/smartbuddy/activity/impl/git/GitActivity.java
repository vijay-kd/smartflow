package com.nameless.smartbuddy.activity.impl.git;

import com.nameless.smartbuddy.activity.dto.Activity;
import com.nameless.smartbuddy.activity.dto.ActivityParameter;
import com.nameless.smartbuddy.activity.dto.ActivityRule;
import com.nameless.smartbuddy.activity.impl.git.dto.GitActivityParameter;
import com.nameless.smartbuddy.process.dto.Process;
import com.nameless.smartbuddy.util.generics.casting.SBCast;
import common.dto.BasicInfo;

import java.util.List;

public class GitActivity extends BasicInfo implements Activity {

    private List<ActivityParameter> parameters;

    public GitActivity(long id, String name) {
        setId(id);
        setName(name);
    }

    @Override
    public List<ActivityParameter> getParameters() {
        return this.parameters;
    }

    @Override
    public List<ActivityRule> getRules() {
        return null;
    }

    @Override
    public int getOrderId() {
        return 0;
    }

    @Override
    public void setParameters(List<ActivityParameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public void setRules(List<ActivityRule> rules) {

    }

    @Override
    public void setOrderId() {

    }


    @Override
    public void execute() {
        System.out.println("Executed");
    }
}
