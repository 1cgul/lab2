package com.example.assignmentlab;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField monthlyPayment;
    @FXML
    private TextField totalPayment;
    @FXML
    private TextField loanAmount;
    @FXML
    private TextField numYears;
    @FXML
    private TextField annInterest;

    @FXML
    protected void onCalculatorButtonClick() {
        double principal = Double.parseDouble(loanAmount.getText());
        double monthlyInterestRate=Double.parseDouble(annInterest.getText())/12;
        double numberOfPayments = Integer.parseInt(numYears.getText())*12;
        double holdMonthlyPayment = principal *(                                 //formula to calculate loan
                (monthlyInterestRate *(Math.pow(1+monthlyInterestRate,numberOfPayments))) /
                        ((Math.pow(1+monthlyInterestRate,numberOfPayments))-1));
        double roundedResult = (Math.round(holdMonthlyPayment * 100.0))/100.0; //rounding the result to the nearest hundredth
        monthlyPayment.setText("$"+ roundedResult);                             //setting the text for the textfields
        totalPayment.setText("$"+ roundedResult*12*Double.parseDouble(numYears.getText()));
    }

}