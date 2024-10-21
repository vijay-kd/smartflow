package com.nameless.smartbuddy.executor.service;

import com.nameless.smartbuddy.executor.dto.ProcessExecutionResult;
import com.nameless.smartbuddy.executor.dto.WorkItem;
import com.nameless.smartbuddy.process.dto.Process;

public interface ProcessExecutor {

    public WorkItem execute(Process process);

    default public WorkItem execute(WorkItem workItem) {
        throw new UnsupportedOperationException();
    };
}
