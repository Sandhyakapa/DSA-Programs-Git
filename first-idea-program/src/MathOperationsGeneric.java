public class MathOperationsGeneric<T> {
    T[] arr= new T[10];
        public <T> add(T x, T y){
            return x+y;
        }
        public int sub(int x, int y){
            return x-y;
        }
        public int mul(int x, int y){
            return x*y;
        }
        public int div(int x, int y){
            return x/y;
        }
    }

