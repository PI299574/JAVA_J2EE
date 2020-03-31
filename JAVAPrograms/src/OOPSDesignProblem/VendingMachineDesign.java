package OOPSDesignProblem;

import java.util.HashMap;
import java.util.Scanner;



class Product{
    
    String name;
    int price;
    int quantity;
    
    public Product(String name, int price , int quantity){
        this.name=name;this.price=price; this.quantity=quantity;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
    
    
}
/*
class Stock{
    Product product;
    int quantity;
}
*/
public class VendingMachineDesign{


static HashMap<String , Product> productMap=new HashMap<>();
//HashMap<Product,Double> productPriceMap=new HashMap<>();
public static void addProduct(Product p){
    productMap.put(p.getName(),p);
}

public static Product getProductDetail(String name){
    return productMap.get(name);
}

public static void updateStock(String product,int quantity){
    if(IsProductAvailable(product,quantity)){
        Product p= getProductDetail(product);
        int remain_quantity = p.getQuantity()-quantity;
        productMap.put(product ,new Product(product, p.getPrice(), remain_quantity));
    }
}


public static String getProduct(String productName, int amount , int quantity){
    
    String result ="";
    
    if(IsProductAvailable(productName,quantity)){
        Product p =getProductDetail(productName);
        int productAmount=p.getPrice();
        
        int totalProductAmount=quantity * productAmount;
        if(amount >= productAmount){
            
            updateStock(productName, quantity);
            result = "product has been succesfully delivered";
            int remainingAmount = amount-productAmount;
            if(remainingAmount>0){
                result = result+ "with balance "+remainingAmount;
            }
        }
        else{
            result="Not sufficent balance";
        }
        
    }
    else{
           result= "product is not available"; 
    }
    return result;
    
}

    
static boolean IsProductAvailable(String name,int quantity)
{
     boolean flag= false;
      Product p = getProductDetail(name);
      if(p!=null && p.getQuantity()- quantity>=0)
    {
        flag=true;
    }
    return flag;
}   

static void initalliseProduct(){
    Product p1= new Product("x1", 100,10);
    addProduct(p1);
    Product p2= new Product("y1", 200,20);
    addProduct(p2);
    Product p3= new Product("z1", 300,30);
    addProduct(p3);
    
    //p2, p3...
}
public static void main(String []args){
    
    
    
    initalliseProduct();
    
    System.out.println("Hello Welcome****");
    Scanner sc=new Scanner(System.in);
    
    System.out.println("press  the below button for ::::::");
    System.out.println("1: productName 2: ProductQuantity 3: Amount");
    
    int n=3;
    boolean []array=new boolean[3];
    String productName="";int quantity=0;int amount=0;
    while(true){
    int x=sc.nextInt();
        if(x==1 && !array[0]){
            System.out.println("Select product***");
            productName=sc.next(); 
            array[0]=true;
            System.out.println("Select 2: ProductQuantity 3: Amount");
        }
        else if(x==2 && !array[1]){
            System.out.println("Select ProductQuantity***");
                quantity= sc.nextInt();
                array[1]=true;
            }
        else if(x==3 && !array[2])
        {
            System.out.print("Insert the Amount***");
            amount=sc.nextInt();
            array[2]=true;
        }  
        else{
          System.out.println("1: productName 2: ProductQuantity 3: Amount"); 
          
        }
        
        if(array[0] && array[1] && array[2] ){
            break;
        }
     
    }
    String message=null;
        if(amount!=0 && productName!=null && quantity>=1){
        message= getProduct(productName,quantity, amount);
    
    System.out.println(message);
    
}

}
    
}
