package io.github.adarsh4145.systemdesign.behavioural_I.template.solution.task;

import io.github.adarsh4145.systemdesign.behavioural_I.template.solution.AuditTrail;

public class GenerateReportTask extends Task{
    public GenerateReportTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("generate report");
    }
}
