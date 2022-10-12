package testrunner;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.EmiCalcScreen;
import utilities.DataSet;

public class EmiCalcTestRunner extends Setup {
    @BeforeTest
    public void startEmiCalc(){
        EmiCalcScreen emiCalcScreen= new EmiCalcScreen(driver);
        emiCalcScreen.btnEmiCalc.click();
    }
    @Test(dataProvider = "data-provider", dataProviderClass = DataSet.class,priority = 2)
    public void doCalculation(double amount, double interest, int year, double processingFee, double mEmi,double tInterest,double pFee,double tAmount){
        EmiCalcScreen emiCalcScreen= new EmiCalcScreen(driver);
        emiCalcScreen.doCalculation(amount,interest,year,processingFee);
        String monthlyEmi= String.valueOf(emiCalcScreen.getmEmi());
        String totalInterest = String.valueOf(emiCalcScreen.gettInterest());
        String totalProcessingFee= String.valueOf(emiCalcScreen.getpFee());
        String totalAmount = String.valueOf(emiCalcScreen.gettAmount());

        System.out.println(monthlyEmi);
        System.out.println(totalInterest);
        System.out.println(totalProcessingFee);
        System.out.println(totalAmount);



        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(monthlyEmi,String.valueOf(mEmi));
        softAssert.assertEquals(totalInterest,String.valueOf(tInterest));
        softAssert.assertEquals(totalProcessingFee,String.valueOf(pFee));
        softAssert.assertEquals(totalAmount,String.valueOf(tAmount));

        emiCalcScreen.btnReset.click();
    }
}
