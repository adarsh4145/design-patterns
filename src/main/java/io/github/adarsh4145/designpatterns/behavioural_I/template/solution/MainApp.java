package io.github.adarsh4145.systemdesign.behavioural_I.template.solution;


import io.github.adarsh4145.systemdesign.behavioural_I.template.solution.task.GenerateReportTask;
import io.github.adarsh4145.systemdesign.behavioural_I.template.solution.task.Task;
import io.github.adarsh4145.systemdesign.behavioural_I.template.solution.task.TransferMoneyTask;

public class MainApp {
    public static void main(String[] args) {
        AuditTrail auditTrail = new AuditTrail();
        Task generateReportTask = new GenerateReportTask(auditTrail);
        TransferMoneyTask transferMoneyTask = new TransferMoneyTask(auditTrail);
        generateReportTask.execute();
        transferMoneyTask.execute();
    }
}
