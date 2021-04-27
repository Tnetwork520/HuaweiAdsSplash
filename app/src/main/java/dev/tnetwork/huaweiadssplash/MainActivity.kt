package dev.tnetwork.huaweiadssplash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.huawei.hms.ads.HwAds

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        HwAds.init(applicationContext)
        
    }
}