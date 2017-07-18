package com.miniproject.y50.drugs2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    int i;
    EditText search;
    String name;
    CustomAdapter customAdapter;
     String[] medicines = {"Abana", "Acaiberry", "Accupril", "Baclofen", "Benicar", "Benzac", "Calan", "Capoten", "Deltasone",
            "Diarex", "Effexor", "Enalapril", "Feldene", "Gerifort", "Himplasia", "Ilosone", "Ketotifen", "Levitra",
            "Maxalt", "Nolvadex", "Orlistat", "Penegra", "Rebetlo", "Zanaflex", "Viagraoraljelly"};
     Integer[] images = {R.drawable.abana, R.drawable.acaiberry, R.drawable.accupril, R.drawable.baclofen, R.drawable.benicar, R.drawable.benzac,
            R.drawable.calan, R.drawable.capoten, R.drawable.deltasone, R.drawable.diarex,
            R.drawable.effexor, R.drawable.enalapril, R.drawable.feldene, R.drawable.geriforte, R.drawable.himplasia,
            R.drawable.ilosone, R.drawable.ketotifen, R.drawable.levitra, R.drawable.maxalt, R.drawable.nolvadex, R.drawable.orlistat,
            R.drawable.penegra, R.drawable.rebetol, R.drawable.viagraoraljelly, R.drawable.zanaflex};

     String[] description = {"Abana helps lower the colesterol. It improves the contractility of the heart by exerting a positive inotropic action.\n" +
            "\n" +
            "Himalaya Herbal Healthcare is focused on producing and developing safe, natural and innovative remedies that help people live better and healthier." +
            " Their products are highly reliable, all-natural and effective.\n",

            "Acai Berry capsules are an all-natural weight-loss supplement made from nature's most powerful antioxidant. " +
                    "Grown deep in the Amazon region, the healing property of the tiny acai berry has been creating much buzz amongst healthcare professionals." +
                    " Known to speed your metabolism, suppress appetite, burn fat and cleanse your internal system, Acai Berry capsules will have you feeling healthier, " +
                    "slimmer and more energized than before!\n" +
                    "\n",

            "Generic Accupril (quinapril hydrochloride) is an ACE inhibitor." +
                    " ACE stands for angiotensin converting enzyme. Generic Accupril is used to treat high blood pressure (hypertension) and heart failure, " +
                    "and may also be used for a variety of different treatments. It is a top prescribed medication and is used all over the world.\n" +
                    "\n" +
                    "Generic Accupril is also marketed as Quinapril.\n",

            "Generic Baclofen is a muscle relaxer that is used in the treatment of muscle spasm; spasticity; hiccups; muscle twitching; alcohol withdrawal," +
                    " and belongs to the drug class skeletal muscle relaxants." +
                    " For effective relief of numerous muscle symptoms, order Generic Baclofen today and experience better health!\n" +
                    "\n" +
                    "Generic Baclofen May also be marketed as:\n" +
                    "Kemstro, Beklo, Lioresal, Liofen, Gablofen\n",
            "Generic Benicar (olmesartan) is an orally administered medication that is made to treat hypertension (high blood pressure). " +
                    "By managing high blood pressure, Generic Benicar helps reduce the likelihood of other serious medical conditions such as heart disease," +
                    " stroke, kidney failure, and other illnesses caused by hypertension. " +
                    "Order it here today for a fraction of the regular price!\n",
            "Generic Benzac (benzoyl peroxide) is an antibacterial ointment." +
                    " Generic Benzac is proven to reduce bacteria by 94% and is included in the World Health Organization Model Lists of Essential medicines!" +
                    " For one of the best treatments of skin acne, order Generic Benzac today!\n",
            "Calan (Verapamil) is in a class of drugs called calcium channel blockers. Verapamil relaxes (widens) blood vessels (veins and arteries), " +
                    "which makes it easier for the heart to pump and reduces its workload. " +
                    " Generic Calan is an FDA approved heart medication used to treat an array of conditions including high blood pressure",
            "Generic Capoten (Captopril) is an ACE inhibitor that is made to treat several problems associated with heart complications and organ malfunctions caused by diabetes." +
                    " Generic Capoten is one of the most prescribed medications for congestive heart failure and hypertension, and now you can order it for a fraction of its regular price!\n" +
                    "\n",
            "Deltasone (Prednisone) is a corticosteroid hormone (glucocorticoid). It decreases your immune system's response to various diseases to reduce symptoms such as swelling and allergic-type reactions." +
                    " Deltasone offers a highly effective, non-drowsy relief from seasonal and chronic allergy symptoms including hay fever.\n",
            "Diarex treat diarrhea. It is a beneficial remedy in acute or chronic amebic infections.\n" +
                    "\n" +
                    "Himalaya Herbal Healthcare is focused on producing and developing safe, natural and innovative remedies that help people live better and healthier. Their products are highly reliable, all-natural and effective.\n" +
                    "\n",
            "Generic Effexor (Venlafaxine) is used in the treatment of depression; bipolar disorder; fibromyalgia; obsessive compulsive disorder; autism and many other diseases." +
                    " Generic Effexor is one of the most prescribed medications for depression, and now you can order it for a fraction of its regular price!\n",
            "Enalapril is the active ingredient found in Vasotec, and used to treating high blood pressure and heart failure. Enalapril offers highly effective treatment of heart problems, " +
                    "and is one of the top prescribed medications by doctors.\n",
            "Generic Feldene (Piroxicam) works by reducing hormones that cause inflammation and pain in the body. " +
                    "Generic Feldene is one of Pfizer's best-selling drugs mainly prescribed to treat inflammation & countless off-label uses. This medication is a cost-saving medication prescribed by medical physicians worldwide.\n",
            "Geriforte helps for Geriatric Stress and general anxiety disorders. " +
                    "Geriforte regulates fat and carbohydrate metabolism, and improves appetite, digestion and assimilation. Geriforte rejuvenates the entire body system and retards the skin changes associated with aging.\n" +
                    "\n",
            "Himplasia effect as a pain relief for prostatic. Himplasia improves urinary flow rate while reducing post-void residual urine." +
                    " Himplasia also inhibits prostatic stromal proliferation.\n" +
                    "\n" +
                    "Himalaya Herbal Healthcare is focused on producing and developing ",
            "Ilosone (erythromycins) is used to treat many kinds of infections. Erythromycins are also used to prevent ''strep'' infections in patients with a history of rheumatic heart disease who may be allergic to penicillin.\n" +
                    "\n",
            "Ketotifen (ketotifen ophthalmic) is used to treat itching of the eyes." +
                    " Ketotifen is the active ingredient in many popular allergy medications including Claritin Eye. Ketotifen offers highly effective treatment of allergies and many of its symptoms and is one of the top prescribed allergy medications by doctors",
            "Generic Levitra is a cost-effective alternative to one of the best known and most trusted erectile dysfunction treatments sold today. Made with Vardenafil, the same active ingredient found in the brand name version," +
                    " Generic Levitra works to help men regain the ability to achieve and keep a long-lasting erection.",
            "Maxalt (Rizatriptan) is prescribed for the treatment of a migraine attack with or without the presence of an aura. It cuts headaches short, but will not prevent attacks. " +
                    "Generic Maxalt is a cost-saving medication prescribed by medical physicians worldwide.\n",
            "Nolvadex (tamoxifen) blocks the actions of estrogen, a female hormone. Certain types of breast cancer require estrogen to grow.\n" +
                    "Tamoxifen is used to treat and prevent some types of breast cancer.\n" +
                    "\n" +
                    "Generic Nolvadex also marketed as: Apo-Tamox, Tamizam.\n",
            "Orlistat -the active ingredient in Xenical® and Alli®- blocks some of the fat that you eat from being absorbed by your body." +
                    " Orlistat is used in the management of obesity including weight loss and weight maintenance when used with a reduced-calorie diet.\n" +
                    "\n",
            "Penegra (Sildenafil) is used to treat impotence in men. Sildenafil increases the body's ability to achieve and maintain an erection during sexual stimulation. Penegra is a top selling Indian brand version of Viagra," +
                    " the world's renowned blue pill for erectile dysfunction treatment.\n",
            "Rebetol (ribavirin) is an antiviral drug. It is used in combination with interferon for the treatment of chronic hepatitis C." +
                    " Although the exact mechanism of its action is unknown, it is thought to interfere with the production and/or action of viral DNA and RNA which are critical to the survival and multiplication of the virus.\n",
            "Generic Zanaflex (Tizanidine) is a skeletal muscle relaxant used to treat muscle spasms associated with multiple sclerosis or spinal cord injuries." +
                    " Generic Zanaflex is a break through medication and prescribed by health physicians all over the world!\n",
            "Generic Viagra Oral Jelly is the most unique and discreet way to treat your erectile dysfunction. This chewable jelly medicine is made with the same active ingredient as the best-selling little blue pill, " +
                    "but in an easier to digest form that is ideal for anyone who has a hard time swallowing pills.\n"};




    //EditText search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listview);
        search=(EditText)findViewById(R.id.txtsearch);


        customAdapter = new CustomAdapter(this, medicines, images);
        lv.setAdapter(customAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, Description.class);
                intent.putExtra("p", images[position]);
                intent.putExtra("m", medicines[position]);
                intent.putExtra("t", description[position]);
                startActivity(intent);
            }
        });}


    public void search(View view) {
        int count=0;
        lv.setAdapter(null);
        name = search.getText().toString();
        if (name != null) {
            for (int i = 0; i < medicines.length; i++) {

                if (name.equalsIgnoreCase(medicines[i])) {
                    count++;
                    final  String[] medicine1={ medicines[i]};
                    final Integer[] image1={ images[i]};
                   final String [] description1 = { description[i]};



                    customAdapter = new CustomAdapter(this, medicine1, image1);
                    lv.setAdapter(customAdapter);
                    lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Intent intent = new Intent(MainActivity.this, Description.class);
                            intent.putExtra("p", image1[position]);
                            intent.putExtra("m", medicine1[position]);
                            intent.putExtra("t", description1[position]);
                            startActivity(intent);
                        }
                    });
                    if(count==0)
                    {
                        Toast.makeText(MainActivity.this, "not found", Toast.LENGTH_LONG).show();
                    }
                }
            }


        }

        else{
            Toast.makeText(MainActivity.this, "enter drug name", Toast.LENGTH_LONG).show();
        }
    }


}

