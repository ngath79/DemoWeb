package QLsach;

import java.util.Date;
import java.util.Scanner;


public class Book {
    String bookName, nickname;
    Date publishDate;

    public Book() {
    }

    public Book(String bookName, String nickname, Date publishDate) {
        this.bookName = bookName;
        this.nickname = nickname;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
    
    public void input() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Book -> Nhap ten sach: ");
        bookName = scan.nextLine();
        
        //Khi nhập tên bút danh của tác giả, nếu chưa tồn tại thì -> Xuất hiện màn hình nhập thông tin cho tác giả đó luôn.
        System.out.println("Book -> Nhap nickname: ");
        nickname = scan.nextLine();
        
        if(!Main.checkExistAuthor(nickname)) {
            //Nhap thong tin moi cho tac gia
            Author author = new Author(nickname);
            author.inputWithoutNickname();
            
            Main.authorList.add(author);
        }
        
        System.out.println("Book -> Nhap ngay xuat ban (dd/mm/YYYY): ");
        publishDate = Utility.convertStringToDate(scan.nextLine());
    }
    
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", nickname=" + nickname + ", publishDate=" + Utility.convertDateToString(publishDate) + '}';
    }
}
