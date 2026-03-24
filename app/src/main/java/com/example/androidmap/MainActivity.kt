package com.example.androidmap

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.osmdroid.config.Configuration
import org.osmdroid.views.MapView
import org.osmdroid.util.GeoPoint
import android.location.Geocoder
import android.widget.Button
import android.widget.EditText
import org.osmdroid.views.overlay.Marker
import java.util.Locale
class MainActivity : AppCompatActivity() {

    private lateinit var map: MapView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Configuration.getInstance().load(
            applicationContext,
            getSharedPreferences("osmdroid", MODE_PRIVATE)
        )

        setContentView(R.layout.activity_main)

        map = findViewById(R.id.map)
        map.setMultiTouchControls(true)

        val startPoint = GeoPoint(-23.5505, -46.6333) // São Paulo
        map.controller.setZoom(12.0)
        map.controller.setCenter(startPoint)

        val etEndereco = findViewById<EditText>(R.id.etEndereco)
        val btnBuscar = findViewById<Button>(R.id.btnBuscar)

        btnBuscar.setOnClickListener {

            val endereco = etEndereco.text.toString()

            val geocoder = Geocoder(this, Locale.getDefault())
            val lista = geocoder.getFromLocationName(endereco, 1)

            if (!lista.isNullOrEmpty()) {

                val location = lista[0]
                val ponto = GeoPoint(location.latitude, location.longitude)

                map.controller.setZoom(15.0)
                map.controller.setCenter(ponto)

                val marker = Marker(map)
                marker.position = ponto
                marker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM)
                marker.title = endereco

                map.overlays.clear()
                map.overlays.add(marker)
                map.invalidate()
            }
        }
    }
}