package myfirstpackage;

public class MySecondClass {
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