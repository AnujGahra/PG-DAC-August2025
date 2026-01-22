package com.mainApp;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileManagerApp {

    private static final String DATA_FOLDER    = "data";       // main folder
    private static final String RECYCLE_FOLDER = "recyclebin"; // recycle bin

    public static void main(String[] args) {
        createFolderIfNotExists(DATA_FOLDER);
        createFolderIfNotExists(RECYCLE_FOLDER);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== FILE MANAGER =====");
            System.out.println("1. Create new file");
            System.out.println("2. Show all files");
            System.out.println("3. Search file by name");
            System.out.println("4. Open (read) file by name");
            System.out.println("5. Delete file by name (Move to Recycle Bin)");
            System.out.println("6. Restore file from Recycle Bin");
            System.out.println("7. Delete ALL files");
            System.out.println("8. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1 -> createFile(sc);
                    case 2 -> showAllFiles();
                    case 3 -> searchFile(sc);
                    case 4 -> openFile(sc);
                    case 5 -> deleteFile(sc);
                    case 6 -> restoreFile(sc);
                    case 7 -> deleteAllFiles();
                    case 8 -> {
                        System.out.println("Exiting...");
                        sc.close();
                        return;
                    }
                    default -> System.out.println("Invalid choice");
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void createFolderIfNotExists(String folder) {
        File dir = new File(folder);
        if (!dir.exists()) dir.mkdirs();
    }

    private static void createFile(Scanner sc) throws IOException {
        System.out.print("Enter file name (without extension): ");
        String name = sc.nextLine().trim() + ".txt";
        Path path = Paths.get(DATA_FOLDER, name);

        if (Files.exists(path)) {
            System.out.println("File already exists!");
            return;
        }

        System.out.println("Enter file content (single line): ");
        String content = sc.nextLine();
        Files.write(path, content.getBytes());
        System.out.println("File created: " + path);
    }

    private static void showAllFiles() {
        File dir = new File(DATA_FOLDER);
        String[] list = dir.list();
        if (list == null || list.length == 0) {
            System.out.println("No files found.");
            return;
        }
        System.out.println("Files:");
        for (String f : list) System.out.println(" - " + f);
    }

    private static void searchFile(Scanner sc) {
        System.out.print("Enter file name to search: ");
        String name = sc.nextLine().trim() + ".txt";
        File f = new File(DATA_FOLDER, name);
        System.out.println(f.exists() ? "File found." : "File not found.");
    }

    private static void openFile(Scanner sc) throws IOException {
        System.out.print("Enter file name to open: ");
        String name = sc.nextLine().trim() + ".txt";
        Path path = Paths.get(DATA_FOLDER, name);
        if (Files.exists(path)) {
            System.out.println("---- File Content ----");
            Files.lines(path).forEach(System.out::println);
        } else {
            System.out.println("File not found.");
        }
    }

    private static void deleteFile(Scanner sc) throws IOException {
        System.out.print("Enter file name to delete: ");
        String name = sc.nextLine().trim() + ".txt";
        Path src = Paths.get(DATA_FOLDER, name);
        Path dest = Paths.get(RECYCLE_FOLDER, name);
        if (Files.exists(src)) {
            Files.move(src, dest, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved to Recycle Bin.");
        } else {
            System.out.println("File not found.");
        }
    }

    private static void restoreFile(Scanner sc) throws IOException {
        System.out.print("Enter file name to restore: ");
        String name = sc.nextLine().trim() + ".txt";
        Path src = Paths.get(RECYCLE_FOLDER, name);
        Path dest = Paths.get(DATA_FOLDER, name);
        if (Files.exists(src)) {
            Files.move(src, dest, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File restored to data folder.");
        } else {
            System.out.println("No such file in Recycle Bin.");
        }
    }

    private static void deleteAllFiles() throws IOException {
        File dir = new File(DATA_FOLDER);
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("No files to delete.");
            return;
        }
        for (File f : files) Files.delete(f.toPath());
        System.out.println("All files deleted permanently.");
    }
}

