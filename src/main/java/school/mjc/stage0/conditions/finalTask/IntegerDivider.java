package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if(divider==0){
            System.out.println("division by zero");
            return;
        }
        int d=dividend/divider;
        if(d*divider==dividend){
            System.out.println("can be divided completely");
        }else{
            System.out.println("cannot be divided completely");
        }
//        if (dividend==0){
//            System.out.println(0);
//        }
//        else if (divider == 0){
//        }
//
//      else if (dividend / divider * divider == dividend){
//        }
//
//      else {
//        }

    }
}
