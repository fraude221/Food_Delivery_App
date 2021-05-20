package com.sen2212.fooddeliveryapp.datastructures;

import android.graphics.Color;

import com.sen2212.fooddeliveryapp.R;

public class Database {

    // Categories
    //*******************************************************************************************************************************************************************************
    public static FoodCategory CAT_ROOT = new FoodCategory("Categories", R.drawable.ic_launcher_background, Color.WHITE); // Categories

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
        LinkedListNode<FoodInfo> necoLahmacunMenu = LinkedListNode.CreateList(NECO_AL);
        LinkedListNode<FoodInfo> nextFood = necoLahmacunMenu.addNextNode(NECO_BL);
        nextFood = nextFood.addNextNode(NECO_CL);
        nextFood = nextFood.addNextNode(NECO_FL);
        nextFood = nextFood.addNextNode(NECO_COLA);
        nextFood = nextFood.addNextNode(NECO_COLA_L);
        nextFood = nextFood.addNextNode(NECO_COLA_Z);
        nextFood = nextFood.addNextNode(NECO_FANTA);
        nextFood = nextFood.addNextNode(NECO_SPRITE);
        nextFood = nextFood.addNextNode(NECO_AYRAN);
        nextFood = nextFood.addNextNode(NECO_SODA);
        nextFood = nextFood.addNextNode(NECO_SALGAM);
        RestaurantInfo necoLahmacun = new RestaurantInfo("Neco Lahmacun", necoLahmacunMenu);

        // Çevre Lahmacun
        LinkedListNode<FoodInfo> cevreLahmacunMenu = LinkedListNode.CreateList(CEVRE_BL);
        nextFood = cevreLahmacunMenu.addNextNode(CEVRE_CL);
        nextFood = nextFood.addNextNode(CEVRE_FL);
        nextFood = nextFood.addNextNode(NECO_COLA);
        nextFood = nextFood.addNextNode(NECO_COLA_L);
        nextFood = nextFood.addNextNode(NECO_COLA_Z);
        nextFood = nextFood.addNextNode(NECO_FANTA);
        nextFood = nextFood.addNextNode(NECO_SPRITE);
        nextFood = nextFood.addNextNode(NECO_AYRAN);
        nextFood = nextFood.addNextNode(NECO_SODA);
        nextFood = nextFood.addNextNode(NECO_SALGAM);
        RestaurantInfo cevreLahmacun = new RestaurantInfo("Çevre Lahmacun", cevreLahmacunMenu);

        // Saray Lahmacun
        LinkedListNode<FoodInfo> sarayLahmacunMenu = LinkedListNode.CreateList(SARAY_AL);
        nextFood = sarayLahmacunMenu.addNextNode(SARAY_BL);
        nextFood = nextFood.addNextNode(SARAY_CL);
        nextFood = nextFood.addNextNode(NECO_COLA);
        nextFood = nextFood.addNextNode(NECO_COLA_L);
        nextFood = nextFood.addNextNode(NECO_COLA_Z);
        nextFood = nextFood.addNextNode(NECO_FANTA);
        nextFood = nextFood.addNextNode(NECO_SPRITE);
        nextFood = nextFood.addNextNode(NECO_AYRAN);
        nextFood = nextFood.addNextNode(NECO_SODA);
        nextFood = nextFood.addNextNode(NECO_SALGAM);
        RestaurantInfo sarayLahmacun = new RestaurantInfo("Saray Lahmacun", sarayLahmacunMenu);

        // Anteplim Lahmacun
        LinkedListNode<FoodInfo> anteplimLahmacunMenu = LinkedListNode.CreateList(ANTEPLIM_AL);
        nextFood = anteplimLahmacunMenu.addNextNode(ANTEPLIM_BL);
        nextFood = nextFood.addNextNode(ANTEPLIM_CL);
        nextFood = nextFood.addNextNode(ANTEPLIM_FL);
        nextFood = nextFood.addNextNode(NECO_COLA);
        nextFood = nextFood.addNextNode(NECO_COLA_L);
        nextFood = nextFood.addNextNode(NECO_COLA_Z);
        nextFood = nextFood.addNextNode(NECO_FANTA);
        nextFood = nextFood.addNextNode(NECO_SPRITE);
        nextFood = nextFood.addNextNode(NECO_AYRAN);
        nextFood = nextFood.addNextNode(NECO_SODA);
        nextFood = nextFood.addNextNode(NECO_SALGAM);
        RestaurantInfo anteplimLahmacun = new RestaurantInfo("Anteplim Lahmacun", anteplimLahmacunMenu);

        // Usta Lahmacun
        LinkedListNode<FoodInfo> ustaLahmacunMenu = LinkedListNode.CreateList(USTA_BL);
        nextFood = ustaLahmacunMenu.addNextNode(USTA_CL);
        nextFood = nextFood.addNextNode(USTA_FL);
        nextFood = nextFood.addNextNode(NECO_COLA);
        nextFood = nextFood.addNextNode(NECO_COLA_L);
        nextFood = nextFood.addNextNode(NECO_COLA_Z);
        nextFood = nextFood.addNextNode(NECO_FANTA);
        nextFood = nextFood.addNextNode(NECO_SPRITE);
        nextFood = nextFood.addNextNode(NECO_AYRAN);
        nextFood = nextFood.addNextNode(NECO_SODA);
        nextFood = nextFood.addNextNode(NECO_SALGAM);
        RestaurantInfo ustaLahmacun = new RestaurantInfo("Usta Lahmacun", ustaLahmacunMenu);

        // Dede Pide
        LinkedListNode<FoodInfo> dedePideMenu = LinkedListNode.CreateList(DEDE_PIDE_KIYKP);
        nextFood = dedePideMenu.addNextNode(DEDE_PIDE_KIYP);
        nextFood = nextFood.addNextNode(DEDE_PIDE_KUSKP);
        nextFood = nextFood.addNextNode(DEDE_PIDE_KUSP);
        nextFood = nextFood.addNextNode(NECO_COLA);
        nextFood = nextFood.addNextNode(NECO_COLA_L);
        nextFood = nextFood.addNextNode(NECO_COLA_Z);
        nextFood = nextFood.addNextNode(NECO_FANTA);
        nextFood = nextFood.addNextNode(NECO_SPRITE);
        nextFood = nextFood.addNextNode(NECO_AYRAN);
        nextFood = nextFood.addNextNode(NECO_SODA);
        RestaurantInfo dedePide = new RestaurantInfo("Dede Pide", dedePideMenu);

        // Doydoy Pide
        LinkedListNode<FoodInfo> doydoyPideMenu = LinkedListNode.CreateList(DOYDOY_PIDE_KIYKP);
        nextFood = doydoyPideMenu.addNextNode(DOYDOY_PIDE_KIYP);
        nextFood = nextFood.addNextNode(DOYDOY_PIDE_KUSKP);
        nextFood = nextFood.addNextNode(DOYDOY_PIDE_KUSP);
        nextFood = nextFood.addNextNode(DOYDOY_PIDE_SP);
        nextFood = nextFood.addNextNode(DOYDOY_PIDE_MP);
        nextFood = nextFood.addNextNode(NECO_COLA);
        nextFood = nextFood.addNextNode(NECO_COLA_L);
        nextFood = nextFood.addNextNode(NECO_COLA_Z);
        nextFood = nextFood.addNextNode(NECO_FANTA);
        nextFood = nextFood.addNextNode(NECO_SPRITE);
        nextFood = nextFood.addNextNode(NECO_AYRAN);
        nextFood = nextFood.addNextNode(NECO_SODA);
        RestaurantInfo doydoyPide = new RestaurantInfo("Doydoy Pide", doydoyPideMenu);

        // Pidemm Pide
        LinkedListNode<FoodInfo> pidemmPideMenu = LinkedListNode.CreateList(PIDEMM_PIDE_KIYKP);
        nextFood = pidemmPideMenu.addNextNode(PIDEMM_PIDE_KIYP);
        nextFood = nextFood.addNextNode(PIDEMM_PIDE_KUSKP);
        nextFood = nextFood.addNextNode(PIDEMM_PIDE_KUSP);
        nextFood = nextFood.addNextNode(PIDEMM_PIDE_SP);
        nextFood = nextFood.addNextNode(PIDEMM_PIDE_MP);
        nextFood = nextFood.addNextNode(NECO_COLA);
        nextFood = nextFood.addNextNode(NECO_COLA_L);
        nextFood = nextFood.addNextNode(NECO_COLA_Z);
        nextFood = nextFood.addNextNode(NECO_FANTA);
        nextFood = nextFood.addNextNode(NECO_SPRITE);
        nextFood = nextFood.addNextNode(NECO_AYRAN);
        nextFood = nextFood.addNextNode(NECO_SODA);
        RestaurantInfo pidemmPide = new RestaurantInfo("Pidemm Pide", pidemmPideMenu);

        // Bises Pide
        LinkedListNode<FoodInfo> bisesPideMenu = LinkedListNode.CreateList(BISES_PIDE_KIYKP);
        nextFood = bisesPideMenu.addNextNode(BISES_PIDE_KIYP);
        nextFood = nextFood.addNextNode(BISES_PIDE_KUSKP);
        nextFood = nextFood.addNextNode(BISES_PIDE_KUSP);
        nextFood = nextFood.addNextNode(BISES_PIDE_SP);
        nextFood = nextFood.addNextNode(NECO_COLA);
        nextFood = nextFood.addNextNode(NECO_COLA_L);
        nextFood = nextFood.addNextNode(NECO_COLA_Z);
        nextFood = nextFood.addNextNode(NECO_FANTA);
        nextFood = nextFood.addNextNode(NECO_SPRITE);
        nextFood = nextFood.addNextNode(NECO_AYRAN);
        nextFood = nextFood.addNextNode(NECO_SODA);
        RestaurantInfo bisesPide = new RestaurantInfo("Bises Pide", bisesPideMenu);

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

        // data
        RESTAURANTS_ROOT = restaurants;
    }

    public static LinkedListNode<RestaurantInfo> FilterRestaurantsByCategory(LinkedListNode<RestaurantInfo> node, String categoryName){
        if(node == null) throw new NullPointerException("RestaurantInfo node is null!");

        LinkedListNode<RestaurantInfo> filtered = null;
        LinkedListNode<RestaurantInfo> currentRest = node;
        while (true){

            LinkedListNode<FoodInfo> currentFood = currentRest.getData().getMenu();
            while (true){
                if(currentFood.getData().hasCategory(categoryName)){
                    if(filtered == null){
                        filtered = LinkedListNode.CreateList(currentRest.getData());
                        break;
                    }
                    else {
                        filtered.addNextNode(currentRest.getData());
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
                return filtered;
            }
            else{
                currentRest = currentRest.getNext();
            }
        }
    }
}
