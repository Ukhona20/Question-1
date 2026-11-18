public class PrintProduct {
    public Product gon;
    public PrintProduct(Product gon){
        this.gon=gon;
    }

    public void PrintReport(){

        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("*********************************************************");
        System.out.println("TOTAL PRODUCT SALES:"+gon.GetTotalProductsSold());
        System.out.println("AVERAGE PRODUCT SALES:"+gon.GetAverageProductSold());
        System.out.println("MOST POPULAR PRODUCT:"+gon.GetMostPopularProduct());

    }
}
