package com.example.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private Context context;
    private ArrayList<User> users = new ArrayList<>();

    public UserListAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.firstName.setText(String.valueOf(users.get(position).getFirstName()));
        holder.lastName.setText(String.valueOf(users.get(position).getLastName()));
        holder.email.setText(String.valueOf(users.get(position).getEmail()));
        holder.degreeProgram.setText(String.valueOf(users.get(position).getDegreeProgram()));
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
