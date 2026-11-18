public class Product implements IProducts {
    String [] Products;
    int [][] Sales;
    int[] TotalPerProduct;

    public Product(String[] products, int[][] sales){
        this.Sales=new int[][]{{25,18,20},{15,10,12},{18,15,20}};
        this.Products=new String[]{"Cozy Nights","Restonic Barbados","Sealy Phuket"};
        CalculationTotals();
    }//calculation
    public void CalculationTotals(){
        TotalPerProduct=new int[Products.length];
        for(int i=0;i< Sales.length;i++){
            for (int j=0;j< Sales[i].length;j++){
                TotalPerProduct[i]+=Sales[i][j];
            }
        }
    }
    @Override
    public int GetTotalProductsSold() {
        int total=0;
            for(int i:TotalPerProduct){
          total+=i;
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int count = Sales.length * Sales[0].length;
        double Average=GetTotalProductsSold()/count;
        return Average;
    }

    @Override
    public String GetMostPopularProduct() {
        int Most =0;
        for ( int i=1;i<TotalPerProduct.length;i++){
            if (TotalPerProduct[i]>TotalPerProduct[Most]){
                Most=i;
            }
        }
        return ""+Most;
    }
}
