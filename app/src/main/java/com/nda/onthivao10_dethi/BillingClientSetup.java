package com.nda.onthivao10_dethi;

import android.content.Context;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.PurchasesUpdatedListener;

public class BillingClientSetup {
    private static BillingClient instance;

    public static  BillingClient getInstance(Context context, PurchasesUpdatedListener listenter)
    {
        return  instance == null ? setupBillingClient(context,listenter):instance;
    }

    private static BillingClient setupBillingClient(Context context, PurchasesUpdatedListener listenter) {
        BillingClient billingClient = BillingClient.newBuilder(context)
                .enablePendingPurchases()
                .setListener(listenter)
                .build();

        return billingClient;
    }
}
