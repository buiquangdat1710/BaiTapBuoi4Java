package BTVN;

public class ButChi {
    private String tenSanPham, thuongHieu, mauSac, chatLieu, doCung;
    private int giaBan;

    public ButChi(String tenSanPham, String thuongHieu, String mauSac, String chatLieu, String doCung, int giaBan) {
        this.tenSanPham = tenSanPham;
        this.thuongHieu = thuongHieu;
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
        this.doCung = doCung;
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

    public String getDoCung() {
        return doCung;
    }

    public void setDoCung(String doCung) {
        this.doCung = doCung;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
    public boolean SoSanh(String tuTimKiem){
        String giaban_String = String.valueOf(this.giaBan);
        return giaban_String.equals(tuTimKiem) || tenSanPham.equals(tuTimKiem) || thuongHieu.equals(tuTimKiem) || mauSac.equals(tuTimKiem) || chatLieu.equals(tuTimKiem) || doCung.equals(tuTimKiem);
    }
    public void inThongTin(){
        System.out.println("Tên sản phẩm: " + tenSanPham);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("Thuowng hiệu " + thuongHieu);
        System.out.println("Màu sắc : " + mauSac);
        System.out.println("Chất liệu: " + chatLieu);
        System.out.println("Độ cứng: " + doCung);
    }
}

