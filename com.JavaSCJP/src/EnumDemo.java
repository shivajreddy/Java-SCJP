public class EnumDemo {
    public static void main(String[] args) {

        Month month = Month.APR;

        switch (month) {
            case APR:
                System.out.println("its april");
                break;
            case FEB:
                System.out.println("february");
                break;
            case JAN:
                System.out.println("its january");
                break;
            case MAY:
                System.out.println("its 20");
            default:
                System.out.println("this is default");
        }

    }
}


enum Month {
    JAN, FEB, MAR, APR, MAY
}
