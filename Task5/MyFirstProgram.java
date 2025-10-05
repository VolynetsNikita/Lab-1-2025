import myfirstpackage.*;

class MyFirstClass {
   public static void main(String[] s) {
            MySecondClass o = new MySecondClass(1,2); 
            
            int i, j;
            for (i = 1; i <= 8; i++) {
                for(j = 1; j <= 8; j++) {
                    o.set_numb1(i);
                    o.set_numb2(j);
                    System.out.print(o.subtraction());
                    System.out.print(" ");
                }
                System.out.println();
            }
    }
}