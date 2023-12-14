package io.github.adarsh4145.designpatterns.behavioural_I.command.solution;

import io.github.adarsh4145.designpatterns.behavioural_I.command.solution.framework.Button;
import io.github.adarsh4145.designpatterns.behavioural_I.command.solution.framework.Command;

public class MainApp {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();

        Command command = new AddCustomerCommand(customerService);

        Button button = new Button(command);

        button.click();

    }
}
