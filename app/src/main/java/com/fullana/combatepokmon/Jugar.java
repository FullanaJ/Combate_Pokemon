package com.fullana.combatepokmon;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;

public class Jugar extends AppCompatActivity {

    TextView attack,speciaAttack;
    @RequiresApi(api = Build.VERSION_CODES.TIRAMISU)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        setContentView(R.layout.activity_jugar);
        JugarViewModel viewModel = new ViewModelProvider(this).get(JugarViewModel.class);
        viewModel.setPokemon1(new MutableLiveData<>(bundle.getSerializable("poke1",Pokemon.class)));
        viewModel.setPokemon1(new MutableLiveData<>(bundle.getSerializable("poke2",Pokemon.class)));
        attack = findViewById(R.id.attack);
        speciaAttack = findViewById(R.id.specialAttack);
        attack.setOnClickListener((l) ->{
            
        });
    }
}
class JugarViewModel extends AndroidViewModel{

    boolean atacando = false;
    MutableLiveData<Pokemon> pokemon1;
    MutableLiveData<Pokemon> pokemon2;
    public JugarViewModel(@NonNull Application application) {
        super(application);
    }

    public void setPokemon1(MutableLiveData<Pokemon> pokemon1) {
        this.pokemon1 = pokemon1;
    }

    public void setPokemon2(MutableLiveData<Pokemon> pokemon2) {
        this.pokemon2 = pokemon2;
    }
}
