package com.example.elvin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * TO DO:
 * send the send button data to somewhere!
 */

public class AddIngredientMenu extends AppCompatActivity
{
    Intent ingData = new Intent(this, IngredientView.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ingredient_menu);
    }


    /**
     * sends ingredient data to IngredientView class
     * @param view
     */
    public void sendIngredient(View view) {
        EditText ingName = (EditText) findViewById(R.id.EnterIngredientName);
        EditText ingMass = (EditText) findViewById(R.id.EnterIngredientMass);

        String ingNameStr = ingName.getText().toString();
        String ingMassStr = ingMass.getText().toString();

        ingData.putExtra("INGREDIENT_NAME", ingNameStr);
        ingData.putExtra("INGREDIENT_MASS", ingMassStr);
    }


    public void quitMenu (View view) {

        startActivity(ingData) ;
    }
}

