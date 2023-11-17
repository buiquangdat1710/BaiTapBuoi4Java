package BTVN;

public class VoGhi{
    private String tenSanPham, thuongHieu, loaiVo, mauSacBia, chatLieuGiay, kichThuoc;
    private int soTrang, giaBan;

    public VoGhi(String tenSanPham, String thuongHieu, String loaiVo, String mauSacBia, String chatLieuGiay, String kichThuoc, int soTrang, int giaBan) {
        this.tenSanPham = tenSanPham;
        this.thuongHieu = thuongHieu;
        this.loaiVo = loaiVo;
        this.mauSacBia = mauSacBia;
        this.chatLieuGiay = chatLieuGiay;
        this.kichThuoc = kichThuoc;
        this.soTrang = soTrang;
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

    public String getLoaiVo() {
        return loaiVo;
    }

    public void setLoaiVo(String loaiVo) {
        this.loaiVo = loaiVo;
    }

    public String getMauSacBia() {
        return mauSacBia;
    }

    public void setMauSacBia(String mauSacBia) {
        this.mauSacBia = mauSacBia;
    }

    public String getChatLieuGiay() {
        return chatLieuGiay;
    }

    public void setChatLieuGiay(String chatLieuGiay) {
        this.chatLieuGiay = chatLieuGiay;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
    public boolean SoSanh(String tuTimKiem){
        String giaban_String = String.valueOf(this.giaBan);
        String sotrang_String = String.valueOf(this.soTrang);
        return giaban_String.equals(tuTimKiem) || sotrang_String.equals(tuTimKiem) || tenSanPham.equals(tuTimKiem) || thuongHieu.equals(tuTimKiem) || loaiVo.equals(tuTimKiem) || mauSacBia.equals(tuTimKiem) || chatLieuGiay.equals(tuTimKiem) || kichThuoc.equals(tuTimKiem);
    }
    public void inThongTin(){
        System.out.println("Tên sản phẩm: " + tenSanPham);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("Số trang: " + soTrang);
        System.out.println("Thuowng hiệu " + thuongHieu);
        System.out.println("Loại vở : " + loaiVo);
        System.out.println("Màu sắc bìa: " + mauSacBia);
        System.out.println("Chất liệu giấy: " + chatLieuGiay);
        System.out.println("Kích thước: " + kichThuoc);
    }
}
