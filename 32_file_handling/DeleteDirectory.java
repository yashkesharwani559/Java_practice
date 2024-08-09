import java.io.File;
import java.util.Scanner;

//A small project in java to write a program that deletes any diretory or file completely from the system and messages when it doesn't exist

public class DeleteDirectory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file or directory name which you want to delete:  ");
        String input = sc.nextLine();
        File folder = new File(input);
        if (folder.exists() == true) {
            DelFolder(folder);
            System.out.println(input + "+ is deleted successfully\n From location " + folder.getAbsolutePath());
        } else {
            System.out.println(input + " doesn't exist");
        }
    }
    static void DelFolder(File file) {
        if (file.delete() == true) {
        }
        else {
            File[] str = file.listFiles();
            for (File file1 : str) {
                DelFolder(file1);
                file1.delete();
            }
            file.delete();
        }
    }
}
