package home_work_1;

public class binary {
    public static void main(String[] args) {
        byte a = 42;
        byte b = 15;
        byte c = -42;
        byte d = -15;
        System.out.println(toBinaryString(a));
        System.out.println(toBinaryString(b));
        System.out.println(toBinaryString(c));
        System.out.println(toBinaryString(d));
    }

    public static String toBinaryString (byte number) {
        String dvoichnoePredstavlenie;
        int everyNum[];
        everyNum = new int[8];
        int counter = number;

            for (int i = 0; Math.abs(counter) > 0; i++) {
                if (Math.abs(counter) % 2 == 1) {
                    counter = counter / 2;
                    everyNum[7 - i] = 1;
                } else {
                    counter = counter / 2;
                }
            }
            if(number < 0) {
                everyNum[0] = 1;
                for (int x = 1; x < 8; x++) {
                    if (everyNum[x] == 0) {
                        everyNum[x] = 1;
                    } else {
                        if (everyNum[x] ==1) {
                            everyNum[x] = 0;
                        }
                    }
                }
                for (int z = 7;z != 0; z--) {
                    if (everyNum[z] == 0) {
                        everyNum[z] = 1;
                        break;
                    } else {
                        if (everyNum[z] == 1) {
                            everyNum[z] = 0;
                            if (everyNum[z - 1] == 0) {
                                everyNum[z - 1] = 1;
                                break;
                            }
                        }
                    }
                }
            }
        dvoichnoePredstavlenie = "Вводим: " + number + ", возвращает: " + everyNum[0] + everyNum[1] + everyNum[2] + everyNum[3] + everyNum[4] + everyNum[5] + everyNum[6] + everyNum[7];
        return dvoichnoePredstavlenie;
    }
}
