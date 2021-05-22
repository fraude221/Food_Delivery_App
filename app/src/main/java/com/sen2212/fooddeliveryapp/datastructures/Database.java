package com.sen2212.fooddeliveryapp.datastructures;

import android.graphics.Color;

import com.sen2212.fooddeliveryapp.R;

public class Database {

    // Categories
    //*******************************************************************************************************************************************************************************
    public static FoodCategory CAT_ROOT = new FoodCategory("Categories", R.drawable.ic_launcher_background, Color.WHITE); // Categories

    public static FoodCategory CAT_ALL = new FoodCategory("All", R.drawable.unnamed,Color.BLACK); // Categories > ALL
    //LAHMACUN
    public static FoodCategory CAT_LAHMACUN = new FoodCategory("Lahmacun", R.drawable.ic_launcher_background,Color.parseColor("#FF9BF39F")); // Categories > Lahmacun
    public static FoodCategory CAT_ACILI_LAHMACUN = new FoodCategory("Acılı Lahmacun", R.drawable.acili_lahmacun,Color.parseColor("#FF9BF39F")); // Categories > Lahmacun > Acılı Lahmacun
    public static FoodCategory CAT_BASPINAR_LAHMACUN = new FoodCategory("Başpınar Lahmacun", R.drawable.baspinar_lahmacun,Color.parseColor("#FF9BF39F")); // Categories > Lahmacun > Başpınar Lahmacun
    public static FoodCategory CAT_CEVIZLI_LAHMACUN= new FoodCategory("Cevizli Lahmacun", R.drawable.cevizli_lahmacun,Color.parseColor("#FF9BF39F")); // Categories > Lahmacun > Cevizli Lahmacun
    public static FoodCategory CAT_FINDIK_LAHMACUN= new FoodCategory("Fındık Lahmacun", R.drawable.findik_lahmacun,Color.parseColor("#FF9BF39F")); // Categories > Lahmacun > Fındık Lahmacun
    //PİDE
    public static FoodCategory CAT_PIDE = new FoodCategory("Pide", R.drawable.ic_launcher_background,Color.parseColor("#FF95CAF4")); // Categories > Pide
    public static FoodCategory CAT_KIYMALI_KASARLI_PIDE = new FoodCategory("Kıymalı Kaşarlı Pide", R.drawable.kiymali_kasarli_pide,Color.parseColor("#FF95CAF4")); // Categories > Pide > Kıymalı Kaşarlı Pide
    public static FoodCategory CAT_KIYMALI_PIDE = new FoodCategory("Kıymalı Pide", R.drawable.kiymali_pide,Color.parseColor("#FF95CAF4")); // Categories > Pide > Kıymalı Pide
    public static FoodCategory CAT_KUSBASI_PIDE = new FoodCategory("Kuşbaşı Pide", R.drawable.kusbasi_pide,Color.parseColor("#FF95CAF4")); // Categories > Pide > Kuşbaşı Pide
    public static FoodCategory CAT_KUSBASILI_KASARLI_PIDE = new FoodCategory("Kuşbaşılı Kaşarlı Pide", R.drawable.kusbasili_kasarli_pide,Color.parseColor("#FF95CAF4")); // Categories > Pide > Kuşbaşılı Kaşarlı Pide
    public static FoodCategory CAT_MANTARLI_PIDE = new FoodCategory("Matarlı Pide", R.drawable.mantarli_pide,Color.parseColor("#FF95CAF4")); // Categories > Pide > Matarlı Pide
    public static FoodCategory CAT_SUCUKLU_PIDE = new FoodCategory("Sucuklu Pide", R.drawable.sucuklu_pide,Color.parseColor("#FF95CAF4")); // Categories > Pide > Sucuklu Pide
    //BUREGER
    public static FoodCategory CAT_BURGER = new FoodCategory("Burger", R.drawable.ic_launcher_background,Color.parseColor("#FFFF8383")); // Categories > Burger
    public static FoodCategory CAT_BALIK_BURGER = new FoodCategory("Balık Burger", R.drawable.balik_burger,Color.parseColor("#FFFF8383")); // Categories > Burger > Balık Burger
    public static FoodCategory CAT_CHEESE_BURGER = new FoodCategory("Cheese Burger", R.drawable.cheese_burger,Color.parseColor("#FFFF8383")); // Categories > Burger > Cheese Burger
    public static FoodCategory CAT_FUME_ET_BURGER = new FoodCategory("Füme Et Burger", R.drawable.fume_et_burger,Color.parseColor("#FFFF8383")); // Categories > Burger > Füme Et Burger
    public static FoodCategory CAT_MANTAR_BURGER = new FoodCategory("Mantar Burger", R.drawable.mantar_burger,Color.parseColor("#FFFF8383")); // Categories > Burger > Mantar Burger
    public static FoodCategory CAT_STEAKHOUSE_BURGER = new FoodCategory("Steakhouse Burger", R.drawable.steakhouse_burger,Color.parseColor("#FFFF8383")); // Categories > Burger > Steakhouse Burger
    public static FoodCategory CAT_VEGAN_BURGER = new FoodCategory("Vegan Burger", R.drawable.vegan_burger,Color.parseColor("#FFFF8383")); // Categories > Burger > Vegan Burger
    //DÖNER
    public static FoodCategory CAT_DONER = new FoodCategory("Döner", R.drawable.ic_launcher_background,Color.parseColor("#BAF17A")); // Categories > Döner
    public static FoodCategory CAT_ET_DURUM = new FoodCategory("Et Dürüm", R.drawable.et_durum,Color.parseColor("#BAF17A")); // Categories > Döner > Et Dürüm
    public static FoodCategory CAT_PIDE_ET_DONER = new FoodCategory("Pide Et Döner", R.drawable.pide_et,Color.parseColor("#BAF17A")); // Categories > Döner > Pide Et Döner
    public static FoodCategory CAT_PIDE_TAVUK_DONER = new FoodCategory("Pide Tavuk Döner", R.drawable.pide_tavuk_doner,Color.parseColor("#BAF17A")); // Categories > Döner > Pide Tavuk Döner
    public static FoodCategory CAT_TAVUK_DURUM = new FoodCategory("Tavuk Dürüm", R.drawable.tavuk_durum,Color.parseColor("#BAF17A")); // Categories > Döner > Tavuk Dürüm
    public static FoodCategory CAT_YARIM_EKMEK_ET = new FoodCategory("Yarım Ekmek Et", R.drawable.yarim_ekmek_et_doner,Color.parseColor("#BAF17A")); // Categories > Döner > Yarım Ekmek Et
    public static FoodCategory CAT_YARIM_EKMEK_TAVUK = new FoodCategory("Yarım Ekmek Tavuk", R.drawable.yarim_ekmek_tavuk_doner,Color.parseColor("#BAF17A")); // Categories > Döner > Yarım Ekmek Tavuk
    //ÇİĞ KÖFTE
    public static FoodCategory CAT_CIG_KOFTE = new FoodCategory("Çiğ Köfte", R.drawable.ic_launcher_background,Color.parseColor("#FFC29FFF")); // Categories > Çiğ Köfte
    public static FoodCategory CAT_CIG_KOFTE_1KG = new FoodCategory("Çiğ Köfte 1kg", R.drawable.cig_kofte_1kg,Color.parseColor("#FFC29FFF")); // Categories > Çiğ Köfte > Çiğ Köfte 1kg
    public static FoodCategory CAT_CIG_KOFTE_500GR = new FoodCategory("Çiğ Köfte 500gr", R.drawable.cig_kofte_500gr,Color.parseColor("#FFC29FFF")); // Categories > Çiğ Köfte > Çiğ Köfte 500gr
    public static FoodCategory CAT_CIG_KOFTE_250GR = new FoodCategory("Çiğ Köfte 250gr", R.drawable.cig_kofte_250gr,Color.parseColor("#FFC29FFF")); // Categories > Çiğ Köfte > Çiğ Köfte 250gr
    public static FoodCategory CAT_CIG_KOFTE_DURUM = new FoodCategory("Çiğ Köfte Dürüm", R.drawable.cig_kofte_durum,Color.parseColor("#FFC29FFF")); // Categories > Çiğ Köfte > Çiğ Köfte Dürüm
    //PIZZA
    public static FoodCategory CAT_PIZZA = new FoodCategory("Pizza", R.drawable.ic_launcher_background,Color.parseColor("#FFECE076")); // Categories > Pizza
    public static FoodCategory CAT_ANANASLI_PIZZA = new FoodCategory("Ananaslı Pizza", R.drawable.ananasli_pizza,Color.parseColor("#FFECE076")); // Categories > Pizza > Ananaslı Pizza
    public static FoodCategory CAT_BBQ_TAVUK_PIZZA = new FoodCategory("BBQ Tavuk Pizza", R.drawable.bbq_tavuk_pizza,Color.parseColor("#FFECE076")); // Categories > Pizza > BBQ Tavuk Pizza
    public static FoodCategory CAT_KARISIK_PIZZA= new FoodCategory("Karışık Pizza", R.drawable.karisik_pizza,Color.parseColor("#FFECE076")); // Categories > Pizza > Karışık Pizza
    public static FoodCategory CAT_MANTARLI_PIZZA= new FoodCategory("Mantarlı Pizza", R.drawable.mantarli_pizza,Color.parseColor("#FFECE076")); // Categories > Pizza > Mantarlı Pizza
    public static FoodCategory CAT_MARGARITA_PIZZA= new FoodCategory("Margarita Pizza", R.drawable.margarita_pizza,Color.parseColor("#FFECE076")); // Categories > Pizza > Margarita Pizza
    public static FoodCategory CAT_SUCUKLU_PIZZA= new FoodCategory("Sucuklu Pizza", R.drawable.sucuklu_pizza,Color.parseColor("#FFECE076")); // Categories > Pizza > Sucuklu Pizza

    //*******************************************************************************************************************************************************************************
    //*******************************************************************************************************************************************************************************
    public static TreeNode<FoodCategory> NCAT_ROOT = TreeNode.CreateTree(CAT_ROOT);
    //LAHMACUN
    public static TreeNode<FoodCategory> NCAT_LAHMACUN = NCAT_ROOT.addChildNode(CAT_LAHMACUN);
    public static TreeNode<FoodCategory> NCAT_ACILI_LAHMACUN = NCAT_LAHMACUN.addChildNode(CAT_ACILI_LAHMACUN);
    public static TreeNode<FoodCategory> NCAT_BASPINAR_LAHMACUN = NCAT_LAHMACUN.addChildNode(CAT_BASPINAR_LAHMACUN);
    public static TreeNode<FoodCategory> NCAT_CEVIZLI_LAHMACUN = NCAT_LAHMACUN.addChildNode(CAT_CEVIZLI_LAHMACUN);
    public static TreeNode<FoodCategory> NCAT_FINDIK_LAHMACUN = NCAT_LAHMACUN.addChildNode(CAT_FINDIK_LAHMACUN);
    //PİDE
    public static TreeNode<FoodCategory> NCAT_PIDE = NCAT_ROOT.addChildNode(CAT_PIDE);
    public static TreeNode<FoodCategory> NCAT_KIYMALI_KASARLI_PIDE = NCAT_PIDE.addChildNode(CAT_KIYMALI_KASARLI_PIDE);
    public static TreeNode<FoodCategory> NCAT_KIYMALI_PIDE= NCAT_PIDE.addChildNode(CAT_KIYMALI_PIDE);
    public static TreeNode<FoodCategory> NCAT_KUSBASI_PIDE = NCAT_PIDE.addChildNode(CAT_KUSBASI_PIDE);
    public static TreeNode<FoodCategory> NCAT_KUSBASILI_KASARLI_PIDE = NCAT_PIDE.addChildNode(CAT_KUSBASILI_KASARLI_PIDE);
    public static TreeNode<FoodCategory> NCAT_MANTARLI_PIDE = NCAT_PIDE.addChildNode(CAT_MANTARLI_PIDE);
    public static TreeNode<FoodCategory> NCAT_SUCUKLU_PIDE = NCAT_PIDE.addChildNode(CAT_SUCUKLU_PIDE);
    //BURGER
    public static TreeNode<FoodCategory> NCAT_BURGER = NCAT_ROOT.addChildNode(CAT_BURGER);
    public static TreeNode<FoodCategory> NCAT_BALIK_BURGER = NCAT_BURGER.addChildNode(CAT_BALIK_BURGER);
    public static TreeNode<FoodCategory> NCAT_CHEESE_BURGER = NCAT_BURGER.addChildNode(CAT_CHEESE_BURGER);
    public static TreeNode<FoodCategory> NCAT_FUME_ET_BURGER = NCAT_BURGER.addChildNode(CAT_FUME_ET_BURGER);
    public static TreeNode<FoodCategory> NCAT_MANTAR_BURGER = NCAT_BURGER.addChildNode(CAT_MANTAR_BURGER);
    public static TreeNode<FoodCategory> NCAT_STEAKHOUSE_BURGER = NCAT_BURGER.addChildNode(CAT_STEAKHOUSE_BURGER);
    public static TreeNode<FoodCategory> NCAT_VEGAN_BURGER = NCAT_BURGER.addChildNode(CAT_VEGAN_BURGER);
    //DONER
    public static TreeNode<FoodCategory> NCAT_DONER = NCAT_ROOT.addChildNode(CAT_DONER);
    public static TreeNode<FoodCategory> NCAT_ET_DURUM = NCAT_DONER.addChildNode(CAT_ET_DURUM);
    public static TreeNode<FoodCategory> NCAT_PIDE_ET_DONER = NCAT_DONER.addChildNode(CAT_PIDE_ET_DONER);
    public static TreeNode<FoodCategory> NCAT_PIDE_TAVUK_DONER = NCAT_DONER.addChildNode(CAT_PIDE_TAVUK_DONER);
    public static TreeNode<FoodCategory> NCAT_TAVUK_DURUM = NCAT_DONER.addChildNode(CAT_TAVUK_DURUM);
    public static TreeNode<FoodCategory> NCAT_YARIM_EKMEK_ET = NCAT_DONER.addChildNode(CAT_YARIM_EKMEK_ET);
    public static TreeNode<FoodCategory> NCAT_YARIM_EKMEK_TAVUK = NCAT_DONER.addChildNode(CAT_YARIM_EKMEK_TAVUK);
    //ÇİĞ KÖFTE
    public static TreeNode<FoodCategory> NCAT_CIG_KOFTE = NCAT_ROOT.addChildNode(CAT_CIG_KOFTE);
    public static TreeNode<FoodCategory> NCAT_CIG_KOFTE_1KG = NCAT_CIG_KOFTE.addChildNode(CAT_CIG_KOFTE_1KG);
    public static TreeNode<FoodCategory> NCAT_CIG_KOFTE_500GR = NCAT_CIG_KOFTE.addChildNode(CAT_CIG_KOFTE_500GR);
    public static TreeNode<FoodCategory> NCAT_CIG_KOFTE_250GR = NCAT_CIG_KOFTE.addChildNode(CAT_CIG_KOFTE_250GR);
    public static TreeNode<FoodCategory> NCAT_CIG_KOFTE_DURUM = NCAT_CIG_KOFTE.addChildNode(CAT_CIG_KOFTE_DURUM);
    //PIZZA
    public static TreeNode<FoodCategory> NCAT_PIZZA = NCAT_ROOT.addChildNode(CAT_PIZZA);
    public static TreeNode<FoodCategory> NCAT_ANANASLI_PIZZA = NCAT_PIZZA.addChildNode(CAT_ANANASLI_PIZZA);
    public static TreeNode<FoodCategory> NCAT_BBQ_TAVUK_PIZZA = NCAT_PIZZA.addChildNode(CAT_BBQ_TAVUK_PIZZA);
    public static TreeNode<FoodCategory> NCAT_KARISIK_PIZZA = NCAT_PIZZA.addChildNode(CAT_KARISIK_PIZZA);
    public static TreeNode<FoodCategory> NCAT_MANTARLI_PIZZA = NCAT_PIZZA.addChildNode(CAT_MANTARLI_PIZZA);
    public static TreeNode<FoodCategory> NCAT_MARGARITA_PIZZA = NCAT_PIZZA.addChildNode(CAT_MARGARITA_PIZZA);
    public static TreeNode<FoodCategory> NCAT_SUCUKLU_PIZZA = NCAT_PIZZA.addChildNode(CAT_SUCUKLU_PIZZA);

    //*******************************************************************************************************************************************************************************

    // Foods
    public static FoodInfo NECO_AL = new FoodInfo("Acılı Lahmacun", NCAT_ACILI_LAHMACUN, 12,"food");
    public static FoodInfo NECO_BL = new FoodInfo("Başpınar Lahmacun", NCAT_BASPINAR_LAHMACUN, 20,"food");
    public static FoodInfo NECO_CL = new FoodInfo("Cevizli Lahmacun", NCAT_CEVIZLI_LAHMACUN, 15,"food");
    public static FoodInfo NECO_FL = new FoodInfo("Fındık Lahmacun", NCAT_FINDIK_LAHMACUN, 10,"food");
    public static FoodInfo NECO_COLA = new FoodInfo("Coca-Cola", NCAT_ROOT, 5,"drink");
    public static FoodInfo NECO_COLA_L = new FoodInfo("Coca-Cola Light", NCAT_ROOT, 5,"drink");
    public static FoodInfo NECO_COLA_Z = new FoodInfo("Coca-Cola Zero", NCAT_ROOT, 5,"drink");
    public static FoodInfo NECO_FANTA = new FoodInfo("Fanta", NCAT_ROOT, 5,"drink");
    public static FoodInfo NECO_SPRITE = new FoodInfo("Sprite", NCAT_ROOT, 5,"drink");
    public static FoodInfo NECO_AYRAN = new FoodInfo("Kapalı Ayran", NCAT_ROOT, 4,"drink");
    public static FoodInfo NECO_SODA = new FoodInfo("Soda", NCAT_ROOT, 2,"drink");
    public static FoodInfo NECO_SALGAM = new FoodInfo("Şalgam", NCAT_ROOT, 4,"drink");

    public static FoodInfo CEVRE_BL = new FoodInfo("Başpınar Lahmacun", NCAT_BASPINAR_LAHMACUN, 14,"food");
    public static FoodInfo CEVRE_CL = new FoodInfo("Cevizli Lahmacun", NCAT_CEVIZLI_LAHMACUN, 12,"food");
    public static FoodInfo CEVRE_FL = new FoodInfo("Fındık Lahmacun", NCAT_FINDIK_LAHMACUN, 8,"food");

    public static FoodInfo SARAY_AL = new FoodInfo("Acılı Lahmacun", NCAT_ACILI_LAHMACUN, 18,"food");
    public static FoodInfo SARAY_BL = new FoodInfo("Başpınar Lahmacun", NCAT_BASPINAR_LAHMACUN, 25,"food");
    public static FoodInfo SARAY_CL = new FoodInfo("Cevizli Lahmacun", NCAT_CEVIZLI_LAHMACUN, 20,"food");

    public static FoodInfo ANTEPLIM_AL = new FoodInfo("Acılı Lahmacun", NCAT_ACILI_LAHMACUN, 12,"food");
    public static FoodInfo ANTEPLIM_BL = new FoodInfo("Başpınar Lahmacun", NCAT_BASPINAR_LAHMACUN, 12,"food");
    public static FoodInfo ANTEPLIM_CL = new FoodInfo("Cevizli Lahmacun", NCAT_CEVIZLI_LAHMACUN, 12,"food");
    public static FoodInfo ANTEPLIM_FL = new FoodInfo("Fındık Lahmacun", NCAT_FINDIK_LAHMACUN, 6,"food");

    public static FoodInfo USTA_BL = new FoodInfo("Başpınar Lahmacun", NCAT_BASPINAR_LAHMACUN, 10,"food");
    public static FoodInfo USTA_CL = new FoodInfo("Cevizli Lahmacun", NCAT_CEVIZLI_LAHMACUN, 10,"food");
    public static FoodInfo USTA_FL = new FoodInfo("Fındık Lahmacun", NCAT_FINDIK_LAHMACUN, 5,"food");

    public static FoodInfo DEDE_PIDE_KIYKP = new FoodInfo("Kıymalı Kaşarlı Pide", NCAT_KIYMALI_KASARLI_PIDE, 18,"food");
    public static FoodInfo DEDE_PIDE_KIYP = new FoodInfo("Kıymalı Pide", NCAT_KIYMALI_PIDE, 15,"food");
    public static FoodInfo DEDE_PIDE_KUSKP = new FoodInfo("Kuşbaşı Kaşarlı Pide", NCAT_KUSBASILI_KASARLI_PIDE, 20,"food");
    public static FoodInfo DEDE_PIDE_KUSP = new FoodInfo("Kuşbaşı Pide", NCAT_KUSBASI_PIDE, 18,"food");

    public static FoodInfo DOYDOY_PIDE_KIYKP = new FoodInfo("Kıymalı Kaşarlı Pide", NCAT_KIYMALI_KASARLI_PIDE, 20,"food");
    public static FoodInfo DOYDOY_PIDE_KIYP = new FoodInfo("Kıymalı Pide", NCAT_KIYMALI_PIDE, 18,"food");
    public static FoodInfo DOYDOY_PIDE_KUSKP = new FoodInfo("Kuşbaşı Kaşarlı Pide", NCAT_KUSBASILI_KASARLI_PIDE, 22,"food");
    public static FoodInfo DOYDOY_PIDE_KUSP = new FoodInfo("Kuşbaşı Pide", NCAT_KUSBASI_PIDE, 20,"food");
    public static FoodInfo DOYDOY_PIDE_SP = new FoodInfo("Sucuklu Pide", NCAT_SUCUKLU_PIDE, 18,"food");
    public static FoodInfo DOYDOY_PIDE_MP = new FoodInfo("Mantarlı Pide", NCAT_MANTARLI_PIDE, 18,"food");

    public static FoodInfo PIDEMM_PIDE_KIYKP = new FoodInfo("Kıymalı Kaşarlı Pide", NCAT_KIYMALI_KASARLI_PIDE, 20,"food");
    public static FoodInfo PIDEMM_PIDE_KIYP = new FoodInfo("Kıymalı Pide", NCAT_KIYMALI_PIDE, 18,"food");
    public static FoodInfo PIDEMM_PIDE_KUSKP = new FoodInfo("Kuşbaşı Kaşarlı Pide", NCAT_KUSBASILI_KASARLI_PIDE, 22,"food");
    public static FoodInfo PIDEMM_PIDE_KUSP = new FoodInfo("Kuşbaşı Pide", NCAT_KUSBASI_PIDE, 20,"food");
    public static FoodInfo PIDEMM_PIDE_SP = new FoodInfo("Sucuklu Pide", NCAT_SUCUKLU_PIDE, 18,"food");
    public static FoodInfo PIDEMM_PIDE_MP = new FoodInfo("Mantarlı Pide", NCAT_MANTARLI_PIDE, 18,"food");

    public static FoodInfo BISES_PIDE_KIYKP = new FoodInfo("Kıymalı Kaşarlı Pide", NCAT_KIYMALI_KASARLI_PIDE, 20,"food");
    public static FoodInfo BISES_PIDE_KIYP = new FoodInfo("Kıymalı Pide", NCAT_KIYMALI_PIDE, 18,"food");
    public static FoodInfo BISES_PIDE_KUSKP = new FoodInfo("Kuşbaşı Kaşarlı Pide", NCAT_KUSBASILI_KASARLI_PIDE, 22,"food");
    public static FoodInfo BISES_PIDE_KUSP = new FoodInfo("Kuşbaşı Pide", NCAT_KUSBASI_PIDE, 20,"food");
    public static FoodInfo BISES_PIDE_SP = new FoodInfo("Sucuklu Pide", NCAT_SUCUKLU_PIDE, 18,"food");

    public static FoodInfo KOCA_PIDE_KIYKP = new FoodInfo("Kıymalı Kaşarlı Pide", NCAT_KIYMALI_KASARLI_PIDE, 12,"food");
    public static FoodInfo KOCA_PIDE_KIYP = new FoodInfo("Kıymalı Pide", NCAT_KIYMALI_PIDE, 10,"food");
    public static FoodInfo KOCA_PIDE_KUSKP = new FoodInfo("Kuşbaşı Kaşarlı Pide", NCAT_KUSBASILI_KASARLI_PIDE, 12,"food");
    public static FoodInfo KOCA_PIDE_KUSP = new FoodInfo("Kuşbaşı Pide", NCAT_KUSBASI_PIDE, 10,"food");

    public static FoodInfo BLACK_BURGER_CB = new FoodInfo("Cheese Burger", NCAT_CHEESE_BURGER, 10,"food");
    public static FoodInfo BLACK_BURGER_FEB = new FoodInfo("Füme Et Burger", NCAT_FUME_ET_BURGER, 20,"food");
    public static FoodInfo BLACK_BURGER_SB = new FoodInfo("Steakhouse Burger", NCAT_STEAKHOUSE_BURGER, 25,"food");

    public static FoodInfo BULL_BURGER_CB = new FoodInfo("Cheese Burger", NCAT_CHEESE_BURGER, 12,"food");
    public static FoodInfo BULL_BURGER_FEB = new FoodInfo("Füme Et Burger", NCAT_FUME_ET_BURGER, 30,"food");
    public static FoodInfo BULL_BURGER_SB = new FoodInfo("Steakhouse Burger", NCAT_STEAKHOUSE_BURGER, 35,"food");
    public static FoodInfo BULL_BURGER_MB = new FoodInfo("Mantarlı Burger", NCAT_MANTAR_BURGER, 25,"food");

    public static FoodInfo GURME_BURGER_CB = new FoodInfo("Cheese Burger", NCAT_CHEESE_BURGER, 10,"food");
    public static FoodInfo GURME_BURGER_FEB = new FoodInfo("Füme Et Burger", NCAT_FUME_ET_BURGER, 25,"food");
    public static FoodInfo GURME_BURGER_SB = new FoodInfo("Steakhouse Burger", NCAT_STEAKHOUSE_BURGER, 25,"food");
    public static FoodInfo GURME_BURGER_MB = new FoodInfo("Mantarlı Burger", NCAT_MANTAR_BURGER, 20,"food");
    public static FoodInfo GURME_BURGER_BB = new FoodInfo("Balık Burger", NCAT_BALIK_BURGER, 18,"food");

    public static FoodInfo YESIM_BURGER_CB = new FoodInfo("Cheese Burger", NCAT_CHEESE_BURGER, 15,"food");
    public static FoodInfo YESIM_BURGER_FEB = new FoodInfo("Füme Et Burger", NCAT_FUME_ET_BURGER, 40,"food");
    public static FoodInfo YESIM_BURGER_SB = new FoodInfo("Steakhouse Burger", NCAT_STEAKHOUSE_BURGER, 40,"food");
    public static FoodInfo YESIM_BURGER_MB = new FoodInfo("Mantarlı Burger", NCAT_MANTAR_BURGER, 15,"food");
    public static FoodInfo YESIM_BURGER_VB = new FoodInfo("Vegan Burger", NCAT_VEGAN_BURGER, 15,"food");

    public static FoodInfo GUZEL_BURGER_CB = new FoodInfo("Cheese Burger", NCAT_CHEESE_BURGER, 8,"food");
    public static FoodInfo GUZEL_BURGER_FEB = new FoodInfo("Füme Et Burger", NCAT_FUME_ET_BURGER, 30,"food");
    public static FoodInfo GUZEL_BURGER_SB = new FoodInfo("Steakhouse Burger", NCAT_STEAKHOUSE_BURGER, 30,"food");
    public static FoodInfo GUZEL_BURGER_MB = new FoodInfo("Mantarlı Burger", NCAT_MANTAR_BURGER, 10,"food");
    public static FoodInfo GUZEL_BURGER_VB = new FoodInfo("Vegan Burger", NCAT_VEGAN_BURGER, 12,"food");
    public static FoodInfo GUZEL_BURGER_BB = new FoodInfo("Balık Burger", NCAT_BALIK_BURGER, 15,"food");

    public static FoodInfo HATAY_DONER_EDD = new FoodInfo("Et Dürüm Döner", NCAT_ET_DURUM, 20,"food");
    public static FoodInfo HATAY_DONER_PED = new FoodInfo("Pide Et Döner", NCAT_PIDE_ET_DONER, 20,"food");
    public static FoodInfo HATAY_DONER_YEED = new FoodInfo("Yarım Ekmek Et Döner", NCAT_YARIM_EKMEK_ET, 20,"food");
    public static FoodInfo HATAY_DONER_TDD = new FoodInfo("Tavuk Dürüm Döner", NCAT_TAVUK_DURUM, 12,"food");
    public static FoodInfo HATAY_DONER_PTD = new FoodInfo("Pide Tavuk Döner", NCAT_PIDE_TAVUK_DONER, 12,"food");
    public static FoodInfo HATAY_DONER_YETD = new FoodInfo("Yarım Ekmek Tavuk Döner", NCAT_YARIM_EKMEK_TAVUK, 12,"food");

    public static FoodInfo CANIM_DONER_EDD = new FoodInfo("Et Dürüm Döner", NCAT_ET_DURUM, 15,"food");
    public static FoodInfo CANIM_DONER_PED = new FoodInfo("Pide Et Döner", NCAT_PIDE_ET_DONER, 12,"food");
    public static FoodInfo CANIM_DONER_YEED = new FoodInfo("Yarım Ekmek Et Döner", NCAT_YARIM_EKMEK_ET, 18,"food");
    public static FoodInfo CANIM_DONER_TDD = new FoodInfo("Tavuk Dürüm Döner", NCAT_TAVUK_DURUM, 10,"food");
    public static FoodInfo CANIM_DONER_PTD = new FoodInfo("Pide Tavuk Döner", NCAT_PIDE_TAVUK_DONER, 8,"food");
    public static FoodInfo CANIM_DONER_YETD = new FoodInfo("Yarım Ekmek Tavuk Döner", NCAT_YARIM_EKMEK_TAVUK, 12,"food");

    public static FoodInfo HARBI_DONER_EDD = new FoodInfo("Et Dürüm Döner", NCAT_ET_DURUM, 22,"food");
    public static FoodInfo HARBI_DONER_PED = new FoodInfo("Pide Et Döner", NCAT_PIDE_ET_DONER, 22,"food");
    public static FoodInfo HARBI_DONER_YEED = new FoodInfo("Yarım Ekmek Et Döner", NCAT_YARIM_EKMEK_ET, 22,"food");
    public static FoodInfo HARBI_DONER_TDD = new FoodInfo("Tavuk Dürüm Döner", NCAT_TAVUK_DURUM, 12,"food");
    public static FoodInfo HARBI_DONER_PTD = new FoodInfo("Pide Tavuk Döner", NCAT_PIDE_TAVUK_DONER, 12,"food");
    public static FoodInfo HARBI_DONER_YETD = new FoodInfo("Yarım Ekmek Tavuk Döner", NCAT_YARIM_EKMEK_TAVUK, 12,"food");

    public static FoodInfo LEZIZ_DONER_EDD = new FoodInfo("Et Dürüm Döner", NCAT_ET_DURUM, 10,"food");
    public static FoodInfo LEZIZ_DONER_PED = new FoodInfo("Pide Et Döner", NCAT_PIDE_ET_DONER, 10,"food");
    public static FoodInfo LEZIZ_DONER_YEED = new FoodInfo("Yarım Ekmek Et Döner", NCAT_YARIM_EKMEK_ET, 10,"food");
    public static FoodInfo LEZIZ_DONER_TDD = new FoodInfo("Tavuk Dürüm Döner", NCAT_TAVUK_DURUM, 5,"food");
    public static FoodInfo LEZIZ_DONER_PTD = new FoodInfo("Pide Tavuk Döner", NCAT_PIDE_TAVUK_DONER, 5,"food");
    public static FoodInfo LEZIZ_DONER_YETD = new FoodInfo("Yarım Ekmek Tavuk Döner", NCAT_YARIM_EKMEK_TAVUK, 5,"food");

    public static FoodInfo YANAR_DONER_EDD = new FoodInfo("Et Dürüm Döner", NCAT_ET_DURUM, 10,"food");
    public static FoodInfo YANAR_DONER_PED = new FoodInfo("Pide Et Döner", NCAT_PIDE_ET_DONER, 12,"food");
    public static FoodInfo YANAR_DONER_YEED = new FoodInfo("Yarım Ekmek Et Döner", NCAT_YARIM_EKMEK_ET, 14,"food");
    public static FoodInfo YANAR_DONER_TDD = new FoodInfo("Tavuk Dürüm Döner", NCAT_TAVUK_DURUM, 5,"food");
    public static FoodInfo YANAR_DONER_PTD = new FoodInfo("Pide Tavuk Döner", NCAT_PIDE_TAVUK_DONER, 7,"food");
    public static FoodInfo YANAR_DONER_YETD = new FoodInfo("Yarım Ekmek Tavuk Döner", NCAT_YARIM_EKMEK_TAVUK, 9,"food");

    public static FoodInfo LEZZET_CIGKOFTE_CD = new FoodInfo("Çiğköfte Dürüm", NCAT_CIG_KOFTE_DURUM, 5,"food");
    public static FoodInfo LEZZET_CIGKOFTE_C250 = new FoodInfo("Çiğköfte 250gr", NCAT_CIG_KOFTE_250GR, 10,"food");
    public static FoodInfo LEZZET_CIGKOFTE_C500 = new FoodInfo("Çiğköfte 500gr", NCAT_CIG_KOFTE_500GR, 20,"food");
    public static FoodInfo LEZZET_CIGKOFTE_C1 = new FoodInfo("Çiğköfte 1kg", NCAT_CIG_KOFTE_1KG, 40,"food");

    public static FoodInfo ADIYAMAN_CIGKOFTE_CD = new FoodInfo("Çiğköfte Dürüm", NCAT_CIG_KOFTE_DURUM, 5,"food");
    public static FoodInfo ADIYAMAN_CIGKOFTE_C250 = new FoodInfo("Çiğköfte 250gr", NCAT_CIG_KOFTE_250GR, 10,"food");
    public static FoodInfo ADIYAMAN_CIGKOFTE_C500 = new FoodInfo("Çiğköfte 500gr", NCAT_CIG_KOFTE_500GR, 18,"food");
    public static FoodInfo ADIYAMAN_CIGKOFTE_C1 = new FoodInfo("Çiğköfte 1kg", NCAT_CIG_KOFTE_1KG, 30,"food");

    public static FoodInfo SESO_CIGKOFTE_CD = new FoodInfo("Çiğköfte Dürüm", NCAT_CIG_KOFTE_DURUM, 8,"food");
    public static FoodInfo SESO_CIGKOFTE_C250 = new FoodInfo("Çiğköfte 250gr", NCAT_CIG_KOFTE_250GR, 15,"food");
    public static FoodInfo SESO_CIGKOFTE_C500 = new FoodInfo("Çiğköfte 500gr", NCAT_CIG_KOFTE_500GR, 20,"food");
    public static FoodInfo SESO_CIGKOFTE_C1 = new FoodInfo("Çiğköfte 1kg", NCAT_CIG_KOFTE_1KG, 25,"food");

    public static FoodInfo COKCOK_CIGKOFTE_CD = new FoodInfo("Çiğköfte Dürüm", NCAT_CIG_KOFTE_DURUM, 12,"food");
    public static FoodInfo COKCOK_CIGKOFTE_C250 = new FoodInfo("Çiğköfte 250gr", NCAT_CIG_KOFTE_250GR, 30,"food");
    public static FoodInfo COKCOK_CIGKOFTE_C500 = new FoodInfo("Çiğköfte 500gr", NCAT_CIG_KOFTE_500GR, 50,"food");
    public static FoodInfo COKCOK_CIGKOFTE_C1 = new FoodInfo("Çiğköfte 1kg", NCAT_CIG_KOFTE_1KG, 70,"food");

    public static FoodInfo ADKO_CIGKOFTE_CD = new FoodInfo("Çiğköfte Dürüm", NCAT_CIG_KOFTE_DURUM, 5,"food");
    public static FoodInfo ADKO_CIGKOFTE_C250 = new FoodInfo("Çiğköfte 250gr", NCAT_CIG_KOFTE_250GR, 30,"food");
    public static FoodInfo ADKO_CIGKOFTE_C500 = new FoodInfo("Çiğköfte 500gr", NCAT_CIG_KOFTE_500GR, 50,"food");
    public static FoodInfo ADKO_CIGKOFTE_C1 = new FoodInfo("Çiğköfte 1kg", NCAT_CIG_KOFTE_1KG, 70,"food");

    public static FoodInfo GURMEM_PIZZA_BBQTP = new FoodInfo("BBQ Tavuk Pizza", NCAT_BBQ_TAVUK_PIZZA, 25,"food");
    public static FoodInfo GURMEM_PIZZA_AP= new FoodInfo("Ananaslı Pizza", NCAT_ANANASLI_PIZZA, 25,"food");
    public static FoodInfo GURMEM_PIZZA_KP = new FoodInfo("Karışık Pizza", NCAT_KARISIK_PIZZA, 30,"food");
    public static FoodInfo GURMEM_PIZZA_MANP = new FoodInfo("Mantarlı Pizza", NCAT_MANTARLI_PIZZA, 25,"food");
    public static FoodInfo GURMEM_PIZZA_MARP = new FoodInfo("Margarita Pizza", NCAT_MARGARITA_PIZZA, 25,"food");
    public static FoodInfo GURMEM_PIZZA_SP = new FoodInfo("Sucuklu Pizza", NCAT_SUCUKLU_PIZZA, 25,"food");

    public static FoodInfo ARTISAN_PIZZA_BBQTP = new FoodInfo("BBQ Tavuk Pizza", NCAT_BBQ_TAVUK_PIZZA, 30,"food");
    public static FoodInfo ARTISAN_PIZZA_AP= new FoodInfo("Ananaslı Pizza", NCAT_ANANASLI_PIZZA, 30,"food");
    public static FoodInfo ARTISAN_PIZZA_KP = new FoodInfo("Karışık Pizza", NCAT_KARISIK_PIZZA, 35,"food");
    public static FoodInfo ARTISAN_PIZZA_MANP = new FoodInfo("Mantarlı Pizza", NCAT_MANTARLI_PIZZA, 30,"food");
    public static FoodInfo ARTISAN_PIZZA_MARP = new FoodInfo("Margarita Pizza", NCAT_MARGARITA_PIZZA, 30,"food");
    public static FoodInfo ARTISAN_PIZZA_SP = new FoodInfo("Sucuklu Pizza", NCAT_SUCUKLU_PIZZA, 35,"food");

    public static FoodInfo ITALIANO_PIZZA_BBQTP = new FoodInfo("BBQ Tavuk Pizza", NCAT_BBQ_TAVUK_PIZZA, 50,"food");
    public static FoodInfo ITALIANO_PIZZA_KP = new FoodInfo("Karışık Pizza", NCAT_KARISIK_PIZZA, 50,"food");
    public static FoodInfo ITALIANO_PIZZA_MARP = new FoodInfo("Margarita Pizza", NCAT_MARGARITA_PIZZA, 50,"food");
    public static FoodInfo ITALIANO_PIZZA_SP = new FoodInfo("Sucuklu Pizza", NCAT_SUCUKLU_PIZZA, 50,"food");

    public static FoodInfo IYIDIR_PIZZA_BBQTP = new FoodInfo("BBQ Tavuk Pizza", NCAT_BBQ_TAVUK_PIZZA, 25,"food");
    public static FoodInfo IYIDIR_PIZZA_KP = new FoodInfo("Karışık Pizza", NCAT_KARISIK_PIZZA, 25,"food");
    public static FoodInfo IYIDIR_PIZZA_MARP = new FoodInfo("Margarita Pizza", NCAT_MARGARITA_PIZZA, 25,"food");
    public static FoodInfo IYIDIR_PIZZA_SP = new FoodInfo("Sucuklu Pizza", NCAT_SUCUKLU_PIZZA, 25,"food");

    public static FoodInfo DILIM_PIZZA_BBQTP = new FoodInfo("BBQ Tavuk Pizza", NCAT_BBQ_TAVUK_PIZZA, 15,"food");
    public static FoodInfo DILIM_PIZZA_KP = new FoodInfo("Karışık Pizza", NCAT_KARISIK_PIZZA, 20,"food");
    public static FoodInfo DILIM_PIZZA_MANP = new FoodInfo("Mantarlı Pizza", NCAT_MANTARLI_PIZZA, 15,"food");
    public static FoodInfo DILIM_PIZZA_MARP = new FoodInfo("Margarita Pizza", NCAT_MARGARITA_PIZZA, 10,"food");
    public static FoodInfo DILIM_PIZZA_SP = new FoodInfo("Sucuklu Pizza", NCAT_SUCUKLU_PIZZA, 20,"food");

    // Restaurants
    public static LinkedListNode<RestaurantInfo> RESTAURANTS_ROOT;
    // Basket
    public static LinkedListNode<FoodInfo> BASKET_ROOT;

    public static void LoadData(){
        //LoadFoodCategories();
        LoadRestaurants();
    }
    private static void LoadRestaurants(){

        // Neco Lahmacun
        FoodInfo[] necoLahmacunMenu = {NECO_AL,NECO_BL,NECO_CL,NECO_FL,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_AYRAN,NECO_SODA,NECO_SALGAM};
        RestaurantInfo necoLahmacun = new RestaurantInfo("Neco Lahmacun", createMenu(necoLahmacunMenu));

        // Çevre Lahmacun
        FoodInfo[] cevreLahmacunMenu = {CEVRE_BL,CEVRE_CL,CEVRE_FL,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_AYRAN,NECO_SODA,NECO_SALGAM};
        RestaurantInfo cevreLahmacun = new RestaurantInfo("Çevre Lahmacun", createMenu(cevreLahmacunMenu));

        // Saray Lahmacun
        FoodInfo[] sarayLahmacunMenu = {SARAY_AL,SARAY_BL,SARAY_CL,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_AYRAN,NECO_SODA,NECO_SALGAM};
        RestaurantInfo sarayLahmacun = new RestaurantInfo("Saray Lahmacun", createMenu(sarayLahmacunMenu));

        // Anteplim Lahmacun
        FoodInfo[] anteplimLahmacunMenu = {ANTEPLIM_AL,ANTEPLIM_BL,ANTEPLIM_CL,ANTEPLIM_FL,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_AYRAN,NECO_SODA,NECO_SALGAM};
        RestaurantInfo anteplimLahmacun = new RestaurantInfo("Anteplim Lahmacun", createMenu(anteplimLahmacunMenu));

        // Usta Lahmacun
        FoodInfo[] ustaLahmacunMenu = {USTA_BL,USTA_CL,USTA_FL,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_AYRAN,NECO_SODA,NECO_SALGAM};
        RestaurantInfo ustaLahmacun = new RestaurantInfo("Usta Lahmacun", createMenu(ustaLahmacunMenu));

        // Dede Pide
        FoodInfo[] dedePideMenu = {DEDE_PIDE_KIYKP,DEDE_PIDE_KIYP,DEDE_PIDE_KUSKP,DEDE_PIDE_KUSP,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_AYRAN,NECO_SODA,NECO_SALGAM};
        RestaurantInfo dedePide = new RestaurantInfo("Dede Pide",  createMenu(dedePideMenu));

        // Doydoy Pide
        FoodInfo[] doydoyPideMenu = {DOYDOY_PIDE_KIYKP,DOYDOY_PIDE_KIYP,DOYDOY_PIDE_KUSKP,DOYDOY_PIDE_KUSP,DOYDOY_PIDE_SP,DOYDOY_PIDE_MP,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_AYRAN,NECO_SODA};
        RestaurantInfo doydoyPide = new RestaurantInfo("Doydoy Pide", createMenu(doydoyPideMenu));

        // Pidemm Pide
        FoodInfo[] pidemmPideMenu = {PIDEMM_PIDE_KIYKP,PIDEMM_PIDE_KIYP,PIDEMM_PIDE_KUSKP,PIDEMM_PIDE_KUSP,PIDEMM_PIDE_SP,PIDEMM_PIDE_MP,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_AYRAN,NECO_SODA};
        RestaurantInfo pidemmPide = new RestaurantInfo("Pidemm Pide", createMenu(pidemmPideMenu));

        // Bises Pide
        FoodInfo[] bisesPideMenu = {BISES_PIDE_KIYKP,BISES_PIDE_KIYP,BISES_PIDE_KUSKP,BISES_PIDE_KUSP,BISES_PIDE_SP,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_AYRAN,NECO_SODA};
        RestaurantInfo bisesPide = new RestaurantInfo("Bises Pide", createMenu(bisesPideMenu));

        // Koca Pide
        FoodInfo[] kocaPideMenu = {KOCA_PIDE_KIYKP,KOCA_PIDE_KIYP,KOCA_PIDE_KUSKP,KOCA_PIDE_KUSP,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_AYRAN,NECO_SODA};
        RestaurantInfo kocaPide = new RestaurantInfo("Koca Pide", createMenu(kocaPideMenu));

        // Black Burger
        FoodInfo[] blackBurgerMenu = {BLACK_BURGER_CB,BLACK_BURGER_FEB,BLACK_BURGER_SB,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE};
        RestaurantInfo blackBurger = new RestaurantInfo("Black Burger", createMenu(blackBurgerMenu));

        // Bull Burger
        FoodInfo[] bullBurgerMenu = {BULL_BURGER_CB,BULL_BURGER_FEB,BULL_BURGER_MB,BULL_BURGER_SB,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE};
        RestaurantInfo bullBurger = new RestaurantInfo("Bull Burger", createMenu(bullBurgerMenu));

        // Gurme Burger
        FoodInfo[] gurmeBurgerMenu = {GURME_BURGER_CB,GURME_BURGER_FEB,GURME_BURGER_MB,GURME_BURGER_SB,GURME_BURGER_BB,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE};
        RestaurantInfo gurmeBurger = new RestaurantInfo("Gurme Burger", createMenu(gurmeBurgerMenu));

        // Yeşim Burger
        FoodInfo[] yesimBurgerMenu = {YESIM_BURGER_CB,YESIM_BURGER_FEB,YESIM_BURGER_MB,YESIM_BURGER_SB,YESIM_BURGER_VB,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE};
        RestaurantInfo yesimBurger = new RestaurantInfo("Yeşim Burger", createMenu(yesimBurgerMenu));

        // Güzel Burger
        FoodInfo[] guzelBurgerMenu = {GUZEL_BURGER_CB,GUZEL_BURGER_FEB,GUZEL_BURGER_MB,GUZEL_BURGER_SB,GUZEL_BURGER_BB,GUZEL_BURGER_VB,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE};
        RestaurantInfo guzelBurger = new RestaurantInfo("Güzel Burger", createMenu(guzelBurgerMenu));

        // Hatay Döner
        FoodInfo[] hatayDonerMenu = {HATAY_DONER_EDD,HATAY_DONER_PED,HATAY_DONER_PTD,HATAY_DONER_TDD,HATAY_DONER_YEED,HATAY_DONER_YETD,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_SODA};
        RestaurantInfo hatayDoner = new RestaurantInfo("Hatay Döner", createMenu(hatayDonerMenu));

        // Canım Döner
        FoodInfo[] canımDonerMenu = {CANIM_DONER_EDD,CANIM_DONER_PED,CANIM_DONER_PTD,CANIM_DONER_TDD,CANIM_DONER_YEED,CANIM_DONER_YETD,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_SODA};
        RestaurantInfo canımDoner = new RestaurantInfo("Canım Döner", createMenu(canımDonerMenu));

        // Harbi Döner
        FoodInfo[] harbiDonerMenu = {HARBI_DONER_EDD,HARBI_DONER_PED,HARBI_DONER_PTD,HARBI_DONER_TDD,HARBI_DONER_YEED,HARBI_DONER_YETD,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_SODA};
        RestaurantInfo harbiDoner = new RestaurantInfo("Harbi Döner", createMenu(harbiDonerMenu));

        // Leziz Döner
        FoodInfo[] lezizDonerMenu = {LEZIZ_DONER_EDD,LEZIZ_DONER_PED,LEZIZ_DONER_PTD,LEZIZ_DONER_TDD,LEZIZ_DONER_YEED,LEZIZ_DONER_YETD,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_SODA};
        RestaurantInfo lezizDoner = new RestaurantInfo("Leziz Döner", createMenu(lezizDonerMenu));

        // Yanar Döner
        FoodInfo[] yanarDonerMenu = {YANAR_DONER_EDD,YANAR_DONER_PED,YANAR_DONER_PTD,YANAR_DONER_TDD,YANAR_DONER_YEED,YANAR_DONER_YETD,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_SODA};
        RestaurantInfo yanarDoner = new RestaurantInfo("Yanar Döner", createMenu(yanarDonerMenu));

        // Lezzet Çiğköfte
        FoodInfo[] lezzetCigkofteMenu = {LEZZET_CIGKOFTE_CD,LEZZET_CIGKOFTE_C250,LEZZET_CIGKOFTE_C500,LEZZET_CIGKOFTE_C1,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_AYRAN,NECO_SODA,NECO_SALGAM};
        RestaurantInfo lezzetCigkofte = new RestaurantInfo("Lezzet Çiğköfte", createMenu(lezzetCigkofteMenu));

        // Adıyaman Çiğköfte
        FoodInfo[] adiyamanCigkofteMenu = {ADIYAMAN_CIGKOFTE_CD,ADIYAMAN_CIGKOFTE_C250,ADIYAMAN_CIGKOFTE_C500,ADIYAMAN_CIGKOFTE_C1,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_AYRAN,NECO_SODA,NECO_SALGAM};
        RestaurantInfo adiyamanCigkofte = new RestaurantInfo("Adıyaman Çiğköfte", createMenu(adiyamanCigkofteMenu));

        // SeSo Çiğköfte
        FoodInfo[] sesoCigkofteMenu = {SESO_CIGKOFTE_CD,SESO_CIGKOFTE_C250,SESO_CIGKOFTE_C500,SESO_CIGKOFTE_C1,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_AYRAN,NECO_SODA,NECO_SALGAM};
        RestaurantInfo sesoCigkofte = new RestaurantInfo("SeSo Çiğköfte", createMenu(sesoCigkofteMenu));

        // ÇokÇok Çiğköfte
        FoodInfo[] cokcokCigkofteMenu = {COKCOK_CIGKOFTE_CD,COKCOK_CIGKOFTE_C250,COKCOK_CIGKOFTE_C500,COKCOK_CIGKOFTE_C1,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_AYRAN,NECO_SODA,NECO_SALGAM};
        RestaurantInfo cokcokCigkofte = new RestaurantInfo("ÇokÇok Çiğköfte", createMenu(cokcokCigkofteMenu));

        // Adko Çiğköfte
        FoodInfo[] adkoCigkofteMenu = {ADKO_CIGKOFTE_CD,ADKO_CIGKOFTE_C250,ADKO_CIGKOFTE_C500,ADKO_CIGKOFTE_C1,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_AYRAN,NECO_SODA,NECO_SALGAM};
        RestaurantInfo adkoCigkofte = new RestaurantInfo("Adko Çiğköfte", createMenu(adkoCigkofteMenu));

        // Gurmem Pizza
        FoodInfo[] gurmemPizzaMenu = {GURMEM_PIZZA_AP,GURMEM_PIZZA_BBQTP,GURMEM_PIZZA_KP,GURMEM_PIZZA_MANP,GURMEM_PIZZA_MARP,GURMEM_PIZZA_SP,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_SODA};
        RestaurantInfo gurmemPizza = new RestaurantInfo("Gurmem Pizza", createMenu(gurmemPizzaMenu));

        // Artisan Pizza
        FoodInfo[] artisanPizzaMenu = {ARTISAN_PIZZA_AP,ARTISAN_PIZZA_BBQTP,ARTISAN_PIZZA_KP,ARTISAN_PIZZA_MANP,ARTISAN_PIZZA_MARP,ARTISAN_PIZZA_SP,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_SODA};
        RestaurantInfo artisanPizza = new RestaurantInfo("Artisan Pizza", createMenu(artisanPizzaMenu));

        // İtaliano Pizza
        FoodInfo[] italianoPizzaMenu = {ITALIANO_PIZZA_BBQTP,ITALIANO_PIZZA_KP,ITALIANO_PIZZA_MARP,ITALIANO_PIZZA_SP,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_SODA};
        RestaurantInfo italianoPizza = new RestaurantInfo("İtaliano Pizza", createMenu(italianoPizzaMenu));

        // İyidir Pizza
        FoodInfo[] iyidirPizzaMenu = {IYIDIR_PIZZA_BBQTP,IYIDIR_PIZZA_KP,IYIDIR_PIZZA_MARP,IYIDIR_PIZZA_SP,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_SODA};
        RestaurantInfo iyidirPizza = new RestaurantInfo("İyidir Pizza", createMenu(iyidirPizzaMenu));

        // Dilim Pizza
        FoodInfo[] dilimPizzaMenu = {DILIM_PIZZA_BBQTP,DILIM_PIZZA_KP,DILIM_PIZZA_MANP,DILIM_PIZZA_MARP,DILIM_PIZZA_SP,NECO_COLA,NECO_COLA_L,NECO_COLA_Z,NECO_FANTA,NECO_SPRITE,NECO_SODA};
        RestaurantInfo dilimPizza = new RestaurantInfo("Dilim Pizza", createMenu(dilimPizzaMenu));

        // Create Linked List
        LinkedListNode<RestaurantInfo> restaurants = LinkedListNode.CreateList(necoLahmacun);
        LinkedListNode<RestaurantInfo> nextRestaurant = restaurants.addNextNode(cevreLahmacun);
        nextRestaurant = nextRestaurant.addNextNode(sarayLahmacun);
        nextRestaurant = nextRestaurant.addNextNode(anteplimLahmacun);
        nextRestaurant = nextRestaurant.addNextNode(ustaLahmacun);
        nextRestaurant = nextRestaurant.addNextNode(dedePide);
        nextRestaurant = nextRestaurant.addNextNode(doydoyPide);
        nextRestaurant = nextRestaurant.addNextNode(pidemmPide);
        nextRestaurant = nextRestaurant.addNextNode(bisesPide);
        nextRestaurant = nextRestaurant.addNextNode(kocaPide);
        nextRestaurant = nextRestaurant.addNextNode(blackBurger);
        nextRestaurant = nextRestaurant.addNextNode(bullBurger);
        nextRestaurant = nextRestaurant.addNextNode(gurmeBurger);
        nextRestaurant = nextRestaurant.addNextNode(yesimBurger);
        nextRestaurant = nextRestaurant.addNextNode(guzelBurger);
        nextRestaurant = nextRestaurant.addNextNode(hatayDoner);
        nextRestaurant = nextRestaurant.addNextNode(canımDoner);
        nextRestaurant = nextRestaurant.addNextNode(harbiDoner);
        nextRestaurant = nextRestaurant.addNextNode(lezizDoner);
        nextRestaurant = nextRestaurant.addNextNode(yanarDoner);
        nextRestaurant = nextRestaurant.addNextNode(lezzetCigkofte);
        nextRestaurant = nextRestaurant.addNextNode(adiyamanCigkofte);
        nextRestaurant = nextRestaurant.addNextNode(sesoCigkofte);
        nextRestaurant = nextRestaurant.addNextNode(cokcokCigkofte);
        nextRestaurant = nextRestaurant.addNextNode(adkoCigkofte);
        nextRestaurant = nextRestaurant.addNextNode(gurmemPizza);
        nextRestaurant = nextRestaurant.addNextNode(artisanPizza);
        nextRestaurant = nextRestaurant.addNextNode(italianoPizza);
        nextRestaurant = nextRestaurant.addNextNode(iyidirPizza);
        nextRestaurant = nextRestaurant.addNextNode(dilimPizza);

        // data
        RESTAURANTS_ROOT = restaurants;
    }

    private static LinkedListNode<FoodInfo> createMenu(FoodInfo[] foodGroup){
        LinkedListNode<FoodInfo> root = null;
        LinkedListNode<FoodInfo> tail = null;

        if(foodGroup.length>0){
            root = LinkedListNode.CreateList(foodGroup[0]);
            tail = root;

            for(int i = 1;i<foodGroup.length;i++){
                tail = tail.addNextNode(foodGroup[i]);
            }
        }
        return root;
    }

    public static LinkedListNode<RestaurantInfo> FilterRestaurantsByCategory(LinkedListNode<RestaurantInfo> node, String categoryName){
        if(node == null) throw new NullPointerException("RestaurantInfo node is null!");

        LinkedListNode<RestaurantInfo> root = null;
        LinkedListNode<RestaurantInfo> tail = null;
        LinkedListNode<RestaurantInfo> currentRest = node;
        while (true){

            LinkedListNode<FoodInfo> currentFood = currentRest.getData().getMenu();
            while (true){
                if(currentFood.getData().hasCategory(categoryName)){
                    if(root == null){
                        root = LinkedListNode.CreateList(currentRest.getData());
                        tail = root;
                        break;
                    }
                    else {
                        tail = tail.addNextNode(currentRest.getData());
                        break;
                    }
                }

                if(currentFood.isTail()){
                    break;
                }
                else {
                    currentFood = currentFood.getNext();
                }
            }

            if(currentRest.isTail()){
                return root;
            }
            else{
                currentRest = currentRest.getNext();
            }
        }
    }
}
