package home_work_2.loops;

public class loop4 {
    public static void main(String[] args) {
        String [][] multiplicationTable = new String[9][9];
        for (int a = 0;a < 9;a++){
            System.out.println("-----" + (a + 1) + "------");
            for (int b = 0;b < 9;b++){
                multiplicationTable[a][b] = (a+1) + " * " + (b + 1) + " = " + ((a+1) * (b+1)) + ";";
                System.out.println(multiplicationTable[a][b]);
            };
        };
    }
}
