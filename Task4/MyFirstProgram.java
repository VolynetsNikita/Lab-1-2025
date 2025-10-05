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

class MySecondClass {
        private int numb1;
        private int numb2;

        public MySecondClass(int numb1, int numb2){
            this.numb1 = numb1;
            this.numb2 = numb2;
        }

        public int get_numb1() {
            return numb1;
        }

        public int get_numb2() {
            return numb2;
        }

        public void set_numb1(int v1){
            this.numb1 = v1;
        }
        public void set_numb2(int v2){
            this.numb2 = v2;
        }

        public int subtraction(){
            return this.numb1 - this.numb2;
        }
}