
package id.ac.unuja.monitoringunuja.Menunggu;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result implements Parcelable
{

    @SerializedName("id_rkat")
    @Expose
    private String idRkat;
    @SerializedName("tanggal_kegiatan")
    @Expose
    private String tanggalKegiatan;
    @SerializedName("id_fakultas")
    @Expose
    private String idFakultas;
    @SerializedName("tahun_anggaran")
    @Expose
    private String tahunAnggaran;
    @SerializedName("kegiatan")
    @Expose
    private String kegiatan;
    @SerializedName("total_dana")
    @Expose
    private String totalDana;
    @SerializedName("penanggung_jawab")
    @Expose
    private String penanggungJawab;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("id_prodi")
    @Expose
    private String idProdi;
    @SerializedName("keterangan")
    @Expose
    private String keterangan;
    public final static Creator<Result> CREATOR = new Creator<Result>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Result createFromParcel(Parcel in) {
            return new Result(in);
        }

        public Result[] newArray(int size) {
            return (new Result[size]);
        }

    }
    ;

    protected Result(Parcel in) {
        this.idRkat = ((String) in.readValue((String.class.getClassLoader())));
        this.tanggalKegiatan = ((String) in.readValue((String.class.getClassLoader())));
        this.idFakultas = ((String) in.readValue((String.class.getClassLoader())));
        this.tahunAnggaran = ((String) in.readValue((String.class.getClassLoader())));
        this.kegiatan = ((String) in.readValue((String.class.getClassLoader())));
        this.totalDana = ((String) in.readValue((String.class.getClassLoader())));
        this.penanggungJawab = ((String) in.readValue((String.class.getClassLoader())));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.idProdi = ((String) in.readValue((String.class.getClassLoader())));
        this.keterangan = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Result() {
    }

    public String getIdRkat() {
        return idRkat;
    }

    public void setIdRkat(String idRkat) {
        this.idRkat = idRkat;
    }

    public String getTanggalKegiatan() {
        return tanggalKegiatan;
    }

    public void setTanggalKegiatan(String tanggalKegiatan) {
        this.tanggalKegiatan = tanggalKegiatan;
    }

    public String getIdFakultas() {
        return idFakultas;
    }

    public void setIdFakultas(String idFakultas) {
        this.idFakultas = idFakultas;
    }

    public String getTahunAnggaran() {
        return tahunAnggaran;
    }

    public void setTahunAnggaran(String tahunAnggaran) {
        this.tahunAnggaran = tahunAnggaran;
    }

    public String getKegiatan() {
        return kegiatan;
    }

    public void setKegiatan(String kegiatan) {
        this.kegiatan = kegiatan;
    }

    public String getTotalDana() {
        return totalDana;
    }

    public void setTotalDana(String totalDana) {
        this.totalDana = totalDana;
    }

    public String getPenanggungJawab() {
        return penanggungJawab;
    }

    public void setPenanggungJawab(String penanggungJawab) {
        this.penanggungJawab = penanggungJawab;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdProdi() {
        return idProdi;
    }

    public void setIdProdi(String idProdi) {
        this.idProdi = idProdi;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(idRkat);
        dest.writeValue(tanggalKegiatan);
        dest.writeValue(idFakultas);
        dest.writeValue(tahunAnggaran);
        dest.writeValue(kegiatan);
        dest.writeValue(totalDana);
        dest.writeValue(penanggungJawab);
        dest.writeValue(status);
        dest.writeValue(idProdi);
        dest.writeValue(keterangan);
    }

    public int describeContents() {
        return  0;
    }

}
