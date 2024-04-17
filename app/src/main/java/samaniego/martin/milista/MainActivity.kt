package samaniego.martin.milista

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val celulares = listOf(
            Celular(R.drawable.galaxys24, "Samsung Galaxy S24", "Android 14", "8 GB", "128 / 256 GB", "6,2 pulgadas FHD2.340 x 1.080 px", "50MP, f/1.8, 85º, OIS", "$23,850.00"),
            Celular(R.drawable.iphone15,"Iphone 15", "iOS 17","Apple A16 Bionic", "128 / 256 / 512 GB", "OLED 6,1 Super Retina XDR", "48 MP, 26 mm, f/1.6", "$19,499.00"),
            Celular(R.drawable.pixel8pro, "Pixel 8 Pro", "Android 14", "12 GB LPDDR5X", "128 / 256 / 512 GB UFS 3.1", "Super Actua Display OLED 6,7", "50 Mpíxeles f/1.68", "$15,772.00"),
            Celular(R.drawable.razrplus, "Razr plus", "Android 13", "8 GB", "256 GB", "principal 2640 x 1080 FHD", "Ultraancha de 12 MP ", "$14,436.00"),
            Celular(R.drawable.zenfone10, "Zenfone 10", "Android 13", "8 GB", "128 GB", "Samsung AMOLED de 5,9 pulgadas", "Sensor insignia Sony® IMX766 de 50 MP", "$20,222.00")
        )

        val recycler_celulares: RecyclerView = findViewById(R.id.lista_view)
        recycler_celulares.layoutManager = LinearLayoutManager(this)
        recycler_celulares.adapter = adaptadorCelulares(celulares)
    }
}