package id.ac.unuja.monitoringunuja.Menunggu;


import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.unuja.monitoringunuja.R;

public class MenungguAdapter extends RecyclerView.Adapter<MenungguAdapter.ViewHolder> {


    private Context context;
    private List<Result> results;


    public MenungguAdapter(Context context, List<Result> results) {
        this.context = context;
        this.results = results;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        @SuppressLint("InflateParams") View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_menunggu, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.txtKegiatan.setText(results.get(position).getKegiatan());
        holder.txtTahun.setText(results.get(position).getTahunAnggaran());
        holder.txtTanggal.setText(results.get(position).getTanggalKegiatan());

    }

    @Override
    public int getItemCount() {
        return results.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtTanggal,txtTahun,txtKegiatan;
        private ConstraintLayout constraintLayout;

        ViewHolder(@NonNull View view) {

            super(view);
            txtKegiatan = view.findViewById(R.id.txtKegiatanMenunggu);
            txtTanggal = view.findViewById(R.id.txtTanggalMenunggu);
            txtTahun = view.findViewById(R.id.txtTahunMenunggu);
        }
    }

}
