public class MainShop {
    public Product A = new Product(3,1.25,3);
    public Product B = new Product(0,4.25,0);
    public Product C = new Product(6,1,5);
    public Product D = new Product(0,0.75,0);
    public double getPriceBySale(int amountOfProduct,Product product){

        if(product.getAmountOfSale()<=amountOfProduct&&product.getAmountOfSale()!=0) {
            return (amountOfProduct / product.getAmountOfSale()) * product.getSalePrice() +
                    (amountOfProduct % product.getAmountOfSale()) * product.getPrice();
        }

        else return amountOfProduct*product.getPrice();
    }
    public  double calculateTotalCost(String basket){
        char[] chars = new char[basket.length()];
        int counterA = 0;
        int counterB = 0;
        int counterC = 0;
        int counterD = 0;
        for (int i = 0; i < basket.length(); i++) {
             chars[i] = basket.charAt(i);
        }
        for (int i = 0; i <basket.length() ; i++) {
            switch (chars[i]){
                case ('A'):
                    counterA++;
                    break;
                case ('B'):
                    counterB++;
                    break;
                case ('C'):
                    counterC++;
                    break;
                case ('D'):
                    counterD++;
                    break;
            }
        }
        return getPriceBySale(counterA,A) + getPriceBySale(counterB,B) + getPriceBySale(counterC, C)+
                getPriceBySale(counterD,D);



    }

}
