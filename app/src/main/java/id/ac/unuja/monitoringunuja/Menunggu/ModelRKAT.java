
package id.ac.unuja.monitoringunuja.Menunggu;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelRKAT implements Parcelable
{

    @SerializedName("result")
    @Expose
    private List<Result> result = null;
    public final static Creator<ModelRKAT> CREATOR = new Creator<ModelRKAT>() {


        @SuppressWarnings({
            "unchecked"
        })
        public ModelRKAT createFromParcel(Parcel in) {
            return new ModelRKAT(in);
        }

        public ModelRKAT[] newArray(int size) {
            return (new ModelRKAT[size]);
        }

    }
    ;

    protected ModelRKAT(Parcel in) {
        in.readList(this.result, (id.ac.unuja.monitoringunuja.Menunggu.Result.class.getClassLoader()));
    }

    public ModelRKAT() {
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(result);
    }

    public int describeContents() {
        return  0;
    }

}
