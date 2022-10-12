package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {
    @DataProvider(name = "data-provider")
    public Object[][] setData(){
        return new Object[][] {
                {50000,10,1,2,4395.79,2749.53,1000.0,52749},
                {100000,10,2,2,4614.49,10747.82,2000.0,110747.82},

        };
    }
}
