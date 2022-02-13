package QLsach;

import java.util.Date;
import java.util.Scanner;

public class Author {
    String fullname, nickname,address;
    Date birthday;

    public Author() {
    }

    public Author(String fullname, String nickname, String address, Date birthday) {
        this.fullname = fullname;
        this.nickname = nickname;
        this.address = address;
        this.birthday = birthday;
    }

    public Author(String nickname) {
        this.nickname = nickname;
    }
    
    public String getFullname() {
        return fullname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public void inputWithoutNickname() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Author -> Nhap ten: ");
        fullname = scan.nextLine();
        
        System.out.println("Author -> Nhap dia chi: ");
        address = scan.nextLine();
        
        System.out.println("Author -> Nhap ngay sinh (dd/mm/YYYY): ");
        birthday = Utility.convertStringToDate(scan.nextLine());
    }
    
    public void input() {
        inputWithoutNickname();
        
        Scanner scan = new Scanner(System.in);
        
        //Mỗi tác giả có bút danh duy nhất, ko được phép nhập trùng lặp tên bút danh của tác giả
        System.out.println("Author -> Nhap nickname: ");
        while(true) {
            nickname = scan.nextLine();
            boolean exist = Main.checkExistAuthor(nickname);
            if(exist) {
                System.out.println("Author -> Nickname da ton tai -> vui long nhap moi: ");
            } else {
                break;
            }
        }
    }
    
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Author{" + "fullname=" + fullname + ", nickname=" + nickname + ", address=" + address + ", birthday=" + Utility.convertDateToString(birthday) + '}';
    }
	
	
}
