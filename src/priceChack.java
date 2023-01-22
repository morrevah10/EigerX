import java.util.*;

public class priceChack {
    public static void main(String[] args)
    {
        String[] products = {"eggs","milk","cheese"};
        String[] productsPrice = {"2.89","3.29","5.79"};
        String[] productSold = {"eggs","eggs","cheese","milk"};
        Float[] soldPrice = {2.89f, 2.99f, 5.97f, 3.29f};
        int errorCount =0;

        errorCount=priceCheck(products,productsPrice,productSold,soldPrice);

        System.out.println("number of errors" + " " + errorCount);
    }

    private static int priceCheck(String[] products, String[] productsPrice, String[] productSold, Float[] soldPrice)
    {
        int errorCount = 0;
        for(int i=0;i<productSold.length;i++){
            int index = Arrays.asList(products).indexOf(productSold[i]);
            //give the index of productSold[i] in products[]
            if(index !=-1){
                float rightPrice = Float.valueOf (productsPrice[index]);
                //change productPrice to flaot to compare
                if(rightPrice != soldPrice[index]){
                    errorCount++;
                }
            }
        }
        return errorCount;
    }
}