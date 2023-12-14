package io.github.adarsh4145.designpatterns.behavioural_I.template.mysolution;

public class GenerateReportTask {
    private final AuditTrail auditTrail;
    public GenerateReportTask(AuditTrail auditTrail){
        this.auditTrail = auditTrail;
    }
    public  void execute(){
        auditTrail.record();
        System.out.println("generate report");
    }
}
