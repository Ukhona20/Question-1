//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Scanner nice=new Scanner(System.in);
String[] Products={"Cozy Nights","Restonic Barbados","Sealy Phuket"};
int[][] Sales=new int[3][3];
for (int i=0;i< Products.length;i++){
    for(int j=0;j<3;j++){
        System.out.println("Enter number of sales for month"+(j+1)+"for "+Products[i]+",mattress:");
        Sales[i][j]=nice.nextInt();
    }
    Product gon =new Product(Products, Sales);
    PrintProduct print =new PrintProduct(gon);
    print.PrintReport();
}
}
