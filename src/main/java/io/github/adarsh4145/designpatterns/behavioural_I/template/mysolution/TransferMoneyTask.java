package io.github.adarsh4145.designpatterns.behavioural_I.template.mysolution;

public class TransferMoneyTask {
    private final AuditTrail auditTrail;

    public TransferMoneyTask(AuditTrail auditTrail){
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();
        System.out.println("transfer money");
    }
}
