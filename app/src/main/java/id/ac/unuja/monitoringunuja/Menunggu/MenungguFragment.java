package id.ac.unuja.monitoringunuja.Menunggu;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.List;

import id.ac.unuja.monitoringunuja.R;
import id.ac.unuja.monitoringunuja.Utils.URLs;

public class MenungguFragment extends Fragment {
    private Context context;
    private View view;
    private id.ac.unuja.monitoringunuja.Utils.Utils Utils;


    public MenungguFragment() {

        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menunggu, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.view = view;
        ambilData();




    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    private void ambilData() {
        if (!Utils.isNetworkAvailable(context)) {
            Toast.makeText(context,
                    "No internet ..Please connect to internet and start app again",
                    Toast.LENGTH_SHORT).show();
            return;
        }




        RequestQueue queue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URLs.tampil,
                response -> {
                    Log.e("api response", response);

                    ModelRKAT modelRKAT = (ModelRKAT) Utils.jsonToPojo(response,ModelRKAT.class);



                    if (modelRKAT.getResult() != null  &&
                            modelRKAT.getResult().size() > 0) {

                        RecyclerView recyclerView = view.findViewById(R.id.recMenunggu);
                        LinearLayoutManager llm = new LinearLayoutManager(context);
                        llm.setOrientation(LinearLayoutManager.VERTICAL);
                        recyclerView.setLayoutManager(llm);
                        MenungguAdapter adapter = new MenungguAdapter(context, modelRKAT.getResult());
                        recyclerView.setAdapter(adapter);


                    } else {
                        Toast.makeText(context, "data tidak di temukan", Toast.LENGTH_SHORT).show();
                    }

                }, error ->
                Toast.makeText(context,
                        "server di temukan !",
                        Toast.LENGTH_SHORT).show()
        );

// Add the request to the RequestQueue.
        queue.add(stringRequest);



    }


}

