package BTVN;

import java.awt.print.Book;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.*;
import java.io.FileReader;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> books = new ArrayList<>();
        ArrayList<VoGhi> voGhi = new ArrayList<>();
        ArrayList<ButChi> butChi = new ArrayList<>();
        ArrayList<ButMuc> butMuc = new ArrayList<>();
        LogIn login = new LogIn("QuangDat","QuangDat123");
        while(login.mode == 0){
            login.dangNhap();
        }
        if(login.mode == 1){
            // Admin;
            int choice;
            while(true){
                Admin admin = new Admin();
                choice = sc.nextInt();
                sc.nextLine();
                switch(choice){
                    case 1:
                        admin.themSachMoi(books);
                        break;
                    case 2:
                        admin.xoaSach(books);
                        break;
                    case 3:
                        admin.suaSach(books);
                        break;
                    case 4:
                        admin.themVoGhiMoi(voGhi);
                        break;
                    case 5:
                        admin.xoaVoGhi(voGhi);
                        break;
                    case 6:
                        admin.suaVoGhi(voGhi);
                        break;
                    case 7:
                        admin.themButChi(butChi);
                        break;
                    case 8:
                        admin.xoaButChi(butChi);
                        break;
                    case 9:
                        admin.suaButChi(butChi);
                        break;
                    case 10:
                        admin.themButMuc(butMuc);
                        break;
                    case 11:
                        admin.xoaButMuc(butMuc);
                        break;
                    case 12:
                        admin.suaButMuc(butMuc);
                        break;
                    case 13:
                        int luaChonCuaKhach;
                        while(true){
                            Guest guest = new Guest();
                            luaChonCuaKhach = sc.nextInt();
                            sc.nextLine();
                            switch(luaChonCuaKhach){
                                case 1:
                                    guest.timKiemTu(books,voGhi,butChi,butMuc);
                                    break;
                                case 2:
                                    guest.danhSach(books,voGhi,butChi,butMuc);
                                    break;
                                case 3:
                                    System.out.println("Đã thoát tài khoản Khách. Hẹn gặp lại bạn!");
                                    return;
                                default:
                                    break;
                            }

                        }
                    case 14:
                        System.out.println("Đã thoát tài khoản Admin. Hẹn gặp lại bạn !!");
                        return;
                    default:
                        break;

                }
            }
        }else{
            // Khach
            int choice;
            while(true){
                Guest guest = new Guest();
                choice = sc.nextInt();
                sc.nextLine();
                switch(choice){
                    case 1:
                        guest.timKiemTu(books,voGhi,butChi,butMuc);
                        break;
                    case 2:
                        guest.danhSach(books,voGhi,butChi,butMuc);
                        break;
                    case 3:
                        System.out.println("Đã thoát tài khoản Khách. Hẹn gặp lại bạn!");
                        return;
                    default:
                        break;
                }

            }
        }
    }
}