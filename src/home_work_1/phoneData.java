package home_work_1;

public class phoneData {
    public static void main(String[] args) {
        int numbers[];
        numbers = new int [10];
        for (int i = 0; i <10; i++) {
            int a = (int) ( Math.random() * 10 );
            numbers[i] = a;
        }
        System.out.println(createPhoneNumber(numbers));
    }

    public static String createPhoneNumber(int arr[]) {
        String phoneNumberFinal = "";
        phoneNumberFinal = "(" + arr[0] + arr [1] + arr[2] + ") " + arr[3] + arr[4] + arr[5] + "-" + arr[6] + arr[7] + arr[8] + arr[9];
        return phoneNumberFinal;
    }
}
