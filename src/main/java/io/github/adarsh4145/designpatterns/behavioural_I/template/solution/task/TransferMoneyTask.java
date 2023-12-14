package io.github.adarsh4145.systemdesign.behavioural_I.template.solution.task;

import io.github.adarsh4145.systemdesign.behavioural_I.template.solution.AuditTrail;

public class TransferMoneyTask extends Task{
    public TransferMoneyTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("transfer money");

    }
}
