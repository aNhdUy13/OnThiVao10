package com.nda.onthivao10_dethi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class advanced_setting extends AppCompatActivity implements PurchasesUpdatedListener {
    BillingClient billingClient;
    AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener;

    ImageView imgStar_advance;

    RecyclerView recyclerView;
    TextView txtPremium;
    Button loadProduct;

    List<String> skulist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_setting);
        imgStar_advance = (ImageView) findViewById(R.id.star_advance);
        txtPremium = (TextView) findViewById(R.id.txt_premium);
        recyclerView = (RecyclerView) findViewById(R.id.recycle_product);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,layoutManager.getOrientation()));

        skulist.add("adblock_1_month");
        skulist.add("adblock_3_month");
        skulist.add("adblock_1_year");

        SetUpBillingClient();
        init();
        back();
    }
    private void init()
    {



    }

    private void loadAllSubcricePackage() {
        if (billingClient.isReady())
        {
                SkuDetailsParams params = SkuDetailsParams.newBuilder()
                        .setSkusList(skulist)
                        .setType(BillingClient.SkuType.SUBS)
                        .build();
                billingClient.querySkuDetailsAsync(params, new SkuDetailsResponseListener() {
                    @Override
                    public void onSkuDetailsResponse(@NonNull  BillingResult billingResult, @Nullable  List<SkuDetails> list) {
                        if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK)
                        {
                            MyProductAdapter adapter = new MyProductAdapter(advanced_setting.this,list,billingClient);
                            recyclerView.setAdapter(adapter);
                        }
                        else
                        {
                            Toast.makeText(advanced_setting.this, "Error : " + billingResult.getResponseCode(), Toast.LENGTH_SHORT).show();
                        }

                    }
                });


        }

        else
        {
            Toast.makeText(this, "Billing Client Not Ready", Toast.LENGTH_SHORT).show();
        }
    }


    private void SetUpBillingClient() {
        acknowledgePurchaseResponseListener = new AcknowledgePurchaseResponseListener() {
            @Override
            public void onAcknowledgePurchaseResponse(@NonNull BillingResult billingResult) {
                if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK)
                {
                    txtPremium.setVisibility(View.VISIBLE);

                }
            }
        };

        billingClient = BillingClientSetup.getInstance(this,this);

        billingClient.startConnection(new BillingClientStateListener() {
            @Override
            public void onBillingServiceDisconnected() {
                Toast.makeText(advanced_setting.this, "Ngắn Kết Nối vơi Billing Service", Toast.LENGTH_SHORT).show();
            }

            //============ Khi Mở ứng dụng => Xem users subcribe gói nào chưa ============//
            @Override
            public void onBillingSetupFinished(@NonNull  BillingResult billingResult) {
                if(billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK)
                {
                    Toast.makeText(advanced_setting.this, "Success to connect billing", Toast.LENGTH_SHORT).show();
                    // Truy vấn các items đã mua.
                    List<Purchase> purchases = billingClient.queryPurchases(BillingClient.SkuType.SUBS)
                            .getPurchasesList();
                    if (purchases.size() > 0)
                    {
                        //
                        recyclerView.setVisibility(View.INVISIBLE);

                        for (Purchase purchase : purchases)
                        {
                            handleItemAlreadyPurchase(purchase);
                        }
                    }
                    else
                    {
                        txtPremium.setVisibility(View.INVISIBLE);
                        recyclerView.setVisibility(View.VISIBLE);
                        loadAllSubcricePackage();
                    }
                }
                else
                {
                    Toast.makeText(advanced_setting.this, "Error : " + billingResult.getResponseCode(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void handleItemAlreadyPurchase(Purchase purchases)
    {
        if (purchases.getPurchaseState() == Purchase.PurchaseState.PURCHASED)
        {
            if (!purchases.isAcknowledged())
            {
                AcknowledgePurchaseParams acknowledgePurchaseParams = AcknowledgePurchaseParams.newBuilder()
                        .setPurchaseToken(purchases.getPurchaseToken())
                        .build();
                billingClient.acknowledgePurchase(acknowledgePurchaseParams,acknowledgePurchaseResponseListener);

            }
            else
            {
                txtPremium.setVisibility(View.VISIBLE);
                txtPremium.setText("You are Premium !");

            }
        }
    }
    @Override
    public void onPurchasesUpdated(@NonNull BillingResult billingResult,  List<Purchase> list) {
        if(billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK && list != null)
        {
            for (Purchase purchase:list)
            {
                handleItemAlreadyPurchase(purchase);
            }
        }
        else if(billingResult.getResponseCode() == BillingClient.BillingResponseCode.USER_CANCELED)
        {
            Toast.makeText(this, "Billing Canceled ", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Error : " + billingResult.getResponseCode(), Toast.LENGTH_SHORT).show();
        }

    }



    private void back() {
        ImageView imgBack = (ImageView) findViewById(R.id.img_back);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}