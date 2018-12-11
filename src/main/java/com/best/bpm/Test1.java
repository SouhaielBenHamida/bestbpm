package com.best.bpm;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class Test1 implements JavaDelegate {
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("test1");
    }
}
