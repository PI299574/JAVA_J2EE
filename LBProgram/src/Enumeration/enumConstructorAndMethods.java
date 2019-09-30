package Enumeration;

enum colr{

    RED,BLUE,GREEN;

   

    private colr(){

           System.out.println("Construcor called for "+this.toString());

    }

   

    public void colorInfo(){

           System.out.println("color is unversal ");

    }

   

}



public class enumConstructorAndMethods {



    public static void main(String[] args) {

           // TODO Auto-generated method stub

           colr c=colr.RED;

           //System.out.println(c);

           //c.colorInfo();

    }



}
