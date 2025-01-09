public class test {
    public static void main(String[] args) {
        int[] ar=new int[5];
        student std1 =  new student();//std1 is a reference variable
        std1.name = "hamsika";
        std1.id = 22;
        std1.classNo = "G2";
        std1.dept = "CSE";
        System.out.println(std1.name);
        System.out.println(std1.id);
        System.out.println(std1.classNo);
        System.out.println(std1.dept);
        std1.talking();
        std1.makingNoise();
        std1.coding();
    }
}
