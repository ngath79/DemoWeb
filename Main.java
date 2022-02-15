package QLsach;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Book> bookList;
    public static List<Author> authorList;
    public static Scanner scan;
    
    public static void main(String[] args) {
        bookList = new ArrayList<>();
        authorList = new ArrayList<>();
        scan = new Scanner(System.in);
        
        int choose;
        
        do {
            showMenu();
            choose = Integer.parseInt(scan.nextLine());
            
            switch(choose) {
                case 1:
                    inputBook();
                    break;
                case 2:
                    displayBook();
                    break;
                case 3:
                    inputAuthor();
                    break;
                case 4:
                    findBookByAuthor();
                    break;
                case 5:
                    System.out.println("Thoat!!!");
                    break;
                default:
                    System.out.println("Nhap sai!!!");
                    break;
            }
        } while(choose != 5);
    }
    
    static void showMenu() {
        System.out.println("1. Nhap thong tin sach");
        System.out.println("2. Hien thi");
        System.out.println("3. Nhap thong tin tac gia");
        System.out.println("4. Tim kiem theo tac gia");
        System.out.println("5. Thoat");
        System.out.println("Chon: ");
    }

    private static void inputBook() {
        System.out.println("Nhap so sach can them: ");
        int n = Integer.parseInt(scan.nextLine());
        
        for (int i = 0; i < n; i++) {
            Book book = new Book();
            book.input();
            
            bookList.add(book);
        }
    }

    private static void displayBook() {
        System.out.println("Thong tin sach");
        
        for (Book book : bookList) {
            book.display();
        }
    }

    private static void inputAuthor() {
        System.out.println("Nhap so tac gia can them: ");
        int n = Integer.parseInt(scan.nextLine());
        
        for (int i = 0; i < n; i++) {
            Author author = new Author();
            author.input();
            
            authorList.add(author);
        }
    }

    private static void findBookByAuthor() {
        System.out.println("Tim quan sach cua tac gia: ");
        String nickname = scan.nextLine();
        
        for (Book book : bookList) {
            if(book.getNickname().equalsIgnoreCase(nickname)) {
                book.display();
            }
        }
    }
    
    public static boolean checkExistAuthor(String nickname) {
        if(authorList.size() == 0) return false;
        
        for (Author author : authorList) {
            if(author.getNickname().equalsIgnoreCase(nickname)) {
                return true;
            }
        }
        return false;
    }
}
