package com.dilara.inzodiacnew;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class EvlerFragment extends Fragment {
    private Button buttonEv1;
    private Button buttonEv10;
    private Button buttonEv11;
    private Button buttonEv12;
    private Button buttonEv2;
    private Button buttonEv3;
    private Button buttonEv4;
    private Button buttonEv5;
    private Button buttonEv6;
    private Button buttonEv7;
    private Button buttonEv8;
    private Button buttonEv9;
    private TextView textView_Ev;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_evler, viewGroup, false);
        buttonEv1 =  inflate.findViewById(R.id.buttonEv1);
        buttonEv2 =  inflate.findViewById(R.id.buttonEv2);
        buttonEv3 =  inflate.findViewById(R.id.buttonEv3);
        buttonEv4 = inflate.findViewById(R.id.buttonEv4);
        buttonEv5 =  inflate.findViewById(R.id.buttonEv5);
        buttonEv6 =  inflate.findViewById(R.id.buttonEv6);
        buttonEv7 =  inflate.findViewById(R.id.buttonEv7);
        buttonEv8 =  inflate.findViewById(R.id.buttonEv8);
        buttonEv9 = inflate.findViewById(R.id.buttonEv9);
        buttonEv10 = inflate.findViewById(R.id.buttonEv10);
        buttonEv11 =  inflate.findViewById(R.id.buttonEv11);
        buttonEv12 = inflate.findViewById(R.id.buttonEv12);
        TextView textView = (TextView) inflate.findViewById(R.id.textView_Ev);
        textView_Ev = inflate.findViewById(R.id.textView_Ev);
        textView.setMovementMethod(new ScrollingMovementMethod());

        buttonEv1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_Ev.setText("1.EV\nYönetici Gezegeni : Mars\nEvin Sahibi  : Koç Burcu\nKısaca ; kişilik, tip, karakter evidir.\nAstrolojide birinci ev ağırlıklı olarak dış görünümümüz üzerinde etkilidir.Başkalarının bizi nasıl gördüğü yani kısaca dışa açık olan yönümüzdir.Dıştan gelen etkilere karşı tepkilerimiz veya uyum sağlama ayrıca kişinin dünyaya bakış açısını, aktiviteyi, kendini ispat tarzını, liderlik ve öncülüğün sınırlarını belli eder. Ayrıca vücut tipini belirlemede büyük ölçüde söz sahibidir. Vücut kısımlarından baş ve başta bulunan diğer organlar ile beyin ve kaslar bu evin etkisindedir. Dişler üzerinde de etkisi vardır.");
            }
        });
        buttonEv2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_Ev.setText("2. EV\nYönetici Gezegeni : Venüs\nEvin Sahibi : Boğa Burcu\nKısaca ; Para ve değerler evidir.\nAstrolojide ikinci ev parayı nasıl kazanacağımız, sahip olacağımız mal mülk, geçim durumumuz, maddi kayıplar ve ekonomik sorunları yönetir.Ayrıca kişinin mesleki ve ticari yetenekleri ve güven ve güvensizliğin dayandığı noktalarda ikinci eve bağlıdır.Vucut kısımlarından, ense, boğaz, ses telleri, tad alma duyusu, boyun ve troid bezi bu evin etkisindedir.");
            }
        });
        buttonEv3.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_Ev.setText("3. EV\nYönetici Gezegeni : Merkür\nEvin Sahibi : İkizler Burcu\nKısaca ;  akıl ve zeka evidir.  \n Astrolojide üçüncü ev zeka, fikir düzeyi, ilim kapasitesi, iletişim, haberleşme gibi konuları yönetir. Problemlere yaklaşımı ve analizi kısaca  sahip olunan bilgiyi nasıl değerlendirdiğinizi belirler. Yakın çevremiz, kardeşler, arkadaşlarımız hakkında fikir verir. Kardeş ilişkileri, yakın çevre ile olan iletişim, arkadaşlık ilişkileri, kısa yolculuklar, uzun vadeli olmayan plan ve projeler bu eve bağlıdır.Kişinin temel eğitim düzeyi üzerinde de etkisi vardır.Vucut kısımlarından eller, kollar, köprücük kemiği, omuz, solunum sistemi, akciğerler, dil, işitme duyusu, sinirler bu evin etkisindedir.");
            }
        });
        buttonEv4.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_Ev.setText("4. EV\nYönetici Gezegeni : Ay\nEvin Sahibi : Yengeç Burcu\nKısaca ; Aile ve toplum evidir.\nAstrolojide dördüncü ev ; Kişinin hayatına temel teşkil edecek esasları ve sahip olacağı yaşam tarzını ,anne, baba, ebeveyn durumundaki kişilerle olan ilişkilerimizi yönetir. Örf ve adetler, kişisel bağlılıklar, alışkanlıklar, ev ve aileyi, duygusal güveni, duygusal kökenli ben imajını, korunma ve sahip olma ihtiyacını temsil eder. Kişinin annesini nasıl gördüğünü veya annenin kişiliğini gösterir. Vucud kısımlarından göğüs, memeler, süt bezleri, mide, dişi organlar ve göğüs kafesi bu evin etkisindedir.");
            }
        });
        buttonEv5.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_Ev.setText("5. EV\nYönetici Gezegeni : Güneş\nEvin Sahibi : Aslan Burcu\nKısaca  ; Aşk, şans, çocuklar evidir.\nAşk hayatı,tutkular ve sevgi ihtiyacı,kumar, piyango, borsa gibi riskli işler, eğlence ve zevkler,  sosyal aktiviteler, serüven, önderlik, yaratıcılık, sanat, ego ve benlik üzerinde söz sahibidir. Ayrıca çocuklar, hamilelik ve doğumu da yönetir. Kişinin irade gücünü, kararlılığını, zevk aldığı alanları, yaratıcılığını ortaya koyma isteğini, kendini ifade etme ve  dikkat çekme çabalarını anlatır. Vücut kısımlarından kalp, sırt, kan damarları, hayat, yaşam enerjisi, bel kemiği ve omurilik bu evin etkisindedir.");
            }
        });
        buttonEv6.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_Ev.setText("6. EV\nYönetici Gezegeni : Merkür\nEvin Sahibi : Başak Burcu\nKısaca ;  Gündelik hayat, rutin işler ve sağlık evidir.\nGündelik hayat ve rutin işleri ve bu işlerde kullandığınız metotları yani çalışma yöntemlerini temsil eder.Temizlik, hijyen, topluma yararlı hizmetler, kişisel gayretler, memurlar, işçiler, iş ve iş ortamı, çevrecilik, moda, defileler, evcil hayvanlar gibi konular ve ayrıca kısaca genel vücut sağlığı üzerinde söz sahibidir.Vücut kısımlarından sindirim sistemi, karın bölgesi, sinir sistemi, bağırsaklar, apandisit bu evin etkisindedir.");
            }
        });
        buttonEv7.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_Ev.setText("7. EV\nYönetici Gezegeni : Venüs\nEvin Sahibi : Terazi Burcu\nKısaca ; Sevgi, evlilik, ortaklık ve denge kurma evidir.\nYedinci ev  birden fazla kişi ile yürütülen faliyetler (ortaklıklar) yazılı yahut sözlü birliktelikler ve en önemlisi evlilik hayatı ile ilgilidir.Kişinin birlikte olacağı kişileri ve onlarla ilişkileri ve beklentilerini, insanlara bakış açısını belli eder. Ayrıca kişinin kendini harcamadan karşılıklı denge kurabilme gücünü gösterir. Romantik aşklar beşinci ev tarafından yönetilse bağlılık sözü verildikten sonra bu ilişki yedinci ev tarafından yönetilmeye başlar.Vücut kısımlarından pankreas, böbrekler, bel bölgesi adeleleri, kemik ve sinir uçları bu burcun etkisindedir.");
            }
        });
        buttonEv8.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_Ev.setText("8. EV\nYönetici Gezegeni : Mars ve Plüto\nEvin Sahibi : Akrep Burcu\nKısaca ; Ölüm ve cinsellik evidir.\nAstroloji de sekinci ev geniş anlamda, ölümler ve yeniden doğuşlar,cinsel tatminler ve tecrübeler ve cinselliğin duygusal tatmin ve değişik amaçlarla kullanılması gibi konuları kapsar.Çalışarak kazandığınız paralar ikinci ev tarafından yönetilsede çalışmadan kazanılan ödüller ve paralarla sekinci ev ilgilenir.Sizin ödemek zorunda olduğunuz veya size ödenmek zorunda olan nafaka vergi iadesi gibi konular ayrıca eşinizin parasal durumu da bu evin yönetimi alıtındadır. Vücut kısımlarından erkek ve kadın cinsel organları, üreme organları, kasıklar, mesane ve rektum bu evin etkisindedir.");
            }
        });
        buttonEv9.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_Ev.setText("9. EV\nYönetici Gezegeni : Jüpiter\nEvin Sahibi : Yay Burcu\nKısaca ; Din, yüksek eğitim ve uzun yolculuklar evidir.\nAstrolojide dokuzuncu ev yapancı ülkelere yapılan uzun yolculuklar ve seyahatler ,yüksek öğretim din ve hukuk gibi konularla ilgilidir.Uluslararası ticaret ve yapancı insanlarla ilişkilerde bu eve dahildir.Allah veya tanrı kavramları; inançlar, soyut fikirler, felsefi düşünceler, yaşamın sırlarına dönük arayışlar, hayata gerçek bakış açısını ve hayatın anlamını algılayış şeklini ifade eder. Vücut kısımlarından karaciğer, kalçalar, mide, dizden yukarı kısım ve kas gücü bu evin etkisi altındadır.");
            }
        });
        buttonEv10.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_Ev.setText("10. EV\nYönetici Gezegeni : Satürn\nEvin Sahibi : Oğlak burcu\nKısaca; Meslek ve kişinin toplumdaki yerini gösteren evdir.\nAstrolojide onuncu ev kişinin mesleğini sosyal statüsünü ve toplumdaki rolünü gösterir. Kişinin bireysel başarılarını, mesleki kariyerini, toplum içindeki statüsünü, başarı ve başarısızlıklarını, ilişkisi olduğu insanlar üzerindeki otorite durumunu anlatır. Toplumda ne kadar tanınacağı ve kendini nasıl ifade edeceği bu evin yönetimi altındadır.Vücut kısımlarından İskelet sistemi, eklemler, deri, dizler ve dişler bu evin etkisindedir.");
            }
        });
        buttonEv11.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                textView_Ev.setText("11. EV\nYönetici Gezegeni : Uranüs\nEvin Sahibi : Kova Burcu\nKısaca ; Dostluklar , umutlar ve hayır işleri evidir.\nAstrolojide onbirinci ev  insanların çevresiyle ilişki durumunu, arkadaşlıklar ve sosyal çevre içinde yapılacak çalışmalar varılacak hedefleri, gerçekleştirilecek toplumsal değişimler ve bunlar için kurulacak dernekler ve hayır işlerini yönetir.Birey içerisindeki insanlara yararlı olma ve bu amaç uğrunda kurulacak dostluklar,gruplar,dernekler bir dersek 11.evin anlamı tam anlamıyla açıklamış oluruz. Vücut kısımlarından kan dolaşımı, kan basıncı, baldırlar, topuklar, lenf sistemi, adeleler bu evin etkisindedir.");
            }
        });
        this.buttonEv12.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                EvlerFragment.this.textView_Ev.setText("12. EV\nYönetici gezegeni : Neptün\nEvin Sahibi : Balık Burcu\nKısaca hayaller ve  bilinç altı ve iç alem evidir.\nAstrolojide onikinci ev bilinç altını, hayalleri ve rüyaları  bunun yanında ruhsal ihtiyaçları, korkuları, endişeleri,kişinin duyduğu güvensizlikleri,sırları, maddi ve manevi hapisler, darlık ve kısıtlanmalar üzerinde söz sahibidir.Kişinin ruhsal yapısını ve  manevi kapasitesini gösterir.Gizli kapaklı işler ve ilişkiler ve bunun yanında gizli düşmanlarda 12.evin yönetimi altındadır.Vücudumuzun ayaklar, sinir sistemi, vücut sıvıları, lenfler bu evin etkisindedir.");
            }
        });
        return inflate;
    }
}