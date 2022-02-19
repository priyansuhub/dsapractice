class Box{
    int volume(int a , int b , int c){
        return(a*b*c);
    }
}

public class Lab4four {
    //Priyansu Rath
    public static void main(String args[]){
        String arg1 = args[0];
        String arg2 = args[1];
        String arg3 = args[2];
        int convert1 = Integer.parseInt(arg1);
        int convert2= Integer.parseInt(arg2);
        int convert3 = Integer.parseInt(arg3);

        Box box = new Box();
        int result = box.volume(convert1, convert2, convert3);
        System.out.println(result);
        System.out.println("Length= "+ convert1);
        System.out.println("Width= "+ convert2);
        System.out.println("Height= "+ convert3);
    }
}
