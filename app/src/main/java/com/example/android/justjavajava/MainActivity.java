/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjavajava;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static java.net.Proxy.Type.HTTP;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    public int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        if (quantity < 2) {
            Context context = getApplicationContext();
            CharSequence text = "Can't order 0 cups!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else {
            quantity = --quantity;
        }
        displayQuantity(quantity);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        if (quantity >= 100) {
            Context context = getApplicationContext();
            CharSequence text = "Can't order over 100!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else{
            quantity = ++quantity;
        }
        displayQuantity(quantity) ;
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.checkbox_whipped_cream);
        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();

        CheckBox ChocolateCheckBox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        boolean hasChocolate = ChocSummary(editTextValue, hasWhippedCream, hasChocolate, price);


        Intent intent = new Intent(olateCheckBox.isChecked();

        Log.v("MainActivity", "Has whipped cream" + hasWhippedCream);

        EditText simpleEditText = (EditText) findViewById(R.id.plain_text_input);
        String editTextValue = simpleEditText.getText().toString();

        int price = calculatePrice(hasWhippedCream, hasChocolate);
        String priceMessage = createOrderIntent.ACTION_SENDTO);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


//        displayMessage(priceMessage);

    /**
     * Calculates the price of the order.
     * @param Chocolate checkbox state of Chocolate topping
     * @param WhippedCream checkbox state of Whipped cream topping
     * */

    private int calculatePrice(boolean WhippedCream, boolean Chocolate)
    {
        int basePrice = 5;
        if (WhippedCream) {
            basePrice += 1;
        } else {
        }

        if (Chocolate) {
            basePrice += 2;
        } else {
        }

        return quantity * basePrice;

    }

    /**
     * get input text for the name field
     * @return
     */


    /**
     * Create the order summary as text.
     * @param addChocolate show true or false to add toppings
     * @param addWhippedCream show true or false to add toppings
     * @param price
     * */

    private String createOrderSummary(String name,boolean addWhippedCream, boolean addChocolate, int price) {
        String priceMessage = "Name: " + name;
        priceMessage += "\nQuantity: " + quantity;
        priceMessage += "\nAdd Whipped cream? " + addWhippedCream;
        priceMessage += "\nAdd Chocolate? " + addChocolate;
        priceMessage += "\nTotal: " + price;
        priceMessage += "\nThank you!";
        return priceMessage;
    }

    /**
     * This method displays the given quantity value on the screen.
     * @param quantity
     */
    private void displayQuantity(int quantity) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + quantity);
    }

//    /**
//     * This method displays the total payment value on the screen.
//     * @param message
//     */
//    private void displayMessage(String message) {
//        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
//     orderSummaryTextView.setText(message);
//
//    }
}