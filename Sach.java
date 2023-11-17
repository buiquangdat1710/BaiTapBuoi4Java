package BTVN;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Sach{
    private String tenSanPham, theLoai, tacGia, nhaXuatBan, namXuatBan, ngonNgu;
    private int giaBan;

    public Sach(String tenSanPham, String theLoai, String tacGia, String nhaXuatBan, String namXuatBan, String ngonNgu, int giaBan) {
        this.tenSanPham = tenSanPham;
        this.theLoai = theLoai;
        this.tacGia = tacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
        this.ngonNgu = ngonNgu;
        this.giaBan = giaBan;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(String namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public Boolean SoSanh (String tuTimKiem){
        String giaban_String = String.valueOf(this.giaBan);
        return tenSanPham.equals(tuTimKiem) || theLoai.equals(tuTimKiem) || tacGia.equals(tuTimKiem) || nhaXuatBan.equals(tuTimKiem) || namXuatBan.equals(tuTimKiem) || ngonNgu.equals(tuTimKiem) || giaban_String.equals(tuTimKiem);
    }
    public void inThongTin(){
        System.out.println("Tên sản phẩm: " + tenSanPham);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("Thể loại: " + theLoai);
        System.out.println("Tác giả : " + tacGia);
        System.out.println("Nhà xuất bản: " + nhaXuatBan);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Ngôn ngữ: " + ngonNgu);
    }
}
