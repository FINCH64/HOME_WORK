package src.home_work_7;

import java.io.*;
import java.util.Scanner;

import static jdk.internal.net.http.common.Utils.close;

public class multiThreads  implements Runnable{

    private Scanner scanner;
    private EasySearch searcher;
    private File path;
    private long counter;
    private int counterOfThreads;
    private String content;
    private String fileName;
    private String searchWord;

    public void run() {
        findWords(content,searchWord);
    };

    multiThreads() {
        scanner = new Scanner(System.in);
        searcher = new EasySearch();
        System.out.println("Введите название директории с файлами(должна лежать в папке home_work_7): ");
        path = new File("src/home_work_7/" + scanner.nextLine());
        counter = 0;
    }

    private void readUsingBufferedReader() {
        if (counter == 0) {
            try {
                for (File file : path.listFiles()) {
                    System.out.println(file.getName());
                }
                System.out.println("Введите название файла,в котором будет осуществлён поиск: ");
                fileName = scanner.nextLine();
                BufferedReader reader = new BufferedReader(new FileReader(path + "/" + fileName));
                String line = null;
                StringBuilder stringBuilder = new StringBuilder();
                String ls = System.getProperty("line.separator");
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line);
                    stringBuilder.append(ls);
                }
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                content = stringBuilder.toString();
                counter++;
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

    private void findWords (String book,String word){
        long wordCount = searcher.search(book,word);
        StringBuilder res = new StringBuilder();
        res.append(fileName + " - " + word + " - " + wordCount);
        File resultTxt = new File("src/home_work_7/result.txt");
        try {
            if(resultTxt.createNewFile()){
                System.out.println("Создан файл result.txt,смотрите результат в нём.");
            };
            writeFile("src/home_work_7/result.txt",res.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeFile(String filename, String text) throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(filename,true);
            text = text + "\n";
            fos.write(text.getBytes("UTF-8"));
        } catch (IOException e) {
            close(fos);
            throw e;
        }
    }

    public void findWordsByUser() {
        readUsingBufferedReader();
        System.out.println("Введите искомое слово: ");
        Scanner scan = new Scanner(System.in);
        searchWord = scan.nextLine();
        addNewThread();
        System.out.println("Если вам нужно осуществить поиск ещё раз,нажмите 1.");
        System.out.println("Если вам закончили искать,нажмите 2.");
        switch (scanner.nextInt()) {
            case 1:
                findWordsByUser();
                break;
            case 2:
                System.out.println("Работа окончена,результаты поисков в result.txt");
                break;
            default:
                System.out.println("Неверный ввод");
        }
    }

    public void addNewThread() {
        Thread[] threadArray = new Thread[999];
        threadArray[counterOfThreads] = new Thread(this);
        threadArray[counterOfThreads].start();
        try {
            threadArray[counterOfThreads].join();
        } catch(InterruptedException e) {
            e.getMessage();
        }
        if (counterOfThreads < 999) {
            counterOfThreads++;
        } else {
            for(int i = 0;i < threadArray.length;i++)
                threadArray[i] = null;
        }
    }

    public static void main(String[] args) {
        multiThreads mainClass = new multiThreads();
        mainClass.findWordsByUser();
    }
}
