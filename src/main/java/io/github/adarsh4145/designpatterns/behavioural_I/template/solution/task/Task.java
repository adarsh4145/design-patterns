package io.github.adarsh4145.designpatterns.behavioural_I.template.solution.task;

import io.github.adarsh4145.designpatterns.behavioural_I.template.solution.AuditTrail;

public abstract class Task {

    private final AuditTrail auditTrail;

    public Task (AuditTrail auditTrail){
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();

}
