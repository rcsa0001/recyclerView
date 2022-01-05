//package com.example.recyclerview;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;
//
//public class Adapter extends RecyclerView.Adapter<Adapter.MyviewHolder> {
//    private List<ModelClass> userList;
//
//    public Adapter(List<ModelClass> userList) {
//        this .userList=userList;
//    }
//
//
//    @NonNull
//    @Override
//    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
//        return new MyviewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {
//        String name=userList.get(position).getTextView();
//
//        holder.setData(name);
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return userList.size();
//    }
//
//    public class MyviewHolder extends RecyclerView.ViewHolder{
//
//        private TextView textView;
//
//        public MyviewHolder(@NonNull View itemView) {
//            super(itemView);
//            textView=itemView.findViewById(R.id.textView);
//        }
//
//        public void setData(String name) {
//            textView.setText(name);
//        }
//    }
//}
