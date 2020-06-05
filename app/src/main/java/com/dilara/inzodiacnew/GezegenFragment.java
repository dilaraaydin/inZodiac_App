package com.dilara.inzodiacnew;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class GezegenFragment extends Fragment {
    private ImageButton buttonJupiter;
    private ImageButton buttonMars;
    private ImageButton buttonMercur;
    private ImageButton buttonMoon;
    private ImageButton buttonNeptun;
    private ImageButton buttonPluton;
    private ImageButton buttonSaturn;
    private ImageButton buttonSun;
    private ImageButton buttonUranus;
    private ImageButton buttonVenus;
    private TextView textView_gezegen;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_gezegen, viewGroup, false);
        buttonSun =  inflate.findViewById(R.id.buttonSun);
        buttonMoon =  inflate.findViewById(R.id.buttonMoon);
        buttonMercur =  inflate.findViewById(R.id.buttonMercur);
        buttonVenus =  inflate.findViewById(R.id.buttonVenus);
        buttonMars =  inflate.findViewById(R.id.buttonMars);
        buttonJupiter =  inflate.findViewById(R.id.buttonJupiter);
        buttonSaturn =  inflate.findViewById(R.id.buttonSaturn);
        buttonUranus =  inflate.findViewById(R.id.buttonUranus);
        buttonNeptun =  inflate.findViewById(R.id.buttonNeptun);
        buttonPluton =  inflate.findViewById(R.id.buttonPluton);
        TextView textView =  inflate.findViewById(R.id.textView_gezegen);
        textView_gezegen = inflate.findViewById(R.id.textView_gezegen);
        textView.setMovementMethod(new ScrollingMovementMethod());
        buttonSun.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_gezegen.setText("Güneş'in bulunduğu burç, harita sahibinin kişiliğini ve bu kişiliği nasıl belirttiğini gösterir. Bütün insanlar değilse bile pek çoğu doğduğu zaman Güneş'in bulunduğu burcun özelliklerini yansıtırlar. Bütün gazete ve dergilerde burçlar köşesinde bahsedilen Güneş burcunuzdur. Güneş olmadan hayat olamazdı. Güneş sizin bireyselliğinizi, kendinize özgü karakterinizi, amaçlarınızı, kararlığınızı, gururunuzu, canlılığınızı, sağlığınızı, kişisel başarınızı, sosyal başarınızı ve kalbinizi yönetir. Özet olarak Güneş sizin egonuzdur. Kendinizi nasıl gördüğünüz ve kendinize verdiğiniz değerdir. Bu gezegen sizin toplum içindeki yerinizi yani başkalarının sizi nasıl gördüğünü de belirler. Aslan burcunu yönetir.");
            }
        });
        buttonMoon.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_gezegen.setText("Ay sizin iç karakterinizi, gizli kalmış yönlerinizi, sadece sizi çok yakından tanıyanların bildiği kişilik özelliklerini temsil eder. Ay genel olarak duyguları temsil eder. Ay sizin en derin duygularınızı, içgüdülerinizi, sezgilerinizi, heyecanlarınızı ve tepkilerinizi açığa çıkarır. Aynı zamanda özel hayatınızı, ev ortamınızı yönetir. Astrolojide Ay, Yengeç burcunu yönetir.");
            }
        });
        buttonMercur.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_gezegen.setText("Astrolojide bu gezegen haberleşmeyi temsil eder. Her türlü konuşma, yazı, yolculuk bu gezegenin yönetimindedir. Sürekli olarak yeni bilgiler edinen, son derece hızlı ve her duruma kolay adapte olabilen bir gezegendir. Merkür mantık, anlayış ve görüşü temsil eder. Merkür'ün yıldız haritasındaki konumu, harita sahibinin nasıl bir zeka ve sinir sistemine sahip olduğunu, entellektüel seviyesini gösterir. Astrolojide Merkür, İkizler ve Başak burçlarını yönetir.");
            }
        });
        buttonVenus.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_gezegen.setText("Venüs duyguları, aşk hayatını, şehveti yönetir. Efsanevi dişi gezegen Venüs aynı zamanda güzelliği, modayı, güzel sanatları temsil eder ve hayatımızı güzel şeylerle doldurur. Müzik dinlemek, lezzetli yemekler yemek, baş döndüren bir parfüm koklamak, muhteşem bir sergi gezmek için fırsatlar yaratır. Boğa ve Terazi burcunun yöneticisidir.");
            }
        });
        buttonMars.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_gezegen.setText("Mars saldırgan, güçlü, girişimci, enerjik, cesur, yarışçı, cüretkar, ateşli özellikler verir. Her tür ihtiras, sağlık, ve liderlik yeteneğini belirtir. Bütün kesici aletleri, silahları, ateşi ve yanıcı her şeyi temsil eder. Mars vücutta  cinsel salgı bezlerini, kasları, idrar yollarını, üretim organlarını ve böbrek üstü bezleri yönetir. Mars Koç ve Akrep burcunun yöneticisidir");
            }
        });
        buttonJupiter.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_gezegen.setText("Astrolojide Jüpiter en büyük yardımcı, en fazla iyilik eden güç sayılır. Dokunduğu her şeye bolluk veren Jüpiter şans gezegenidir. Jüpiter varlık, zenginlik, ve maddesel kazançları yönetir. Ayrıca görüş, iyimserlik, inanç, sadakat, adalet, güven ve akıl getirir. Jüpiter kafanın ve işlerin gelişmesini gösterir. Onun için  din, felsefe gibi konularla ticaret, ekonomi gibi konular Jüpiter'e bağlıdır. Yay burcunun yöneticisidir.");
            }
        });
        buttonSaturn.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_gezegen.setText("Kısıtlamalara, hayal kırıklıklarına neden olan ve genellikle daha fazla sorumluluklar yükleyerek insanı disiplinli olmaya zorlayan soğuk bir gezegendir. Hayat bize çok şey öğretir. Satürn bir öğretmene benzer, verdiği dersler genellikle serttir ama bu dersler bizi başarıya götürür. Satürn, düşünce, konsantrasyon, süreklilik, somut ödüller, sebat, hırs ve verimlilik gezegenidir. Bu görev duygusu ile dolu gezegen tedbirli olmayı, zorlukları, gecikmeleri, kısıtlamaları, kuralları, sorumluluk duygusunu, acıyı, korkuyu, inkarı, bir şeyi zor yoldan elde etmeyi, otoriteyi ve disiplini yönetir. Oğlak burcunun yöneticisidir.");
            }
        });
        buttonUranus.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_gezegen.setText("Uranüs sürprizler ve beklenmedik olaylar gezegenidir. Geleceği, yeni teknolojiyi, internet ve sanal ortamı temsil eder. Yenilikçi, önceden bilinmeyen, sürpriz dolu, deneyci ve geleceğe dönük şeylerin gezegenidir. Uranüs toplumların, uygarlıkların, kurumların düzenlerini sarsıp yeni düzenlere başlamalarına neden olur. Ani değişiklikler, isyan, bağımsızlık ve şok getirir. Evrensel gerçeğin peşinde çabuk ve özgürleştirici sonuçlar getirir. Uranüs duygusal değildir, objektiftir. Kova burcunun yönetici gezegenidir.");
            }
        });
        buttonNeptun.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_gezegen.setText("Neptün sınırları aşmayı ve engelleri yıkmayı temsil eder. Ama bu yıkma daha çok düşünce şeklinde ortaya çıkar. En güzel müziği, şiiri, edebiyatı, biçim ve seçkin beğenileri yaratan sanatçıların ilham perisidir. Rüyaların, bilinçaltının, hayallerin, yanılgıların, fantezilerin, sihirli ve büyüleyici her şeyin yöneticisidir. Uykuyu temsil eden de Neptün'dür. Astrolojide Neptün, Balık burcunun yöneticisidir.");
            }
        });
        buttonPluton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_gezegen.setText("Plüto bilinmeyeni, yani ölüm ve ölümden sonraki hayatı temsil eder. Yeniden doğuşun, dönüşümün, başkalaşımın, başlangıç ve bitişin gezegenidir. Plüto psikolojik bakımdan bilinçaltını gösterir. Saplantıları, tabuları, alışkanlıkları, krizleri, yaşam ve ölüm gibi temel konuları yönetir. Pluto gizli kalmış, görülmeyen, saklanan şeylerinde yöneticisidir. Akrep burcunun yöneticisidir.");
            }
        });
        return inflate;
    }
}