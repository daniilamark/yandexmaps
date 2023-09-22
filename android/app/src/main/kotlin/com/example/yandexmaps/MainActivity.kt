package com.example.yandexmaps

import androidx.annotation.NonNull
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugins.GeneratedPluginRegistrant
import com.yandex.mapkit.MapKitFactory

class MainActivity: FlutterActivity() {
  override fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine) {

    MapKitFactory.setApiKey("297c9786-84d5-45f4-99d9-55ea91a34110") 
    super.configureFlutterEngine(flutterEngine)
  }
}