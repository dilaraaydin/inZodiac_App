package com.dilara.inzodiacnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.fragment.app.Fragment;

public class BurclarFragment extends Fragment {
    private ImageButton buttonAquarius;
    private ImageButton buttonAries;
    private ImageButton buttonCancer;
    private ImageButton buttonCapricorn;
    private ImageButton buttonGemini;
    private ImageButton buttonLeo;
    private ImageButton buttonLibra;
    private ImageButton buttonPisces;
    private ImageButton buttonSagittarius;
    private ImageButton buttonScorpio;
    private ImageButton buttonTaurus;
    private ImageButton buttonVirgo;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        buttonAries =inflate.findViewById(R.id.buttonAries);
        buttonTaurus =inflate.findViewById(R.id.buttonTaurus);
        buttonGemini =inflate.findViewById(R.id.buttonGemini);
        buttonCancer =inflate.findViewById(R.id.buttonCancer);
        buttonLeo =inflate.findViewById(R.id.buttonLeo);
        buttonVirgo =inflate.findViewById(R.id.buttonVirgo);
        buttonLibra =inflate.findViewById(R.id.buttonLibra);
        buttonScorpio =inflate.findViewById(R.id.buttonScorpio);
        buttonSagittarius =inflate.findViewById(R.id.buttonSagittarius);
        buttonCapricorn =inflate.findViewById(R.id.buttonCapricorn);
        buttonAquarius =inflate.findViewById(R.id.buttonAquarius);
        buttonPisces =inflate.findViewById(R.id.buttonPisces);
        buttonAries.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Builder builder = new Builder(getActivity());
                builder.setTitle("Koç Burcu");
                builder.setMessage("Olumlu Yanları: Öncülük ve macera ruhu. Girişkenlik. Adam yönlendirme. Hedef belirleme özelliği. Yüksek Enerji. Engelleri aşabilme yetişi. Sınırlamalardan nefret. Liderlik. Dürüstlük. Hazır cevaplık. Canlılık.\n\nOlumsuz Yanları: Egoizm. Kararları yıkmak. Kendini öne sürmek, ileri-ye çıkartmak. Alaycı, isyankar. Sabırsız. Saldırgan. Hiddetli. Ani çıkışlar");
                builder.setIcon(R.drawable.ic_aries);
                builder.setPositiveButton("Burç sayfasına dönelim.", null);
                builder.create().show();
            }
        });
        buttonTaurus.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Builder builder = new Builder(getActivity());
                builder.setTitle( "Boğa Burcu");
                builder.setMessage("Olumlu Özellikleri: Pratik, güvenilir. Uyumlu, tahammüllü, güçlü değer yargıları var. Kararlı. Sanata ve güzelliğe düşkün. Güçlü istekleri var. Sıcak kanlı. Para sahibi olur. Duygulara önem verir.\n\nOlumsuz Özellikleri: Tembel. Kendine düşkün. Statik. Yeterince esnek değil. Orijinalite eksikliği, inatçı. Alıngan.");
                builder.setIcon((int) R.drawable.ic_taurus);
                builder.setPositiveButton("Burç sayfasına dönelim.", null);
                builder.create().show();
            }
        });
        this.buttonGemini.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Builder builder = new Builder(getActivity());
                builder.setTitle("İkizler Burcu");
                builder.setMessage("Olumlu yanları: Uyumlu, entelektüel, çabuk kavrayan, mantıklı, konuşkan, canlı, sempatik, yeniliklere açık. Aynı anda bir kaç işi birden yapabilen.\n\nOlumsuz yanları: Değişken, güvenilmez, iki yüzlü, kararsız, yüzeysel, dedikoducu, huzursuz, havai");
                builder.setIcon(R.drawable.ic_gemini);
                builder.setPositiveButton("Burç sayfasına dönelim.", null);
                builder.create().show();
            }
        });
        this.buttonCancer.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Builder builder = new Builder(getActivity());
                builder.setTitle( "Yengeç Burcu");
                builder.setMessage("Olumlu Yanları: Nazik,Hassas,Sempatik,Merhametli Düş gücü yüksek. Analık ve babalık duygulan güçlü. Vatansever. Yuva sevgisi. Israrlı. Becerikli. İyi eş. Tutumlu.\n\nOlumsuz Yanları: Aşırı duygusal. Züppe. Dağınık. Kuşkucu. Değişken. Kıskanç. Zayıf karakterli. Kendine acıma meyilli. Sabit olamamak. Değişken duygular.");
                builder.setIcon(R.drawable.ic_cancer);
                builder.setPositiveButton("Burç sayfasına dönelim.", null);
                builder.create().show();
            }
        });
        this.buttonLeo.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Builder builder = new Builder(getActivity());
                builder.setTitle("Aslan Burcu");
                builder.setMessage( "Olumlu Yanları: Yüce gönüllülük. Cömertlik. Yaratıcılık. Babalık. Fedakarlık. Üstünlük. Yaratıcılık. Neşe. İyi organizasyon. Açık zihin.\n\nOlumsuz Yanları: Otorite. Diktatörlük. Zorbalık. Tantana. Züppelik. Tolerans göstermemek. Sabit fikirlilik. Kuvvet deliliği. Kendini beğenmişlik.");
                builder.setIcon(R.drawable.ic_leo);
                builder.setPositiveButton( "Burç sayfasına dönelim.",null);
                builder.create().show();
            }
        });
        this.buttonVirgo.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Builder builder = new Builder(getActivity());
                builder.setTitle("Başak Burcu");
                builder.setMessage("Olumlu Özellikleri: Analizcilik. Dostluk. Dikkat. Ustalık. Cana yakınlık. Temizlik. Titizlik. Alçak gönüllülük. Giyim merakı. Hesap kafası. Esprili konuşma. İyilik isteği.\n\nOlumsuz Özellikleri: Hastalık hastası. İşgüzar. Aceleci. Aşırı tenkitçi. Aşırı titiz. Kolay beğenmez. Geleneklere sıkı bağlı. Aşırı meraklı");
                builder.setIcon( R.drawable.ic_virgo);
                builder.setPositiveButton( "Burç sayfasına dönelim.", null);
                builder.create().show();
            }
        });
        this.buttonLibra.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Builder builder = new Builder(getActivity());
                builder.setTitle( "Terazi Burcu");
                builder.setMessage("Olumlu Özellikleri: Güzellik, güzel sanatlara yetenekli. Sevimlilik. Uyumluluk. Zarafet. Romantik. Diplomatik. İncelik. Çekicilik. İdealist. Tarafsız. İyi niyetli. İyi ortak. İyi siyasetçi. Kreatif ve alımlı. Akıllı.\n\nOlumsuz Özellikleri: Kararsız. Alıngan. Hafiflik. Değişkenlik. Flörtçü. Dengesizlik. Tembellik. Çabuk fikir değiştirme. Tesir altında kalmak.");
                builder.setIcon( R.drawable.ic_libra);
                builder.setPositiveButton( "Burç sayfasına dönelim.", null);
                builder.create().show();
            }
        });
        this.buttonScorpio.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Builder builder = new Builder(getActivity());
                builder.setTitle("Akrep Burcu");
                builder.setMessage( "Olumlu Yanları: Sırdaş. Duygularım belli etmez. Gerçek dost. Cazibeli. Güçlü. Çalışkan. Kararlı. Unutmaz. Güçlü sezgiler. Güçlü duygular. Yüksek imajinasyon. Anlayışlı. Dikkatli. Yüksek analiz gücüne sahip. Sevgi. Pişmanlık.\n\nOlumsuz Yanları: Kindar. Kuşkucu. Kıskanç. alıngan. Dik kafalı. Suskun. Akrep gibi, zehirleyici. Alaycı. Ben merkezci. İhtiraslı");
                builder.setIcon( R.drawable.ic_scorpio);
                builder.setPositiveButton( "Burç sayfasına dönelim.",  null);
                builder.create().show();
            }
        });
        this.buttonSagittarius.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Builder builder = new Builder(getActivity());
                builder.setTitle( "Yay Burcu");
                builder.setMessage( "Olumlu Özellikleri: Keyifli. Neşeli, îş bilir. Açık zihinli. Adapte olur. İyi yargılar, Felsefik. Özgürlüğüne düşkün. Dışa dönük. Dindar. Eğitimli. Olgun. İyi niyetli. Sportmen. Yüksek hayal gücü. Şanslı. Neşeli.\n\nOlumsuz Özellikleri: Aşırı iyimser. Gürültücü. Sorumsuz. Kaprisli. Ani ilgi. Çabuk bıkmak. Sabırsızlık");
                builder.setIcon(R.drawable.ic_sagittarius);
                builder.setPositiveButton( "Burç sayfasına dönelim.", null);
                builder.create().show();
            }
        });
        this.buttonCapricorn.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Builder builder = new Builder(getActivity());
                builder.setTitle("Oğlak Burcu");
                builder.setMessage("Olumlu Yönleri: Çalışkan. Güvenilir. Kararlı. İstekli. Sabırlı. Azimli. İhtiyatlı. Disiplinli. Plancı. Espri gücü. Düzenli. Sebatkar. Azla yetinir. Zengin olur. Dayanma gücü yüksek. Sorumlu. İyi eş, iyi anne baba. Mülkiyetçi.\n\nOlumsuz Yönleri: Eğilmez. Dik başlı. İhtiraslı. Kötümser. Kuşkucu. Kindar. Sert. Karamsar. Yalnızlık hayranı");
                builder.setIcon(R.drawable.ic_capricorn);
                builder.setPositiveButton("Burç sayfasına dönelim.",null);
                builder.create().show();
            }
        });
        this.buttonAquarius.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Builder builder = new Builder(getActivity());
                builder.setTitle( "Kova Burcu");
                builder.setMessage("Olumlu Özellikleri: Hümanist. Bağımsız. Dost. Mucit. Orijinalist. Reformist. Sadık. Vefalı. İdealist. Entelektüel. Yeniliğe meraklı. Değişikliği sever. Geçmişe bağlı.\n\nOlumsuz Özellikleri: Umulmadık gariplikler. isyankarlık. Muhalif. Sabit fikirli. Gelenekleri zorlayıcı. Çılgın, tartışmaya meraklı. Dikkati çekmek ister. Çılgın. Kendini beğenmiş. Olmayacak hayaller");
                builder.setIcon(R.drawable.ic_aquarius);
                builder.setPositiveButton( "Burç sayfasına dönelim.", null);
                builder.create().show();
            }
        });
        this.buttonPisces.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Builder builder = new Builder(getActivity());
                builder.setTitle("Balık Burcu");
                builder.setMessage("Olumlu Özellikleri: Alçak gönüllü. Şefkatli. Sempatik. Hassas. Adapte olabilir. Etkili. Anlayışlı. Nazik. Sezgili. Renkli hayaller. Derin duygular. Sevgiye düşkünlük. Merhametli. Güzel sanatlarda başarılı. İyi niyetli. Yardımsever.\n\nOlumsuz Özellikleri: Belirsizlik. İhmalcilik. Gizlilik. Kolay dağılmak. Zayıf arzular. Kararsızlık. Mücadeleci değil. Karamsar. Çekingen. Alıngan");
                builder.setIcon(R.drawable.ic_pisces);
                builder.setPositiveButton("Burç sayfasına dönelim.",null);
                builder.create().show();
            }
        });
        return inflate;
    }
}