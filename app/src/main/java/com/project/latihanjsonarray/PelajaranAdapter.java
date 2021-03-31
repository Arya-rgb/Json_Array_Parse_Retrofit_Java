package com.project.latihanjsonarray;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PelajaranAdapter  extends RecyclerView.Adapter<PelajaranAdapter.ViewHolder> {


    private ArrayList<PelajarModel> pelajarModels=new ArrayList<>();
    private Context context;

    public PelajaranAdapter(Context context, ArrayList<PelajarModel> pelajarModels) {
        this.pelajarModels=pelajarModels;
        this.context=context;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView id_absen,hari_mapel,waktu_mapel,kelas_mapel,nama_guru,semester,pin_absen,nama_mapel;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            id_absen=(TextView)itemView.findViewById(R.id.absn_id);
            hari_mapel=(TextView)itemView.findViewById(R.id.absn_harimapel);

            waktu_mapel=(TextView)itemView.findViewById(R.id.absn_jammapel);
            kelas_mapel=(TextView)itemView.findViewById(R.id.absn_kelasmapel);

            nama_guru=(TextView)itemView.findViewById(R.id.absn_namaguru);
            semester=(TextView)itemView.findViewById(R.id.absn_semester);

            pin_absen=(TextView)itemView.findViewById(R.id.absn_pin);
            nama_mapel=(TextView)itemView.findViewById(R.id.absn_namamapel);
        }
    }

    @NonNull
    @Override
    public PelajaranAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pelajar_item,parent,false);
        return new PelajaranAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PelajaranAdapter.ViewHolder holder, int position) {

        holder.id_absen.setText(pelajarModels.get(position).getId());
        holder.hari_mapel.setText(pelajarModels.get(position).getHariMapel());

        holder.waktu_mapel.setText(pelajarModels.get(position).getWaktuMapel());
        holder.kelas_mapel.setText(pelajarModels.get(position).getKelasMapel());

        holder.nama_guru.setText(pelajarModels.get(position).getNamaGuru());
        holder.semester.setText(pelajarModels.get(position).getSemester());

        holder.pin_absen.setText(pelajarModels.get(position).getPinAbsen());
        holder.nama_mapel.setText(pelajarModels.get(position).getNamaMapel());

    }

    @Override
    public int getItemCount() {
        return pelajarModels.size();
    }
}
