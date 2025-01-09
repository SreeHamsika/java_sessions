public class day_6_problems {
    public static void main(String[] args) {
        //nestedloop
        //outerloop: rows
        for(int i=0;i<3;i++){
            //innerloop
            for(int j=0;j<4;j++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
    for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    int []arr=new int[5];
    System.out.println(arr);//[I@4517d9a3 [=array I= integer,remaining memory location, so it will allocate memory
}
}
