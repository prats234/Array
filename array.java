public class array {
    public static void main(String[] args) {
        double[] data = new double[5];
        data[0] = 20.3;
        data[1] = 30.1;
        data[2] = 40.5;
        data[3] = 80;
        data[4] = 60;

        String[] data2 = new String[3];
        data2[0] = "Burger";
        data2[1] = "Pizza";
        data2[2] = "Sandwich";
        {
            System.out.println(data2[0]);
            System.out.println(data2[1]);
            System.out.println(data2[2]);
        }
        if (data[2] > data[3])
        {
            System.out.println(data[2] + " is greater than " + data[3]);
        } else
        {
            System.out.println(data[3] + " is greater than "+ data[2]);
        }
    }
}
