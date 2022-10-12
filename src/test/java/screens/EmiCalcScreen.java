package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//@Getter
//@Setter


public class EmiCalcScreen {
    @FindBy(id = "com.continuum.emi.calculator:id/btnStart")
    public AndroidElement btnEmiCalc;
    @FindBy(id = "com.continuum.emi.calculator:id/etLoanAmount")
    AndroidElement txtAmount;
    @FindBy(id = "com.continuum.emi.calculator:id/etInterest")
    AndroidElement txtInterest;
    @FindBy(id = "com.continuum.emi.calculator:id/etYears")
    AndroidElement txtYear;
    @FindBy(id = "com.continuum.emi.calculator:id/etMonths")
    AndroidElement txtMonth;
    @FindBy(id = "com.continuum.emi.calculator:id/etEMI")
    AndroidElement txtEmiRes;
    @FindBy(id = "com.continuum.emi.calculator:id/etFee")
    AndroidElement txtProcessingFree;
    @FindBy(id = "com.continuum.emi.calculator:id/btnCalculate")
    AndroidElement btnCalculation;

    @FindBy(id = "com.continuum.emi.calculator:id/btnReset")
    public AndroidElement btnReset;
    @FindBy(id = "com.continuum.emi.calculator:id/monthly_emi_result")
    AndroidElement lblMonthlyEmi;
    @FindBy(id = "com.continuum.emi.calculator:id/total_interest_result")
    AndroidElement lblTotalInterest;
    @FindBy(id = "com.continuum.emi.calculator:id/processing_fee_result")
    AndroidElement lblProcessingFee;

    @FindBy(id = "com.continuum.emi.calculator:id/total_payment_result")
    AndroidElement lblTotalPayment;


    private double mEmi;
    private double tInterest;
    private double pFee;
    private double tAmount;

    public double getmEmi() {
        return mEmi;
    }

    public void setmEmi(double mEmi) {
        this.mEmi = mEmi;
    }

    public double gettInterest() {
        return tInterest;
    }

    public void settInterest(double tInterest) {
        this.tInterest = tInterest;
    }

    public double getpFee() {
        return pFee;
    }

    public void setpFee(double pFee) {
        this.pFee = pFee;
    }

    public double gettAmount() {
        return tAmount;
    }

    public void settAmount(double tAmount) {
        this.tAmount = tAmount;
    }

    public EmiCalcScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void doCalculation(double amount, double interest, int year, double processingFee) {

        txtAmount.sendKeys("" + amount + "");
        txtInterest.sendKeys("" + interest + "");
        txtYear.sendKeys("" + year + "");
        txtProcessingFree.sendKeys("" + processingFee + "");
        btnCalculation.click();

        setmEmi(Double.parseDouble(lblMonthlyEmi.getText().replace(",","")));
        settInterest(Double.parseDouble(lblTotalInterest.getText().replace(",","")));
        setpFee(Double.parseDouble(lblProcessingFee.getText().replace(",","")));
        settAmount(Double.parseDouble(txtAmount.getText().replace(",","")));

    }


}

