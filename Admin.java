package BTVN;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    Scanner sc = new Scanner(System.in);
    public Admin(){
        System.out.println("----------------------Admin----------------------------");
        System.out.println("| 1. Thêm sách mới.                                   |");
        System.out.println("| 2. Xóa sách.                                        |");
        System.out.println("| 3. Sửa sách.                                        |");
        System.out.println("| 4. Thêm vở ghi.                                     |");
        System.out.println("| 5. Xóa vở ghi.                                      |");
        System.out.println("| 6. Sửa vở ghi.                                      |");
        System.out.println("| 7. Thêm bút chì.                                    |");
        System.out.println("| 8. Xóa bút chì.                                     |");
        System.out.println("| 9. Sửa bút chì.                                     |");
        System.out.println("| 10. Thêm bút mực.                                   |");
        System.out.println("| 11. Xóa bút mực.                                     |");
        System.out.println("| 12. Sửa bút mực.                                     |");
        System.out.println("| 13. Các chức năng của khách.                         |");
        System.out.println("| 14. Thoát tài khoản admin.                           |");
        System.out.println("-------------------------------------------------------");
    }
    public void inDanhSachSach(ArrayList<Sach> books){
        int id = 1;
        for(Sach sach : books){
            System.out.println("------");
            System.out.println("Thứ tự: " + id);
            sach.inThongTin();
            id++;
        }
        System.out.println("------");
    }
    public void inDanhSachVoGhi(ArrayList<VoGhi> voGhi){
        int id = 1;
        for(VoGhi vo :voGhi){
            System.out.println("------");
            System.out.println("Thứ tự: " + id);
            vo.inThongTin();
            id++;
        }
        System.out.println("------");
    }
    public void inDanhSachButChi(ArrayList<ButChi> butChi){
        int id = 1;
        for(ButChi but : butChi){
            System.out.println("------");
            System.out.println("Thứ tự: " + id);
            but.inThongTin();
            id++;
        }
        System.out.println("------");
    }
    public void inDanhSachButMuc(ArrayList<ButMuc> butMuc){
        int id = 1;
        for(ButMuc but : butMuc){
            System.out.println("------");
            System.out.println("Thứ tự: " + id);
            but.inThongTin();
            id++;
        }
        System.out.println("------");
    }

    public void themSachMoi(ArrayList<Sach> books){
        String tenSanPham, theLoai, tacGia, nhaXuatBan, namXuatBan, ngonNgu;
        int giaBan;
        System.out.print("Tiêu đề sách mới: ");
        tenSanPham = sc.nextLine();
        System.out.print("Thể loại sách mới: ");
        theLoai = sc.nextLine();
        System.out.print("Tác giả sách mới: ");
        tacGia = sc.nextLine();
        System.out.print("Nhà xuất bản mới: ");
        nhaXuatBan = sc.nextLine();
        System.out.print("Ngày xuất bản sách mới: ");
        namXuatBan = sc.nextLine();
        System.out.print("Ngôn ngữ sách mới: ");
        ngonNgu = sc.nextLine();
        System.out.print("Giá bán mới: ");
        giaBan = sc.nextInt();
        Sach sachMoi = new Sach(tenSanPham,theLoai,tacGia,nhaXuatBan,namXuatBan,ngonNgu,giaBan);
        books.add(sachMoi);
    }
    public void xoaSach(ArrayList<Sach> books){
        System.out.println("Hiện tại đây là danh sách sách của cửa hàng: ");
        inDanhSachSach(books);
        while(true){
            System.out.print("Nhập thứ tự sách bạn muốn xóa: ");
            int thuTu = sc.nextInt();
            if(thuTu > books.size()){
                System.out.println("Thứ tự không hợp lệ !!!");
            }else{
                books.remove(thuTu-1);
                System.out.println("Đã xóa thành công sách !!!");
                System.out.println("Danh sách sách của cửa hàng sau khi xóa: ");
                inDanhSachSach(books);
                return;
            }
        }
    }
    public void suaSach(ArrayList<Sach> books){
        System.out.println("Hiện tại đây là danh sách sách của cửa hàng: ");
        inDanhSachSach(books);
        System.out.print("Nhập thứ tự sách bạn muốn sửa: ");
        int thuTu = sc.nextInt();
        sc.nextLine();
        String tenSanPham, theLoai, tacGia, nhaXuatBan, namXuatBan, ngonNgu;
        int giaBan;
        System.out.print("Tiêu đề sách muốn sửa: ");
        tenSanPham = sc.nextLine();
        System.out.print("Thể loại sách muốn sửa: ");
        theLoai = sc.nextLine();
        System.out.print("Tác giả sách muốn sửa: ");
        tacGia = sc.nextLine();
        System.out.print("Nhà xuất bản muốn sửa: ");
        nhaXuatBan = sc.nextLine();
        System.out.print("Ngày xuất bản sách muốn sửa: ");
        namXuatBan = sc.nextLine();
        System.out.print("Ngôn ngữ muốn sửa: ");
        ngonNgu = sc.nextLine();
        System.out.print("Giá bán muốn sửa: ");
        giaBan = sc.nextInt();
        books.get(thuTu-1).setTenSanPham(tenSanPham);
        books.get(thuTu-1).setTacGia(tacGia);
        books.get(thuTu-1).setTheLoai(theLoai);
        books.get(thuTu-1).setNhaXuatBan(nhaXuatBan);
        books.get(thuTu-1).setNamXuatBan(namXuatBan);
        books.get(thuTu-1).setNgonNgu(ngonNgu);
        books.get(thuTu-1).setGiaBan(giaBan);
        System.out.println("Đã sửa sách thành công !!!");
        System.out.println("Đây là danh sách sách mới của cửa hàng: ");
        inDanhSachSach(books);
    }




    public void themVoGhiMoi(ArrayList<VoGhi> voGhi){
        String tenSanPham, thuongHieu, loaiVo, mauSacBia, chatLieuGiay, kichThuoc;
        int giaBan;
        int soTrang;
        System.out.print("Tiêu đề vở ghi mới: ");
        tenSanPham = sc.nextLine();
        System.out.print("Thương hiệu vở ghi mới: ");
        thuongHieu = sc.nextLine();
        System.out.print("Loại vở mới: ");
        loaiVo = sc.nextLine();
        System.out.print("Màu sắc bìa mới: ");
        mauSacBia = sc.nextLine();
        System.out.print("Chất liệu giấy mới: ");
        chatLieuGiay = sc.nextLine();
        System.out.print("Kích thước vở mới: ");
        kichThuoc = sc.nextLine();
        System.out.print("Giá bán mới: ");
        giaBan = sc.nextInt();
        System.out.print("Sô trang vở mói: ");
        soTrang = sc.nextInt();
        VoGhi voMoi = new VoGhi(tenSanPham,thuongHieu,loaiVo,mauSacBia,chatLieuGiay,kichThuoc,giaBan,soTrang);
        voGhi.add(voMoi);
    }
    public void xoaVoGhi(ArrayList<VoGhi> voGhi){
        System.out.println("Hiện tại đây là danh sách vở ghi của cửa hàng: ");
        inDanhSachVoGhi(voGhi);
        while(true){
            System.out.print("Nhập thứ tự vở ghi bạn muốn xóa: ");
            int thuTu = sc.nextInt();
            if(thuTu > voGhi.size()){
                System.out.println("Thứ tự không hợp lệ !!!");
            }else{
                voGhi.remove(thuTu-1);
                System.out.println("Đã xóa thành công vở ghi !!!");
                System.out.println("Danh sách vở ghi của cửa hàng sau khi xóa: ");
                inDanhSachVoGhi(voGhi);
                return;
            }
        }
    }
    public void suaVoGhi(ArrayList<VoGhi> voGhi){
        System.out.println("Hiện tại đây là danh sách vở ghi của cửa hàng: ");
        inDanhSachVoGhi(voGhi);
        System.out.print("Nhập thứ tự vở ghi bạn muốn sửa: ");
        int thuTu = sc.nextInt();
        sc.nextLine();
        String tenSanPham, thuongHieu, loaiVo, mauSacBia, chatLieuGiay, kichThuoc;
        int giaBan;
        int soTrang;
        System.out.print("Tiêu đề vở ghi muốn sửa: ");
        tenSanPham = sc.nextLine();
        System.out.print("Thương hiệu vở ghi muốn sửa: ");
        thuongHieu = sc.nextLine();
        System.out.print("Loại vở muốn sửa: ");
        loaiVo = sc.nextLine();
        System.out.print("Màu sắc bìa muốn sửa: ");
        mauSacBia = sc.nextLine();
        System.out.print("Chất liệu giấy muốn sửa: ");
        chatLieuGiay = sc.nextLine();
        System.out.print("Kích thước vở muốn sửa: ");
        kichThuoc = sc.nextLine();
        System.out.print("Giá bán muốn sửa: ");
        giaBan = sc.nextInt();
        System.out.print("Số trang vở muốn sửa: ");
        soTrang = sc.nextInt();
        voGhi.get(thuTu-1).setTenSanPham(tenSanPham);
        voGhi.get(thuTu-1).setThuongHieu(thuongHieu);
        voGhi.get(thuTu-1).setLoaiVo(loaiVo);
        voGhi.get(thuTu-1).setMauSacBia(mauSacBia);
        voGhi.get(thuTu-1).setChatLieuGiay(chatLieuGiay);
        voGhi.get(thuTu-1).setKichThuoc(kichThuoc);
        voGhi.get(thuTu-1).setGiaBan(giaBan);
        voGhi.get(thuTu-1).setSoTrang(soTrang);
        System.out.println("Đã sửa vở ghi thành công !!!");
        System.out.println("Đây là danh sách vở ghi mới của cửa hàng: ");
        inDanhSachVoGhi(voGhi);
    }




    public void themButChi(ArrayList<ButChi> butChi){
        String tenSanPham, thuongHieu, mauSac, chatLieu, doCung;
        int giaBan;
        System.out.print("Tên bút chì: ");
        tenSanPham = sc.nextLine();
        System.out.print("Thương hiêu bút chì: ");
        thuongHieu = sc.nextLine();
        System.out.print("Màu sắc bút chì: ");
        mauSac = sc.nextLine();
        System.out.print("Chất liệu bút chì: ");
        chatLieu = sc.nextLine();
        System.out.print("Độ cứng của bút chì: ");
        doCung = sc.nextLine();
        System.out.print("Giá bán mới: ");
        giaBan = sc.nextInt();
        ButChi but = new ButChi(tenSanPham,thuongHieu,mauSac,chatLieu,doCung,giaBan);
        butChi.add(but);
    }
    public void xoaButChi(ArrayList<ButChi> butChi){
        System.out.println("Hiện tại đây là danh sách bút chì của cửa hàng: ");
        inDanhSachButChi(butChi);
        while(true){
            System.out.print("Nhập thứ tự bút chì bạn muốn xóa: ");
            int thuTu = sc.nextInt();
            if(thuTu > butChi.size()){
                System.out.println("Thứ tự không hợp lệ !!!");
            }else{
                butChi.remove(thuTu-1);
                System.out.println("Đã xóa thành công bút chì !!!");
                System.out.println("Danh sách bút chì của cửa hàng sau khi xóa: ");
                inDanhSachButChi(butChi);
                return;
            }
        }
    }
    public void suaButChi(ArrayList<ButChi> butChi){
        System.out.println("Hiện tại đây là danh sách bút chì của cửa hàng: ");
        inDanhSachButChi(butChi);
        System.out.print("Nhập thứ tự bút chì bạn muốn sửa: ");
        int thuTu = sc.nextInt();
        sc.nextLine();
        String tenSanPham, thuongHieu, mauSac, chatLieu, doCung;
        int giaBan;
        System.out.print("Tên bút chì: ");
        tenSanPham = sc.nextLine();
        System.out.print("Thương hiêu bút chì: ");
        thuongHieu = sc.nextLine();
        System.out.print("Màu sắc bút chì: ");
        mauSac = sc.nextLine();
        System.out.print("Chất liệu bút chì: ");
        chatLieu = sc.nextLine();
        System.out.print("Độ cứng của bút chì: ");
        doCung = sc.nextLine();
        System.out.print("Giá bán mới: ");
        giaBan = sc.nextInt();
        butChi.get(thuTu-1).setTenSanPham(tenSanPham);
        butChi.get(thuTu-1).setThuongHieu(thuongHieu);
        butChi.get(thuTu-1).setMauSac(mauSac);
        butChi.get(thuTu-1).setChatLieu(chatLieu);
        butChi.get(thuTu-1).setDoCung(doCung);
        butChi.get(thuTu-1).setGiaBan(giaBan);
        System.out.println("Đã sửa bút chì thành công !!!");
        System.out.println("Đây là danh sách sách mới của cửa hàng: ");
        inDanhSachButChi(butChi);
    }






    public void themButMuc(ArrayList<ButMuc> butMuc){
        String tenSanPham, thuongHieu, mauSac, chatLieu, loaiMuc, doMin;
        int giaBan;
        System.out.print("Tên bút mực: ");
        tenSanPham = sc.nextLine();
        System.out.print("Thương hiệu bút mực: ");
        thuongHieu = sc.nextLine();
        System.out.print("Màu Sắc bút mực: ");
        mauSac = sc.nextLine();
        System.out.print("Chất liệu bút mực: ");
        chatLieu = sc.nextLine();
        System.out.print("Loại mực: ");
        loaiMuc = sc.nextLine();
        System.out.print("Độ mịn của bút mực: ");
        doMin = sc.nextLine();
        System.out.print("Giá bán mới: ");
        giaBan = sc.nextInt();
        ButMuc but = new ButMuc(tenSanPham,thuongHieu,mauSac,chatLieu,loaiMuc,doMin,giaBan);
        butMuc.add(but);
    }
    public void xoaButMuc(ArrayList<ButMuc> butMuc){
        System.out.println("Hiện tại đây là danh sách bút mực của cửa hàng: ");
        inDanhSachButMuc(butMuc);
        while(true){
            System.out.print("Nhập thứ tự bút mực bạn muốn xóa: ");
            int thuTu = sc.nextInt();
            if(thuTu > butMuc.size()){
                System.out.println("Thứ tự không hợp lệ !!!");
            }else{
                butMuc.remove(thuTu-1);
                System.out.println("Đã xóa thành công sách !!!");
                System.out.println("Danh sách sách của cửa hàng sau khi xóa: ");
                inDanhSachButMuc(butMuc);
                return;
            }
        }
    }
    public void suaButMuc(ArrayList<ButMuc> butMuc){
        System.out.println("Hiện tại đây là danh sách bút mực của cửa hàng: ");
        inDanhSachButMuc(butMuc);
        System.out.print("Nhập thứ tự bút mực bạn muốn sửa: ");
        int thuTu = sc.nextInt();
        sc.nextLine();
        String tenSanPham, thuongHieu, mauSac, chatLieu, loaiMuc, doMin;
        int giaBan;
        System.out.print("Tên bút mực: ");
        tenSanPham = sc.nextLine();
        System.out.print("Thương hiệu bút mực: ");
        thuongHieu = sc.nextLine();
        System.out.print("Màu Sắc bút mực: ");
        mauSac = sc.nextLine();
        System.out.print("Chất liệu bút mực: ");
        chatLieu = sc.nextLine();
        System.out.print("Loại mực: ");
        loaiMuc = sc.nextLine();
        System.out.print("Độ mịn của bút mực: ");
        doMin = sc.nextLine();
        System.out.print("Giá bán mới: ");
        giaBan = sc.nextInt();
        butMuc.get(thuTu-1).setTenSanPham(tenSanPham);
        butMuc.get(thuTu-1).setThuongHieu(thuongHieu);
        butMuc.get(thuTu-1).setMauSac(mauSac);
        butMuc.get(thuTu-1).setChatLieu(chatLieu);
        butMuc.get(thuTu-1).setLoaiMuc(loaiMuc);
        butMuc.get(thuTu-1).setDoMin(doMin);
        butMuc.get(thuTu-1).setGiaBan(giaBan);
        System.out.println("Đã sửa bút mực thành công !!!");
        System.out.println("Đây là danh sách bút mực mới của cửa hàng: ");
        inDanhSachButMuc(butMuc);
    }

}
