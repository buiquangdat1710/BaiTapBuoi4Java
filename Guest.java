package BTVN;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Formatter;
public class Guest{
    Scanner sc = new Scanner(System.in);
    public Guest(){
        System.out.println("----------------------Tài khoản Khách----------------------");
        System.out.println("| 1. Tìm kiếm theo từ.                                    |");
        System.out.println("| 2. Xem danh sách sản phẩm đang có.                      |");
        System.out.println("| 3. Thoát tài khoản khách.                               |");
        System.out.println("-----------------------------------------------------------");
    }
    public void timKiemTu(ArrayList<Sach> books, ArrayList<VoGhi> voGhi, ArrayList<ButChi> butChi, ArrayList<ButMuc> butMuc){
        System.out.print("Nhập từ bạn muốn tìm kiếm: ");
        String tuTimKiem = sc.nextLine();
        System.out.println("1. Hiển thị kết quả dạng bảng");
        System.out.println("2. Hiển thị kết quả dạng danh sách");
        System.out.print("Lựa chọn của bạn: ");
        while(true){
            int your_choice = sc.nextInt();
            if(your_choice == 1){
                System.out.println("Danh sách sản phẩm tìm kiếm được:");
                System.out.println("---------------------------------------------------");
                System.out.printf("| %10s | %10s | %10s | %10s |","Tên sản phẩm","Giá bán","Thương hiệu","Thông tin thêm");
                // Chỗ table format này em chưa xử lý được ạ
                break;
            }else if(your_choice == 2){
                System.out.println("Danh sách sản phẩm tìm kiếm được:");
                for(Sach sach:books){
                    if(sach.SoSanh(tuTimKiem)){
                        System.out.println("------");
                        sach.inThongTin();
                    }
                }
                for(VoGhi vo : voGhi){
                    if(vo.SoSanh(tuTimKiem)){
                        System.out.println("------");
                        vo.inThongTin();
                    }
                }
                for(ButChi but : butChi){
                    if(but.SoSanh(tuTimKiem)){
                        System.out.println("------");
                        but.inThongTin();
                    }
                }
                for(ButMuc but : butMuc){
                    if(but.SoSanh(tuTimKiem)){
                        System.out.println("------");
                        but.inThongTin();
                    }
                }
                System.out.println("------");
                break;
            }else{
                System.out.print("Nhập sai !! Vui lòng nhập lại: ");

            }
        }

    }
    public void danhSach(ArrayList<Sach> books, ArrayList<VoGhi> voGhi, ArrayList<ButChi> butChi, ArrayList<ButMuc> butMuc){
        System.out.println("Hiện tại đây là danh sách sản phẩm của cửa hàng: ");
        int id = 1;
        for(Sach sach : books){
            System.out.println("------");
            System.out.println("Thứ tự: " + id);
            sach.inThongTin();
            id++;
        }
        id = 1;
        for(VoGhi vo :voGhi){
            System.out.println("------");
            System.out.println("Thứ tự: " + id);
            vo.inThongTin();
            id++;
        }
        id = 1;
        for(ButChi but : butChi){
            System.out.println("------");
            System.out.println("Thứ tự: " + id);
            but.inThongTin();
            id++;
        }
        id = 1;
        for(ButMuc but : butMuc){
            System.out.println("------");
            System.out.println("Thứ tự: " + id);
            but.inThongTin();
            id++;
        }
        System.out.println("------");
    }
}
