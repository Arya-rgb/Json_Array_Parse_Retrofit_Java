package com.project.latihanjsonarray;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PelajarModel {

    @SerializedName("id_absen")
    @Expose
    private String id_absen;

    @SerializedName("hari_mapel")
    @Expose
    private String hari_mapel;

    @SerializedName("waktu_mapel")
    @Expose
    private String waktu_mapel;

    @SerializedName("kelas_mapel")
    @Expose
    private String kelas_mapel;

    @SerializedName("nama_guru")
    @Expose
    private String nama_guru;

    @SerializedName("semester")
    @Expose
    private String semester;

    @SerializedName("pin_absen")
    @Expose
    private String pin_absen;

    @SerializedName("nama_mapel")
    @Expose
    private String nama_mapel;

    public String getId() {
        return id_absen;
    }

    public void setId(String id_absen) {
        this.id_absen = id_absen;
    }

    public String getHariMapel() {
        return hari_mapel;
    }

    public void setHariMapel(String hari_mapel) {
        this.hari_mapel = hari_mapel;
    }

    public String getWaktuMapel() {
        return waktu_mapel;
    }

    public void setWaktuMapel(String waktu_mapel) {
        this.waktu_mapel = waktu_mapel;
    }

    public String getKelasMapel() {
        return kelas_mapel;
    }

    public void setKelasMapel(String kelas_mapel) {
        this.kelas_mapel = kelas_mapel;
    }

    public String getNamaGuru() {
        return nama_guru;
    }

    public void setNamaGuru(String nama_guru) {
        this.nama_guru = nama_guru;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getPinAbsen() {
        return pin_absen;
    }

    public void setPinAbsen(String pin_absen) {
        this.pin_absen = pin_absen;
    }

    public String getNamaMapel() {
        return nama_mapel;
    }

    public void setNamaMapel(String nama_mapel) {
        this.nama_mapel = nama_mapel;
    }

}
