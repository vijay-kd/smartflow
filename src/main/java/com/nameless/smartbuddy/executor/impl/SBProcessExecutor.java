package com.nameless.smartbuddy.executor.impl;

import com.nameless.smartbuddy.activity.dto.Activity;
import com.nameless.smartbuddy.executor.dto.ProcessExecutionResult;
import com.nameless.smartbuddy.executor.dto.WorkItem;
import com.nameless.smartbuddy.executor.service.ProcessExecutor;
import com.nameless.smartbuddy.process.dto.Process;

import java.util.List;

public class SBProcessExecutor implements ProcessExecutor {

    @Override
    public WorkItem execute(Process process) {

        List<Activity> activities =  process.getActivities();

        activities.forEach(Activity::execute);

        return null;
    }

    public static void main(String[] args) {


    }
}
