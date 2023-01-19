package com.ayberk.burcyorum

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ayberk.burcyorum.databinding.ActivityMainBinding
import com.ayberk.burcyorum.databinding.ActivityYorumBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()


        val terazi = Landmark("-Terazi-","Latince ismi Libra olan teraziyi oluşturan yıldızlar, Yunanlılar'da Akrep takımyıldızının kıçkaçlarıydı. Romalılar'da ise terazinin iki kefesi olarak farklı bir takımyıldızına dönüşür. Terazi takımyıldızı eskiden sonbahar ekinoksu boyunca görünürken, gece ve gündüzün eşit olması bua uyardı. Şimdi ise bu ekinoks Başak burcuna denk geliyor.","< Sakin >",R.drawable.teraziburcu)
        val boga = Landmark("-Boğa-","Latince ismi Taurus olan boğa takımyıldızının M.Ö. 15.000 tarihinde boğaya benzetildiği biliniyor. Yunan ve Roma mitine göre takımyıldız ya Europa'yı tavlamak için boğa kılığına girmiş Jüpiter ya da Herakles'in yakaladığı Girit Boğası olarak karşımıza çıkar.","< Cana yakın >",R.drawable.bogaburcu)
        val basak = Landmark("-Başak-","Latince ismi Virgo olan başak, göyüzünde bir kadın figürüdür. Eski Babilliler onu tarımsal bereket, yani tahıl ve bitkilerin tanrıçası Ceres ile özdeşleştirir. Onu bir eğreltiotunu tutarken resmeden Romalılar'da da bu gelenek devam eder.","< Çalışkan >",R.drawable.basakburcu)
        val ikizler = Landmark("-İkizler-","Latince ismi Gemini olan Castor ve Pollux ikizleri yıldızların arasında çöp adam gibi görünür. Kaçırılması büyük Truva Savaşı'nı başlatan Truvalı Helen'in ve kocası Agamemnon'u savaştan sonra öldüren Klytaimnestra'nın erkek kardeşleri olan ikizler, atçılık ve denizcilik ile ilişkilendirilir. Pollux ve Helen, Zeus bir kuğu kılığına girip anneleri Leda'ya tecavüz ettiğinde bir yumurtadan; bir başka yumurtadan ise babaları Tyndareus olan Castor ve Klytaimnestra çıkar. Sadece Pollux ölümsüzdür, Zeus diğer kardeşi de gökyüzünde ölümsüz kılar.","< Kararsız >",R.drawable.ikizlerburcu)
        val yengec = Landmark("-Yengeç-","Latince ismi Cancer olan yengeç, Herkül Lerna Hydra'sını altermeye çalışırken ona yardımcı olur. Herkül onu ayağıyla ezerek uzaklara gönderir.","< Duygusal >",R.drawable.yengecburcu)
        val aslan = Landmark("-Aslan-","Latince ismi Leo olan aslan, erken dönemde Mezopotamyalılar tarafından M.Ö. 4000 yıllarında fark edilir. Yunanlılar ve Romalılar aslanı Herkül'ün Nemea Aslanı'nı öldürdüğü mit ile ilişkilendirmiştir.","< Lider >",R.drawable.aslanburcu)
        val akrep = Landmark("-Akrep-","Latince ismi Scorpio olan akrebin kıskaçları Romalılar tarafından koparılmış da olsa Orion (Avcı) Takımyıldızı'na yakındır ve Orion'un kaçtığı bir düşmandır. Orion'un davranışlarından intikam almak için Diana tarafından ya da herhangi bir yaratığı öldürebileceğine dair övünmesine yanıt olarak Toprak tarafından gönderilmiştir","< Hırslı >",R.drawable.akrepburcu)
        val yay = Landmark("-Yay-","Latince ismi Sagittatius olan yay takımyıldızı, ok ve yayıyla akrebi hedef alan bir kentuar (yarı insan yarı at) olarak tasvir edilir","< Eğlenceli >",R.drawable.yayburcu)
        val oglak = Landmark("-Oglak-","Latince ismi Capricorn olan bu şekil yarı oğlak yarı balıktır ve 21 Aralık kış gün dönümünde görünür. Takımyıldıza Pan ya da Faunus adı verilmiştir. Mite göre tanrılarla savaşmak için gönderilen canavar Typhon'dan saklanır ve kaçmak için Nil Nehri'ne girip vücudunun alt kısmını balığa dönüştürür. Jüpiter onu ödüllendirmek adına ölümsüz kılar.","< İnatçı >",R.drawable.oglakburcu)
        val kova = Landmark("-Kova-","Latince ismi Aquarius olan kova takımyıldızı, bir testiden su döken bir adam olarak görünür. Ganymedes ya da Catamitus adında genç bir oğlanla özdeşleştirilen kovaya Zeus aşık olur ve onu kaçırmak için bir kartala dönüşüp Olimpos Dağı'na tanrıların şarap sunucusu olarak yerleştirir. Bu hikâye, Aquila Takımyıldızı'nda resmedilir.","< Yardımsever >",R.drawable.kovaburcu)
        val balik = Landmark("-Balık-","Latince ismi Pisces olan ve halatlarla bağlanmış iki balık, tanrıları öldürmek üzere gelen korkunç yaratık Typhon'dan kaçan Venüs ve oğlu Cupid olarak karşımıza çıkar. Faunus (Oğlak), Nil Nehri'ne yüzmek için girerken bu ikili kendilerini balığa dönüştürür.","< Üzgün >",R.drawable.balikburcu)



        landmarkList.add(terazi)
        landmarkList.add(boga)
        landmarkList.add(basak)
        landmarkList.add(ikizler)
        landmarkList.add(yengec)
        landmarkList.add(aslan)
        landmarkList.add(akrep)
        landmarkList.add(yay)
        landmarkList.add(oglak)
        landmarkList.add(kova)
        landmarkList.add(balik)


        binding.recyclerView.layoutManager =LinearLayoutManager(this@MainActivity)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter


    }
}