package BTVN;

public class ButMuc {
    private String tenSanPham, thuongHieu, mauSac, chatLieu, loaiMuc, doMin;
    private int giaBan;

    public ButMuc(String tenSanPham, String thuongHieu, String mauSac, String chatLieu, String loaiMuc, String doMin, int giaBan) {
        this.tenSanPham = tenSanPham;
        this.thuongHieu = thuongHieu;
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
        this.loaiMuc = loaiMuc;
        this.doMin = doMin;
        this.giaBan = giaBan;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getLoaiMuc() {
        return loaiMuc;
    }

    public void setLoaiMuc(String loaiMuc) {
        this.loaiMuc = loaiMuc;
    }

    public String getDoMin() {
        return doMin;
    }

    public void setDoMin(String doMin) {
        this.doMin = doMin;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
    public Boolean SoSanh (String tuTimKiem){
        String giaBan_String = String.valueOf(this.giaBan);
        return tenSanPham.equals(tuTimKiem) || thuongHieu.equals(tuTimKiem) || mauSac.equals(tuTimKiem) || chatLieu.equals(tuTimKiem) || loaiMuc.equals(tuTimKiem) || doMin.equals(tuTimKiem) || giaBan_String.equals(tuTimKiem);
    }
    public void inThongTin(){
        System.out.println("Tên sản phẩm: " + tenSanPham);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("Thương hiệu: " + thuongHieu);
        System.out.println("Màu Sắc : " + mauSac);
        System.out.println("Chất liệu: " + chatLieu);
        System.out.println("Loại mực: " + loaiMuc);
        System.out.println("Độ mịn: " + doMin);
    }
}
