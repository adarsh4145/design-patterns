package io.github.adarsh4145.designpatterns.behavioural_I.command.solution;

import io.github.adarsh4145.designpatterns.behavioural_I.command.solution.framework.Command;

public class AddCustomerCommand implements Command {

    private CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService){
        this.customerService = customerService;
    }
    @Override
    public void execute() {
        customerService.addCustomer();
    }
}
