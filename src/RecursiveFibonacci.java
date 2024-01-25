public class RecursiveFibonacci {
    public static void main(String[] args) {

        System.out.println(Recursive(5));
    }
    public static int Recursive(int startNum){
        startNum++;
        if (startNum != 100){
            Recursive(startNum);
        }else{
            return startNum;
        }
        return startNum;

    }
}
